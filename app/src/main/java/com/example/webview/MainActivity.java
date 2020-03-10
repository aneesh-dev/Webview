package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = findViewById(R.id.webview);
        String ss="http://www.indiaexams.org/";

        //to load html data
       /*String customHtml = "<html><body><h1>Hello, WebView</h1></body></html>";
        webView.loadData(customHtml, "text/html", "UTF-8");*/

        //to load html url
     webView.getSettings().setJavaScriptEnabled(true);
     webView.getSettings().setAppCacheEnabled(true);
        webView.loadUrl(ss);
    }
}
