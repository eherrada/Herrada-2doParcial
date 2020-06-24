package com.utn.parcial.controller;

import com.utn.parcial.service.ClientService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api")
public class ClientController {


    @Autowired
    ClientService clientService;

    @GetMapping("/client/{id}/")
    @ApiOperation(value = "Obtener la ciudad y duración de la última llamada de un cliente", notes = "Se debe enviar el client id")
    @ApiResponses({@ApiResponse( code = HttpServletResponse.SC_NO_CONTENT, message = "El usuario no tiene llamadas"), @ApiResponse( code = 500, message = "Usuario no encontrado")})
    public ResponseEntity<String> userCityLastCallDuration(@ApiParam (name = "Client ID", type = "int", value = "Client ID", example = "1" , required = true) @RequestParam("Client ID") int id){
        return clientService.userCityLastCallDuration(id);
    }


}