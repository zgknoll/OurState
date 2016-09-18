package bitsplease.ourstate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartPetition extends AppCompatActivity {

    private String user = LoginActivity.username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_petition);
    }


}
