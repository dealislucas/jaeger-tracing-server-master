package com.lucascosta.jaegertracingserver.controller;

import com.lucascosta.jaegertracingserver.model.Pessoa;
import com.lucascosta.jaegertracingserver.model.PessoaOutraApi;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/xpto")
    public Pessoa apiDeOutraPessoa(){

        return new Pessoa();
    }



        @PostMapping("/mensagem")
        public String receberMensagem(@RequestBody String mensagem) {
            return "Você enviou: " + mensagem;
        }
    }





