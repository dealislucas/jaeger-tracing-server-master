package com.lucascosta.jaegertracingserver.controller;


import lombok.Getter;

import java.math.BigInteger;

@Getter
public class Pessoaentrada {
    String nome;
    String sobrenome;
    BigInteger cpf;
}