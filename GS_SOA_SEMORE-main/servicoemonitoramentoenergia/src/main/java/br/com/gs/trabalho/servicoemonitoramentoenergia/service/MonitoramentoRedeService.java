package br.com.gs.trabalho.servicoemonitoramentoenergia.service;

import br.com.gs.trabalho.servicoemonitoramentoenergia.dto.StatusRedeEletricaDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MonitoramentoRedeService {

    private final RestTemplate restTemplate;


    public MonitoramentoRedeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public StatusRedeEletricaDTO verificarStatusPorLocalidade(String localidadeId) {
        // URL da API
        String url = "http://localhost:8080/api/empresaenergia/status?localidadeId=" + localidadeId;

        // Convertendo a reposta para JSON
        StatusRedeEletricaDTO status = restTemplate.getForObject(url, StatusRedeEletricaDTO.class);

        return status;
    }
}