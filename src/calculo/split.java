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
public class split {
    public static void main(String[] args) {
        String dias = "lunes-martes-miercoles-jueves-viernes-sabado-domingo";
//        String[] result = dias.split("-");
//        for (String split : result){
//            System.out.println(split);
            String cont =dias.replaceFirst("e", "11");
            System.out.println(cont);
        }
        
    }
    

