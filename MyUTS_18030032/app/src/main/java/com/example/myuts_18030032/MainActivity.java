package com.example.myuts_18030032;
/*merupkan library yang dipakai*/
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    String TAG = "Main Activity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /*merupkan fungsi untuk mengirim data" ke tampilan berikutnya*/
    public void Next(View view) {
        /*fungsi untuk pidah ke activity selanjutnya*/
        Intent intent = new Intent(this, MainActivity2.class);


        EditText NIM = findViewById(R.id.NIM);/*merupakan inisialisasi untuk palette yang akan digunakan dalam method*/
        String inputNIM = NIM.getText().toString();/*merupakan pembentukan variabel untuk menyimpan data yang akan dibawa ke activity selanjutnya*/
        intent.putExtra("NIM", inputNIM);/*Untuk "intent.putextra" adalah koding yang digunakan untuk membawa data yang tersimpan ke activity selanjutnya*/

        EditText Nam_Mas = findViewById(R.id.Nam_Mas);
        String inputNam_Mas = Nam_Mas.getText().toString();
        intent.putExtra("Nam_Mas", inputNam_Mas);

        RadioGroup Kelas = findViewById(R.id.Kelas);
        int inputKelas = Kelas.getCheckedRadioButtonId();
        RadioButton kelas1 = findViewById(inputKelas);
        String kelas = String.valueOf(kelas1.getText().toString());
        intent.putExtra("Kelas", kelas);

        startActivity(intent);

    }
}