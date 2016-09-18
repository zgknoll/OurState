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
import java.util.Arrays;
import java.util.Date;


public class NewPetitionListActivity extends Activity {

    private int count;
//    private Petition[] petitionArray;
//    private DatabaseHelper db;
//    private int petCount;
//    private int voteCount;
//    private int timeCount;
//    private long currentTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        db=new DatabaseHelper(this,1);
//        petitionArray= db.getAllPetitions();
        setContentView(R.layout.activity_new_petition_list);

        ArrayList<String> petitionsList = new ArrayList<String>();
        count=petitionsList.size();
//        petCount=petitionsList.size();
//        voteCount=petitionsList.size();
//        timeCount=petitionsList.size();
//        while(petitionArray.length>petCount)
//        {
//            petitionsList.add(petitionArray[petCount].getPetitionTitle());
//            petCount++;
//        }

        petitionsList.add("Petition 1");
        petitionsList.add("Petition 2");
        petitionsList.add("Petition 3");
        petitionsList.add("Petition 4");
        petitionsList.add("Petition 5");
        ArrayList<String> petitionNumList = new ArrayList<String>();
        while(petitionsList.size()>count)
        {
            petitionNumList.add(count+1 + ".");
            count++;

        }
        ArrayList<String> petitionVotesList = new ArrayList<String>();
//        while(petitionArray.length>voteCount)
//        {
//            petitionVotesList.add(petitionArray[voteCount].getVotes()+"votes");
//            voteCount++;
//        }
        petitionVotesList.add("5 votes");
        petitionVotesList.add("10 votes");
        petitionVotesList.add("15 votes");
        petitionVotesList.add("20 votes");
        petitionVotesList.add("25 votes");
        ArrayList<String> timeAgoList = new ArrayList<String>();
//        while(petitionArray.length>timeCount)
//        {
//            currentTime=new Date().getTime();
//            petitionVotesList.add(TimeAgo.toDuration(currentTime-(petitionArray[timeCount].getCreationTime())));
//            timeCount++;
//        }
        timeAgoList.add(TimeAgo.toDuration(1230000000));
        timeAgoList.add(TimeAgo.toDuration(1230000000));
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
