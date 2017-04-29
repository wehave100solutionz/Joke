package game_on_ha.jokes.ListViewAdapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import game_on_ha.jokes.AfterSelectedListJoke;
import game_on_ha.jokes.MainActivity;
import game_on_ha.jokes.R;

/**
 * Created by asad on 4/24/2017.
 */

public class RecycleAdapterJokeList extends RecyclerView.Adapter<MyViewHolderJokeList> {

     private List<JokeDataList> mDataJoke;
     LayoutInflater inflater;
    Context context;

    public RecycleAdapterJokeList(Context context, List<JokeDataList> dataJoke){

        this.mDataJoke = dataJoke;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolderJokeList onCreateViewHolder(ViewGroup parent, int viewType) {

        View view =  inflater.inflate(R.layout.joke_list,parent,false);
        MyViewHolderJokeList myViewHolder = new MyViewHolderJokeList(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolderJokeList holder, final int position) {


       JokeDataList itemCurrentPosition = mDataJoke.get(position);
        holder.setData(holder, itemCurrentPosition, position);

    }

    @Override
    public int getItemCount() {
        int count = mDataJoke.size();
        return count;
    }
}
