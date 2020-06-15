-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 15 Haz 2020, 08:56:30
-- Sunucu sürümü: 10.4.11-MariaDB
-- PHP Sürümü: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `ciftlik_bank`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanicilar`
--

CREATE TABLE `kullanicilar` (
  `kullanici_id` int(11) NOT NULL,
  `ad_soyad` varchar(50) COLLATE utf8mb4_turkish_ci NOT NULL,
  `tc_no` varchar(11) COLLATE utf8mb4_turkish_ci NOT NULL,
  `tel_no` varchar(11) COLLATE utf8mb4_turkish_ci NOT NULL,
  `guvenlik_sorusu` varchar(75) COLLATE utf8mb4_turkish_ci NOT NULL,
  `guvenlik_cevap` varchar(75) COLLATE utf8mb4_turkish_ci NOT NULL,
  `musteri_no` varchar(20) COLLATE utf8mb4_turkish_ci NOT NULL,
  `sifre` varchar(50) COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `kullanicilar`
--

INSERT INTO `kullanicilar` (`kullanici_id`, `ad_soyad`, `tc_no`, `tel_no`, `guvenlik_sorusu`, `guvenlik_cevap`, `musteri_no`, `sifre`) VALUES
(22, 'fırat', '11111111111', '11111111111', 'Evcil hayvanınızın adı nedir?', 'paraşüt', '5893698', '6651'),
(23, 'emine', '22222222222', '22222222222', 'Evcil hayvanınızın adı nedir?', 'fırat', '1201421', '9040');

--
-- Tetikleyiciler `kullanicilar`
--
DELIMITER $$
CREATE TRIGGER `bakiye_ekle` AFTER INSERT ON `kullanicilar` FOR EACH ROW INSERT INTO kullanici_bakiye(kullanici_id,bakiye,musteri_no) VALUES(NEW.kullanici_id,0,NEW.musteri_no)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `bakiye_sil` AFTER DELETE ON `kullanicilar` FOR EACH ROW DELETE FROM kullanici_bakiye
WHERE kullanici_id = OLD.kullanici_id
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `fatura_ekle` AFTER INSERT ON `kullanicilar` FOR EACH ROW INSERT INTO kullanicilar_faturalar(kullanici_id,elektrik,su,dogalgaz,internet)
VALUES(
	NEW.kullanici_id,
    35 + RAND() * 465,
    35 + RAND() * 465,
    35 + RAND() * 465,
    35 + RAND() * 465
)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `fatura_sil` AFTER DELETE ON `kullanicilar` FOR EACH ROW DELETE FROM kullanicilar_faturalar
WHERE kullanici_id = OLD.kullanici_id
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanicilar_faturalar`
--

CREATE TABLE `kullanicilar_faturalar` (
  `id` int(11) NOT NULL,
  `kullanici_id` int(11) NOT NULL,
  `elektrik` decimal(10,2) NOT NULL,
  `su` decimal(10,2) NOT NULL,
  `dogalgaz` decimal(10,2) NOT NULL,
  `internet` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `kullanicilar_faturalar`
--

INSERT INTO `kullanicilar_faturalar` (`id`, `kullanici_id`, `elektrik`, `su`, `dogalgaz`, `internet`) VALUES
(16, 22, '208.25', '409.81', '459.31', '102.10'),
(17, 23, '200.36', '95.58', '306.83', '282.39');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanici_bakiye`
--

CREATE TABLE `kullanici_bakiye` (
  `id` int(11) NOT NULL,
  `kullanici_id` int(11) NOT NULL,
  `bakiye` decimal(10,2) NOT NULL,
  `musteri_no` varchar(20) COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `kullanici_bakiye`
--

INSERT INTO `kullanici_bakiye` (`id`, `kullanici_id`, `bakiye`, `musteri_no`) VALUES
(19, 22, '1000000.00', '5893698'),
(20, 23, '0.00', '1201421');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kullanicilar`
--
ALTER TABLE `kullanicilar`
  ADD PRIMARY KEY (`kullanici_id`,`musteri_no`),
  ADD UNIQUE KEY `tc_no` (`tc_no`);

--
-- Tablo için indeksler `kullanicilar_faturalar`
--
ALTER TABLE `kullanicilar_faturalar`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `kullanici_id` (`kullanici_id`);

--
-- Tablo için indeksler `kullanici_bakiye`
--
ALTER TABLE `kullanici_bakiye`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`,`kullanici_id`),
  ADD UNIQUE KEY `musteri_no` (`musteri_no`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kullanicilar`
--
ALTER TABLE `kullanicilar`
  MODIFY `kullanici_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- Tablo için AUTO_INCREMENT değeri `kullanicilar_faturalar`
--
ALTER TABLE `kullanicilar_faturalar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Tablo için AUTO_INCREMENT değeri `kullanici_bakiye`
--
ALTER TABLE `kullanici_bakiye`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
