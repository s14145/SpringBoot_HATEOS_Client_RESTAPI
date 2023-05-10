package com.hateoasclient.controller;

import com.hateoasclient.model.ClientAPIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/clientapi/v1/accounts")
public class ClientController {

    @Value("${upstream.get.account.baseURL}")
    private String getResourceURL;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{accountNumber}")
    public ResponseEntity<ClientAPIResponse> getAccountDetails(@PathVariable Long accountNumber){
        Map<String, Long> params = new HashMap<>();
        params.put("accountNumber", accountNumber);
       ResponseEntity<ClientAPIResponse> clientAPIResponseResponseEntity = restTemplate.getForEntity(getResourceURL, ClientAPIResponse.class, params);
       ClientAPIResponse clientAPIResponse = clientAPIResponseResponseEntity.getBody();
       return new ResponseEntity<>(clientAPIResponse, HttpStatus.OK);
    }
}
