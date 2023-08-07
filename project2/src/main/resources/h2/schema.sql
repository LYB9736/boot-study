DROP TABLE IF EXISTS `post`;
DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  idx int(11) NOT NULL AUTO_INCREMENT,
  id varchar(100) NOT NULL,
  password varchar(100) NOT NULL,
  create_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  update_date TIMESTAMP NULL ON UPDATE CURRENT_TIMESTAMP,
  delete_date TIMESTAMP NULL,
  PRIMARY KEY (idx),
  UNIQUE  (id)
);

CREATE TABLE `post` (
  idx int(11) NOT NULL AUTO_INCREMENT,
  title varchar(100) NOT NULL,
  content varchar(1000) NOT NULL,
  user_idx int(11) NOT NULL,
  create_date TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  update_date TIMESTAMP    NULL ON UPDATE CURRENT_TIMESTAMP,
  delete_date TIMESTAMP    NULL,
  PRIMARY KEY (idx),
  FOREIGN KEY (user_idx) REFERENCES `user` (idx)
);