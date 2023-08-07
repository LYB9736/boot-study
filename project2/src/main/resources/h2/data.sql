INSERT INTO `user` (`idx`, `id`, `password`, `create_date`)
VALUES(1, 'temp', '123', now()),
      (2, 'sample', '123', now());

INSERT INTO `post` (`idx`, `title`, `content`, `user_idx`, `create_date`)
VALUES(1, '첫번째', '안녕하세요', 1, now()),
      (2, '두번째', '반갑습니다', 1, now()),
      (3, '세번째', '뉴비입니다', 2, now());