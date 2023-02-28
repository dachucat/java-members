--- 2023-02-26
CREATE TABLE `topic` (
  `name` varchar(100) NOT NULL COMMENT '名称',
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) unsigned DEFAULT NULL,
  `parent1_id` bigint(20) unsigned DEFAULT NULL,
  `column_type` tinyint(4) DEFAULT '0' COMMENT '分类的栏目类别',
  `is_hot` tinyint(4) DEFAULT '0',
  `icon` varchar(100) DEFAULT NULL,
  `sort_value` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;

--- 2023-02-27
ALTER TABLE library.topic ADD code varchar(32) NULL;

---2023-02-28
CREATE TABLE `park` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `icon` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `introduction` text,
  `barcode` varchar(36) DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  `type` tinyint unsigned NOT NULL DEFAULT '3' COMMENT '类型',
  `ordering` bigint unsigned DEFAULT NULL,
  `code` varchar(50) DEFAULT NULL COMMENT '与前台约定',
  `parent_id` bigint unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `park_id_IDX` (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
