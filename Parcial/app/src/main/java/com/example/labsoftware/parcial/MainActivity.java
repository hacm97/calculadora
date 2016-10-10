package com.example.labsoftware.parcial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton0 = (Button)findViewById(R.id.button4);
        boton0.setOnClickListener(this);
        Button botonigu = (Button)findViewById(R.id.button8);
        botonigu.setOnClickListener(this);
        Button botonpunt = (Button)findViewById(R.id.button13);
        botonpunt.setOnClickListener(this);
        Button botonmas = (Button)findViewById(R.id.button25);
        botonmas.setOnClickListener(this);
        Button boton3 = (Button)findViewById(R.id.button3);
        boton3.setOnClickListener(this);
        Button boton2 = (Button)findViewById(R.id.button7);
        boton2.setOnClickListener(this);
        Button boton1 = (Button)findViewById(R.id.button12);
        boton1.setOnClickListener(this);
        Button botonres = (Button)findViewById(R.id.button24);
        botonres.setOnClickListener(this);
        Button boton6 = (Button)findViewById(R.id.button2);
        boton6.setOnClickListener(this);
        Button boton5 = (Button)findViewById(R.id.button6);
        boton5.setOnClickListener(this);
        Button boton4 = (Button)findViewById(R.id.button11);
        boton4.setOnClickListener(this);
        Button botonpor = (Button)findViewById(R.id.button23);
        botonpor.setOnClickListener(this);
        Button boton9 = (Button)findViewById(R.id.button);
        boton9.setOnClickListener(this);
        Button boton8 = (Button)findViewById(R.id.button5);
        boton8.setOnClickListener(this);
        Button boton7 = (Button)findViewById(R.id.button9);
        boton7.setOnClickListener(this);
        Button botondiv = (Button)findViewById(R.id.button22);
        botondiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        TextView pant = (TextView)findViewById(R.id.texto);
        int select = v.getId();

        switch (select){

            case R.id.button4:
                pant.setText("0");
                break;
            case R.id.button3:
                pant.setText("3");
                break;
            case R.id.button7:
                pant.setText("2");
                break;
            case R.id.button12:
                pant.setText("1");
                break;
            case R.id.button2:
                pant.setText("6");
                break;
            case R.id.button6:
                pant.setText("5");
                break;
            case R.id.button11:
                pant.setText("4");
                break;
            case R.id.button:
                pant.setText("9");
                break;
            case R.id.button5:
                pant.setText("8");
                break;
            case R.id.button9:
                pant.setText("7");
                break;
            case R.id.button13:
                pant.setText(".");
                break;

        }

    }
}