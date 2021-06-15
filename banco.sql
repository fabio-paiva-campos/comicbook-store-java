-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.8-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for banco
CREATE DATABASE IF NOT EXISTS `banco` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `banco`;

-- Dumping structure for table banco.hqs
CREATE TABLE IF NOT EXISTS `hqs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(50) NOT NULL DEFAULT '0',
  `editora` varchar(50) NOT NULL DEFAULT '0',
  `autor` varchar(50) NOT NULL DEFAULT '0',
  `paginas` int(11) NOT NULL DEFAULT 0,
  `volume` int(11) NOT NULL DEFAULT 0,
  `genero` varchar(50) NOT NULL DEFAULT '0',
  `capa` varchar(500) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table banco.hqs: ~6 rows (approximately)
/*!40000 ALTER TABLE `hqs` DISABLE KEYS */;
INSERT INTO `hqs` (`id`, `titulo`, `editora`, `autor`, `paginas`, `volume`, `genero`, `capa`) VALUES
	(1, 'Batman - Cavaleiro das Trevas', 'DC', 'Frank Miller', 516, 1, 'Policial', 'C:\\Users\\Fabio\\Desktop\\Fabio, Lucas & Heber\\LojaHQs\\src\\Image\\dark_knight.png'),
	(2, 'Akira', 'Panini', 'Katsuhiro Otomo', 120, 1, 'Sci-fi', 'C:\\Users\\Fabio\\Desktop\\Fabio, Lucas & Heber\\LojaHQs\\src\\Image\\akira.png'),
	(3, 'Ghost in the Shell', 'Panini', 'Masamune Shirow', 100, 2, 'Sci-fi', 'C:\\Users\\Fabio\\Desktop\\Fabio, Lucas & Heber\\LojaHQs\\src\\Image\\ghost-in-the-shell.jpg'),
	(6, 'Watchmen', 'DC', 'Alan Moore', 120, 1, 'Policial', 'C:\\Users\\Fabio\\Desktop\\Fabio, Lucas & Heber\\LojaHQs\\src\\Image\\watchmen.png'),
	(7, 'Transmetropolitan', 'DC', 'Warren Ellis', 120, 1, 'Sci-fi', 'C:\\Users\\Fabio\\Desktop\\Fabio, Lucas & Heber\\LojaHQs\\src\\Image\\transmetropolitan.png'),
	(8, 'Uzumaki', 'Devir', 'Junji Ito', 120, 1, 'Terror', 'C:\\Users\\Fabio\\Desktop\\Fabio, Lucas & Heber\\LojaHQs\\src\\Image\\uzumaki.jpg');
/*!40000 ALTER TABLE `hqs` ENABLE KEYS */;

-- Dumping structure for table banco.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(500) NOT NULL,
  `senha` varchar(5000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table banco.users: ~2 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `login`, `senha`) VALUES
	(2, 'fabio', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3'),
	(3, 'lucas', '8d23cf6c86e834a7aa6eded54c26ce2bb2e74903538c61bdd5d2197997ab2f72'),
	(4, 'heber', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
