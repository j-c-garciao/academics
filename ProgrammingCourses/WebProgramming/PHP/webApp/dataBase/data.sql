-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.7.17-log - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de data para data
DROP DATABASE IF EXISTS `data`;
CREATE DATABASE IF NOT EXISTS `data` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `data`;

-- Volcando estructura para tabla data.cliente
DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(50) COLLATE utf16_spanish_ci DEFAULT NULL,
  `lname` varchar(50) COLLATE utf16_spanish_ci DEFAULT NULL,
  `date` date DEFAULT NULL,
  `time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf16 COLLATE=utf16_spanish_ci;

-- Volcando data para la tabla data.cliente: ~9 rows (aproximadamente)
DELETE FROM `cliente`;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`id`, `fname`, `lname`, `date`, `time`) VALUES
	(12, 'Mickey', 'Mouse', NULL, '2018-01-01 00:00:00'),
	(13, 'Mickey34', 'Mouse34', NULL, '2018-01-01 00:00:00'),
	(29, 'Fabian', 'Frisbey', NULL, '2019-03-07 07:32:00'),
	(30, 'Martin', 'Wiskey', NULL, '2019-03-07 07:32:46'),
	(31, 'Iván David', 'Apellido', NULL, '2019-03-07 07:33:21'),
	(32, 'Mickey', 'Mouse', NULL, '2022-03-09 11:04:24'),
	(33, 'Mickey Loco', 'Mouse', NULL, '2022-03-09 11:04:46'),
	(34, 'Mickey W', 'Mouse', NULL, '2022-03-09 11:11:18'),
	(35, 'Mickey W', 'Mouse', NULL, '2022-03-09 11:12:03');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
