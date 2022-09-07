insert into t_lugares(nombre_lugar,precio_envio)values('Medellin',10000);
insert into t_lugares(nombre_lugar,precio_envio)values('Barranquilla',10000);


insert into t_clientes(documento,nombre,email) values(1031168192,'Andres Steban Luna','alunac1@ucentral.edu.co');


insert into t_envios(id_lugar_recibido,id_lugar_entrega,id_cliente,ticket,direccion_entrega,id_administrador,created_at) values(1,2,1,'123','123',1,NOW());
