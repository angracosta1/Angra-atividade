/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.br.atividadae08;

/**
 *
 * @author angra
 */
import java.util.Arrays;

public class Main {
     public static void main(String[] args) {

        // Criar perfil
        PerfilUsuario admin = new PerfilUsuario(
                1L,
                "Administrador",
                Arrays.asList("CREATE", "READ", "UPDATE", "DELETE")
        );

        // Criar usuário
        Usuario user = new Usuario(
                1L,
                admin,
                "angra",
                "angra@email.com",
                "123"
        );

                  // Testar login
        user.logar("123");

              // Criar sessão
        user.criarSessao();

             // Mostrar dados
        System.out.println(user);
    }
}
