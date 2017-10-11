package com.example.lucas.tppolytech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Définissez votre vue, rien de plus. Tout sera pris en charge par le fragment qui affiche les données
        setContentView(R.layout.activity_main);
        //Retrouver votre fragment en utilisant son identifiant (si besoin)$
    }
}
