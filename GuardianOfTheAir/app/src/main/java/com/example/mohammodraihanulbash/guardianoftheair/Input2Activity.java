package com.example.mohammodraihanulbash.guardianoftheair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Input2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_input2, menu);
        return true;
    }


    public void backk(View view)
    {
        String button_text ;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Back")){
            Intent intent = new Intent (this,InputActivity.class);
            startActivity(intent);
        }
    }


    public void contribute(View view)
    {
        String button_text ;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Back")){
            Intent intent = new Intent (this,CityMapActivity.class);
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
