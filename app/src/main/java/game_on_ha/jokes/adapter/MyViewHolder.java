package game_on_ha.jokes.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import game_on_ha.jokes.AfterSelectedListJoke;
import game_on_ha.jokes.MainActivity;
import game_on_ha.jokes.R;

/**
 * Created by asad on 4/24/2017.
 */

class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView tvTitle;
    ImageView imgList;
    Context context;
    public MyViewHolder(View itemView) {
        super(itemView);

        tvTitle = (TextView) itemView.findViewById(R.id.tvtitle);
        imgList = (ImageView) itemView.findViewById(R.id.imageRow);
        context = itemView.getContext();


    }

    public void setData(MyViewHolder holder, CustomImages itemCurrentPosition, int position) {

        holder.tvTitle.setText(itemCurrentPosition.getTitle());
        holder.imgList.setImageResource(itemCurrentPosition.getImageID());
        holder.itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

         final Intent intent;
        intent = new Intent(context, AfterSelectedListJoke.class);
        context.startActivity(intent);


    }
}
