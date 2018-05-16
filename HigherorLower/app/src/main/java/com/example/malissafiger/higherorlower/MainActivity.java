package com.example.malissafiger.higherorlower;

import android.icu.text.StringSearch;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();

    int  n = rand.nextInt(20) + 1;

    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }


    public void btnGuess(View view)
    {
        EditText editTextVal= (EditText) findViewById(R.id.editTextVal);
        int x= Integer.parseInt(editTextVal.getText().toString());
        if (x < n)
        {
            makeToast("go higher than this!");
        }
        else if (x > n)
        {
            makeToast("go lower than this!");

        }
        else{

            makeToast("you got it! Try again!!");


            n = rand.nextInt(20) + 1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
