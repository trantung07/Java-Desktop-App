-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 20, 2017 at 07:00 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlbh_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(45) NOT NULL DEFAULT '',
  `status` tinyint(3) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `name`, `status`) VALUES
(1, 'Đồ chơi cho bé', 1),
(2, 'Đồ dùng sơ sinh', 1),
(3, 'Phụ kiện', 1),
(4, 'Thời trang bé gái', 1),
(5, 'Thời trang bé trai', 1);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` varchar(45) NOT NULL DEFAULT '',
  `p_name` varchar(255) NOT NULL DEFAULT '',
  `cate_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `sell_price` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `funds_price` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `inventory` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `description` text,
  `status` tinyint(3) UNSIGNED NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `p_name`, `cate_id`, `sell_price`, `funds_price`, `inventory`, `description`, `status`) VALUES
('PK0001', 'Set nón và khăn len sao', 5, 115000, 60000, 4, '', 0),
('Pk0002', 'Nón len móc hoa', 4, 45000, 25000, 14, '', 1),
('PK0003', 'Băng đo thun hoa vải cho bé gái', 4, 35000, 15000, 14, '', 1),
('PK0004', 'Nón bê rê ca rô gấu', 3, 65000, 45000, 10, '', 1),
('PK0005', 'Mắt kính tròn', 3, 120000, 85000, 4, '', 1),
('SP000025', 'Mèo Tom biết nói', 2, 150000, 100000, 7, '', 0);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(10) UNSIGNED NOT NULL,
  `username` varchar(45) NOT NULL DEFAULT '',
  `password` varchar(45) NOT NULL DEFAULT '',
  `fullname` varchar(255) NOT NULL DEFAULT '',
  `phone` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `fullname`, `phone`) VALUES
(1, 'admin', 'admin', 'Administrator', '01649824157'),
(2, 'tung', 'tung', 'Administrator2', '01649498240'),
(3, 'minh', 'minh', 'Cao Minh', '01245136165'),
(4, 'tuan', 'tuan', 'Anh Tuan', '01245111165'),
(5, 'hoi', 'hoi', 'Hoi Bum', '01245741165'),
(7, 'trang', 'trang', 'thu trang', '01689971570'),
(8, 'toan', 'toan', 'tran tung', '013643124'),
(9, 'khoi', 'khoi', 'dinh khoi', '0978461423'),
(10, 'hung', 'hung', 'pham sy hung', '0921451324'),
(11, 'huy', 'huy', 'nguyen dang huy', '01649241574'),
(12, 'linh', 'linh', 'ngo khanh linh', '0942950083'),
(19, 'hong quan', 'quan', 'hong quan', '0984215641'),
(20, 'quet', 'quyet', 'van quyet', '0123451652'),
(21, 'nam221', 'nam', 'hai nam', '016492148462'),
(22, 'hoang', 'hoang2', 'hoang', '0921451362'),
(23, 'giabao', 'baokute', 'gia bao', '0921654123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
