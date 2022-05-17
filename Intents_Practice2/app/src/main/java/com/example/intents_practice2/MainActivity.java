package com.example.intents_practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void callSecondActivity(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivityTwo.class);
        intent.putExtra("Value1" , "Ayesha Rashid");
        intent.putExtra("Value2" , "BSEF19M531");
        startActivity(intent);

    }
}