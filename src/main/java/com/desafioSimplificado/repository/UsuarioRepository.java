package com.desafioSimplificado.repository;

import com.desafioSimplificado.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

    Optional<UsuarioModel> obterUsuarioPorDocumento(String documento);
}

