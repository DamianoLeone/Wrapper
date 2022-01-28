package com.example.wrapper;

import android.content.Context;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gestorefile {
    String nome;
    public Gestorefile(String nome){
        this.nome=nome;
    }
    public String leggiFile(String nome, Context c){
        String str="";//serve la classe buffered reader siccome voglio leggere il file.txt riga per riga
        BufferedReader br=new BufferedReader(new InputStreamReader(c.openFileInput(filedaleggere)))//c sta per contesto che bisogna passare
        str=br.readLine();
    }

    public void scriviFile(String nome,String testo){

    }
}
