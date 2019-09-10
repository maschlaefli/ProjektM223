-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 10. Sep 2019 um 15:59
-- Server-Version: 10.4.6-MariaDB
-- PHP-Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `jwtbase`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `adresse`
--

CREATE TABLE `adresse` (
  `id` int(11) NOT NULL,
  `ort` varchar(255) NOT NULL,
  `plz` int(11) NOT NULL,
  `strasse_nr` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `adresse`
--

INSERT INTO `adresse` (`id`, `ort`, `plz`, `strasse_nr`) VALUES
(1, 'brüttisellen', 8306, 'dorfstarsse 40'),
(2, 'ZH', 84353, 'Hansstrasse 420');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `angestellter`
--

CREATE TABLE `angestellter` (
  `id` int(11) NOT NULL,
  `alter_` int(11) NOT NULL,
  `nachname` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `angestellt_seit` int(11) DEFAULT NULL,
  `adresse_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `angestellter`
--

INSERT INTO `angestellter` (`id`, `alter_`, `nachname`, `name`, `password`, `username`, `angestellt_seit`, `adresse_id`) VALUES
(1, 17, 'Schläfli', 'max', '123', 'admin', 1999, 1),
(2, 33, 'Tim', 'Down', 'eeeeee', 'reeee', 2001, 2);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `firma`
--

CREATE TABLE `firma` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `adresse_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `firma`
--

INSERT INTO `firma` (`id`, `name`, `adresse_id`) VALUES
(1, 'Suisa', 1),
(2, 'UPC', 2);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `kunde`
--

CREATE TABLE `kunde` (
  `id` int(11) NOT NULL,
  `alter_` int(11) NOT NULL,
  `nachname` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `adresse_id` int(11) DEFAULT NULL,
  `firma_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `kunde`
--

INSERT INTO `kunde` (`id`, `alter_`, `nachname`, `name`, `password`, `username`, `adresse_id`, `firma_id`) VALUES
(3, 88, 'peter', 'hans', 'hans', 'hanspeter', 1, 2),
(5, 55, 'Jürgen', 'Jens', '333', 'ichbins', 2, 1);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `adresse`
--
ALTER TABLE `adresse`
  ADD PRIMARY KEY (`id`);

--
-- Indizes für die Tabelle `angestellter`
--
ALTER TABLE `angestellter`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK8bgfsxm1g61ce7rekdav3s37k` (`adresse_id`);

--
-- Indizes für die Tabelle `firma`
--
ALTER TABLE `firma`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4y4upq2sbb8gfnvamrcbe8rbq` (`adresse_id`);

--
-- Indizes für die Tabelle `kunde`
--
ALTER TABLE `kunde`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKisylc0t1w4q0tv4kq032siff7` (`adresse_id`),
  ADD KEY `FKlfbh5flldxqpwb2f2nrw9qii5` (`firma_id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `adresse`
--
ALTER TABLE `adresse`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT für Tabelle `angestellter`
--
ALTER TABLE `angestellter`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT für Tabelle `firma`
--
ALTER TABLE `firma`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT für Tabelle `kunde`
--
ALTER TABLE `kunde`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
