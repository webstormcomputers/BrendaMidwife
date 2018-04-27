package com.webstormcomputers.brendamidwife;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void phoneOnClick(View view){
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "1-409-739-3904"));
        startActivity(phoneIntent);
    }


    public void webSiteButtonOnClick(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.easttexasmidwife.com"));
        startActivity(browserIntent);
    }
}
