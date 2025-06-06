package br.com.gs.trabalho.servicoemonitoramentoenergia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServicoemonitoramentoenergiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicoemonitoramentoenergiaApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}