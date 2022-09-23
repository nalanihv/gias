package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class PruebaActivity extends AppCompatActivity {
private ListView lvMostrar;
private Button btBorrar;
private Button btIngresar;
private EditText etParaIngresar;
private ArrayList<Float>numeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);

         btIngresar=findViewById(R.id.btIngresar);
         btBorrar=findViewById(R.id.btBorrar);
         etParaIngresar=findViewById(R.id.etParaIngresar);
         lvMostrar=findViewById(R.id.lvMostrar);
         numeros=new ArrayList<>();

        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,numeros);

        btBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeros.clear();
            }
        });

        btIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              int aux= Integer.parseInt(etParaIngresar.getText().toString().trim());
                float suma=0, promedio=0;

                numeros.add((float) aux);//recibe el numero
                etParaIngresar.setText(null);//vacia el texto
                adapter.notifyDataSetChanged();//avisa qu ecambia el valor
                lvMostrar.setAdapter(adapter); //muestra el numero en el listview
                for (int i = 0; i <numeros.size()-1 ; i++) {
                    suma= suma + numeros.get(i);

                }
                promedio=suma/numeros.size();

                ArrayAdapter adapter1=new ArrayAdapter(getApplicationContext(), (int) suma);
                lvMostrar.setAdapter(adapter1);
                ArrayAdapter adapter2=new ArrayAdapter(getApplicationContext(), (int) promedio);
                lvMostrar.setAdapter(adapter2);





            }
        });
    }



}