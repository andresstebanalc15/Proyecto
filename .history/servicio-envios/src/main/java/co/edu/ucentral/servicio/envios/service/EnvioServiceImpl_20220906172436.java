package co.edu.ucentral.servicio.productos.service;


import org.springframework.stereotype.Service;

import co.edu.ucentral.commons.services.service.CommonServiceImpl;
import co.edu.ucentral.servicio.envios.model.Envio;
import co.edu.ucentral.servicio.envios.repository.EnvioRepository;
@Service
public class EnvioServiceImpl extends CommonServiceImpl<Envio,ProductoRepository> implements EnvioService{

}
