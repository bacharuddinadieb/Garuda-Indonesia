package id.sch.smktelkom_mlg.tugas01.xirpl5007.garudaindonesia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etnama;
    EditText etdate;
    Button bok;
    TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnama = (EditText) findViewById(R.id.nama);
        etdate = (EditText) findViewById(R.id.date);
        bok = (Button) findViewById(R.id.button);
        tvhasil = (TextView) findViewById(R.id.hasile);
        bok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama1 = etnama.getText().toString();
                String date1 = etdate.getText().toString();
                tvhasil.setText("Nama Pemesan : " + nama1 + "\nTanggal Berangkat : " + date1);
            }
        });
    }

}
