
CREATE TABLE `author` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `mail` varchar(100) DEFAULT NULL,
  `remark` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `book` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `book_infor_id` int(10) unsigned NOT NULL,
  `bookshelf_id` int(10) unsigned DEFAULT NULL,
  `borrow_record_id` int(10) unsigned DEFAULT NULL,
  `status` tinyint(4) DEFAULT '0',
  `in_library_date` datetime NOT NULL,
  `destory_date` datetime DEFAULT NULL,
  `barcode` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `book_author` (
  `book_infor_id` int(10) unsigned NOT NULL,
  `author_id` int(10) unsigned NOT NULL,
  `type` tinyint(4) DEFAULT '0',
  `level` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`book_infor_id`,`author_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `book_infor` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `publisher_id` int(10) unsigned DEFAULT NULL,
  `version` varchar(32) DEFAULT NULL,
  `price` decimal(5,2) DEFAULT NULL,
  `barcode` varchar(32) DEFAULT NULL,
  `count` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



CREATE TABLE `bookshelf` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `barcode` varchar(32) DEFAULT NULL,
  `status` tinyint(4) DEFAULT '0',
  `type` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



CREATE TABLE `publisher` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `borrow_card` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `client_id` int(10) unsigned NOT NULL,
  `start_date` datetime NOT NULL,
  `end_date` datetime DEFAULT NULL,
  `status` tinyint(4) DEFAULT '0',
  `level` tinyint(4) DEFAULT '0',
  `book_count` int(10) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `client` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `mail` varchar(100) DEFAULT NULL,
  `account` varchar(100) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  `mobile` varchar(32) DEFAULT NULL,
  `status` tinyint(4) DEFAULT '0',
  `address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `book_type` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



CREATE TABLE `book_of_type` (
  `book_infor_id` int(10) unsigned NOT NULL,
  `book_type_id` int(10) unsigned NOT NULL,
  `level` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`book_infor_id`,`book_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



CREATE TABLE `book_in_library` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `book_infor_id` bigint(20) unsigned NOT NULL,
  `count` int(11) DEFAULT '0',
  `status` tinyint(4) DEFAULT '0',
  `logistics_no` varchar(32) DEFAULT NULL COMMENT '物流单号',
  `in_library_date` datetime DEFAULT NULL COMMENT '入库时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `client` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `mail` varchar(100) DEFAULT NULL,
  `account` varchar(100) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  `mobile` varchar(32) DEFAULT NULL,
  `status` tinyint(4) DEFAULT '0',
  `address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



CREATE TABLE `borrow_request` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `book_infor_id` int(10) unsigned NOT NULL,
  `remark` text,
  `client_id` int(10) unsigned NOT NULL,
  `type` tinyint(4) DEFAULT '0',
  `borrow_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



CREATE TABLE `borrow_record` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `client_id` int(10) unsigned NOT NULL,
  `borrow_card_id` int(10) unsigned DEFAULT NULL,
  `start_date` datetime NOT NULL,
  `end_date` datetime DEFAULT NULL,
  `status` tinyint(4) DEFAULT '0',
  `remark` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `book_borrow_record` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `client_id` int(10) unsigned NOT NULL,
  `borrow_card_id` int(10) unsigned DEFAULT NULL,
  `borrow_id` int(10) unsigned NOT NULL,
  `book_id` int(10) unsigned NOT NULL,
  `book_infor_id` int(10) unsigned NOT NULL,
  `status` tinyint(4) DEFAULT '0',
  `start_date` datetime NOT NULL,
  `end_date` datetime DEFAULT NULL,
  `back_date` datetime DEFAULT NULL,
  `remark` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `client_wallet` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `client_id` int(10) unsigned NOT NULL,
  `amount` decimal(10,2) DEFAULT NULL,
  `last_depsit_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `client_wallet_client_id_IDX` (`client_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `third_auth` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `auth_type` tinyint(4) NOT NULL,
  `code` varchar(100) DEFAULT NULL,
  `client_id` int(10) unsigned NOT NULL,
  `status` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `third_auth_auth_type_IDX` (`auth_type`,`client_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


