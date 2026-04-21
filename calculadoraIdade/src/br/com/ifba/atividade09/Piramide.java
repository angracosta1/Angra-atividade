/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author angra
 */

public class Piramide extends FormaTridimensional {

    private double base;
    private double altura;

    public Piramide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
         // Área aproximada (base quadrada)
        return (base * base) + (2 * base * altura);
    }

    @Override
    public double obterVolume(){
         // Volume da pirâmide
        return (base * base * altura) / 3;
    }

    @Override
    public String toString(){
        return "Piramide - base: " + base + ", altura: " + altura;
    }
}