package co.edu.ucentral.servicio.lugares.service;


import org.springframework.stereotype.Service;

import co.edu.ucentral.commons.services.service.CommonServiceImpl;
import co.edu.ucentral.servicio.lugares.model.Envio;
import co.edu.ucentral.servicio.lugares.repository.EnvioRepository;
@Service
public class LugarServiceImpl extends CommonServiceImpl<Envio,EnvioRepository> implements LugarService{

}
