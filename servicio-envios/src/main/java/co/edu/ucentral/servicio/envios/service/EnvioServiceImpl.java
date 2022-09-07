package co.edu.ucentral.servicio.envios.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.ucentral.commons.services.service.CommonServiceImpl;
import co.edu.ucentral.servicio.envios.model.Envio;
import co.edu.ucentral.servicio.envios.repository.EnvioRepository;
@Service
public class EnvioServiceImpl extends CommonServiceImpl<Envio,EnvioRepository> implements EnvioService{
    // @Autowired
    // private EnvioRepository repository;

    // @Override
    // @Transactional
    // public List<Envio> buscarEnviosCliente(Long id){
    //     return repository.buscarEnviosCliente(id);
    // }
}
