package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("safsaffsafas","aaa_branch");

        Toast.makeText(this, "firt", Toast.LENGTH_LONG).show();

        Toast.makeText(this, "branch", Toast.LENGTH_LONG).show();
    }
}
