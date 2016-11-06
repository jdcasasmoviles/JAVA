-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.1.33-community-log - MySQL Community Server (GPL)
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para sistema
CREATE DATABASE IF NOT EXISTS `sistema` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `sistema`;


-- Volcando estructura para tabla sistema.clientes
CREATE TABLE IF NOT EXISTS `clientes` (
  `Codigo` int(10) DEFAULT NULL,
  `Empresa` varchar(50) DEFAULT NULL,
  `Ruc` varchar(50) DEFAULT NULL,
  `Telefono` int(10) DEFAULT NULL,
  `Contacto` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sistema.clientes: 11 rows
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` (`Codigo`, `Empresa`, `Ruc`, `Telefono`, `Contacto`) VALUES
	(1, 'GLORIA SAC', '4234567', 987654321, 'JEFE'),
	(2, 'RADIO PEPES ', '5234567', 987654322, 'JEFE'),
	(3, 'CRUZTRONICS', '6234567', 987654323, 'JEFE'),
	(4, 'WHISMASTER', '7234567', 987654324, 'JEFE'),
	(5, 'GLORIA SAC', '8234567', 987654325, 'SUPERVISOR'),
	(6, 'GLORIA SAC', '9234567', 987654326, 'SUPERVISOR'),
	(7, 'RADIO PEPES', '0234567', 987654327, 'SUPERVISOR'),
	(8, 'RADIO PEPES', '87564628', 998567409, 'AMIGO'),
	(9, 'GLORIA', '87564624', 998567404, 'AMIGO'),
	(10, 'CRUZTRONICS', '7853684', 991318777, 'WEB'),
	(11, 'CRUZTRONICS', '7853681', 991318778, 'WEB');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;


-- Volcando estructura para tabla sistema.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `Apellidos` varchar(50) DEFAULT NULL,
  `Nombres` varchar(50) DEFAULT NULL,
  `Telefono` int(10) DEFAULT NULL,
  `Usuario` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `clave` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla sistema.usuarios: 4 rows
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`Apellidos`, `Nombres`, `Telefono`, `Usuario`, `Email`, `clave`) VALUES
	('casas', 'tomas', 995949259, 'mattguns', 'mattguns@hotmail.es', 'misterio'),
	('rodriguez', 'raul', 995947779, 'slash', 'slash@hotmail.com', 'xyz'),
	('contreras', 'andres', 995566334, 'bombita', 'andre_2013@gmail.com', 'piplop'),
	('mejia', 'miguel', 995534334, 'tio', 'mmp_tauro@gmail.com', 'avanzado');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
