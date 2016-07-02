package com.example.lorena.intentapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.manoel.intentapplication.R;

public class SegundaActivity extends AppCompatActivity {

    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {    // questão 3
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent i = getIntent(); // questão 4
        Bundle b = i.getExtras();  // questão 4
        String chave = "chave";  // questão 4
        textview.setText(b.getString(chave));  // questão 4

    }

}
