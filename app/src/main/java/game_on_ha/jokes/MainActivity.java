package game_on_ha.jokes;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

import game_on_ha.jokes.log_in.LogIn;
import game_on_ha.jokes.log_in.SignUp;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ImageView icon_joke;
    ImageView icon_update;
    ImageView icon_favorite;
    ImageView icon_setting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToolBar();
        setViews();
        icon_joke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,JokeList.class);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this);
                    startActivity(intent, activityOptions.toBundle());

                }
                else {

                    startActivity(intent);
                }
            }
        });
    }


    private void setViews()
    {
        icon_joke = (ImageView) findViewById(R.id.joke_icon);
        icon_update = (ImageView) findViewById(R.id.update_icon);
        icon_favorite = (ImageView) findViewById(R.id.favorite_icon);
        icon_setting = (ImageView) findViewById(R.id.setting_icon);
    }
    private void setToolBar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Jokes");


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String msg = "";
        switch (item.getItemId()) {

            case R.id.asad:
                msg = "Asad";

                break;
            case R.id.rate:
                msg = "rate";
                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);
                break;
            case R.id.about:
                msg = "about";
                break;
            case R.id.help:
                msg = "help";
                break;
        }

        Toast.makeText(this, "you clicked", Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }


}
