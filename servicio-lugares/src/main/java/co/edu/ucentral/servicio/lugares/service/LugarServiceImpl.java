package co.edu.ucentral.servicio.lugares.service;


import org.springframework.stereotype.Service;

import co.edu.ucentral.commons.services.service.CommonServiceImpl;
import co.edu.ucentral.servicio.lugares.model.Lugar;
import co.edu.ucentral.servicio.lugares.repository.LugarRepository;
@Service
public class LugarServiceImpl extends CommonServiceImpl<Lugar,LugarRepository> implements LugarService{

}
