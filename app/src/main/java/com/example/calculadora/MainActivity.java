package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declarando variáveis:
    TextView edtTxtResult, strPronto;
    EditText edtTxtEntrada;
    EditText edtTxtEntrada2;
    InputMethodManager imm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ocultar teclado:
        imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);

        // Ligar Java com XML:
        edtTxtResult = (TextView) findViewById(R.id.edtTxtResult);
        edtTxtEntrada = (EditText) findViewById(R.id.edtTxtEntrada);
        edtTxtEntrada2 = (EditText) findViewById(R.id.edtTxtEntrada2);

    }

    public void ClickSomar(View view) {

        // Verificação para evitar o app crachar:
        boolean ok = true;
        if (edtTxtEntrada.getText().toString().trim().isEmpty()) {
            ok = false;
            edtTxtEntrada.setError(getString(R.string.msgErro));
        }
        if (edtTxtEntrada2.getText().toString().trim().isEmpty()) {
            ok = false;
            edtTxtEntrada2.setError(getString(R.string.msgErro));
        }
        if (ok) {

            // Capturar dados e realizar a operação:
            Float n1 = Float.parseFloat(edtTxtEntrada.getText().toString());
            Float n2 = Float.parseFloat(edtTxtEntrada2.getText().toString());
            Float soma = n1 + n2;

            // Ocultar teclado:
            imm.hideSoftInputFromWindow(edtTxtEntrada.getWindowToken(), 0);

            // Mostrar resultado:
            edtTxtResult.setText(String.format("%.2f", soma));

            // Cor personalizada da fonte:
            edtTxtResult.setTextColor(getResources().getColor(R.color.edtTxtResult));

            // Mensagem toast:
            Toast.makeText(getApplicationContext(), getString(R.string.strPronto), Toast.LENGTH_SHORT).show();
        }
    }

    public void ClickSub(View view) {

        // Mensagem de erro na entrada de dados:
        boolean ok = true;
        if (edtTxtEntrada.getText().toString().trim().isEmpty()) {
            ok = false;
            edtTxtEntrada.setError(getString(R.string.msgErro));
        }
        if (edtTxtEntrada2.getText().toString().trim().isEmpty()) {
            ok = false;
            edtTxtEntrada.setError(getString(R.string.msgErro));
        }
        if (ok) {
            Float n1 = Float.parseFloat(edtTxtEntrada.getText().toString());
            Float n2 = Float.parseFloat(edtTxtEntrada2.getText().toString());
                imm.hideSoftInputFromWindow(edtTxtEntrada.getWindowToken(), 0);
            Float sub = n1 - n2;
            edtTxtResult.setText(String.format("%.2f", sub));

            Toast.makeText(getApplicationContext(), getString(R.string.strPronto), Toast.LENGTH_SHORT).show();
        }
    }
    public void clickMult(View view) {
        boolean ok = true;
        if (edtTxtEntrada.getText().toString().trim().isEmpty()) {
            ok = false;
            edtTxtEntrada.setError(getString(R.string.msgErro));
        }
        if (edtTxtEntrada2.getText().toString().trim().isEmpty()) {
            ok = false;
            edtTxtEntrada2.setError(getString(R.string.msgErro));
        }
        if (ok) {
            Float n1 = Float.parseFloat(edtTxtEntrada.getText().toString());
            Float n2 = Float.parseFloat(edtTxtEntrada2.getText().toString());
                imm.hideSoftInputFromWindow(edtTxtEntrada.getWindowToken(), 0);
            Float mult = n1 * n2;
            edtTxtResult.setText(String.format("%.2f", mult));

            Toast.makeText(getApplicationContext(), getString(R.string.strPronto), Toast.LENGTH_SHORT).show();
        }
    }
    public void clickDiv(View view) {
        boolean ok = true;
        if (edtTxtEntrada.getText().toString().trim().isEmpty()) {
            ok = false;
            edtTxtEntrada.setError(getString(R.string.msgErro));
        }
        if (edtTxtEntrada2.getText().toString().trim().isEmpty()) {
            ok = false;
            edtTxtEntrada2.setError(getString(R.string.msgErro));
        }
        if (ok) {
            Float n1 = Float.parseFloat(edtTxtEntrada.getText().toString());
            Float n2 = Float.parseFloat(edtTxtEntrada2.getText().toString());
                imm.hideSoftInputFromWindow(edtTxtEntrada.getWindowToken(), 0);
            Float div = n1 / n2;
            edtTxtResult.setText(String.format("%.2f", div));

            Toast.makeText(getApplicationContext(), getString(R.string.strPronto), Toast.LENGTH_SHORT).show();
        }
    }
}