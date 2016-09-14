package com.shituocheng.calcalculateapplication.com.test;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab = (FloatingActionButton)findViewById(R.id.fab);
        TransitionInflater transitionInflater = TransitionInflater.from(this);
        Transition transition = transitionInflater.inflateTransition(R.transition.fade_transition);
        getWindow().setExitTransition(transition);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, null);
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent, compat.toBundle());
            }
        });
    }

}
