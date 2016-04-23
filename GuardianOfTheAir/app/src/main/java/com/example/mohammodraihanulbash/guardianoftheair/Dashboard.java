package com.example.mohammodraihanulbash.guardianoftheair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dashboard, menu);
        return true;
    }


    public void citynews(View view){

        String Button_text;
        Button_text = ((Button) view).getText().toString();
        if(Button_text.equals(".")){
            Intent intent = new Intent(this,SearchCity.class);
            startActivity(intent);
        }
    }


    public void areanews(View view){

        String Button_text;
        Button_text = ((Button) view).getText().toString();
        if(Button_text.equals(".")){
            Intent intent = new Intent(this,AreaNews.class);
            startActivity(intent);
        }
    }

    public void input1(View view){

        String Button_text;
        Button_text = ((Button) view).getText().toString();
        if(Button_text.equals(".")){
            Intent intent = new Intent(this,Input.class);
            startActivity(intent);
        }
    }


    public void web(View view){

        String Button_text;
        Button_text = ((Button) view).getText().toString();
        if(Button_text.equals(" ")){
            Intent intent = new Intent(this,Profile.class);
            startActivity(intent);
        }
    }


    public void webb(View view){

        String Button_text;
        Button_text = ((Button) view).getText().toString();
        if(Button_text.equals(" ")){
            Intent intent = new Intent(this,WebActivity.class);
            startActivity(intent);
        }
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
