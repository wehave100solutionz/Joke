package game_on_ha.jokes.ListViewAdapter;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import game_on_ha.jokes.R;
import game_on_ha.jokes.adapter.CustomImages;

/**
 * Created by asad on 4/24/2017.
 */

public class JokeDataList {
    Context context;

    private String jokeDes;

    public String getJokeDes() {
        return jokeDes;
    }

    public void setJokeDes(String jokeDes) {
        this.jokeDes = jokeDes;
    }

    public static ArrayList<JokeDataList> getData()
    {
        ArrayList<JokeDataList> dataList = new ArrayList<>();


        for (int i=0; i< 20; i++){

            JokeDataList customImgObj = new JokeDataList();

            customImgObj.setJokeDes("میں نازک مزاج ہوں تم پھر ایسا نہیں کرنا\n\"" +
                    "\"میری جاں پر بن گی جو تم نے مسکرا کر دیکھا"+i);
            dataList.add(customImgObj);
        }
        return dataList;
    }



}
