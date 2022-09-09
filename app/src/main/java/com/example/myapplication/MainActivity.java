package com.example.myapplication;
 /*wrap content, abarca ancho y largo tod0
   dp. para margenes
    android:layout_below="@+id/"   abajo d'q
    android:inputType="numberPassword"  . ingresar datos
 */


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println();
    }
}