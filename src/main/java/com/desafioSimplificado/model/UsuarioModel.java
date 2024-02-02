package com.desafioSimplificado.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Usuarios")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;
    @Column(unique = true)
    private String documento;
    @Column(unique = true)
    private String email;

    private String senha;
    private BigDecimal saldo;
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;
}
