/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

/**
 *
 * @author DANIELCASTELAO\vmontestovar
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
     ClasseAde A =  new ClasseAde ( ) ;
      ClasseAde B =  new ClasseAde ( 20 ) ;
     ClasseAde C =  new ClasseAde ( 20 , 40 ) ;
      System.out.println( "El objeto _a: _ contiene:"  +A.getValorPrimari()+  ","  + A.getValorSecundari()) ;
       System.out.println( "El objeto _B: _ contiene:"  + B.getValorPrimari()+  ","  + B.getValorSecundari()) ;
      System.out.println( "El objeto _c: _ contiene:"  + C.getValorPrimari()+  ","  + C.getValorSecundari()) ;
     }
    }
    

