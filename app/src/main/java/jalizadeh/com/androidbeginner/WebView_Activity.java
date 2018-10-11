package jalizadeh.com.androidbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class WebView_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_);


        Button btnOB = (Button) findViewById(R.id.btnOpenBrowser);
        final WebView webView = (WebView) findViewById(R.id.webView);

        btnOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //enable JavaScript in webview
                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);

                webView.loadUrl("http://www.jalizadeh.com");
            }
        });

    }
}
