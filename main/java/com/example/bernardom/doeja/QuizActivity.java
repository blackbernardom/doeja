package com.example.bernardom.doeja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {
    private TextView tvp1, tvp2, tvp3, tvp4, tvp5, tvp6, tvp7, tvp8, tvp9, tvp10;
    private RadioButton rbtnsim1, rbtnsim2, rbtnsim3, rbtnsim4, rbtnsim5, rbtnsim6,
            rbtnsim7, rbtnsim8, rbtnsim9, rbtnsim10, rbtnnao1, rbtnnao2, rbtnnao3, rbtnnao4,
            rbtnnao5, rbtnnao6, rbtnnao7, rbtnnao8, rbtnnao9, rbtnnao10;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        tvp1 = (TextView) findViewById(R.id.tvp1);
        tvp2 = (TextView) findViewById(R.id.tvp2);
        tvp3 = (TextView) findViewById(R.id.tvp3);
        tvp4 = (TextView) findViewById(R.id.tvp4);
        tvp5 = (TextView) findViewById(R.id.tvp5);
        tvp6 = (TextView) findViewById(R.id.tvp6);
        tvp7 = (TextView) findViewById(R.id.tvp7);
        tvp8 = (TextView) findViewById(R.id.tvp8);
        tvp9 = (TextView) findViewById(R.id.tvp9);
        tvp10 = (TextView) findViewById(R.id.tvp10);

        rbtnsim1 = (RadioButton) findViewById(R.id.rbtnsim1);
        rbtnsim2 = (RadioButton) findViewById(R.id.rbtnsim2);
        rbtnsim3 = (RadioButton) findViewById(R.id.rbtnsim3);
        rbtnsim4 = (RadioButton) findViewById(R.id.rbtnsim4);
        rbtnsim5 = (RadioButton) findViewById(R.id.rbtnsim5);
        rbtnsim6 = (RadioButton) findViewById(R.id.rbtnsim6);
        rbtnsim7 = (RadioButton) findViewById(R.id.rbtnsim7);
        rbtnsim8 = (RadioButton) findViewById(R.id.rbtnsim8);
        rbtnsim9 = (RadioButton) findViewById(R.id.rbtnsim9);
        rbtnsim10 = (RadioButton) findViewById(R.id.rbtnsim10);

        rbtnnao1 = (RadioButton) findViewById(R.id.rbtnnao1);
        rbtnnao2 = (RadioButton) findViewById(R.id.rbtnnao2);
        rbtnnao3 = (RadioButton) findViewById(R.id.rbtnnao3);
        rbtnnao4 = (RadioButton) findViewById(R.id.rbtnnao4);
        rbtnnao5 = (RadioButton) findViewById(R.id.rbtnnao5);
        rbtnnao6 = (RadioButton) findViewById(R.id.rbtnnao6);
        rbtnnao7 = (RadioButton) findViewById(R.id.rbtnnao7);
        rbtnnao8 = (RadioButton) findViewById(R.id.rbtnnao8);
        rbtnnao9 = (RadioButton) findViewById(R.id.rbtnnao9);
        rbtnnao10 = (RadioButton) findViewById(R.id.rbtnnao10);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);


    }
}
