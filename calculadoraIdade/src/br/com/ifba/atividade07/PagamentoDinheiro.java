/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author angra
 */
public class PagamentoDinheiro implements Pagamento  {
   private double valor;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        return valor - (valor * 0.10); // 10% desconto
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("Pagamento em Dinheiro");
        System.out.println("Valor original: R$" + valor);
        System.out.println("Total com desconto: R$" + calcularTotal() + "\n");
    }
  
}
