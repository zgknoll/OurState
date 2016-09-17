package bitsplease.ourstate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;


public class PetitionListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petition_list);
    }

    //setContentView(R.layout.layoutName);
    TextView textView1 = (TextView) findViewById(R.id.textView);
    //textView1.setText("text you want to display");
}
