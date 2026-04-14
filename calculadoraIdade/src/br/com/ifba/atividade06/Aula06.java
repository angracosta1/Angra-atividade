/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06;

/**
 *
 * @author angra
 */
public class Aula06 {
    public static void main(String[] arges){
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(111);
       p1.setDono("sacio");
        p1.abrirConta("cc");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Ivanete");
        p2.abrirConta("cp");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.sacar(150);
        p1.feicharConta();
        
       p1.estadoAtual();
       p2.estadoAtual();
     
    }
}
