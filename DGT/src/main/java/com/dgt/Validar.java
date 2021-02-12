/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dgt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno Tarde
 */
public class Validar {
    public List <Pregunta> preguntasAcertadas = new ArrayList<>();
    public List <Pregunta> preguntasErradas = new ArrayList<>();
    public boolean Validar(Pregunta p,String resp){
        if(p.getRc()==resp){
            preguntasAcertadas.add(p);
            return true;
        }
        else{
            preguntasErradas.add(p);
            return false;
        }
    }

    public List<Pregunta> getPreguntasAcertadas() {
        return preguntasAcertadas;
    }

    public List<Pregunta> getPreguntasErradas() {
        return preguntasErradas;
    }
}
