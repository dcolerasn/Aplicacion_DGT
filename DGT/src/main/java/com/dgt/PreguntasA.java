package com.dgt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Alumno Tarde
 */
public class PreguntasA {
    public List <Pregunta> listaPreguntas;    
    public List <Pregunta> listaPreguntasEx;
    public List  listaNumeros;
    public int n = 0;
    private int nPreguntas = 10;
    private BufferedReader fichero;
    private File archivo;
    
    public PreguntasA(){
        listaPreguntas = new ArrayList<>();
        listaNumeros = new ArrayList<>();
        listaPreguntasEx = new ArrayList<>();        
        listaNumeros.clear();
//Creamos una listaPreguntas con todas las preguntas del archivo trafico.csv
      
        Random r = new Random();
        try {
            String a = "C:\\Archivos\\mediadgt\\traficoA.csv";
            fichero = new BufferedReader(new InputStreamReader(new FileInputStream(a), "utf-8"));  
            String linea;
            while((linea = fichero.readLine())!=null){
                String [] campos = linea.split(";");
                String enunciado =campos[0];
                String r1 = campos[1];
                String r2 = campos[2];
                String r3 = campos[3];
                String rc = campos[4];
                String ref = campos[5];
                listaPreguntas.add(new Pregunta(enunciado,r1,r2,r3,rc,ref));
            }

        } catch (IOException ex) {
           System.out.println(ex);
        }
        
    //Creamos una listaNumeros que contiene x(nPreguntas números números random sacados del tamaño de la listaPregutas
        while(listaNumeros.size()<nPreguntas){
            int numero = r.nextInt(listaPreguntas.size());
            if(!listaNumeros.contains(numero)){
                listaNumeros.add(numero);
            }
        }
        //Creamos una listaPreguntasEx en la que introducimos las preguntas seleccionadas por los 
        //números
            int cont = 0;
            while(listaPreguntasEx.size()!=nPreguntas){
                int num = (int) listaNumeros.get(cont);
                listaPreguntasEx.add(listaPreguntas.get(num));
                cont++;
            }
            listaPreguntas.clear();
        }


    public List getLista(){
        return listaPreguntasEx;
    }
    }



