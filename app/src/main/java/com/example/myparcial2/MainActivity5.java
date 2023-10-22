package com.example.myparcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity5 extends AppCompatActivity {


    WebView wb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        wb1 = (WebView) findViewById(R.id.wb1);
        String URL = getIntent().getStringExtra("sitioweb");
        wb1.setWebViewClient(new WebViewClient());
        wb1.loadUrl("http://"+ URL);
    }
    public void vol(View R){
        Intent volver = new Intent(this, MainActivity4.class);
        startActivity(volver);
    }
}