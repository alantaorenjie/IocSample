package com.trj.iocdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.trj.annotation.Bind;
import com.trj.bindview.Ioc;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.main_tv)
    TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ioc.inject(this);
        mTv.setText("123456789");

        
    }
}
