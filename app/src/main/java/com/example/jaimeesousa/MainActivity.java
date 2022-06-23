package com.example.jaimeesousa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2; // declarando as vars e seus tipos
    TextView resultText;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.TextNum1);
        edit2 = findViewById(R.id.TextNum2);
        resultText = findViewById(R.id.result);
    }

    public void Subtrair (View view) {
        num1 =  Integer.parseInt(edit1.getText().toString()); //
        num2 = Integer.parseInt(edit2.getText().toString());
        double result = num1 - num2;
        resultText.setText("O resultado da subtração foi " + Double.valueOf(result).toString());
    }
    public void Somar (View view) {
        num1 =  Integer.parseInt(edit1.getText().toString()); //
        num2 = Integer.parseInt(edit2.getText().toString());
        double result = num1 + num2;
        resultText.setText("O resultado da soma foi " + Double.valueOf(result).toString());
    }
    public void Multiplicar (View view) {
        num1 =  Integer.parseInt(edit1.getText().toString()); //
        num2 = Integer.parseInt(edit2.getText().toString());
        double result = num1 * num2;
        resultText.setText("O resultado da multiplicação foi " + Double.valueOf(result).toString());
    }
    public void Dividir (View view) {
        num1 =  Integer.parseInt(edit1.getText().toString()); //
        num2 = Integer.parseInt(edit2.getText().toString());
        double result = num1 / num2;
        resultText.setText("O resultado da divisão foi " + Double.valueOf(result).toString());
    }
}