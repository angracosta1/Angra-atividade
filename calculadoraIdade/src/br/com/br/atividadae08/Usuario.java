/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.br.atividadae08;

/**
 *
 * @author angra
 */
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Usuario {
  private Long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private boolean ativo;

    private List<LogAuditoria> logs = new ArrayList<>();
    private List<Sessao> sessoes = new ArrayList<>();

    public Usuario(Long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha){
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ativo = true;
    }

    // Método logar
    public void logar(String senha){
        if (this.senha.equals(senha)){
            this.ultimoLogin = LocalDateTime.now();
            logs.add(new LogAuditoria(null, this, "LOGIN"));
            System.out.println("Login realizado!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }

          // Método criar sessao
    public void criarSessao() {
        String token = UUID.randomUUID().toString();
        Sessao s = new Sessao(null, this, token);
        sessoes.add(s);
        System.out.println("Sessao criada: " + token);
    }

    public Long getId() { return id; }
    public PerfilUsuario getPerfil(){ return perfil; }
    public String getNomeUsuario(){ return nomeUsuario; }
    public String getEmail(){ return email; }
    public boolean isAtivo(){ return ativo; }

    @Override
    public String toString() {
        return "Usuario: " + nomeUsuario + " | Email: " + email + " | Perfil: " + perfil;
    }
}
   

