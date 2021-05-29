package com.example.backend.controller;

import com.example.backend.dto.UserCanVoteDto;
import com.example.backend.validators.validateCpf;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssociadoController {

    // TODO: para verificar se um associado pode votar, ir em : https://user-info.herokuapp.com/users/{cpf}
//    @RequestMapping("/users/{cpf}")
//    public ResponseEntity<UserCanVoteDto> verificaSeApto(@PathVariable String cpf) {
//        Boolean cpf_valid = validateCpf.isCPF(cpf);
//        if (cpf_valid) {
//            // TODO: Verificar se este usuário já votou na pauta em que se encontra.
//            UserCanVoteDto user = new UserCanVoteDto(cpf_valid);
//            return ResponseEntity.ok(user);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

}
