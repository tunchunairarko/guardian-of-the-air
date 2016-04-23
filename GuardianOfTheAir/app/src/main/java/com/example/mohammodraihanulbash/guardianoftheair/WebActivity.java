package com.example.mohammodraihanulbash.guardianoftheair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        }


    public void C(View view){

        String Button_text;
        Button_text = ((Button) view).getText().toString();
        if(Button_text.equals("Carbon")){
            String url = "https://worldview.earthdata.nasa.gov/?p=geographic&l=VIIRS_SNPP_CorrectedReflectance_TrueColor,MODIS_Aqua_CorrectedReflectance_TrueColor,MODIS_Terra_CorrectedReflectance_TrueColor,Reference_Labels,Reference_Features,Coastlines&t=2016-04-21&v=-91.828125,-88.3125,292.359375,94.78125";
            WebView wv = (WebView) this.findViewById(R.id.webView);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.loadUrl(url);
        }
    }





    public void L(View view){

        String Button_text;
        Button_text = ((Button) view).getText().toString();
        if(Button_text.equals("Fire Ash")){
            String url = "https://worldview.earthdata.nasa.gov/?p=geographic&l=VIIRS_SNPP_CorrectedReflectance_TrueColor,MODIS_Aqua_CorrectedReflectance_TrueColor,MODIS_Terra_CorrectedReflectance_TrueColor,Reference_Labels,Reference_Features,Coastlines&t=2016-04-21&v=-91.828125,-88.3125,292.359375,94.78125";
            WebView wv = (WebView) this.findViewById(R.id.webView);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.loadUrl(url);
        }
    }


    public void S(View view){

        String Button_text;
        Button_text = ((Button) view).getText().toString();
        if(Button_text.equals("Sulfur")){
            String url = "https://worldview.earthdata.nasa.gov/";
            WebView wv = (WebView) this.findViewById(R.id.webView);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.loadUrl(url);
        }
    }



    public void D(View view){

        String Button_text;
        Button_text = ((Button) view).getText().toString();
        if(Button_text.equals("Dust")){
            String url = "https://worldview.earthdata.nasa.gov/?p=geographic&l=VIIRS_SNPP_CorrectedReflectance_TrueColor,MODIS_Aqua_CorrectedReflectance_TrueColor,MODIS_Terra_CorrectedReflectance_TrueColor,Aqua_Orbit_Asc,AIRS_Dust_Score,Reference_Labels,Reference_Features,Coastlines&t=2016-04-22&v=5.681394377289038,-25.46188877746814,197.77514437728905,66.08498622253185";
            WebView wv = (WebView) this.findViewById(R.id.webView);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.loadUrl(url);
        }
    }


    public void P(View view){

        String Button_text;
        Button_text = ((Button) view).getText().toString();
        if(Button_text.equals("Pollutant concentration")){
            String url = "https://www3.epa.gov/airquality/airdata/ad_maps.html";
            WebView wv = (WebView) this.findViewById(R.id.webView);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.loadUrl(url);
        }
    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_web, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
