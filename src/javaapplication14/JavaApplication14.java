/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //RECORRER UNA MATRIZ E INDICAR CUALES VOCALES TIENE
        char Matriz[][]= {{'A','B','C'},
                          {'E','F','H'},
                          {'Z','N','O'},
                          {'R','P','W'}};
         for (int i=0;i<4;i++){
            for (int x=0;x<3;x++){
                if(Matriz[i][x]=='A'){
                    System.out.println(Matriz[i][x]);
                }else if(Matriz[i][x]=='E'){
                    System.out.println(Matriz[i][x]);
                }else if(Matriz[i][x]=='I'){
                    System.out.println(Matriz[i][x]);
                }else if(Matriz[i][x]=='O'){
                    System.out.println(Matriz[i][x]);
                }else if(Matriz[i][x]=='U'){
                    System.out.println(Matriz[i][x]);
                }
            }
         }      
    }
}
