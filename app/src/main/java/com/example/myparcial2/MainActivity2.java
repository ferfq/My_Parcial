package com.example.myparcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private EditText et1;
    private EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
    }

    public void enviar(View e){
        Intent i = new Intent(this, MainActivity3.class);
        i.putExtra("nombre",et1.getText().toString());
        i.putExtra("apellido",et2.getText().toString());
        startActivity(i);


    }

    public void volver(View d){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}