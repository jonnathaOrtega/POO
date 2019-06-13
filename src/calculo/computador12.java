/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

/**
 *
 * @author ISTLOJA12
 */
public class computador12 {
        //declaro atributos
        private  int año;
        private String modelo;
        private String marca;
        private double capacidaddeprocesador;
        private boolean portatil;
        // declaro metrodos 
        public void guardarinformacion(){
            System.out.println("hola soy el computador y guardo informacion");
        }
        public void leerinformacion (){
            System.out.println("hola soy el computador y guardo informacion");
       }
       public void imprimirinformacion (String info){
           System.out.println(info);
       }
        public static void main(String[] args) {
            computador12 primerobjeto=new computador12();// he creado el primer objeto
        primerobjeto.guardarinformacion();// llamo a un metodo
        primerobjeto.imprimirinformacion("hola");
        primerobjeto.imprimirinformacion("chao");
    }
        
        
    
    
}
