package com.shituocheng.calcalculateapplication.com.test;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.util.Log;
import android.view.MenuItem;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Slide slide = new Slide();
        slide.setDuration(1000);
        getWindow().setEnterTransition(slide);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(Main2Activity.this, null);
            Intent intent = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(intent, compat.toBundle());
            this.finish();
        }
        return true;
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("isDestroy", "destroy");
    }
}
