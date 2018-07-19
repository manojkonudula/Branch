package com.leadconn.branch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addition();
    }
    public void addition()
    {
        int a =20; int b= 20;

        int add = a+b;
        String text = "hello world";
    }
}
