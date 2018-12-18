-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Vært: 127.0.0.1
-- Genereringstid: 18. 12 2018 kl. 13:53:11
-- Serverversion: 10.1.37-MariaDB
-- PHP-version: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tv2`
--

-- --------------------------------------------------------

--
-- Struktur-dump for tabellen `medie`
--

CREATE TABLE `medie` (
  `assetId` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf8_bin NOT NULL,
  `created` date NOT NULL,
  `fileName` varchar(50) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Data dump for tabellen `medie`
--

INSERT INTO `medie` (`assetId`, `name`, `created`, `fileName`) VALUES
(1, '[]', '2018-12-18', '123456'),
(2, '[]', '2018-12-18', '123456'),
(3, '[]', '2018-12-18', '123456');

--
-- Begrænsninger for dumpede tabeller
--

--
-- Indeks for tabel `medie`
--
ALTER TABLE `medie`
  ADD PRIMARY KEY (`assetId`);

--
-- Brug ikke AUTO_INCREMENT for slettede tabeller
--

--
-- Tilføj AUTO_INCREMENT i tabel `medie`
--
ALTER TABLE `medie`
  MODIFY `assetId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
