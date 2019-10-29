package com.poli.example;

public class Produto implements Gravavel{

    public String gravar(){
        System.out.println("Lógica de salvar Produto executada....");
        return "Produto Salvo com sucesso!";
    }
}
