package bitsplease.ourstate;

/**
 * Created by Armand on 9/17/2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter{

    String[] petitions;
    String[] petitionVotes;
    String[] petitionNum;
    String[] timeAgo;
    Context context;
    private static LayoutInflater petitionInflater=null;

    public CustomAdapter(Context context,String[] petitions,String[] petitionVotes,String[] petitionNum,String[] timeAgo ){
       // super(context,R.layout.custom_row,petitions);//,petitionNums,petitionVotes,timeAgo);
        this.petitions=petitions;
        this.petitionVotes=petitionVotes;
        this.petitionNum=petitionNum;
        this.timeAgo=timeAgo;
        this.context=context;
        petitionInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return petitions.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView petitionName;
        TextView petitionNum;
        TextView petitionVotes;
        TextView timeAgo;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder= new Holder();
        View rowView;
        rowView=petitionInflater.inflate(R.layout.custom_row,null);
        holder.petitionName=(TextView)rowView.findViewById(R.id.petitionName);
        holder.petitionNum=(TextView)rowView.findViewById(R.id.petitionNum);
        holder.petitionVotes=(TextView)rowView.findViewById(R.id.numberVotes);
        holder.timeAgo=(TextView)rowView.findViewById(R.id.timeAgo);
        holder.petitionName.setText(petitions[position]);
        holder.petitionNum.setText(petitionNum[position]);
        holder.petitionVotes.setText(petitionVotes[position]);
        holder.timeAgo.setText(timeAgo[position]);
        return rowView;
    }
}
