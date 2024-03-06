
/*Faça uma calculadora que some, subtraia, multiuplique e divida
mostrando o resultado final
*/

package com.mycompany.calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        
        //SOMA
        
        System.out.println("Digite primeiro número e segundo número para soma");
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();
        double result = num1 + num2;
       
        System.out.println("O resultado da soma é: ");
        System.out.println(result);
         
        
       
       
       /* 
        SUBTRAÇÃO
        
        System.out.println("Digite o primeiro número"); double num1 = teclado.nextDouble();
        System.out.println("Digite o segundo número"); double num2 = teclado.nextDouble();
       
        double result = num1 - num2;
       
        System.out.println("O resultado da subtração é: ");
        System.out.println(result);
     
        
        DIVISÃO
        
        System.out.println("Digite primeiro número e segundo número para soma");
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();
        double result = num1 / num2;
       
        System.out.println("O resultado da divisão é: ");
        System.out.println(result);
        

        MULTIPLICAÇÃO
        
        System.out.println("Digite o primeiro número"); double num1 = teclado.nextDouble();
        System.out.println("Digite o segundo número"); double num2 = teclado.nextDouble();
       
        double result = num1 * num2;
       
        System.out.println("O resultado da multiplicação é: ");
        System.out.println(result);
        
        
        teclado.close();
        
        */
        
     
    }
}
