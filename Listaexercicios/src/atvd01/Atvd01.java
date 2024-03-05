/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvd01;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atvd01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaração das variaveis 
        Scanner input = new Scanner(System.in);     
        int num1, num2, soma;
        
        //recebendo o valor da primeira variavel
        System.out.println("Informe o primeiro numero: ");
        num1 = input.nextInt();
        
        //recebendo o valor da segunda variavel
        System.out.println("Informe o primeiro numero: ");
        num2 = input.nextInt();
        
        soma = num1 + num2;
                
        System.out.println("A soma dos números " + num1 + " + " + num2 + " é: " + soma);
        
                
    
    }
    
}
