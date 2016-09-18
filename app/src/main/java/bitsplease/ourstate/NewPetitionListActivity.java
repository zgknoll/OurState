package bitsplease.ourstate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class NewPetitionListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_petition_list);

        ArrayList<String> petitionsList = new ArrayList<String>();
        petitionsList.add("Petition 1");
        petitionsList.add("Petition 2");
        petitionsList.add("Petition 3");
        ArrayList<String> petitionNumList = new ArrayList<String>();
        petitionNumList.add("1.");
        petitionNumList.add("2.");
        petitionNumList.add("3.");
        ArrayList<String> petitionVotesList = new ArrayList<String>();
        petitionVotesList.add("5 votes");
        petitionVotesList.add("10 votes");
        petitionVotesList.add("15 votes");
        ArrayList<String> timeAgoList = new ArrayList<String>();
        timeAgoList.add(TimeAgo.toDuration(1230000000));
        timeAgoList.add(TimeAgo.toDuration(1230000000));
        timeAgoList.add(TimeAgo.toDuration(1230000000));
        String[] petitions=petitionsList.toArray(new String[petitionsList.size()]);//{"Petition 1","Petition 2","Petition 3"};
        String[] petitionNum=petitionNumList.toArray(new String[petitionNumList.size()]);//{"1.","2.","3."};
        String[] petitionVotes=petitionVotesList.toArray(new String[petitionVotesList.size()]);//{"5 votes","10 votes","15 votes"};
        String[] timeAgo=timeAgoList.toArray(new String[timeAgoList.size()]);//{"5 days ago","10 days ago","15 days ago"};
        ListAdapter petitionAdapter=new CustomAdapter(this,petitions,petitionVotes,petitionNum,timeAgo);
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
