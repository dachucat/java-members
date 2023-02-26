
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