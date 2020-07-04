package com.example.webviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView web;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web=findViewById(R.id.web);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://www.google.com");
        WebSettings webSet=web.getSettings();
        webSet.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed(){
        if(web.canGoBack()){
            web.goBack();
        }else{
            super.onBackPressed();

        }
    }
}
