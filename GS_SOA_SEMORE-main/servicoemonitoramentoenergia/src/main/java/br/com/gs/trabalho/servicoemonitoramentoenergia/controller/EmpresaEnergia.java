package br.com.gs.trabalho.servicoemonitoramentoenergia.controller;

import br.com.gs.trabalho.servicoemonitoramentoenergia.dto.StatusRedeEletricaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@RestController
@RequestMapping("/api/empresaenergia")
public class EmpresaEnergia {

    @GetMapping("/status")
    public StatusRedeEletricaDTO getStatusDaRede(@RequestParam(defaultValue = "0") String localidadeId) {

        if ("FIAP".equals(localidadeId)) {
            // simular como offline
            return new StatusRedeEletricaDTO(
                    localidadeId,
                    "OFFLINE",
                    "Falha na subestação por sobrecarga",
                    OffsetDateTime.of(2025, 6, 1, 22, 34, 2, 0, ZoneOffset.of("-03:00"))
            );
        }

        // simular como online
        return new StatusRedeEletricaDTO(
                localidadeId,
                "ONLINE",
                "Operação normal",
                null // Sem previsão por que esta online
        );
    }
}