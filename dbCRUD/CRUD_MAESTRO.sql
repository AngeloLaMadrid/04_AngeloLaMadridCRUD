/*Eliminar la base de datos dbteam04prototipo, si es que existe */
DROP DATABASE IF EXISTS`dbteam04prototipo`;

/*Crear la base de datos dbteam04prototipo, si es que no existe*/
CREATE DATABASE IF NOT EXISTS `dbteam04prototipo`;
USE `dbteam04prototipo`;

/*CREAR TABLAS*/

/*CREAR TABLA LOGIN*/
CREATE TABLE `login` (
  `NOMUSU` varchar(50) NOT NULL,
  `PASSUSU` varchar(50) NOT NULL
);

/*CREAR TABLA TRABAJADORES*/
CREATE TABLE `trabajadores` (
  `CODTRA` int(11) NOT NULL,
  `NOMTRA` varchar(40) NOT NULL,
  `APETRA` varchar(40) NOT NULL,
  `SEXTRA` varchar(40) NOT NULL,
  `DNITRA` varchar(40) NOT NULL,
  `FNTRA` varchar(40) NOT NULL,
  `DIRTRA` varchar(40) NOT NULL,
  `NUMCEL` varchar(40) NOT NULL
);

/*AGREGAR LLAVE PRIMARIA EN LA TABLA TRABAJADORES*/
ALTER TABLE `trabajadores`
  ADD PRIMARY KEY (`CODTRA`);


ALTER TABLE `trabajadores`
  MODIFY `CODTRA` int(11) NOT NULL AUTO_INCREMENT, 
  AUTO_INCREMENT=33;

/*INSERTAR DATOS A LA TABLA LOGIN*/
INSERT INTO `login` (`NOMUSU`, `PASSUSU`) VALUES

('angelo', 'angelo'),
('123', '123'),
('admin', 'admin'),
('admin', 'root'),
('root', 'admin'),
('root', 'root');

/*INSERTAR DATOS A LA TABLA TRABAJADORES*/
INSERT INTO `trabajadores` (`CODTRA`, `NOMTRA`, `APETRA`, `SEXTRA`, `DNITRA`, `FNTRA`, `DIRTRA`, `NUMCEL`) VALUES
(1, 'Angelo', 'La Madrid', 'M', '44656316', '2002-07-12', 'URB. TESTER', '987546214'),
(2, 'Roberto', 'Francia', 'M', '44645434', '1995-07-10', 'Jr. Eduardo Valle # 4633 Hab. 558', '974513456'),
(3, 'Andrés', 'Ramirez', 'M', '31757676', '1998-09-17', 'Urb. Thiago Treviño # 7 Piso 6', '998744124'),
(4, 'Clara', 'Sanchez', 'F', '87423135', '1972-07-07', 'Urb. Maximiliano Regalado # 312 Hab. 404', '998736456'),
(5, 'Jessica', 'Llanos', 'F', '44212412', '1998-10-20', 'Cl. Camila Ferrer # 33 Dpto. 854', '974212121'),
(6, 'Andreu', 'Guzman', 'M', '45674647', '1993-10-30', 'Av. Irene Guevara # 852', '921647654'),
(7, 'Araceli', 'Rojas', 'F', '28679636', '1984-12-15', 'Cl. Juan Manuel Del Río # 5917', '991647773'),
(8, 'Vanesa', 'Serra', 'F', '15679689', '1995-09-18', 'Urb. Isidora Moya # 6737', '97647664'),
(9, 'Pablo', 'Salguero', 'M', '11673622', '1991-12-05', 'Av. Juan Madera # 14', '975645574'),
(10, 'Andres', 'Díaz', 'M', '53671639', '1994-12-30', 'Urb. Hidalgo Hernandes # 8 Dpto. 352', '976215789');

/*MOSTRAR DATOS DE LAS RESPECTIVAS TABLAS LOGIN Y TRABAJADORES*/
SELECT * FROM login;
SELECT * FROM trabajadores;