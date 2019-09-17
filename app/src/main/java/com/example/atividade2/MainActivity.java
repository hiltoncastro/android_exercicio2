package com.example.atividade2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnQueAbreTelaComLinearLayoutVertical;
    private Button btnQueAbreTelaComLinearLayoutHorizontal;
    private Button btnQueAbreOMapa;
    private Button btnQueAbreTelaPassandoDadosParaEla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnQueAbreTelaComLinearLayoutVertical = (Button) findViewById(R.id.btnAbreLinearLayoutVertical);
        btnQueAbreTelaComLinearLayoutHorizontal = (Button) findViewById(R.id.btnAbreLinearLayoutHorizontal);
        btnQueAbreOMapa = (Button) findViewById(R.id.btnAbreMapa);
        btnQueAbreTelaPassandoDadosParaEla = (Button) findViewById(R.id.btnAbreTelaPassandoDados);

        btnQueAbreTelaComLinearLayoutVertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, TelaLinearLayoutVertical.class);
                startActivity(intent);
            }
        });
        btnQueAbreTelaComLinearLayoutHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, TelaLinearLayoutHorizontal.class);
                startActivity(intent);
            }
        });
        btnQueAbreOMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, TelaLinearLayoutMapa.class);
                startActivity(intent);
            }
        });
        btnQueAbreTelaPassandoDadosParaEla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
                Toast.makeText(MainActivity.this, "Vamos passar pra outra activity : " + editTextNome.getText(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, TelaRecebeDados.class);
                intent.putExtra("nome", editTextNome.getText().toString());
                startActivity(intent);


            }
        });

    }
}