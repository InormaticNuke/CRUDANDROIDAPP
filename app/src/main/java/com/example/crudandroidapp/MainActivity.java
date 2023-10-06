package com.example.crudandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    String[] adress = new String[]{"Las Condes","Vitacura","Providencia","Lo Barnechea"};

    EditText edtRut, edtName,edtAdress;

    ListView list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtRut = (EditText) findViewById(R.id.edtrut);
        edtName = (EditText) findViewById(R.id.edtname);
        edtAdress = (EditText) findViewById(R.id.edtadress);
        spinner= (Spinner) = findViewById(R.id.spnID);
        list = (ListView) findViewById(R.id.listVW);


    }
}