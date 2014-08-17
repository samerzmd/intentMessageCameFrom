package com.example.sam.intentmessage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MyActivity extends Activity {
    @InjectView(R.id.two)Button goTwo;
    @InjectView(R.id.three)Button goThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        ButterKnife.inject(this);
        goTwo.setOnClickListener(listener);
        goThree.setOnClickListener(listener);
    }
    View.OnClickListener listener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           BaseIntent intent;
            switch (view.getId()){
                case R.id.two:
                    intent=new BaseIntent(MyActivity.class,MyActivity.this,MyActivity2.class);
                    startActivity(intent);
                    break;
                case R.id.three:

                    intent=new BaseIntent(MyActivity.class,MyActivity.this,MyActivity3.class);
                    startActivity(intent);
                    break;

            }
        }
    };
}
