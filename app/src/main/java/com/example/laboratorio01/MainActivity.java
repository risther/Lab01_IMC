package com.example.laboratorio01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final float[] imc = new float[1];
        Button btnCalcular= (Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView editPeso=(TextView) findViewById(R.id.editPeso);
                TextView editAltura=(TextView) findViewById(R.id.editAltura);
                TextView tvResultado=(TextView) findViewById(R.id.tvRespuesta);
                TextView tvDescripcion=(TextView) findViewById(R.id.tvDescripcion);
                TextView tvReco=(TextView) findViewById(R.id.tvReco);
                TextView tvRec2=(TextView) findViewById(R.id.tvRec2);
                int peso= Integer.parseInt(editPeso.getText().toString());
                float altura= Float.parseFloat(editAltura.getText().toString());
                imc[0] =peso/(altura*altura);
                if(imc[0]<18.5){
                    tvResultado.setText(imc[0]+"");
                    tvDescripcion.setText(R.string.rp1);
                    tvReco.setText(R.string.reco1);
                    tvRec2.setText(R.string.reco1_1);
                }else{
                    if (imc[0]<24.9){
                        tvResultado.setText(imc[0]+"");
                        tvDescripcion.setText(R.string.rp2);
                        tvReco.setText(R.string.reco2);
                        tvRec2.setText(R.string.reco2_1);
                    }else{
                        if (imc[0]<29.9){
                            tvResultado.setText(imc[0]+"");
                            tvDescripcion.setText(R.string.rp3);
                            tvReco.setText(R.string.reco3);
                            tvRec2.setText(R.string.reco3_1);
                        }else{
                            tvResultado.setText(imc[0]+"");
                            tvDescripcion.setText(R.string.rp4);
                            tvReco.setText(R.string.reco4);
                            tvRec2.setText(R.string.reco4_1);
                        }

                    }
                }
            }
        });
    }
}