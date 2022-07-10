package com.armagan.can.multiactivite;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView3;

    String userNAme;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView3 = findViewById(R.id.textView3);

        editText = findViewById(R.id.edittext);
        userNAme = "";

       new CountDownTimer(10000,1000){


           @SuppressLint("SetTextI18n")
           @Override
           public void onTick(long millisUntilFinished) {
               textView3.setText("KalanSüre: " +millisUntilFinished / 10000);
           }

           @Override
           public void onFinish() {

           }
       }.start();




    }







     public void  changeScreen(View view){

         userNAme = editText.getText().toString();

         Intent intent = new Intent(MainActivity.this,MainActivity2.class);

         intent.putExtra("userInput",userNAme);

         startActivity(intent);


    }
}