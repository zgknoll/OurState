package bitsplease.ourstate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class PetitionListActivity extends AppCompatActivity {

    private int counter = 0;
    private DatabaseHelper db;
    private int[] count = new int[10];
    private String output = "";
    private Petition[] petitions = db.getAllPetitions();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petition_list);
        TextView textElement;
        textElement = (TextView) findViewById(R.id.leftSide);
        leftSideInitialize();
        textElement.setText(output);
        db = new DatabaseHelper(this, 1);
        leftSideInitialize();

        Button button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProfile = new Intent(PetitionListActivity.this, PetitionDescActivity.class);
                startActivity(intentProfile);
            }
        });

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProfile = new Intent(PetitionListActivity.this, PetitionDescActivity.class);
                startActivity(intentProfile);
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProfile = new Intent(PetitionListActivity.this, PetitionDescActivity.class);
                startActivity(intentProfile);
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProfile = new Intent(PetitionListActivity.this, PetitionDescActivity.class);
                startActivity(intentProfile);
            }
        });

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProfile = new Intent(PetitionListActivity.this, PetitionDescActivity.class);
                startActivity(intentProfile);
            }
        });

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProfile = new Intent(PetitionListActivity.this, PetitionDescActivity.class);
                startActivity(intentProfile);
            }
        });

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProfile = new Intent(PetitionListActivity.this, PetitionDescActivity.class);
                startActivity(intentProfile);
            }
        });

        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProfile = new Intent(PetitionListActivity.this, PetitionDescActivity.class);
                startActivity(intentProfile);
            }
        });

        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProfile = new Intent(PetitionListActivity.this, PetitionDescActivity.class);
                startActivity(intentProfile);
            }
        });

        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProfile = new Intent(PetitionListActivity.this, PetitionDescActivity.class);
                startActivity(intentProfile);
            }
        });
    };

    private void leftSideInitialize(){
        output = "";
        counter = 0;
        for(int i = 0; i < 10; i++) {
            count[i] = counter;
            output += count[i] + ".\n";
        }
    }

    private void leftSideIncrement(){
        output = "";
        for(int i = 0; i < 10; i++) {
            count[i] = counter++;
            output += count[i] + ".\n";
        }
    }

    private void leftSideDecrement(){
        output = "";
        for(int i = 0; i < 10; i++) {
            count[i] = counter--;
            output += count[i] + ".\n";
        }
    }




    private void updateButtons(){
        for(int i = 0; i < 10; i++){
//            if(R.id.("button" + i)){
//
//
//            }
        }


    }

}
