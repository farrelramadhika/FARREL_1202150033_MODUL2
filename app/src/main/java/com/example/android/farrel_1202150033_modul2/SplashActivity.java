package com.example.android.farrel_1202150033_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by TOSHIBA on 2/17/2018.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        Toast toast = null;
        toast = Toast.makeText(getApplicationContext(),"FARREL_1202150033",Toast.LENGTH_SHORT);
        toast.show();
        finish();
    }
}
