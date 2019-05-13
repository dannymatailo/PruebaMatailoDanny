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
public class PruebaMatailoDanny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caja caja1=new Caja(3,2,6);
        int resultado=caja1.volumen();
        System.out.println("El volumen es      = " +resultado);
        Caja caja2=new Caja();
        caja2.setAncho(3);
        System.out.println("El ancho es        = " +caja2.getAncho());
        Caja caja3=new Caja();
        caja3.setAlto(2);
        System.out.println("La altura es       = " +caja3.getAlto());
        Caja caja4=new Caja();
        caja4.setProfundo(6);
        System.out.println("La profundidad es  = " +caja4.getProfundo());
    }
    }
    

