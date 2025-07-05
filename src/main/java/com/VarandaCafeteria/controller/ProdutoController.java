package com.VarandaCafeteria.controller;

import com.VarandaCafeteria.dto.ProdutoResponseDTO;
import com.VarandaCafeteria.model.entity.Produto;
import com.VarandaCafeteria.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/bebidas-base")
    public ResponseEntity<List<ProdutoResponseDTO>> listarBebidaBase() {
        List<Produto> bebidas = produtoRepository.findByIsAdicional(false);
        List<ProdutoResponseDTO> dtoList = bebidas.stream()
                .map(this::toDTO)
                .toList();
        return ResponseEntity.ok(dtoList);
    }

    @GetMapping("/adicionais")
    public ResponseEntity<List<ProdutoResponseDTO>> listarAdicionais() {
        List<Produto> adicionais = produtoRepository.findByIsAdicional(true);
        List<ProdutoResponseDTO> dtoList = adicionais.stream()
                .map(this::toDTO)
                .toList();
        return ResponseEntity.ok(dtoList);
    }

    private ProdutoResponseDTO toDTO(Produto produto) {
        ProdutoResponseDTO dto = new ProdutoResponseDTO();
        dto.setId(produto.getId());
        dto.setNome(produto.getNome());
        dto.setPreco(produto.getPreco());
        return dto;
    }
}
