package pt.pdm.ficha3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InserirDadosUtilizador extends AppCompatActivity {

    private EditText txtNome, txtIdade, txtCC, txtNIF, txtMorada;
    private Button btnInserir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.txtNome);
        txtIdade = findViewById(R.id.txtIdade);
        txtCC = findViewById(R.id.txtCC);
        txtNIF = findViewById(R.id.txtNIF);
        txtMorada = findViewById(R.id.txtMorada);
        btnInserir = findViewById(R.id.btnInserir);

        btnInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendInformation = new Intent(InserirDadosUtilizador.this, VisualizarDadosUtilizador.class);
                sendInformation.putExtra("nome", txtNome.getText().toString());
                sendInformation.putExtra("idade", txtIdade.getText().toString());
                sendInformation.putExtra("cc", txtCC.getText().toString());
                sendInformation.putExtra("nif", txtNIF.getText().toString());
                sendInformation.putExtra("morada", txtMorada.getText().toString());

                startActivity(sendInformation);
            }
        });
    }
}