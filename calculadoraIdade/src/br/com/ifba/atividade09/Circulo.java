/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author angra
 */
// Círculo é uma forma 2D
public class Circulo extends FormaBidimensional{

    private double raio;

     // Construtor para inicializar o raio
    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double obterArea(){
         // Fórmula da área do círculo
        return Math.PI * raio * raio;
    }

    @Override
    public String toString(){
        // Descrição do objeto
        return "Circulo - raio: " + raio;
    }
}
