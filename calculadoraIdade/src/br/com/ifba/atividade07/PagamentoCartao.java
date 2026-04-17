/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author angra
 */
public class PagamentoCartao implements Pagamento {

    private double valor;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        return valor + (valor * 0.05); // 5% taxa
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("Pagamento no Cartão");
        System.out.println("Valor original: R$" + valor);
        System.out.println("Total com taxa: R$" + calcularTotal() + "\n");
    }
 
}
