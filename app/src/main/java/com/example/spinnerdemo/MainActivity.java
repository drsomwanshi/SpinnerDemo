package com.example.spinnerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    Spinner sp1=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String city[]={"Latur","Pune","Mumbai","Aurangabad"};
        ArrayAdapter <String> adapter=new
                ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,city);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp1=findViewById(R.id.sp1);
        sp1.setAdapter(adapter);
        sp1.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item=sp1.getItemAtPosition(position).toString();
        Toast.makeText(MainActivity.this, "Selected Item=" + item, Toast.LENGTH_SHORT).show();

        Toast toast=Toast.makeText(this,"Hello COCSIT\nLatur\n7896896\ncocsit@cosit.com",Toast.LENGTH_SHORT);
        toast.setMargin(50,50);

        toast.setGravity(Gravity.TOP, 0, 0);
        toast.show();




    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}