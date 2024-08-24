package com.codigocerto.backend.domain.enums;

import lombok.Getter;

@Getter
public enum Status {

    FILA_DE_ESPERA("Fila de espera"),
    APROVADO("Aprovado"),
    REPROVADO("Reprovado"),
    CANCELADO("Cancelado"),
    CONCLUIDO("Concluido");

    private final String statusCadastramento;

    Status(String status) {
        this.statusCadastramento = status;
    }
}