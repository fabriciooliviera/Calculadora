/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author fabricio.jesus
 */
public class CalculadoraCredito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroConta, SaldoInicial , despesas,
                creditos, limiteCreditos, novoSaldo;
        
        Cliente cliente;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("infomeo salario inicial:");
        numeroConta=entrada.nextInt();
        System.out.println(" Informe o saldo inicial:");
        SaldoInicial=entrada.nextInt();
        System.out.println("Informe o valor das despesas:");
        despesas=entrada.nextInt();
        System.out.println("informe o valor do credito:");
        creditos=entrada.nextInt();
        System.out.println("informe o limite do credito:");
        limiteCreditos=entrada.nextInt();
        
        cliente= new Cliente(numeroConta, SaldoInicial, despesas, creditos, limiteCreditos);
        novoSaldo=cliente.getNovoSaldo();
        System.out.printf("o saldo é : %d%n", novoSaldo);
        if(cliente.isCreditoExecidido()){
            System.out.print("limite de credito excedido.");
            
        }
        // TODO code application logic here
    }
    
}
