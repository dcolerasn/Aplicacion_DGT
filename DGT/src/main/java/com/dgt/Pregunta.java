/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dgt;

/**
 *
 * @author Alumno Tarde
 */
public class Pregunta {

    private String enunciado;
    private String r1;
    private String r2;
    private String r3;
    private String r4;
    private String rc;
    private String rd;
    private String ref;

    public Pregunta(String enunciado, String r1, String r2, String r3, String rc, String ref) {
        this.enunciado = enunciado;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.rc = rc;
        this.ref = ref;
        this.rd = null;
    }

    public String getRd() {
        return rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }
    
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getR1() {
        return r1;
    }

    public void setR1(String r1) {
        this.r1 = r1;
    }

    public String getR2() {
        return r2;
    }

    public void setR2(String r2) {
        this.r2 = r2;
    }

    public String getR3() {
        return r3;
    }

    public void setR3(String r3) {
        this.r3 = r3;
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }
    
    
}
