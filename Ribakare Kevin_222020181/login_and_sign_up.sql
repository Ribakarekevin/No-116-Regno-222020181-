-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 10:16 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `my project`
--

-- --------------------------------------------------------

--
-- Table structure for table `login and sign up`
--

CREATE TABLE `login and sign up` (
  `id` int(11) NOT NULL,
  `Username` varchar(225) NOT NULL,
  `Email` varchar(225) NOT NULL,
  `Password` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login and sign up`
--

INSERT INTO `login and sign up` (`id`, `Username`, `Email`, `Password`) VALUES
(1, 'Ribakare', 'ribakare10@gmail.com', '123'),
(2, 'Kevin', 'kevin@gmail.com', '123'),
(3, 'Geno', 'geno@gmail.com', '789'),
(4, 'Marv', 'marv@gmail.com', '456789'),
(5, 'Kaberuka', 'kaberuka23@gmail.com', '123'),
(6, 'Kevin', 'kevin123@gmail.com', '222020181');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login and sign up`
--
ALTER TABLE `login and sign up`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login and sign up`
--
ALTER TABLE `login and sign up`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
