package com.example.auxviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;

public class InstallLoaction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_install_loaction);
//        if (NavUtils.getParentActivityName(this) != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);    //显示向左的箭头图标
//        }

//        ActionBar bar = getActionBar();
//        bar.setDisplayHomeAsUpEnabled(false); //不显示
//        bar.setDisplayShowHomeEnabled(false); //不显示home affordance
//        bar.setDisplayShowTitleEnabled(false); // 不显示title
//        bar.setDisplayShowCustomEnabled(true); //显示自定义View
//
//
//
//        View CustomTitle = getLayoutInflater().inflate(R.layout.activity_install_loaction, null);
//        ActionBar.LayoutParams lp = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT, Gravity.CENTER);
//        bar.setCustomView(CustomTitle, lp);
//        ImageButton navButton = (ImageButton)bar.getCustomView().findViewById(R.id.left_btn);
//        navButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//// TODO Auto-generated method stub
//                NavUtils.navigateUpFromSameTask(InstallLoaction.this);
//            }
//        });
    }
}
