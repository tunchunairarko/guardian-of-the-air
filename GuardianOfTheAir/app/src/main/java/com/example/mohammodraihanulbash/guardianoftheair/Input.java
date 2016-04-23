package com.example.mohammodraihanulbash.guardianoftheair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Input extends AppCompatActivity {

//    Spinner spinner;
//    ArrayAdapter<CharSequence>adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);


//        spinner = (Spinner)findViewById(R.id.spinner2);
//        adapter = ArrayAdapter.createFromResource(this, R.array.city_names, android.R.layout.simple_spinner_dropdown_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + "selected", Toast.LENGTH_LONG).show();
//
//            }
//        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_input, menu);
        return true;
    }

    public void back(View view){

        String Button_text;
        Button_text = ((Button) view).getText().toString();
        if(Button_text.equals("Back")){
            Intent intent = new Intent(this,Dashboard.class);
            startActivity(intent);
        }
    }

    public void inputt(View view){

        String Button_text;
        Button_text = ((Button) view).getText().toString();
        if(Button_text.equals("Next")){
            Intent intent = new Intent(this,Input2.class);
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
