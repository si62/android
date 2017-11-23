package com.example.si.testwebview;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by si on 23/11/2017.
 */

public class MyWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading (WebView view, String url) {
        if (Uri.parse(url).getHost().contains("ipm.edu.mo")) {
            // This is my web site, so do not override; let my WebView load the page
            return false;
        }

        // reject anything other
        return true;
    }
}
