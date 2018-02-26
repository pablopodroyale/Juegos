package com.example.pablo.adivinador;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtView;
    TextView txtViewMuestra;
    String ingresoUsuario;
    ImageView imagenAdivino;
    Integer guess=0;
    Integer max = 100;
    Integer min = 0;
    String user;
    static Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView = (TextView) findViewById(R.id.textViewAdivine);
        txtViewMuestra=(TextView)findViewById(R.id.textViewMuestra);
        imagenAdivino=(ImageView)findViewById(R.id.imageViewAdivino);
        imagenAdivino.setImageDrawable(getResources().getDrawable(R.drawable.leon_genio_con_sombra));


        txtView.setText("Piense un número del 1 al 100, yo trataré de adivinarlo.Si el número que usted pensó es más grande, presione '+' en cambio, si es menor, presione '-'. Si adivino, apriete el boton adivinaste");
        guess = rand.nextInt(100) + 1;
        txtViewMuestra.setText("¿El número que ud pensó es " + guess + "?");


    }
    public void botonAdivinaste(View view){

        Toast.makeText(MainActivity.this,"gracias por jugar", Toast.LENGTH_SHORT).show();
        imagenAdivino.setImageDrawable(getResources().getDrawable(R.drawable.leon_genio_plano));

    }
    public void botonMas(View view){
        min = guess;
        guess = min + ((max - min) / 2);
        imagenAdivino.setImageDrawable(getResources().getDrawable(R.drawable.leon_genio_con_sombra));
        txtViewMuestra.setText("El número que ud pensó es " + guess + "?");

    }
    public void botonMenos(View view){
        max = guess;
        guess = min + ((max - min) / 2);
        txtViewMuestra.setText("El número que ud pensó es " + guess + "?");
        imagenAdivino.setImageDrawable(getResources().getDrawable(R.drawable.leon_genio_con_sombra));


    }






}
