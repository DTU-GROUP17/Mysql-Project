CREATE DATABASE  IF NOT EXISTS `sql_project_dummy` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sql_project`;
-- MySQL dump 10.13  Distrib 5.6.17, for osx10.6 (i386)
--
-- Host: localhost    Database: sql_project
-- ------------------------------------------------------
-- Server version	5.7.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `operatoer`
--

DROP TABLE IF EXISTS `operatoer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operatoer` (
  `opr_id` int(11) NOT NULL,
  `opr_navn` text,
  `ini` text,
  `cpr` text,
  `password` text,
  PRIMARY KEY (`opr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operatoer`
--

LOCK TABLES `operatoer` WRITE;
/*!40000 ALTER TABLE `operatoer` DISABLE KEYS */;
INSERT INTO `operatoer` VALUES (1,'Angelo A','AA','070770-7007','lKje4fa'),(2,'Antonella B','AB','080880-8008','atoJ21v'),(3,'Luigi C','LC','090990-9009','jEfm5aQ');
/*!40000 ALTER TABLE `operatoer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `opg1`
--

DROP TABLE IF EXISTS `opg1`;
/*!50001 DROP VIEW IF EXISTS `opg1`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `opg1` (
  `raavare_navn` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `opg2`
--

DROP TABLE IF EXISTS `opg2`;
/*!50001 DROP VIEW IF EXISTS `opg2`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `opg2` (
  `recept_id` tinyint NOT NULL,
  `recept_navn` tinyint NOT NULL,
  `raavare_navn` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `opg3a`
--

DROP TABLE IF EXISTS `opg3a`;
/*!50001 DROP VIEW IF EXISTS `opg3a`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `opg3a` (
  `recept_navn` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `opg3b`
--

DROP TABLE IF EXISTS `opg3b`;
/*!50001 DROP VIEW IF EXISTS `opg3b`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `opg3b` (
  `recept_navn` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `opg4`
--

DROP TABLE IF EXISTS `opg4`;
/*!50001 DROP VIEW IF EXISTS `opg4`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `opg4` (
  `recept_navn` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `opg5`
--

DROP TABLE IF EXISTS `opg5`;
/*!50001 DROP VIEW IF EXISTS `opg5`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `opg5` (
  `recept_navn` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `opg6`
--

DROP TABLE IF EXISTS `opg6`;
/*!50001 DROP VIEW IF EXISTS `opg6`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `opg6` (
  `recept_id` tinyint NOT NULL,
  `raavare_navn` tinyint NOT NULL,
  `nom_netto` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `opg7`
--

DROP TABLE IF EXISTS `opg7`;
/*!50001 DROP VIEW IF EXISTS `opg7`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `opg7` (
  `pb_id` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `opg8`
--

DROP TABLE IF EXISTS `opg8`;
/*!50001 DROP VIEW IF EXISTS `opg8`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `opg8` (
  `opr_navn` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `opg9`
--

DROP TABLE IF EXISTS `opg9`;
/*!50001 DROP VIEW IF EXISTS `opg9`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `opg9` (
  `i` tinyint NOT NULL,
  `j` tinyint NOT NULL,
  `k` tinyint NOT NULL,
  `l` tinyint NOT NULL,
  `m` tinyint NOT NULL,
  `n` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `produktbatch`
--

DROP TABLE IF EXISTS `produktbatch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produktbatch` (
  `pb_id` int(11) NOT NULL,
  `status` int(11) DEFAULT NULL,
  `recept_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`pb_id`),
  KEY `recept_id` (`recept_id`),
  CONSTRAINT `produktbatch_ibfk_1` FOREIGN KEY (`recept_id`) REFERENCES `recept` (`recept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produktbatch`
--

LOCK TABLES `produktbatch` WRITE;
/*!40000 ALTER TABLE `produktbatch` DISABLE KEYS */;
INSERT INTO `produktbatch` VALUES (1,2,1),(2,2,1),(3,2,2),(4,1,3),(5,0,3);
/*!40000 ALTER TABLE `produktbatch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produktbatchkomponent`
--

DROP TABLE IF EXISTS `produktbatchkomponent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produktbatchkomponent` (
  `pb_id` int(11) NOT NULL,
  `rb_id` int(11) NOT NULL,
  `tara` double DEFAULT NULL,
  `netto` double DEFAULT NULL,
  `opr_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`pb_id`,`rb_id`),
  KEY `rb_id` (`rb_id`),
  KEY `opr_id` (`opr_id`),
  CONSTRAINT `produktbatchkomponent_ibfk_1` FOREIGN KEY (`pb_id`) REFERENCES `produktbatch` (`pb_id`),
  CONSTRAINT `produktbatchkomponent_ibfk_2` FOREIGN KEY (`rb_id`) REFERENCES `raavarebatch` (`rb_id`),
  CONSTRAINT `produktbatchkomponent_ibfk_3` FOREIGN KEY (`opr_id`) REFERENCES `operatoer` (`opr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produktbatchkomponent`
--

LOCK TABLES `produktbatchkomponent` WRITE;
/*!40000 ALTER TABLE `produktbatchkomponent` DISABLE KEYS */;
INSERT INTO `produktbatchkomponent` VALUES (1,1,0.5,10.05,1),(1,2,0.5,2.03,1),(1,4,0.5,1.98,1),(2,1,0.5,10.01,2),(2,2,0.5,1.99,2),(2,5,0.5,1.47,2),(3,1,0.5,10.07,1),(3,3,0.5,2.06,2),(3,4,0.5,1.55,1),(3,6,0.5,1.53,2),(4,1,0.5,10.02,3),(4,5,0.5,1.57,3),(4,6,0.5,1.03,3),(4,7,0.5,0.99,3);
/*!40000 ALTER TABLE `produktbatchkomponent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `q1`
--

DROP TABLE IF EXISTS `q1`;
/*!50001 DROP VIEW IF EXISTS `q1`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `q1` (
  `antal` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `q2`
--

DROP TABLE IF EXISTS `q2`;
/*!50001 DROP VIEW IF EXISTS `q2`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `q2` (
  `samlede_maengde` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `q3`
--

DROP TABLE IF EXISTS `q3`;
/*!50001 DROP VIEW IF EXISTS `q3`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `q3` (
  `raavare_navn` tinyint NOT NULL,
  `samlede_maengde` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `q4`
--

DROP TABLE IF EXISTS `q4`;
/*!50001 DROP VIEW IF EXISTS `q4`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `q4` (
  `raavare_navn` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `raavare`
--

DROP TABLE IF EXISTS `raavare`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `raavare` (
  `raavare_id` int(11) NOT NULL,
  `raavare_navn` text,
  `leverandoer` text,
  PRIMARY KEY (`raavare_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `raavare`
--

LOCK TABLES `raavare` WRITE;
/*!40000 ALTER TABLE `raavare` DISABLE KEYS */;
INSERT INTO `raavare` VALUES (1,'dej','Wawelka'),(2,'tomat','Knoor'),(3,'tomat','Veaubais'),(4,'tomat','Franz'),(5,'ost','Ost og Skinke A/S'),(6,'skinke','Ost og Skinke A/S'),(7,'champignon','Igloo Frostvarer');
/*!40000 ALTER TABLE `raavare` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `raavarebatch`
--

DROP TABLE IF EXISTS `raavarebatch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `raavarebatch` (
  `rb_id` int(11) NOT NULL,
  `raavare_id` int(11) DEFAULT NULL,
  `maengde` double DEFAULT NULL,
  PRIMARY KEY (`rb_id`),
  KEY `raavare_id` (`raavare_id`),
  CONSTRAINT `raavarebatch_ibfk_1` FOREIGN KEY (`raavare_id`) REFERENCES `raavare` (`raavare_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `raavarebatch`
--

LOCK TABLES `raavarebatch` WRITE;
/*!40000 ALTER TABLE `raavarebatch` DISABLE KEYS */;
INSERT INTO `raavarebatch` VALUES (1,1,1000),(2,2,300),(3,3,300),(4,5,100),(5,5,100),(6,6,100),(7,7,100);
/*!40000 ALTER TABLE `raavarebatch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recept`
--

DROP TABLE IF EXISTS `recept`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recept` (
  `recept_id` int(11) NOT NULL,
  `recept_navn` text,
  PRIMARY KEY (`recept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recept`
--

LOCK TABLES `recept` WRITE;
/*!40000 ALTER TABLE `recept` DISABLE KEYS */;
INSERT INTO `recept` VALUES (1,'margherita'),(2,'prosciutto'),(3,'capricciosa');
/*!40000 ALTER TABLE `recept` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receptkomponent`
--

DROP TABLE IF EXISTS `receptkomponent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `receptkomponent` (
  `recept_id` int(11) NOT NULL,
  `raavare_id` int(11) NOT NULL,
  `nom_netto` double DEFAULT NULL,
  `tolerance` double DEFAULT NULL,
  PRIMARY KEY (`recept_id`,`raavare_id`),
  KEY `raavare_id` (`raavare_id`),
  CONSTRAINT `receptkomponent_ibfk_1` FOREIGN KEY (`recept_id`) REFERENCES `recept` (`recept_id`),
  CONSTRAINT `receptkomponent_ibfk_2` FOREIGN KEY (`raavare_id`) REFERENCES `raavare` (`raavare_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receptkomponent`
--

LOCK TABLES `receptkomponent` WRITE;
/*!40000 ALTER TABLE `receptkomponent` DISABLE KEYS */;
INSERT INTO `receptkomponent` VALUES (1,1,10,0.1),(1,2,2,0.1),(1,5,2,0.1),(2,1,10,0.1),(2,3,2,0.1),(2,5,1.5,0.1),(2,6,1.5,0.1),(3,1,10,0.1),(3,4,1.5,0.1),(3,5,1.5,0.1),(3,6,1,0.1),(3,7,1,0.1);
/*!40000 ALTER TABLE `receptkomponent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `opg1`
--

/*!50001 DROP TABLE IF EXISTS `opg1`*/;
/*!50001 DROP VIEW IF EXISTS `opg1`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `opg1` AS select `raavare`.`raavare_navn` AS `raavare_navn` from (`raavare` join `raavarebatch`) order by `raavare`.`raavare_navn` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `opg2`
--

/*!50001 DROP TABLE IF EXISTS `opg2`*/;
/*!50001 DROP VIEW IF EXISTS `opg2`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `opg2` AS select `recept`.`recept_id` AS `recept_id`,`recept`.`recept_navn` AS `recept_navn`,`raavare`.`raavare_navn` AS `raavare_navn` from ((`recept` join `receptkomponent` on((`recept`.`recept_id` = `receptkomponent`.`recept_id`))) join `raavare` on((`raavare`.`raavare_id` = `receptkomponent`.`raavare_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `opg3a`
--

/*!50001 DROP TABLE IF EXISTS `opg3a`*/;
/*!50001 DROP VIEW IF EXISTS `opg3a`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `opg3a` AS select `recept`.`recept_navn` AS `recept_navn` from (`recept` join `raavare`) where ((`raavare`.`raavare_navn` = 'champignon') or 'tomat') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `opg3b`
--

/*!50001 DROP TABLE IF EXISTS `opg3b`*/;
/*!50001 DROP VIEW IF EXISTS `opg3b`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `opg3b` AS select `rk1`.`recept_navn` AS `recept_navn` from ((`recept` `rk1` join `receptkomponent` on((`rk1`.`recept_id` = `receptkomponent`.`recept_id`))) join `raavare` on((`receptkomponent`.`raavare_id` = `raavare`.`raavare_id`))) where ((`raavare`.`raavare_navn` like 'champignon') and exists(select 1 from (`receptkomponent` `rk2` join `raavare` on((`rk2`.`raavare_id` = `raavare`.`raavare_id`))) where ((`rk1`.`recept_id` = `rk2`.`recept_id`) and (`raavare`.`raavare_navn` like 'skinke')))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `opg4`
--

/*!50001 DROP TABLE IF EXISTS `opg4`*/;
/*!50001 DROP VIEW IF EXISTS `opg4`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `opg4` AS select `rk1`.`recept_navn` AS `recept_navn` from ((`recept` `rk1` join `receptkomponent` on((`rk1`.`recept_id` = `receptkomponent`.`recept_id`))) join `raavare` on((`receptkomponent`.`raavare_id` = `raavare`.`raavare_id`))) where (not(exists(select 1 from (`receptkomponent` `rk2` join `raavare` on((`rk2`.`raavare_id` = `raavare`.`raavare_id`))) where ((`rk1`.`recept_id` = `rk2`.`recept_id`) and (`raavare`.`raavare_navn` like 'champignon'))))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `opg5`
--

/*!50001 DROP TABLE IF EXISTS `opg5`*/;
/*!50001 DROP VIEW IF EXISTS `opg5`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `opg5` AS select distinct `recept`.`recept_navn` AS `recept_navn` from ((`recept` join `receptkomponent` on((`recept`.`recept_id` = `receptkomponent`.`recept_id`))) join `raavare` on((`receptkomponent`.`raavare_id` = `raavare`.`raavare_id`))) where (`receptkomponent`.`nom_netto` = (select max(`receptkomponent`.`nom_netto`) from (`receptkomponent` join `raavare` on((`receptkomponent`.`raavare_id` = `raavare`.`raavare_id`))) where (`raavare`.`raavare_navn` like 'tomat'))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `opg6`
--

/*!50001 DROP TABLE IF EXISTS `opg6`*/;
/*!50001 DROP VIEW IF EXISTS `opg6`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `opg6` AS select `recept`.`recept_id` AS `recept_id`,`raavare`.`raavare_navn` AS `raavare_navn`,`receptkomponent`.`nom_netto` AS `nom_netto` from ((`recept` join `receptkomponent` on((`recept`.`recept_id` = `receptkomponent`.`recept_id`))) join `raavare` on((`raavare`.`raavare_id` = `receptkomponent`.`raavare_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `opg7`
--

/*!50001 DROP TABLE IF EXISTS `opg7`*/;
/*!50001 DROP VIEW IF EXISTS `opg7`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `opg7` AS select distinct `produktbatchkomponent`.`pb_id` AS `pb_id` from (((`produktbatchkomponent` join `produktbatch` on((`produktbatchkomponent`.`pb_id` = `produktbatch`.`pb_id`))) join `receptkomponent` on((`produktbatch`.`recept_id` = `receptkomponent`.`recept_id`))) join `raavare` on((`receptkomponent`.`raavare_id` = `raavare`.`raavare_id`))) where (`produktbatchkomponent`.`netto` = (select max(`produktbatchkomponent`.`netto`) from (`produktbatchkomponent` join `raavare`) where (`raavare`.`raavare_navn` like 'tomat'))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `opg8`
--

/*!50001 DROP TABLE IF EXISTS `opg8`*/;
/*!50001 DROP VIEW IF EXISTS `opg8`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `opg8` AS select distinct `operatoer`.`opr_navn` AS `opr_navn` from (((`operatoer` join `produktbatchkomponent` on((`produktbatchkomponent`.`opr_id` = `operatoer`.`opr_id`))) join `produktbatch` on((`produktbatch`.`pb_id` = `produktbatchkomponent`.`pb_id`))) join `recept` on((`recept`.`recept_id` = `produktbatch`.`recept_id`))) where (`recept`.`recept_navn` = 'margherita') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `opg9`
--

/*!50001 DROP TABLE IF EXISTS `opg9`*/;
/*!50001 DROP VIEW IF EXISTS `opg9`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `opg9` AS select `produktbatch`.`pb_id` AS `i`,`produktbatch`.`status` AS `j`,`raavare`.`raavare_navn` AS `k`,`receptkomponent`.`nom_netto` AS `l`,`recept`.`recept_navn` AS `m`,`operatoer`.`opr_navn` AS `n` from (((((`operatoer` join `produktbatchkomponent` on((`produktbatchkomponent`.`opr_id` = `operatoer`.`opr_id`))) join `produktbatch` on((`produktbatch`.`pb_id` = `produktbatchkomponent`.`pb_id`))) join `recept` on((`recept`.`recept_id` = `produktbatch`.`recept_id`))) join `receptkomponent` on((`receptkomponent`.`recept_id` = `recept`.`recept_id`))) join `raavare` on((`raavare`.`raavare_id` = `receptkomponent`.`raavare_id`))) group by `i`,`j`,`k`,`l`,`m`,`n` order by `n` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `q1`
--

/*!50001 DROP TABLE IF EXISTS `q1`*/;
/*!50001 DROP VIEW IF EXISTS `q1`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `q1` AS select count(0) AS `antal` from `produktbatchkomponent` where (`produktbatchkomponent`.`netto` > 10) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `q2`
--

/*!50001 DROP TABLE IF EXISTS `q2`*/;
/*!50001 DROP VIEW IF EXISTS `q2`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `q2` AS select sum(`raavarebatch`.`maengde`) AS `samlede_maengde` from (`raavarebatch` join `raavare` on((`raavare`.`raavare_id` = `raavarebatch`.`raavare_id`))) where (`raavare`.`raavare_navn` = 'tomat') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `q3`
--

/*!50001 DROP TABLE IF EXISTS `q3`*/;
/*!50001 DROP VIEW IF EXISTS `q3`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `q3` AS select `raavare`.`raavare_navn` AS `raavare_navn`,sum(`raavarebatch`.`maengde`) AS `samlede_maengde` from (`raavarebatch` join `raavare` on((`raavare`.`raavare_id` = `raavarebatch`.`raavare_id`))) group by `raavare`.`raavare_navn` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `q4`
--

/*!50001 DROP TABLE IF EXISTS `q4`*/;
/*!50001 DROP VIEW IF EXISTS `q4`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `q4` AS select `raavare`.`raavare_navn` AS `raavare_navn` from ((`raavare` join `receptkomponent` on((`receptkomponent`.`raavare_id` = `raavare`.`raavare_id`))) join `recept` on((`recept`.`recept_id` = `receptkomponent`.`recept_id`))) group by `raavare`.`raavare_navn` having (count(0) > 2) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-06  3:42:15
