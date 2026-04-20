/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.br.atividadae08;

/**
 *
 * @author angra
 */
public class Sessao {
  private Long id;
    private Usuario usuario;
    private String token;
 
     public Sessao(Long id, Usuario usuario, String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }

    public Long getId() { return id; }

    @Override
    public String toString() {
        return "Sessao do usuario: " + usuario.getNomeUsuario() + " | Token: " + token;
    }
}

