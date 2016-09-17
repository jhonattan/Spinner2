package com.example.android.spinner2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Spinner spinner3;
    private Spinner spinner4;
    private Spinner spinner5;

    private EditText editText;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner5 = (Spinner) findViewById(R.id.spinner5);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);

        ArrayAdapter<String> adapter;
        String[] productos = {"Otoño", "Invierno", "Verano"};
        String[] color = {"Rojo", "Verde", "Amarillo"};
        String[] talla = {"XS", "S", "M"};
        String[] cantidad = new String[50];

        for(int i=0; i<cantidad.length ; i++){
            cantidad[i]=(i+1) + "";
        }



        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, productos);
        spinner.setAdapter(adapter);

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, color);
        spinner3.setAdapter(adapter);

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, talla);
        spinner4.setAdapter(adapter);

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, cantidad);
        spinner5.setAdapter(adapter);


    }

    public void seleccionado(View view) {

         int precio = Integer.valueOf(editText.getText().toString());
         int preciotottal = precio * Integer.valueOf(spinner5.getSelectedItem().toString());

        editText2.setText("Por "+spinner5.getSelectedItem().toString()+" polo(s) "+ spinner.getSelectedItem().toString()+" de color "+spinner3.getSelectedItem().toString()+", "+"talla "+ spinner4.getSelectedItem().toString()+
        " pagara: "+ preciotottal);
    }
}
