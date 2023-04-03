DROP DATABASE inventario;
CREATE DATABASE inventario;

USE inventario;

CREATE TABLE UnidadMedida (
 Id  int NOT NULL  PRIMARY KEY AUTO_INCREMENT UNIQUE,
 nombre VARCHAR(35),
 codigo VARCHAR(25)
 );

CREATE TABLE Producto(
  Id  int NOT NULL  PRIMARY KEY AUTO_INCREMENT UNIQUE,
  nombre VARCHAR(25),
  marca VARCHAR(25),
  precio DECIMAL,
  unidadMedida int,
  codigo VARCHAR(25),
  CONSTRAINT FK_unidadMedida
  FOREIGN KEY (unidadMedida) REFERENCES UnidadMedida(Id)
  );
   
   
Create TABLE inventario (
     Id  int NOT NULL  PRIMARY KEY AUTO_INCREMENT UNIQUE,
     idProducto int UNIQUE,
     cantidad DECIMAL,
     CONSTRAINT FK_idProducto FOREIGN KEY (idProducto)
     REFERENCES Producto(Id) 
);
     
     
     CREATE TABLE Cliente (
       Id  int NOT NULL  PRIMARY KEY AUTO_INCREMENT UNIQUE,
       nombre VARCHAR(255),
       correo VARCHAR(50),
       RFC VARCHAR(40),
       telefonno VARCHAR(11),
       contrasena VARCHAR(14));
       
       CREATE TABLE Venta(
         Id  int NOT NULL  PRIMARY KEY AUTO_INCREMENT UNIQUE,
         idCliente int,
         total DECIMAL,
         folio VARCHAR(255),
         fecha DATETIME,
         CONSTRAINT FK_idCliente FOREIGN KEY (idCliente )
         REFERENCES Cliente(Id)
       );
       
       CREATE TABLE Detalle (
         Id  int NOT NULL  PRIMARY KEY AUTO_INCREMENT UNIQUE,
         idVenta int,
         idProducto int,
         cantidad DECIMAL,
         total DECIMAL,
         CONSTRAINT FK_idVenta 
         FOREIGN KEY (idVenta) REFERENCES Venta(Id),
         CONSTRAINT FK_idProducto_detalle 
         FOREIGN KEY (idProducto) REFERENCES Producto(Id)
         
       );
      
       
       
       
