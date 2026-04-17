/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author angra
 */
public class PagamentoPix implements Pagamento{
    private double valor;

    public PagamentoPix(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        return valor;
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("Pagamento via PIX");
        System.out.println("Valor pago: R$" + calcularTotal());
        System.out.println("Cashback: R$" + valor * 0.02 + "\n"); // 2% cashback
    }
}
