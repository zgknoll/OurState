package bitsplease.ourstate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivityNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_new);
        TextView textElement;
        textElement = (TextView) findViewById(R.id.textView);

        textElement.setText(LoginActivity.username);


    }
}
