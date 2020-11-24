package com.example.p2.dao;

import java.util.ArrayList;
import java.util.List;

public class bd {
    public static List<Cidade> dados =new ArrayList<>();
    private bd(){}

    public static void SalvarDados(Cidade cidade){
        dados.add(cidade);
    }
    public static List getDados(){
        return dados;
    }
}
