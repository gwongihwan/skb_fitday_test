package com.skb.fitday.springboot.service;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class ExternalApiCaller {

    public static void sendREST(String sendUrl, String jsonValue) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "aaaaa");

        HttpEntity entity = new HttpEntity(jsonValue, headers);
        URI url = URI.create(sendUrl);

        ResponseEntity response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

        if (response.getStatusCode() != HttpStatus.OK) {

        }

        Object responseBody = response.getBody();
    }

}
