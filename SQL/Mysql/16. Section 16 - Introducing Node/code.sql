CREATE DATABASE webapp;
USE webapp;

CREATE TABLE users(
	email VARCHAR(255) PRIMARY KEY, 
    created_at TIMESTAMP DEFAULT NOW()
);

SELECT * FROM users;

SELECT email, DATE_FORMAT(created_at,"%M %D %Y") FROM users 
WHERE created_at = (SELECT MIN(created_at) FROM users);

SELECT MONTHNAME(created_at) AS month, COUNT(created_at) AS count
FROM users
GROUP BY MONTHNAME(created_at)
ORDER BY count DESC;

SELECT * FROM users
WHERE email LIKE '%@yahoo.com'; 

SELECT 
	CASE
		WHEN email like '%@yahoo.com' THEN 'yahoo'
        WHEN email like '%@gmail.com' THEN 'gmail'
        WHEN email like '%@hotmail.com' THEN 'hotmail'
        ELSE 'other'
	END AS provider,
    COUNT(*) AS total
    FROM users
    GROUP BY provider
    ORDER BY provider;
    
