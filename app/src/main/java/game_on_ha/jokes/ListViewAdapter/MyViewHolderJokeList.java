package game_on_ha.jokes.ListViewAdapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import game_on_ha.jokes.DisplayJokes;
import game_on_ha.jokes.MainActivity;
import game_on_ha.jokes.R;

/**
 * Created by asad on 4/24/2017.
 */

class MyViewHolderJokeList extends RecyclerView.ViewHolder  {
    boolean check = false;

    TextView jokeList;
    ImageView imgFav;
    Context context;
    Intent intent;

    public MyViewHolderJokeList(View itemView) {
        super(itemView);

        jokeList = (TextView) itemView.findViewById(R.id.joke_des);
        imgFav = (ImageView) itemView.findViewById(R.id.add_joke);
        context = itemView.getContext();

    }

    public void setData(MyViewHolderJokeList holder, final JokeDataList itemCurrentPosition, final int position) {

        final int  pos = position;
        holder.jokeList.setText(itemCurrentPosition.getJokeDes());
        //holder.imgList.setImageResource(itemCurrentPosition.getImageID());

        imgFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check=!check;
               // intent.putExtra("key",pos);
                if (check==true){

                    imgFav.setColorFilter(ContextCompat.getColor(context,R.color.off_white));
                }
                else {
                    imgFav.setColorFilter(ContextCompat.getColor(context,R.color.colorAccent));
                }
                Toast.makeText(context,"KEY"+pos,Toast.LENGTH_SHORT).show();

            }
        });




        holder.jokeList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent = new Intent(context, DisplayJokes.class);
                //intent.putExtra("key",pos);
                intent.putExtra("text",itemCurrentPosition.getJokeDes());
                Log.d("kEY",pos+"");
                context.startActivity(intent);
            }
        });


    }


}
