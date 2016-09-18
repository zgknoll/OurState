package bitsplease.ourstate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.profileButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProfile = new Intent(MainActivity.this, ProfileActivityNew.class);
                startActivity(intentProfile);
            }
        });

        Button button2 = (Button) findViewById(R.id.petitionsButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProfile = new Intent(MainActivity.this, NewPetitionListActivity.class);
                startActivity(intentProfile);
            }
        });

        Button button3 = (Button) findViewById(R.id.startPetitionButton);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProfile = new Intent(MainActivity.this, StartPetition.class);
                startActivity(intentProfile);
            }
        });

    };
}
