package com.example.david.scorecardpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
/**
 * Created by jacklavallee on 11/28/17.
 */

public class ScoringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        Intent go;
        switch(item.getItemId())
        {
            case R.id.activity_login:
                go = new Intent(this,LoginActivity.class);
                startActivity(go);
                return true;

            case R.id.activity_scoring:
                go = new Intent(this,ScoringActivity.class);
                startActivity(go);
                return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
