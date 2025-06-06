package br.com.gs.trabalho.servicoemonitoramentoenergia.controller;

import br.com.gs.trabalho.servicoemonitoramentoenergia.dto.StatusRedeEletricaDTO;
import br.com.gs.trabalho.servicoemonitoramentoenergia.service.MonitoramentoRedeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitoramento-rede")
public class MonitoramentoRedeController {

    private final MonitoramentoRedeService monitoramentoRedeService;

    public MonitoramentoRedeController(MonitoramentoRedeService monitoramentoRedeService) {
        this.monitoramentoRedeService = monitoramentoRedeService;
    }

    @GetMapping("/{localidadeId}")
    public StatusRedeEletricaDTO getStatus(@PathVariable String localidadeId) {
        // direcionando a camada Serviço
        return monitoramentoRedeService.verificarStatusPorLocalidade(localidadeId);
    }
}