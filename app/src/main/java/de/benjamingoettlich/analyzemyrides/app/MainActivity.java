package de.benjamingoettlich.analyzemyrides.app;

/**
 * Created by benja_000 on 12.02.2017.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onClickBtn(View v)
    {
        Intent i = new Intent(getBaseContext(),SecondActivity.class);
        startActivity(i);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id ==R.id.action_settings){
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
