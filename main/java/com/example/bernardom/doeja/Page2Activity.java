package com.example.bernardom.doeja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Page2Activity extends AppCompatActivity {
    private EditText etLocalizacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);


        etLocalizacao = (EditText)findViewById(R.id.etLocalizacao);
    }
}
