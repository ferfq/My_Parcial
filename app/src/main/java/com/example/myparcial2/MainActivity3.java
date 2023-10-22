package com.example.myparcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv = (TextView)findViewById(R.id.tv);

        String nombre = getIntent() .getStringExtra("nombre");
        String apellido = getIntent() .getStringExtra("apellido");
        tv.setText("Bienvenida" + nombre+ "" + apellido);
    }
    public void REGRESAR(View R){
        Intent volver = new Intent(this, MainActivity2.class);
        startActivity(volver);
    }
    public void INICIO(View R){
        Intent volverI = new Intent(this, MainActivity.class);
        startActivity(volverI);
    }
}