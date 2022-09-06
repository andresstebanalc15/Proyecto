package co.edu.ucentral.servicio.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.servicio.productos.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
