package game_on_ha.jokes.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.ArrayList;

import game_on_ha.jokes.R;

/**
 * Created by asad on 4/24/2017.
 */

public class CustomImages {
    Context context;

    private int imageID;
    private String title;

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

      public static ArrayList<CustomImages> getData()
      {
          ArrayList<CustomImages> dataList = new ArrayList<>();

          int imgId[] = getImages();
          for (int i=0; i< imgId.length; i++){

              CustomImages customImgObj = new CustomImages();

              customImgObj.setImageID(imgId[i]);
              customImgObj.setTitle("JokeDescription"+i);
              dataList.add(customImgObj);
          }
          return dataList;
      }

    private static int[] getImages() {



        int images[] = {R.drawable.pathan,R.drawable.saariki,R.drawable.wife,
                R.drawable.sardar,R.drawable.mix,R.drawable.jutt};
        return images;
    }
}
