package com.example.pablo.adivinador;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenActivity extends AppCompatActivity {
    private static final long SPLASH_SCREEN_DELAY = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        // ESTABLECE QUE LA ORIENTACION SEA VERTICAL.
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        setContentView(R.layout.splash_screen);

        Toast.makeText(SplashScreenActivity.this, "Preparense para mis poderes mentales ah re!!Dany Vazquez te venceremos!!", Toast.LENGTH_LONG).show();
        TimerTask task = new TimerTask() {
            @Override
            public void run(){

                // COMIENZO DE LA PROXIMA ACTIVIDAD.
                Intent mainIntent = new Intent().setClass(
                        SplashScreenActivity.this, MainActivity.class);
                startActivity(mainIntent);

                // CERRAR LA ACTIVIDAD PARA QUE EL USUARIO NO SEA CAPAZ DE IR PARA ATRAS PRESIONANDO EL BOTON "BACK BUTTON".
                finish();
            }
        };

        // SIMULA UN PROCESO LARGO DE COMIENZO DE APLICACION.
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
    }
}

