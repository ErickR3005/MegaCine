package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Random;

public class Juego extends AppCompatActivity {
    /*Dictionary<String,String>  juego = new Dictionary<String, String>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public Enumeration<String> keys() {
            return null;
        }

        @Override
        public Enumeration<String> elements() {
            return null;
        }

        @Override
        public String get(Object o) {
            return null;
        }

        @Override
        public String put(String s, String s2) {
            return null;
        }

        @Override
        public String remove(Object o) {
            return null;
        }
    };*/
    ArrayList preguntas = new ArrayList();
    ArrayList respuestas= new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        preguntas.add(" ¿ Qué animal es la mascota de Jazmín en Aladdin?");
        preguntas.add("¿Cómo se llama el actor protagonista de  Solo en casa");
        preguntas.add("¿Cómo se llama el pájaro símbolo de los Juegos del Hambre?");
        preguntas.add("¿Qué personaje de Disney perdió su zapato de cristal ?");
        preguntas.add(" ¿Cómo se llama la serie de dibujos animados en la que sale un gato cósmico del siglo XXI?");

        respuestas.add("Mono");
        respuestas.add("Macaulay Culkin");
        respuestas.add("Sinsajo");
        respuestas.add("Cenicienta");
        respuestas.add("Doraemon");

        /*juego.put("¿ Qué animal es la mascota de Jazmín en Aladdin?", "Mono");
        juego.put("¿Cómo se llama el actor protagonista de \" Solo en casa\"?","Macaulay Culkin");
        juego.put("¿Cómo se llama el pájaro símbolo de los Juegos del Hambre?","Sinsajo");
        juego.put("¿Qué personaje de Disney perdió su zapato de cristal ?","Cenicienta");
        juego.put(" ¿Cómo se llama la serie de dibujos animados en la que sale un gato cósmico del siglo XXI?", "Doraemon");
        Random rd= new Random();


        int rCorrecta=0; //contador respeustas correctas
        int rF=0; //contador respustas falladas
        for(int x =0;x<=4;x++){
                int i = rd.nextInt(5);
<<<<<<< HEAD
                TextView texto = findViewById(R.id.pregunta_txt);
            ImageView foto=findViewById(R.id.foto);
            //foto.setImageURI();*/
    }
    public void correcta(View v){
        startActivity(new Intent(this,Victoria.class));
    }
    public void incorrecta(View v) {
        startActivity(new Intent(this, Derrota.class));
    }
           /*String p = (String) preguntas.get(i);
           String r= (String) respuestas.get(i);
            TextView texto = findViewById(R.id.pregunta_txt);
            texto.setText(p);
            Button b1= findViewById(R.id.btn_opcion1);
            Button b2= findViewById(R.id.btn_opcion2);
            Button b3= findViewById(R.id.btn_opcion3);
            Button b4= findViewById(R.id.btn_opcion4);
            b3.setText(r);


           if(rF==1){
               Intent intent = new Intent(this,Derrota.class);
               startActivity(intent);
           }
        else if (rCorrecta == 5){
               Intent intent = new Intent(this,Victoria.class);
               startActivity(intent);
           }



    }



    }*/


}