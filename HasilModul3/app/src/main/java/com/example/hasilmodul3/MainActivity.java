package com.example.hasilmodul3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void input(View view) {
        Intent intent = new Intent(this, SkorActivity.class);

        EditText inputTima = findViewById(R.id.Tima);
        String namaTima = inputTima.getText().toString();
        Log.d(TAG, namaTima);
        intent.putExtra("Tima", namaTima);

        EditText inputTimb = findViewById(R.id.Timb);
        String namaTimb = inputTimb.getText().toString();
        Log.d(TAG, namaTimb);
        intent.putExtra("Timb", namaTimb);

        startActivity(intent);

    }
}