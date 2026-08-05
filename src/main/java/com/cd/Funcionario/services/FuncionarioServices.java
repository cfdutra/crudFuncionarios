package com.cd.Funcionario.services;

import com.cd.Funcionario.models.FuncionarioModel;
import com.cd.Funcionario.repositories.FuncionarioRepository;
import org.hibernate.annotations.Audited;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServices {

    @Autowired
    private FuncionarioRepository funcionarioRepository;


    public List<FuncionarioModel> findAAL(){
        return funcionarioRepository.findAll();
    }

    public FuncionarioModel buscarPorId(Long id){
        return  funcionarioRepository.findById(id).get();
    }

    public FuncionarioModel criarPessoa(FuncionarioModel funcionarioModel){
        return funcionarioRepository.save(funcionarioModel);
    }


}
