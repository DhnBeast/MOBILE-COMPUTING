package com.example.myuts_18030032;
/*merupkan library yang dipakai*/
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {
    /*deklarasi untuk variabel yang akan digunakan dalam datepickerdialog*/
    private SimpleDateFormat dateFormat;
    private DatePickerDialog datePickerDialog;
    private TextView dateresult;
    private Button datePick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);/*untuk membuat format tanggal yang digunakan dalam datepickerdialog*/

        TextView NIM = findViewById(R.id.h_Nim);/*merupakan inisialisasi untuk palette yang akan digunakan untuk menampilkan data yang dibawah dari activity sebelumnya*/
        String NIM_MAHA = getIntent().getStringExtra("NIM");/*merupakan pembentukan variabel untuk menampilkan data yang dibawa dari activity sebelumnya*/
        NIM.setText(NIM_MAHA); /*merupakan pemberian nilai pada pallete yang berdasarkan dari data yang disimpan di variabel*/

        TextView Nam_Mas = findViewById(R.id.h_Nama);
        String Nam_MAHA = getIntent().getStringExtra("Nam_Mas");
        Nam_Mas.setText(Nam_MAHA);

        TextView Kelas = findViewById(R.id.h_Kelas);
        String Kelas_MAHA = getIntent().getStringExtra("Kelas");
        Kelas.setText(Kelas_MAHA);

        dateresult = (TextView) findViewById(R.id.h_date);/* merupakan inisialisasi palette untuk datepicker*/
        datePick = (Button) findViewById(R.id.tanggal);/* merupakan inisialisasi palette untuk datepicker*/
        datePick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog();
            }
        });
    }
        private void showDateDialog() {
            Calendar newCalendar = Calendar.getInstance();
            datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    Calendar newDate = Calendar.getInstance();
                    newDate.set(year, monthOfYear, dayOfMonth);
                    dateresult.setText(dateFormat.format(newDate.getTime()));
                }
            }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
            datePickerDialog.show();
        }

        public void reset(View view) {
            EditText MATKUL = findViewById(R.id.input_MATKUL);
            EditText DOSEN = findViewById(R.id.input_DOSEN);
            EditText STUDI = findViewById(R.id.input_STUDI);
            EditText Sifat = findViewById(R.id.input_Sifat);
            EditText SKS = findViewById(R.id.input_SKS);
            TextView date = findViewById(R.id.h_date);

             /*untuk membuat semua isi EditText menjadi kosong saat tombol reset ditekan*/
            MATKUL.setText("");
            DOSEN.setText("");
            STUDI.setText("");
            Sifat.setText("");
            SKS.setText("");
            date.setText("");
        }

    public void next(View view) {
            Intent intent = new Intent(this, MainActivity3.class);/* metode/fungsi intent yang digunakan untuk pindah ke activity selanjutnya*/

            TextView nimm = findViewById(R.id.h_Nim); /* inisialisasi untuk palette yang akan digunakan dalam method*/
            String NIM_MAHAS = nimm.getText().toString();/* pembentukan variabel untuk menyimpan data yang akan dibawa ke activity selanjutnya*/
            intent.putExtra("NIM", NIM_MAHAS);/*Untuk "intent.putextra" adalah koding yang digunakan untuk membawa data yang tersimpan ke activity selanjutnya*/

            TextView namam = findViewById(R.id.h_Nama);
            String NAMA_MAHAS = namam.getText().toString();
            intent.putExtra("Nam_Mas", NAMA_MAHAS);

            TextView kelasm = findViewById(R.id.h_Kelas);
            String KELAS_MAHAS = kelasm.getText().toString();
            intent.putExtra("Kelas", KELAS_MAHAS);

            EditText Matkulm = findViewById(R.id.input_MATKUL);
            String MATKUL_MAHAS = Matkulm.getText().toString();
            intent.putExtra("MATKULM", MATKUL_MAHAS);

            EditText Dosenm = findViewById(R.id.input_DOSEN);
            String DOSEN_MAHAS = Dosenm.getText().toString();
            intent.putExtra("DOSENM", DOSEN_MAHAS);

            EditText Studim = findViewById(R.id.input_STUDI);
            String Studi_MAHAS = Studim.getText().toString();
            intent.putExtra("STUDIM", Studi_MAHAS);

            EditText Sifatm = findViewById(R.id.input_Sifat);
            String Sifat_MAHAS = Sifatm.getText().toString();
            intent.putExtra("SIFATM", Sifat_MAHAS);

            EditText SKSm = findViewById(R.id.input_SKS);
            String SKS_MAHAS = SKSm.getText().toString();
            intent.putExtra("SKSM", SKS_MAHAS);

            TextView Tanggalm = findViewById(R.id.h_date);
            String Tanggal_MAHAS = Tanggalm.getText().toString();
            intent.putExtra("TANGGALM", Tanggal_MAHAS);


            startActivity(intent);

    }
}

