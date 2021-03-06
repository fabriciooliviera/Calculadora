/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static sun.net.www.http.HttpClient.New;

/**
 *
 * @author fabricio.jesus
 */
public class Cliente {
    private int numeroConta;
    private int saldoInicial;
    private int despesas;
    private int creditos;
    
    private int limiteCredito;

    
    public Cliente (int numeroConta, int saldoInicial, int despesas, int credito, int limiteCredito) {
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
        this.despesas = despesas;
        this.creditos = credito;
        this.limiteCredito = limiteCredito;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public int getDespesas() {
        return despesas;
    }

    public void setDespesas(int despesas) {
        this.despesas = despesas;
    }

    public int getCredito() {
        return creditos;
    }

    public void setCredito(int credito) {
        this.creditos = credito;
    }

    public int getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    public int getNovoSaldo(){
        return saldoInicial + despesas -creditos;
    }
    public boolean isCreditoExecidido(){
        return getNovoSaldo()>limiteCredito;
    }
          
}
