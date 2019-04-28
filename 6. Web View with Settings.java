
 public void webs()
{

 	String url="http://www.dialcom.lk";
        WebView wv=(WebView)this.findViewById(R.id.wee); //wv - web view name
        wv.setWebViewClient(new WebViewClient()); //To avoid opening phone browser instead of webView
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl(url);

        wv.getSettings().setLoadWithOverviewMode(true);
        wv.getSettings().setUseWideViewPort(true);
        wv.getSettings().setSupportZoom(true);
        wv.getSettings().setBuiltInZoomControls(true); //Physical Zoom Buttons
}

// Put In the Manifest to avoid reload the page after rotating

        <activity android:name=".Browse"

            android:configChanges="orientation|screenSize" //This part only

            ></activity>
            
            
