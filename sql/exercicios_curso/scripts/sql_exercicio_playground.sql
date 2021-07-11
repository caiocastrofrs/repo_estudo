USE movies_db;
----- EXERCICIO 1
SELECT `title` FROM `series` AS `titulos`;
----- EXERCICIO 2
(SELECT 
	`title`
	FROM `movies` WHERE `rating` > 3)
UNION
(SELECT 
	`title` 
    FROM `movies` WHERE `awards` > 1)
UNION
(SELECT 
	`title`
    FROM `movies` WHERE `release_date` > 01-01-1988)
UNION
(SELECT 
	`title`
	FROM `movies` WHERE `release_date` < 31-12-2009);
----- EXERCICIO 3
SELECT `id`,`title` FROM `movies` LIMIT 3 OFFSET 10;
----- EXERCICIO 4
SELECT `title`,`rating` FROM `episodes` ORDER BY `rating` ASC LIMIT 3;
----- EXERCICIO 5
SELECT `first_name`, `last_name` FROM `actors`;

