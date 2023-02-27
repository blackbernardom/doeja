package com.example.bernardom.doeja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Page1Activity extends AppCompatActivity {

    private EditText etNome, etSexo,etndoacao,ettiposangue, etIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);


        etNome = (EditText) findViewById(R.id.etnome);
        etSexo = (EditText) findViewById(R.id.etsexo);
        etndoacao = (EditText) findViewById(R.id.etndoacao);
        ettiposangue = (EditText) findViewById(R.id.ettiposangue);
        etIdade = (EditText) findViewById(R.id.etidade);
    }
}
