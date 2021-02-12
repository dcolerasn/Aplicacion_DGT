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
public class Preguntas {
    public List <Pregunta> listaPreguntas;    
    public List <Pregunta> listaPreguntasEx;
    public List listaNumeros;
    public int n = 0;
    final public int nPreguntas = 30;
    private BufferedReader fichero;
    private File archivo;
    
    public Preguntas(){
        listaPreguntas = new ArrayList<>();
        listaNumeros = new ArrayList<>();
        listaPreguntasEx = new ArrayList<>();
        Random r = new Random();
        
        while(listaNumeros.size()<nPreguntas){
            int numero = r.nextInt(100);
            if(!listaNumeros.contains(numero)){
                listaNumeros.add(numero);
            }
        }
        try {
            String a = "C:\\Archivos\\trafico.csv";
            fichero = new BufferedReader(new InputStreamReader(new FileInputStream(a), "utf-8"));  
            String linea;
            while((linea = fichero.readLine())!=null){
                String [] campos = linea.split(";");
                String enunciado =(campos[0]);
                String r1 = campos[1];
                String r2 = campos[2];
                String r3 = campos[3];
                String r4 = campos[4];
                String rc = campos[5];
                listaPreguntas.add(new Pregunta(enunciado,r1,r2,r3,r4,rc));
            }

        } catch (IOException ex) {
           System.out.println("El fichero no ha podido ser leido");
        }
            int cont = 0;
            while(listaPreguntasEx.size()!=nPreguntas){
                int num = (int) listaNumeros.get(cont);
                listaPreguntasEx.add(listaPreguntas.get(num));
            }
        }
    }


