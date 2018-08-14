/*
SQLyog Community v12.3.3 (64 bit)
MySQL - 5.7.17-log : Database - pizzashop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`pizzashop` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `pizzashop`;

/*Table structure for table `bill` */

DROP TABLE IF EXISTS `bill`;

CREATE TABLE `bill` (
  `ID` varchar(4) DEFAULT NULL,
  `NAME` varchar(30) DEFAULT NULL,
  `TYPE` varchar(10) DEFAULT NULL,
  `PRICE` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bill` */

/*Table structure for table `member` */

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
  `name` varchar(20) DEFAULT NULL,
  `address` varchar(70) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `contact` varchar(15) NOT NULL,
  PRIMARY KEY (`contact`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `member` */

insert  into `member`(`name`,`address`,`email`,`contact`) values 
('Arun','Sagarpur,New Delhi','aarunbaaliyan@gmail.com','7011407370'),
('ARUN KUMAR','RZ-1183,STREET NO.-5/5,MAIN SAGARPUR,NEW DELHI','ARUNBAALIYAN@GMAIL.COM','8800707098');

/*Table structure for table `menu` */

DROP TABLE IF EXISTS `menu`;

CREATE TABLE `menu` (
  `id` varchar(4) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `menu` */

insert  into `menu`(`id`,`name`,`type`,`price`) values 
('bn01','Grill Chicken','non-veg',79),
('bn02','crispy Chicken','non-veg',119),
('bn03','Chicken Whopper','non-veg',189),
('bn04','Chicken Chilli Cheese Melt','non-veg',149),
('bn05','Spicy Chicken Royal','non-veg',149),
('bv01','Veggie','veg',69),
('bv02','Crispy Veg','veg',99),
('bv03','Veg Whopper','veg',169),
('bv04','Veg Chilli Cheese Melt','veg',109),
('bv05','Tandoor Grill','veg',99),
('bv06','Paneer King Melt','veg',199),
('d01','Choco Truffle Cake','cake',199),
('d02','Snicker Pie','pie',85),
('d03','Oreo Choco Shake','shake',125),
('d04','Oreo Vanilla Shake','shake',125),
('d05','Sundae Strawberry','sundae',149),
('d06','Choco Fudge Sundae','Sundae',125),
('pn01','Triple Chicken Feast','non-veg',549),
('pn02','Keema Masala','non-veg',499),
('pn03','Chicken Italiano','non-veg',599),
('pn04','Big Pizza Classic Chicken','non-veg',725),
('pn05','Double Trouble','non-veg',849),
('pn06','Chicken Tikka','non-veg',999),
('pv01','Veggie Supreme','veg',480),
('pv02','Veggie Lover','veg',425),
('pv03','Tandoori Paneer','veg',490),
('pv04','Paneer Vagorama','veg',495),
('pv05','Exotica','veg',475),
('pv06','Country Feast','veg',425),
('s01','Cheese Garlic Bread','veg',99),
('s02','Garlic Bread stix','veg',85),
('s03','Exotica Garlic Bread','veg',125),
('s04','Non-Veg Pockets','non-veg',89),
('s05','Veg Pockets','veg',69),
('s06','Garlic Bread Spicy Supreme','veg',99);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
