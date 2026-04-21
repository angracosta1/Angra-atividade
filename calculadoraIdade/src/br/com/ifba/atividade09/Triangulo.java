/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author angra
 */
public class Triangulo extends FormaBidimensional{

    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    
    public double obterArea(){
         // Área = (base * altura) / 2
        return (base * altura) / 2;
    }

    @Override
    public String toString(){
        return "Triangulo - base: " + base + ", altura: " + altura;
    }
}