package com.DefaultCompany.ExportAndroidUnity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view)
    {
        Log.d("MainActivity","run TestUnityActivity");
        // 点击跳转UnityActivity
        Intent intent = new Intent(MainActivity.this, TestUnityActivity.class);
        startActivity(intent);
    }
}