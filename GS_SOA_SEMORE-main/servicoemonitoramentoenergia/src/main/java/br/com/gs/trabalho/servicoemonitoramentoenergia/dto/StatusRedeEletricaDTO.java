package br.com.gs.trabalho.servicoemonitoramentoenergia.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusRedeEletricaDTO
{

    private String localidadeId;
    private String status; // Status da situação
    private String motivo; // Motivo do por que o ocorrido
    private OffsetDateTime previsaoRetorno; // Previsão do retorno

}