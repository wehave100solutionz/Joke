package game_on_ha.jokes;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

import game_on_ha.jokes.log_in.SignUp;

public class DisplayJokes extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);
        setToolBar();
        TextView textView = (TextView) findViewById(R.id.display);
        Bundle extras = getIntent().getExtras();
        //int position = extras.getInt("key", 0);
        String joke = extras.getString("text");
        //Log.d("kEY_REC",position+"");
        if(extras != null) {
            textView.setText(joke+"Image");
           //text.setText(position+"");
        }

    }

    private void setToolBar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Jokes");

        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.back_arrow));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_item,menu);
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
                Intent intent = new Intent(DisplayJokes.this, SignUp.class);
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


