/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA12
 */
public class Calculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada =new Scanner (System.in);
        double radio,area=Math.PI;
        System.out.println("ingrese el radio");
        radio=entrada.nextDouble();
        area=area*radio*radio;
                
        System.out.println("el area del radio"+area);
    }
    
}

        
