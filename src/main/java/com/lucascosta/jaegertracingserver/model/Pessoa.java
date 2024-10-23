package com.lucascosta.jaegertracingserver.model;

import lombok.Getter;

import java.math.BigInteger;

@Getter
public class Pessoa {
    String nome = "Lucas";
    String sobreNome = "Dealis";
    Integer idade = 20;
    String regiao = "Teotonio";
    BigInteger cpf = BigInteger.valueOf(123456789);
}
