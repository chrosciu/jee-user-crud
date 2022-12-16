CREATE TABLE `users` (
                         `id` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
                         `username` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                         `email` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                         `password` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO users (username, email, password) VALUES ('chrosciu', 'mchrost82@gmail.com', NULL);