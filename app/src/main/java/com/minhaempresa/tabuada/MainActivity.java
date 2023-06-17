package com.minhaempresa.tabuada;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText numero; // Campo onde o usuário digita o número
    private TextView titulo, resultadoTextView; // Título do app e local onde aparece a tabuada
    int resposta = 0; // Variável global para os resultados

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Link do layout
        numero = findViewById(R.id.numero); // Id do campo número
        titulo = findViewById(R.id.title); // Id do campo de título
        resultadoTextView = findViewById(R.id.resultadoTextView); // Id do campo de resultados
    }
    public void resultado (View view){
        switch (view.getId()) {
            case R.id.button: // Id do botão
                StringBuffer buffer = new StringBuffer();
                String fs = numero.getText().toString(); // Traz o número digitado no input
                int valor = Integer.parseInt(fs); // Converte para inteiro

                for (int mult = 1; mult <= 10; mult++) { // Multiplicador vai de 1 a 10
                    resposta = (mult * valor); // Multiplica os valores
                    buffer.append(valor + " x " + mult + " = " + resposta + "\n"); // Coloca os textos o resultado
                }
                resultadoTextView.setText(buffer); // Traz os resultados para a TextView
                titulo.setText("Tabuada do " + valor); // Altera o título do app
                break; // Encerra o laço de repetição
        }
    }
}
