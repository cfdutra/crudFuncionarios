package com.cd.Funcionario.controllers;


import com.cd.Funcionario.models.FuncionarioModel;
import com.cd.Funcionario.services.FuncionarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/funcionarios")
public class FuncionariosControllers {

    @Autowired
    private FuncionarioServices funcionarioServices;
    @GetMapping
    public List<FuncionarioModel> findAll(){
        return funcionarioServices.findAll();
    }

    @GetMapping("/{id}")
    public FuncionarioModel buscarPorId (@PathVariable Long id){
        return funcionarioServices.buscarPorId(id);
    }

    @GetMapping("/{id}")
    public void deletar( @PathVariable Long id ){
        funcionarioServices.deletar(id);
    }

    public FuncionarioModel criaFuncionario( @RequestBody FuncionarioModel funcionarioModel){
        return funcionarioServices.criarPessoa(funcionarioModel);
    }

    @PutMapping("/{id}")
    public FuncionarioModel atualizar( @PathVariable Long id, @RequestBody FuncionarioModel funcionarioModel){
        return funcionarioServices.atualizar(id, funcionarioModel);
    }

}
