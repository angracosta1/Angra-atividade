/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author angra
 */
public class Esfera extends FormaTridimensional {

    private double raio;

    public Esfera(double raio){
        this.raio = raio;
    }

    @Override
    public double obterArea(){
        // Área da esfera
        return 4 * Math.PI * raio * raio;
    }

    @Override
    public double obterVolume(){
        // Volume da esfera
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public String toString(){
        return "Esfera - raio: " + raio;
    }
}