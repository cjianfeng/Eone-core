DROP TABLE IF EXISTS `demo_t`;  
  
CREATE TABLE `demo_t` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,  
  `name` varchar(40) NOT NULL,  
  `password` varchar(255) NOT NULL,  
  `age` int(4) NOT NULL,  
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;  
  
/*Data for the table `demo_t` */  
  
insert  into `demo_t`(`id`,`name`,`password`,`age`) values (1,'测试','sfasgfaf',24);