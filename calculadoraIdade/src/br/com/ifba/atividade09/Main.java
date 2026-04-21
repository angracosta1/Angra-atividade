/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author angra
 */
public class Main{

    public static void main(String[] args){

        // Array do tipo Forma "polimorfismo"
        Forma[] formas = new Forma[6];

        formas[0] = new Circulo(2);
        formas[1] = new Quadrado(3);
        formas[2] = new Triangulo(4, 5);
        formas[3] = new Esfera(2);
        formas[4] = new Cubo(3);
        formas[5] = new Piramide(4, 6);
        
        // Percorre todas as formas
        for (Forma f : formas){
             // Chama o toString de cada objeto
            System.out.println(f.toString());
            
             // Verifica se é 2D
            if (f instanceof FormaBidimensional){
                
                 // Converte para acessar obterArea
                FormaBidimensional fb = (FormaBidimensional) f;
                System.out.println("Area: " + fb.obterArea());
            }
            
             // Verifica se é 3D
            if (f instanceof FormaTridimensional){
                
                // Converte para acessar área e volume
                FormaTridimensional ft = (FormaTridimensional) f;
                System.out.println("Area: " + ft.obterArea());
                System.out.println("Volume: " + ft.obterVolume());
            }

            System.out.println("----------");
        }
    }
}