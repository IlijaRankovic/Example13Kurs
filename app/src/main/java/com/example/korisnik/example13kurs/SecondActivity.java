package com.example.korisnik.example13kurs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Korisnik on 10.5.2017..
 */

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstamceState){
        super.onCreate(savedInstamceState);

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onCreate", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onStart(){
        super.onStart();

        Toast toast = Toast.makeText(getBaseContext(), "SeconActivity.onStart", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onResume(){
        super.onResume();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onResume", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onRestart", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onPause(){
        super.onPause();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onPause", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onStop(){
        super.onStop();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStop", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onDestroy", Toast.LENGTH_SHORT);
        toast.show();
    }
}
