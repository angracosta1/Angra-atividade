/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author angra
 */
// Representa formas 3D (área + volume)
public abstract class FormaTridimensional extends Forma{

    // Área da superfície
    public abstract double obterArea();
    
    // Volume da forma
    public abstract double obterVolume();
}