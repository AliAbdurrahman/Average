package com.studio.alba33.average;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText MTK, Bahasa, Kejuruan, Inggris;
    Button Count;
    TextView Average;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MTK = (EditText)findViewById(R.id.etMtk);
        Bahasa = (EditText)findViewById(R.id.etBahasa);
        Kejuruan = (EditText)findViewById(R.id.etKejuruan);
        Inggris = (EditText)findViewById(R.id.etInggris);
        Count = (Button)findViewById(R.id.btnCount);
        Average = (TextView)findViewById(R.id.txtAverage);

        Count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nMtk = MTK.getText().toString();
                String nBahasa = Bahasa.getText().toString();
                String nKejuruan = Kejuruan.getText().toString();
                String nInggris = Inggris.getText().toString();

                int aMtk = Integer.parseInt(nMtk);
                int aBahasa = Integer.parseInt(nBahasa);
                int aKejuruan = Integer.parseInt(nKejuruan);
                int aInggris = Integer.parseInt(nInggris);

                int rRata = aMtk + aBahasa + aKejuruan + aInggris / 4;
                if ((rRata >= 0 ) && (rRata <= 40)){
                    Average.setText("NIlai anda D");
                }else if ((rRata >= 41) && (rRata <= 65)){
                    Average.setText("Nilai anda C");
                }else if ((rRata >= 66) && (rRata <= 80)){
                    Average.setText("Nilai anda B");
                }else if ((rRata >= 81) && (rRata <= 100)){
                    Average.setText("Nilai anda A");
                }else {
                    Average.setText("Nilai anda tidak diketahui");
                }
            }
        });
    }
}
