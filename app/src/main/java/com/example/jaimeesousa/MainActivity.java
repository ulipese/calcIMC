package com.example.jaimeesousa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editPeso, editAltura;
    TextView resultText;
    double peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.inputPeso);
        editAltura = findViewById(R.id.inputAltura);
        resultText = findViewById(R.id.result);
    }
    public void CalcularIMC (View view) {
        peso =  Double.parseDouble(editPeso.getText().toString());
        altura = Double.parseDouble(editAltura.getText().toString());
        double result = Math.round(peso / (Math.pow(altura, 2)));

        if (result < 18.5) {
            resultText.setText("O seu IMC é: " + Double.valueOf(result).toString() + ", você está abaixo do peso.");
        }
        if (result >= 18.6 && result < 25) {
            resultText.setText("O seu IMC é: " + Double.valueOf(result).toString() + ", você está no peso ideal.");
        }
        if (result >= 25 && result < 30) {
            resultText.setText("O seu IMC é: " + Double.valueOf(result).toString() + ", você está pouco acima do peso ideal.");
        }
        if (result >= 30) {
            resultText.setText("O seu IMC é: " + Double.valueOf(result).toString() + ", você está muito acima do peso ideal.");
        }
    }
}