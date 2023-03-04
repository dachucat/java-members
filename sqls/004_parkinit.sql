CREATE TABLE `park` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `icon` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `introduction` text,
  `barcode` varchar(36) DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  `level` tinyint unsigned NOT NULL DEFAULT '3' COMMENT '等级（最高为1，最低为3）',
  `ordering` bigint unsigned DEFAULT NULL,
  `url` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '地址',
  `parent_id` bigint unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `park_id_IDX` (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO park (icon,introduction,barcode,name,`level`,`ordering`,url,parent_id) VALUES
	 (NULL,NULL,NULL,'顶部菜单',1,NULL,'topMenu',NULL),
	 (NULL,NULL,NULL,'商家App',2,NULL,'测试',1),
	 ('图片','帮老板快速招人，8小时闪电入职','二维码','招才猫直聘',3,1,NULL,2),
	 ('图片','收车卖车无忧，车商必装APP','二维码','58车商通',3,2,NULL,2),
	 (NULL,NULL,NULL,'小程序',2,NULL,NULL,1),
	 ('图片','扫码即用免下载，随用随走功能全','二维码','58同城小程序',3,1,NULL,5)


