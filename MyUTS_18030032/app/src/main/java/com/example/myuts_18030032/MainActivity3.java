package com.example.myuts_18030032;
/*merupkan library yang dipakai*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView h_Nim = findViewById(R.id.hnim);/* inisialisasi untuk palette yang akan digunakan untuk menampilkan data yang dibawah dari activity sebelumnya*/
        String NIM_MAHAS = getIntent().getStringExtra("NIM");/* pembentukan variabel untuk menampilkan data yang dibawa dari activity sebelumnya*/
        h_Nim.setText(NIM_MAHAS);/* pemberian nilai pada pallete yang berdasarkan dari data yang disimpan di variabel*/

        TextView h_Nama = findViewById(R.id.hnama);
        String NAMA_MAHAS = getIntent().getStringExtra("Nam_Mas");
        h_Nama.setText(NAMA_MAHAS);

        TextView h_Kelas = findViewById(R.id.hkelas);
        String KELAS_MAHAS = getIntent().getStringExtra("Kelas");
        h_Kelas.setText(KELAS_MAHAS);

        TextView h_dosen = findViewById(R.id.hdosen);
        String DOSEN_MAHAS = getIntent().getStringExtra("DOSENM");
        h_dosen.setText(DOSEN_MAHAS);

        TextView h_mata = findViewById(R.id.hmata);
        String MATKUL_MAHAS = getIntent().getStringExtra("MATKULM");
        h_mata.setText(MATKUL_MAHAS);

        TextView h_studi = findViewById(R.id.hstudi);
        String Studi_MAHAS = getIntent().getStringExtra("STUDIM");
        h_studi.setText(Studi_MAHAS);

        TextView h_tanggal = findViewById(R.id.htanggal);
        String Tanggal_MAHAS = getIntent().getStringExtra("TANGGALM");
        h_tanggal.setText(Tanggal_MAHAS);

        TextView h_sks = findViewById(R.id.hsks);
        String SKS_MAHAS = getIntent().getStringExtra("SKSM");
        h_sks.setText(SKS_MAHAS);



    }
}