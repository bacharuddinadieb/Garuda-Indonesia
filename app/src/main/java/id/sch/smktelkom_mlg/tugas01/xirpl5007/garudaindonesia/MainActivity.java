package id.sch.smktelkom_mlg.tugas01.xirpl5007.garudaindonesia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etnama;
    EditText etdate;
    Spinner sdeparture;
    Spinner sarrival;
    Button bok;
    TextView tvhasil;
    TextView tvhasil2;
    CheckBox ind, west, jpn, mid;
    RadioButton eco, ecopre, buss, first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnama = (EditText) findViewById(R.id.nama);
        etdate = (EditText) findViewById(R.id.date);
        sdeparture = (Spinner) findViewById(R.id.spinnerdeparture);
        sarrival = (Spinner) findViewById(R.id.spinnerarrival);
        ind = (CheckBox) findViewById(R.id.chkind);
        west = (CheckBox) findViewById(R.id.chkwest);
        jpn = (CheckBox) findViewById(R.id.chkjpn);
        mid = (CheckBox) findViewById(R.id.chkmid);
        eco = (RadioButton) findViewById(R.id.reco);
        ecopre = (RadioButton) findViewById(R.id.recopre);
        buss = (RadioButton) findViewById(R.id.rbus);
        first = (RadioButton) findViewById(R.id.rfirst);
        bok = (Button) findViewById(R.id.button);
        tvhasil2 = (TextView) findViewById(R.id.detail);
        tvhasil = (TextView) findViewById(R.id.hasile);
        bok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama1 = etnama.getText().toString();
                String date1 = etdate.getText().toString();
                String departure1 = sdeparture.getSelectedItem().toString();
                String arrival1 = sarrival.getSelectedItem().toString();
                String hasil1 = "Kuliner yang anda pilih adalah : \n";
                int startlen = hasil1.length();
                if (ind.isChecked()) hasil1 += ind.getText() + "\n";
                if (west.isChecked()) hasil1 += west.getText() + "\n";
                if (jpn.isChecked()) hasil1 += jpn.getText() + "\n";
                if (mid.isChecked()) hasil1 += mid.getText() + "\n";
                if (hasil1.length() == startlen) hasil1 += "Anda Memilih Makanan Biasa";

                String hasil2 = null;
                if (eco.isChecked()) {
                    hasil2 = eco.getText().toString();
                } else if (ecopre.isChecked()) {
                    hasil2 = ecopre.getText().toString();
                } else if (buss.isChecked()) {
                    hasil2 = buss.getText().toString();
                } else if (first.isChecked()) {
                    hasil2 = first.getText().toString();
                }
                tvhasil2.setText("Detail Pemesanan Tiket");
                tvhasil.setText("Nama Pemesan : \n" + nama1 + "\n\nTanggal Berangkat : \n" + date1 + "\n\nBandara Keberangkatan : \n" + departure1 + "\n\nBandara Tujuan : \n" + arrival1 + "\n\n" + hasil1 + "\nKelas Anda : " + "\n" + hasil2);
            }
        });
    }

}
