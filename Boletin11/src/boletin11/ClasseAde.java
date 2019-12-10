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
public class ClasseAde {
    private int valorPrimari;
    private int valorSecundari;
    
    

    public ClasseAde(){
  valorPrimari=5;
  valorSecundari=10;
    }
    public ClasseAde(int vp){
        
         vp=valorPrimari;
        valorSecundari=10;
    }
      public  ClasseAde(int vp,int vs){
            valorPrimari=vp;
            valorSecundari=vp;
            
        }
      
        
    


    

    public int getValorPrimari() {
        return valorPrimari;
    }

    public int getValorSecundari() {
        return valorSecundari;
    }
    
    
    
        
    
}
