package co.edu.ucentral.servicio.productos.service;


import org.springframework.stereotype.Service;

import co.edu.ucentral.commons.services.service.CommonServiceImpl;
import co.edu.ucentral.servicio.productos.model.Producto;
import co.edu.ucentral.servicio.productos.repository.ProductoRepository;
@Service
public class ProductoServiceImpl extends CommonServiceImpl<Producto,ProductoRepository> implements ProductoService{

}
