package com.example.android.farrel_1202150033_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onPesanSekarang(View view){
        if (((RadioButton)findViewById(R.id.dineIn)).isChecked()) {
            intent = new Intent(this, DineIn.class);
            startActivity(intent);
        }else if (((RadioButton)findViewById(R.id.takeAway)).isChecked()) {
            intent = new Intent(this, TakeAway.class);
            startActivity(intent);
        }else {
            Toast.makeText(this,"Pilih salah satu", Toast.LENGTH_SHORT).show();
        }

    }

}



