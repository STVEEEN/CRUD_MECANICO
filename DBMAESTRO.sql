create table tbUsuario (
UUID_Usuario VARCHAR2(100),
nombre VARCHAR2  (100),
apellido VARCHAR2(100),
correo VARCHAR2(100),
contrasena INT,
edad INT
)


CREATE TABLE tbMecanico(
UUID_Vehiculo VARCHAR2 (100),
nombre_cliente VARCHAR2 (100),
telefono_cliente INT,
marca_vehiculo VARCHAR2 (100),
modelo_vehiculo VARCHAR2 (100),
problema_vehiculo VARCHAR2 (100),
estado_problema VARCHAR2 (100)
)