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
public class farmacia{
    // atributos
    private String dosis;
    private String empresa;
    private int fechadecaducidad;
    private boolean cientifico;
    //metodo
    public void leerdosis (){
        System.out.println("bastante dosis");
    }
    public void guardardosis (){
        System.out.println("poca dosis");
    }
    public static void main(String[] args) {
        farmacia primerobjeto = new farmacia();
        primerobjeto.leerdosis();
        primerobjeto.guardardosis();
      
        
        
                
    }
   
    
    
}
