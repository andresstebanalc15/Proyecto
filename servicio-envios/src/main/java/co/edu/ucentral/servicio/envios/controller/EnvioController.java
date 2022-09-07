package co.edu.ucentral.servicio.envios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import co.edu.ucentral.servicio.envios.model.Envio;
import co.edu.ucentral.servicio.envios.service.EnvioService;
import co.edu.ucentral.commons.controller.CommonController;


@RestController
public class EnvioController extends CommonController<Envio, EnvioService>{
	
    // @Autowired
    // private EnvioService service;

    // @GetMapping("/envio-cliente/{id}")
    // public ResponseEntity<?> buscarEnviosCliente(@PathVariable Long id){
    //     return ResponseEntity.ok().body(service.buscarEnviosCliente(id));
    // }
	
	
}
