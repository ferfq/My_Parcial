package com.example.myparcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    private EditText tx1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tx1 = (EditText)findViewById(R.id.Etb1);
    }
    public void navegar(View n){
        Intent j = new Intent( this, MainActivity5.class);
        j.putExtra("sitioweb", tx1.getText().toString());
        startActivity(j);
    }
    public void REGRE(View R){
        Intent volver = new Intent(this, MainActivity3.class);
        startActivity(volver);
    }
}