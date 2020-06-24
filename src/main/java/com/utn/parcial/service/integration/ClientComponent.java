package com.utn.parcial.service.integration;

import com.utn.parcial.controller.RestTemplateResponseErrorHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Slf4j
@Component
public class ClientComponent {

    private RestTemplate rest;
    private static String url = "http://localhost:8080/client/";
    @PostConstruct
    @Autowired
    private void init() {
        rest = new RestTemplateBuilder().errorHandler(new RestTemplateResponseErrorHandler()).build();
    }


    public ResponseEntity<String> userCityLastCallDuration(int id){
        String uri = url+"parcial/"+id+"/";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
        return result;
    }




}
