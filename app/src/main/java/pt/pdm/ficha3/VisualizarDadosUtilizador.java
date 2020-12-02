package pt.pdm.ficha3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VisualizarDadosUtilizador extends AppCompatActivity {

    private TextView nome, idade, cc, nif, morada;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_utilizador);

        btnVoltar = findViewById(R.id.btnVoltar);
        nome = findViewById(R.id.insereNome);
        idade = findViewById(R.id.insereIdade);
        cc = findViewById(R.id.insereCC);
        nif = findViewById(R.id.insereNIF);
        morada = findViewById(R.id.insereMorada);

        Bundle extras = getIntent().getExtras();
        String tvNome = extras.getString("nome");
        String tvIdade = extras.getString("idade");
        String tvCC = extras.getString("cc");
        String tvNif = extras.getString("nif");
        String tvMorada = extras.getString("morada");

        nome.setText(tvNome);
        idade.setText(tvIdade);
        cc.setText(tvCC);
        nif.setText(tvNif);
        morada.setText(tvMorada);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}