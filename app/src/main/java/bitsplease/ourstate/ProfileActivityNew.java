package bitsplease.ourstate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivityNew extends AppCompatActivity {

    private DatabaseHelper db;
    private Petition[] petitions;
    private String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_new);
        db = new DatabaseHelper(this, 1);
        TextView textElement;
        textElement = (TextView) findViewById(R.id.textView);
        textElement.setText(LoginActivity.username);

        petitions = db.findPetitionsByUsername(LoginActivity.username);

        for(int i = 0; i < petitions.length; i++){
            str += petitions[i].getPetitionTitle() + "\n";
        }

        TextView textElement1;
        textElement1 = (TextView) findViewById(R.id.petitionList);
        textElement1.setText(str);


    }
}
