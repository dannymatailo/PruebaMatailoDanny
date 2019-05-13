/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamatailodanny;

/**
 *
 * @author labctr
 */
public class Caja {
    int ancho;
    int alto;
    int profundo;

    public Caja() {
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }
    

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public int volumen(){
        return ancho*alto*profundo;
    }
    
}
