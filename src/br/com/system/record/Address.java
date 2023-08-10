package br.com.system.record;

public record Address(String cep, String logradouro,
                String complemento, String bairro,
                String localidade, String uf) {

}
