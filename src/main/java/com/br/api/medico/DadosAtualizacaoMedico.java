package com.br.api.medico;

import com.br.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        String email,
        @Validated DadosEndereco endereco
    ) {
}
