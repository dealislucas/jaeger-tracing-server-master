package com.lucascosta.jaegertracingserver.controller;

import com.lucascosta.jaegertracingserver.model.Pessoa;
import com.lucascosta.jaegertracingserver.model.PessoaOutraApi;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("/meuNome")
public class JaegerServerController {

    @GetMapping("/teste/{valor}")
    public String receberPelaUrl(@PathVariable Integer valor){
        String retorno = "";
        if (valor % 2 == 0){
            retorno = "par";
        }else {
            retorno = "impar";
        }
       return retorno;
    }

    @GetMapping("/teste/")
    public String recebePeloHeader(@RequestHeader Integer valor){
        String retorno = "";
        if (valor % 2 == 0){
            retorno = "par";
        }else {
            retorno = "impar";
        }
        return retorno;
    }

    @GetMapping()
    public String pessoa(@RequestBody Pessoa pessoa){


        PessoaOutraApi pessoaOutraApi1 = new PessoaOutraApi();
        pessoaOutraApi1.setNome(pessoa.getNome());
        pessoaOutraApi1.setSobreNome(pessoa.getSobreNome());
        pessoaOutraApi1.setIdade(pessoa.getIdade());

        return pessoa.getSobreNome();
    }

    @GetMapping("/naosei")
    public Pessoa apiDeOutraPessoa(){

        return new Pessoa();
    }



        @PostMapping("/trocadenome")
        public String receberMensagem(@RequestBody Pessoaentrada objeto) {
        String retorno;
        Pessoa xpto = new Pessoa();
        if (objeto.getCpf().equals(xpto.getCpf())){
            retorno = "Seu nome foi alterado para: " + objeto.getNome();
        } else {
            retorno = "O cpf digitado esta errado";
        }
            return retorno;
        }
    }





