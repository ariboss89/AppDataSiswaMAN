# Host: localhost  (Version: 5.5.8)
# Date: 2020-09-09 12:39:39
# Generator: MySQL-Front 5.3  (Build 4.81)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "tb_guru"
#

DROP TABLE IF EXISTS `tb_guru`;
CREATE TABLE `tb_guru` (
  `Idg` int(11) NOT NULL AUTO_INCREMENT,
  `nip` varchar(20) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `jeniskelamin` varchar(20) DEFAULT NULL,
  `agama` varchar(20) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `bidang` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Idg`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

#
# Data for table "tb_guru"
#

INSERT INTO `tb_guru` VALUES (1,'2019010101','DRS. MANISE','LAKI-LAKI','ISLAM','KAWIN','QURAN HADITS'),(2,'20191010111','Dra. Ojimukani','LAKI-LAKI','ISLAM','KAWIN','AQIDAH AKHLAK');

#
# Structure for table "tb_mapel"
#

DROP TABLE IF EXISTS `tb_mapel`;
CREATE TABLE `tb_mapel` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_mapel` varchar(255) DEFAULT NULL,
  `kategori` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

#
# Data for table "tb_mapel"
#

/*!40000 ALTER TABLE `tb_mapel` DISABLE KEYS */;
INSERT INTO `tb_mapel` VALUES (1,'QURAN HADITS','A'),(3,'AQIDAH AKHLAK','A'),(4,'FIQIH','A'),(5,'SEJARAH KEBUDAYAAN ISLAM','A'),(6,'BAHASA INDONESIA','A'),(7,'BAHASA INGGRIS','A'),(8,'SENI BUDAYA','B'),(9,'PENJASORKES','B'),(10,'PRAKARYA DAN KEWIRAUSAHAAN','B'),(11,'GEOGRAFI','C'),(12,'SEJARAH','C'),(13,'SOSIOLOGI','C'),(14,'EKONOMI','C'),(15,'FISIKA','C'),(16,'BIOLOGI','C'),(17,'KIMIA','C'),(18,'SASTRA INGGRIS','B'),(19,'NAHWU SHOROF','B'),(20,'MATEMATIKA','A');
/*!40000 ALTER TABLE `tb_mapel` ENABLE KEYS */;

#
# Structure for table "tb_nilai"
#

DROP TABLE IF EXISTS `tb_nilai`;
CREATE TABLE `tb_nilai` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `semester` varchar(50) DEFAULT NULL,
  `tahun_ajaran` varchar(50) DEFAULT NULL,
  `mapel` varchar(255) DEFAULT NULL,
  `nisn` varchar(255) DEFAULT NULL,
  `nilai` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

#
# Data for table "tb_nilai"
#

/*!40000 ALTER TABLE `tb_nilai` DISABLE KEYS */;
INSERT INTO `tb_nilai` VALUES (1,'GANJIL','2022/2021','QURAN HADITS','1111',90),(2,'GANJIL','2022/2021','AQIDAH AKHLAK','1111',80);
/*!40000 ALTER TABLE `tb_nilai` ENABLE KEYS */;

#
# Structure for table "tb_penempatan"
#

DROP TABLE IF EXISTS `tb_penempatan`;
CREATE TABLE `tb_penempatan` (
  `Idp` int(11) NOT NULL AUTO_INCREMENT,
  `nisn` varchar(50) DEFAULT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `jeniskelamin` varchar(50) DEFAULT NULL,
  `kelas` varchar(10) DEFAULT NULL,
  `jurusan` varchar(20) DEFAULT NULL,
  `walikelas` varchar(50) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Idp`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

#
# Data for table "tb_penempatan"
#

INSERT INTO `tb_penempatan` VALUES (1,'1111','Joko','PEREMPUAN','X','BELUM DI TENTUKAN','DRS. MANISE','BELUM LULUS');

#
# Structure for table "tb_pengguna"
#

DROP TABLE IF EXISTS `tb_pengguna`;
CREATE TABLE `tb_pengguna` (
  `username` varchar(50) NOT NULL DEFAULT '',
  `password` varchar(255) DEFAULT NULL,
  `nip` varchar(50) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

#
# Data for table "tb_pengguna"
#

/*!40000 ALTER TABLE `tb_pengguna` DISABLE KEYS */;
INSERT INTO `tb_pengguna` VALUES ('ariboss89','e10adc3949ba59abbe56e057f20f883e','2019010101','ADMIN'),('oji123','25d55ad283aa400af464c76d713c07ad','20191010111','GURU');
/*!40000 ALTER TABLE `tb_pengguna` ENABLE KEYS */;

#
# Structure for table "tb_siswa"
#

DROP TABLE IF EXISTS `tb_siswa`;
CREATE TABLE `tb_siswa` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `nisn` varchar(50) DEFAULT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `tempat` varchar(50) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `jeniskelamin` varchar(50) DEFAULT NULL,
  `agama` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `anakke` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `kontak` varchar(12) DEFAULT NULL,
  `ayah` varchar(50) DEFAULT NULL,
  `ibu` varchar(50) DEFAULT NULL,
  `alamatorangtua` varchar(255) DEFAULT NULL,
  `kontakorangtua` varchar(12) DEFAULT NULL,
  `pekerjaanayah` varchar(50) DEFAULT NULL,
  `pekerjaanibu` varchar(50) DEFAULT NULL,
  `namawali` varchar(50) DEFAULT NULL,
  `alamatwali` varchar(255) DEFAULT NULL,
  `kontakwali` varchar(12) DEFAULT NULL,
  `pekerjaanwali` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

#
# Data for table "tb_siswa"
#

INSERT INTO `tb_siswa` VALUES (5,'1111','Joko','Manise','2020-05-23','PEREMPUAN','ISLAM','ANAK KANDUNG','1','m','0812919101','J','AA','YUHUU','98719101','PNS','PNS','','','',NULL),(7,'1234','Manis','Kuy','2010-06-18','LAKI-LAKI',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

#
# Structure for table "tb_ta"
#

DROP TABLE IF EXISTS `tb_ta`;
CREATE TABLE `tb_ta` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `tahun_ajaran` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

#
# Data for table "tb_ta"
#

/*!40000 ALTER TABLE `tb_ta` DISABLE KEYS */;
INSERT INTO `tb_ta` VALUES (1,'2022/2021');
/*!40000 ALTER TABLE `tb_ta` ENABLE KEYS */;
