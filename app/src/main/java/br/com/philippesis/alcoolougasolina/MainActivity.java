package br.com.philippesis.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    }
}
