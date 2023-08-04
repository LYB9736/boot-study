DROP TABLE IF EXISTS `post`;
DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `id` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`idx`),
  UNIQUE KEY `user_un` (`id`)
)

CREATE TABLE `post` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `content` varchar(100) NOT NULL,
  `user_idx` int(11) NOT NULL,
  PRIMARY KEY (`idx`),
  KEY `post_FK` (`user_idx`),
  CONSTRAINT `post_FK` FOREIGN KEY (`user_idx`) REFERENCES `user` (`idx`)
)