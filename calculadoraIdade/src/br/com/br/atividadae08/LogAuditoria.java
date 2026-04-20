/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.br.atividadae08;

import java.time.LocalDateTime;

/**
 *
 * @author angra
 */
public class LogAuditoria {

    private Long id;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;

    
     public LogAuditoria(Long id, Usuario usuario, String acao) {
        this.id = id;
        this.usuario = usuario;
        this.acao = acao;
        this.dataHora = LocalDateTime.now();
        this.ip = "127.0.0.1";
    }

    public Long getId()
    { return id; }

    @Override
    public String toString() {
        return "Log: " + acao + " | Usuario: " + usuario.getNomeUsuario() + " | Data: " + dataHora;
    }
}
     

