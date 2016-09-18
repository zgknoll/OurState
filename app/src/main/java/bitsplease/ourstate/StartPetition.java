package bitsplease.ourstate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.util.Date;


public class StartPetition extends AppCompatActivity {

    private String user = LoginActivity.username;
    private DatabaseHelper db;
    private String petitionTitle;
    private String petitionDesc;
    private String creator;
    private long creationTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_petition);
        db = new DatabaseHelper(this, 1);

        Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView editText1 = (TextView) findViewById(R.id.editText);
                TextView editText2 = (TextView) findViewById(R.id.editText2);
                petitionTitle = editText1.getText().toString();
                petitionDesc = editText2.getText().toString();
                creator = LoginActivity.username;
                creationTime = new Date().getTime();
                Petition p = new Petition(1, petitionTitle, petitionDesc, 0, creator, creationTime);
                db.insertPetition(petitionTitle, petitionDesc, 0, creator, creationTime);
                p.incrementVote(creator, db);
            }
        });




    }





}
