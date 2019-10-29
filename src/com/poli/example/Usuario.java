package com.poli.example;

public class Usuario implements Gravavel {

    public String gravar(){
        System.out.println("Lógica de salvar usuário executada....");
        return "Usuário Salvo com sucesso!";
    }
}
