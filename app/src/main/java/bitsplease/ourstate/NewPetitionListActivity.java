package bitsplease.ourstate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class NewPetitionListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_petition_list);

        String[] petitions={"Petition 1","Petition 2","Petition 3"};
        ListAdapter petitionAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,petitions);
        ListView petitionsListView=(ListView) findViewById(R.id.petitionListView);
        petitionsListView.setAdapter(petitionAdapter);

        petitionsListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String petitions=String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(NewPetitionListActivity.this,petitions,Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
