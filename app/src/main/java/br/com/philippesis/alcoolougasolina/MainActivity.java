package br.com.philippesis.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editAlcool, editGasolina;
    private Button btnVerificar;
    private TextView txtExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlcool = (EditText) findViewById(R.id.editAlcool);
        editGasolina = (EditText) findViewById(R.id.editGasolina);
        btnVerificar = (Button) findViewById(R.id.btnVerificar);
        txtExibicao = (TextView) findViewById(R.id.txtExibicao);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String alcool = editAlcool.getText().toString();
                String gasolina = editGasolina.getText().toString();

                if ( alcool.isEmpty() || gasolina.isEmpty() ) {
                    txtExibicao.setText("Um ou ambos os valores estão em branco!");
                } else {

                    if ( (Double.parseDouble(alcool) / Double.parseDouble(gasolina)) >= 0.7) {
                        txtExibicao.setText("Compensa abastecer com gasolina! ;-)");
                    } else {
                        txtExibicao.setText("Compensa abastecer com álcool! ;-)");
                    }

                }

            }
        });

    }
}
