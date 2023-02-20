
CREATE TABLE `author` (
  `name` varchar(100) NOT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `country` varchar(100) NOT NULL,
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  UNIQUE KEY `author_un` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `book` (
  `book_infor_id` int unsigned NOT NULL,
  `bookshelf_id` int unsigned NOT NULL,
  `borrow_record_id` int unsigned DEFAULT NULL,
  `status` smallint NOT NULL,
  `in_library_date` date NOT NULL,
  `destory_date` date DEFAULT NULL,
  `barcode` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
