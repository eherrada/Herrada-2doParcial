package com.utn.parcial.service;

import com.utn.parcial.service.integration.ClientComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    ClientComponent clientComponent;

    public ResponseEntity<String> userCityLastCallDuration(int id){
        return clientComponent.userCityLastCallDuration(id);
    }

}
