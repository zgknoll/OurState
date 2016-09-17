package bitsplease.ourstate;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author Zach Knoll
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ourstate.db";
    private static final String LOGIN_TABLE = "login_table";
    private static final String PETITION_TABLE = "petition_table";
    private static final String VOTES_TABLE = "votes_table";

    public DatabaseHelper(Context context, int version) {
        super(context, DATABASE_NAME, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+LOGIN_TABLE+" (ID INTEGER PRIMARY KEY, USERNAME TEXT, PASSWORD INTEGER)");
        db.execSQL("create table "+PETITION_TABLE+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, PETITION_TITLE TEXT, PETITION_DESC TEXT, VOTES INTEGER, CREATOR TEXT, CREATION_TIME INTEGER)");
        db.execSQL("create table "+VOTES_TABLE+" VOTER_ID INTEGER PRIMARY KEY AUTOINCREMENT, VOTER TEXT, ID INTEGER");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+LOGIN_TABLE);
        db.execSQL("DROP TABLE IF EXISTS "+PETITION_TABLE);
        onCreate(db);
    }

    public boolean usernameExists(String username) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select USERNAME from "+LOGIN_TABLE+
                " where USERNAME = "+username,null);
        if(res.getCount() > 0){
            res.close();
            return true;
        } else {
            res.close();
            return false;
        }
    }

    public boolean passwordExists(String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select PASSWORD from "+LOGIN_TABLE+" where PASSWORD = "+password,null);
        if(res.getCount() > 0){
            res.close();
            return true;
        } else {
            res.close();
            return false;
        }
    }

    public boolean insertLogin(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("USERNAME", username);
        contentValues.put("PASSWORD", password);
        return db.insert(LOGIN_TABLE, null, contentValues) != -1;
    }

    public boolean insertPetition(String petitionTitle, String petitionDesc, int votes, String creator, int creationTime) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("PETITION_TITLE", petitionTitle);
        contentValues.put("PETITION_DESC", petitionDesc);
        contentValues.put("VOTES", votes);
        contentValues.put("CREATOR", creator);
        contentValues.put("CREATION_TIME", creationTime);
        return db.insert(PETITION_TABLE, null, contentValues) != -1;
    }

    public boolean petitionVote(int petitionId) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select ID from "+PETITION_TABLE+
                "where ID = "+petitionId,null);
        if(res.getCount() == 0) {
            res.close();
            return false;
        } else {
            res.moveToNext();
            int votes = res.getInt(0)+1;
            ContentValues contentValues = new ContentValues();
            contentValues.put("VOTES", votes);
            res.close();
            return db.insert(PETITION_TABLE, null, contentValues) != -1;
        }
    }


}