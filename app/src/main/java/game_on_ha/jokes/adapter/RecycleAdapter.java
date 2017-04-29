package game_on_ha.jokes.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import game_on_ha.jokes.R;

/**
 * Created by asad on 4/24/2017.
 */

public class RecycleAdapter extends RecyclerView.Adapter<MyViewHolder> {

     private List<CustomImages> mData;
     LayoutInflater inflater;

    public RecycleAdapter(Context context, ArrayList<CustomImages> data){

        this.mData = data;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view =  inflater.inflate(R.layout.list_view,parent,false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

       CustomImages itemCurrentPosition = mData.get(position);
        holder.setData(holder, itemCurrentPosition, position);

    }

    @Override
    public int getItemCount() {
        int count = mData.size();
        return count;
    }
}
