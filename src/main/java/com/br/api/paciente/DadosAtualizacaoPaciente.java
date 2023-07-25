package com.br.api.paciente;

import com.br.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        @Validated DadosEndereco endereco
    ) {
}
