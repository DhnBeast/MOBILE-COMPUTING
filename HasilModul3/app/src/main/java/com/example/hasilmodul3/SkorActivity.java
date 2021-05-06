package com.example.hasilmodul3;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SkorActivity extends AppCompatActivity {
    int skora = 0;
    int skorb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        TextView namaTima = findViewById(R.id.tima);
        String namaA = getIntent().getStringExtra("Tima");
        namaTima.setText("Poin Team" + " " + namaA);

        TextView namaTimb = findViewById(R.id.timb);
        String namaB = getIntent().getStringExtra("Timb");
        namaTimb.setText("Poin Team" + " " + namaB);
    }

    public void Tambah(View view) {
        if (view.getId() == R.id.satuA) {
            skora = skora + 1;
        } else if (view.getId() == R.id.duaA) {
            skora = skora + 2;
        } else if (view.getId() == R.id.tigaA) {
            skora = skora + 3;
        } else if (view.getId() == R.id.satub) {
            skorb = skorb + 1;
        } else if (view.getId() == R.id.duab) {
            skorb = skorb + 2;
        } else if (view.getId() == R.id.Tigab) {
            skorb = skorb + 3;
        }

        TextView skortA= findViewById(R.id.timA);
        skortA.setText(String.valueOf(skora));

        TextView skortB = findViewById(R.id.timB);
        skortB.setText(String.valueOf(skorb));


    }

    public void resetb(View view) {
        TextView skorTB = findViewById(R.id.timB);
        skorb = 0;
        skorTB.setText(String.valueOf(skorb));
    }

    public void reseta(View view) {
        TextView skorTA = findViewById(R.id.timA);
        skora = 0;
        skorTA.setText(String.valueOf(skora));
    }
}