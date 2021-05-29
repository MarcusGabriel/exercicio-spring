package com.example.backend.controller;

import com.example.backend.dto.PautaDto;
import com.example.backend.form.PautaForm;
import com.example.backend.model.Pauta;
import com.example.backend.repository.PautaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/pauta")
public class PautaController {

    @Autowired
    PautaRepository pautaRepository;

    @PostMapping
    public ResponseEntity<PautaDto> save(@RequestBody @Valid PautaForm pautaForm, UriComponentsBuilder uriComponentsBuilder) {
        Pauta p = pautaForm.convertToDto();
        pautaRepository.save(p);
        URI uri = uriComponentsBuilder.path("/pauta/{id}").buildAndExpand(p.getId()).toUri();
        return ResponseEntity.created(uri).body(new PautaDto(p));
    }

}
