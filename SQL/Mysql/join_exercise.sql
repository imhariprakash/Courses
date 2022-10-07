-- CREATE TABLE customer(  
--   cust_id int NOT NULL,  
--   name varchar(35),  
--   occupation varchar(25),  
--   age int  
-- );  

-- CREATE TABLE orders (  
--     order_id int NOT NULL,   
--     cust_id int,   
--     prod_name varchar(45),  
--     order_date date  
-- );  


-- INSERT INTO customer(cust_id, name, occupation, age)   
-- VALUES (101, 'Peter', 'Engineer', 32),  
-- (102, 'Joseph', 'Developer', 30),  
-- (103, 'John', 'Leader', 28),  
-- (104, 'Stephen', 'Scientist', 45),  
-- (105, 'Suzi', 'Carpenter', 26),  
-- (106, 'Bob', 'Actor', 25),  
-- (107, NULL, NULL, NULL); 


-- INSERT INTO orders (order_id, cust_id, prod_name, order_date)   
-- VALUES (1, '101', 'Laptop', '2020-01-10'),  
-- (2, '103', 'Desktop', '2020-02-12'),  
-- (3, '106', 'Iphone', '2020-02-15'),  
-- (4, '104', 'Mobile', '2020-03-05'),  
-- (5, '102', 'TV', '2020-03-20');  


-- SELECT * FROM orders;
-- SELECT * FROM customer



-- SELECT name, occupation FROM customer, orders
-- WHERE orders.cust_id = customer.cust_id
-- ORDER BY customer.cust_id;

-- SELECT name, occupation FROM customer  
-- WHERE NOT EXISTS (SELECT * FROM orders   
-- WHERE customer.cust_id = orders.cust_id);  

-- -- SELECT * FROM orders
-- -- UNION 
-- -- SELECT * FROM customer;

-- SELECT * FROM orders WHERE order_id = 3;

-- DELETE FROM customer
-- WHERE cust_id = (SELECT cust_id FROM orders
-- 				 WHERE order_id = 3);
--                  
--                  
-- DELETE FROM orders WHERE EXISTS (  
-- SELECT * FROM customer   
-- WHERE order_id=3);  

-- SELECT * FROM orders, customer;



-- CREATE TABLE students (
--     id INTEGER PRIMARY KEY,
--     f_name TEXT NOT NULL,
--     l_name TEXT NOT NULL,
--     city TEXT NOT NULL
-- );

-- CREATE TABLE contacts (
--     id INTEGER PRIMARY KEY,
--     cellphone TEXT NOT NULL,
--     homephone TEXT NOT NULL
-- );



-- Active: 1665118824092@@127.0.0.1@3306@world_x

-- INSERT INTO students (id, f_name, l_name, city)
-- VALUES (1, 'Devine', 'Putin', 'France'),
--        (2, 'Michael', 'Clark', 'Australia'),
--        (3, 'Ethon', 'Miller', 'England'),
--        (4, 'Mark', 'Strauss', 'America');

-- INSERT INTO contacts (id, cellphone, homephone)
-- VALUES (1, '123456789', '987654321'),
--        (2, '123456789', '987654321'),
--        (3, '123456789', '987654321'),
--        (4, '123456789', '987654321');


-- DELETE students, contacts FROM students
-- INNER JOIN contacts ON contacts.id = students.id
-- WHERE students.id = 3;

-- SELECT * FROM students;
-- SELECT * FROM contacts;


-- CREATE TABLE employee(  
--     name varchar(45) NOT NULL,    
--     occupation varchar(35) NOT NULL,    
--     working_date date,  
--     working_hours varchar(10)  
-- );  



-- INSERT INTO employee VALUES    
-- ('Robin', 'Scientist', '2020-10-04', 12),  
-- ('Warner', 'Engineer', '2020-10-04', 10),  
-- ('Peter', 'Actor', '2020-10-04', 13),  
-- ('Marco', 'Doctor', '2020-10-04', 14),  
-- ('Brayden', 'Teacher', '2020-10-04', 12),  
-- ('Antonio', 'Business', '2020-10-04', 11);  




-- INSERT INTO employee VALUES
-- ('Markus', 'Actor', '2020-10-08', -12);

-- SELECT * FROM employee;


-- SELECT concat('HELLO ', 'HI');
 