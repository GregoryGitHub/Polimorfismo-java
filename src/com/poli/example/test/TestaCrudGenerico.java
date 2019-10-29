package com.poli.example.test;

import com.poli.example.CrudGenerico;
import com.poli.example.Produto;
import com.poli.example.Usuario;

public class TestaCrudGenerico {

    public static void main(String[] args) {
        CrudGenerico cd = new CrudGenerico();

        // Grava novo usuário
        Usuario u = new Usuario();
        cd.gravaGenerico(u);

        // Grava novo Produto
        Produto p = new Produto();
        cd.gravaGenerico(p);
    }
}
