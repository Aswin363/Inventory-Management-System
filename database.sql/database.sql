-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: emart
-- ------------------------------------------------------
-- Server version	8.0.41

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `empid` varchar(20) NOT NULL,
  `empname` varchar(50) NOT NULL,
  `job` varchar(30) DEFAULT NULL,
  `salary` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES ('E102','abhimanu','Watchman',10000.00),('E103','subas kuar','Helper',12000.00),('E104','ak','Receptionist',15000.00),('E105','pl','Receptionist',12000.00);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `order_id` varchar(20) NOT NULL,
  `p_id` varchar(20) NOT NULL,
  `quantity` int DEFAULT NULL,
  `userid` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`order_id`,`p_id`),
  KEY `ORD_PROD_FK` (`p_id`),
  KEY `ORD_USER_FK` (`userid`),
  CONSTRAINT `ORD_PROD_FK` FOREIGN KEY (`p_id`) REFERENCES `products` (`p_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ORD_USER_FK` FOREIGN KEY (`userid`) REFERENCES `users` (`userid`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES ('O-101','P101',2,'sub@123'),('O-102','P101',2,'sub@123'),('O-102','P102',5,'sub@123'),('O-103','P101',2,'sub@123'),('O-103','P102',5,'sub@123');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `p_id` varchar(20) NOT NULL,
  `p_name` varchar(100) NOT NULL,
  `p_companyname` varchar(100) DEFAULT NULL,
  `p_price` decimal(10,2) DEFAULT NULL,
  `our_price` decimal(10,2) DEFAULT NULL,
  `p_tax` int DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `mfg_date` date DEFAULT NULL,
  `exp_date` date DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES ('P101','maggie','neltle',25.00,30.00,5,94,'2025-12-04','2026-01-31','y'),('P102','cofee','neltle',42.00,50.00,5,190,'2025-12-03','2026-01-03','y'),('P103','noodels','xyz',25.00,30.00,0,9,'2025-12-01','2025-12-04','N'),('P104','detergen','Wheel',90.00,99.00,5,1000,'2025-12-01','2025-12-31','y'),('P105','chocklate','ITC',25.00,30.00,0,50,'2025-11-02','2025-12-02','N'),('P106','soap','dov',20.00,30.00,5,1000,'2025-12-07','2025-12-31','N');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `userid` varchar(20) NOT NULL,
  `empid` varchar(20) DEFAULT NULL,
  `password` varchar(50) NOT NULL,
  `usertype` varchar(30) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userid`),
  KEY `USERS_EMP_FK` (`empid`),
  CONSTRAINT `USERS_EMP_FK` FOREIGN KEY (`empid`) REFERENCES `employees` (`empid`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('aswin',NULL,'aswin123','Manager','Aswin'),('dh@123',NULL,'1234','Receptionist','dheeru'),('gaurab@123',NULL,'1234','Receptionist','gaurab'),('sub@123',NULL,'test','Receptionist','subh');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-12-08 19:39:45
