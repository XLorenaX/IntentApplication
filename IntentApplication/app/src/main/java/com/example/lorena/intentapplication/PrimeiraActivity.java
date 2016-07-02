package com.example.lorena.intentapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.manoel.intentapplication.R;

public class PrimeiraActivity extends AppCompatActivity {// questão 1

    private EditText editext;
    private Button botao = (Button) findViewById(R.id.transicao);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        editext = (EditText) findViewById(R.id.edtext); //questão 1
        Log.i("IntentApplication", editext.toString());// questão 1
        Toast tt = Toast.makeText(PrimeiraActivity.this, editext.toString(), Toast.LENGTH_LONG); // questão2
        tt.show();

        botao.setOnClickListener(new View.OnClickListener(){  //questão 3
            public void onClick(View view){
                Intent in= new Intent(PrimeiraActivity.this, SegundaActivity.class);
                String chave  = "chave";
                in.putExtra(chave, editext.toString());
                startActivity(in);
            }
        });


    }





}
