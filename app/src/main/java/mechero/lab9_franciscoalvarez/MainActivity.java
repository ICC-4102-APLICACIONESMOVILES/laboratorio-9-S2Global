package mechero.lab9_franciscoalvarez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = (WebView)findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("http://demo.tutorialzine.com/2012/04/mobile-touch-gallery/");
        webView.setWebChromeClient(new WebChromeClient(){
            public void onConsoleMessage(String message){
                Log.d("Webview", message);
            }
        });
        webView.addJavascriptInterface(new WebAppInterface(this), "Android");
    }

    @Override
    public void onBackPressed() {
    }
}
