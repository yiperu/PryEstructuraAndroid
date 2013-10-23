package com.apps4s.pryestructuraandroid;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.cad1);
        tv2 = (TextView)findViewById(R.id.cad2);

        boolean condicion = false;
        if (condicion){
            tv1.setText("Me llamo Henry");
        } else {
            tv1.setText("Mi apellido es Ambicho");
        }
        // Declaracion de Variables:
        // Enteros
        int numero = 1000;
        // Cademas
        String cadena1 = "Hola, esto es una cadena";
        // Decimales
        double decimal = 12.65;
        // Booleanos
        boolean x1 = false;
        boolean x2 = true;

        //Arreglos
        int [] arreglo1 = new int[] {10,23,45,67,123,146,278};

        // Mostrar el dato en un TextView
        tv2 = (TextView)findViewById(R.id.cad2);
        String recuperado = tv2.getText().toString();
        tv2.setText(recuperado+" \n Tutorial Android");
        tv2.setTextSize(20);
        tv2.setTextColor(Color.RED);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
