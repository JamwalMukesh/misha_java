SHOW databases;

-- Create, Update and Delete operations
-- We have pre-populated database present. 
-- World database 
-- Your task is to find World database script and import into your MySQL
USE world;

SHOW TABLES;

DESCRIBE country;

DESC city;

-- READ operations has variety of things.
SELECT *
FROM country;

SELECT name, continent, population, surfacearea
FROM country;

SELECT name, continent, population, surfacearea
FROM country
LIMIT 5;

-- LIMIT SKIP_ROW, NUMBER_OF_ROWS
SELECT name, continent, population, surfacearea
FROM country
LIMIT 5,5;

-- FILTER THE RECORDS 
-- For this there is WHERE clause
SELECT name, continent, population, surfacearea
FROM country
WHERE continent = 'Asia';

SELECT name, continent, population, surfacearea
FROM country
WHERE continent = 'Asia' OR continent = 'Europe';

SELECT name, continent, population, surfacearea
FROM country
WHERE continent IN ('Asia','Europe');

SELECT name, continent, population, surfacearea
FROM country
WHERE continent NOT IN ('Asia','Europe');

-- Pattern matching 
-- Here % means zero or any number of letters
-- Underscore means any one letter
SELECT name, continent, population, surfacearea
FROM country
WHERE name like 'I%';

SELECT name, continent, population, surfacearea
FROM country
WHERE name like '_n%';

SELECT name, continent, population, surfacearea
FROM country
WHERE name not like '_n%';

SELECT name, continent, population, surfacearea, indepyear
FROM country;

-- NULL is treated as UNKNOWN or UNSPECIFIED
-- and it is not a value
-- So equal operator is not work on NULL
SELECT name, continent, population, surfacearea, indepyear
FROM country
WHERE indepyear = NULL;

SELECT name, continent, population, surfacearea, indepyear
FROM country
WHERE indepyear IS NULL;

SELECT name, continent, population, surfacearea, indepyear
FROM country
WHERE indepyear IS NOT NULL;

-- Arrange the record according to name in ascending order
SELECT name, continent, population, surfacearea, indepyear
FROM country
ORDER BY name;

SELECT name, continent, population, surfacearea, indepyear
FROM country
ORDER BY name desc;

SELECT name, continent, population, surfacearea, indepyear
FROM country
ORDER BY continent;

-- continent is a column which have ENUM data type
-- In ENUM data type column, data is arranged according to their set of values.
-- 'enum(''Asia'',''Europe'',''North America'',''Africa'',''Oceania'',''Antarctica'',''South America'')'
DESC country;

-- Below query give this error
-- 'You have an error in your SQL syntax; check the manual that corresponds to your MySQL server 
-- version for the right syntax to use near ''WHERE continent IN (''Asia'',''Europe'')'' 
-- at line 4'
-- Error means WHERE clause is placed before ORDER BY clause
SELECT name, continent, population, surfacearea, indepyear
FROM country
ORDER BY continent
WHERE continent IN ('Asia','Europe');

-- SQL is order specific language
SELECT name, continent, population, surfacearea, indepyear
FROM country
WHERE continent IN ('Asia','Europe')
ORDER BY continent;

SHOW ERRORS;

-- Two Level Order
-- If one column has same value then how they will arrange
-- For that there is concept of Two Level Order
SELECT name, continent, population, surfacearea, indepyear
FROM country
ORDER BY continent, population DESC;

SELECT name, continent, population, surfacearea, indepyear
FROM country
ORDER BY continent ASC, population DESC;

SELECT name, continent, population, surfacearea, indepyear
FROM country
ORDER BY population DESC
LIMIT 1;

SELECT name, continent, population, surfacearea, indepyear
FROM country
ORDER BY population DESC
LIMIT 1,1;

-- JOIN Queries
-- Mostly we store data into multiple tables 
-- But for displaying purpose we need to collect data from multiple tables
-- There are six type of Join
-- 1. Natural Join
-- 2. Inner Join
-- 3. Outer Join
-- 4. Self Join
-- 5. Equi Join
-- 6. Cross Join
-- In world schema, country table is a parent table of city table.
-- In City table there is a column which name is countrycode which 
-- is a foreign key associated with country table
-- Mostly Join operation performed where two table has something common field
-- common field means two or more column whose data type and their value are same

USE world;

SHOW ERRORS;
-- No database selected

-- CROSS JOIN (CARTESIAN PRODUCT)
SELECT * FROM country CROSS JOIN city;

SELECT * FROM country, city;

-- NATURAL JOIN
-- There must be one column in each table which have same value
-- It show those record which value is same as another. 
-- Here city and country table are not suitable for NATURAL JOIN
-- Because foreign key column name is countrycode in city table
-- and primary key column name is code in country table.
-- I am going to create a table which suits to natural join
CREATE TABLE student
(
	rollno int primary key,
	name varchar(100)
);

INSERT INTO student VALUES(1001,'misha'),(1002,'mehak'),(1003,'mukesh');

SELECT * FROM student;

CREATE TABLE student_marks
(
	id int primary key auto_increment,
    rollno int,
    marks int,
    FOREIGN KEY(rollno) REFERENCES student(rollno)
);

INSERT into student_marks(rollno,marks) VALUES(1001,45),(1001,56),(1002,30);

-- NATURAL JOIN pick the column name whose name are same
-- and return those record which have same value
SELECT * FROM student natural join student_marks;

-- EQUI JOIN
-- Any join which have a condition which uses equal to operator.
-- All NATURAL JOIN is an EQUI JOIN
-- All EQUI JOIN is not NATURAL JOIN

-- INNER JOIN
-- It is a conditional based
-- It show those result which satisfy the condition from both table
-- condition can be of any type
-- means >, <, >=, <=, = , != 
SELECT rollno, name, marks
FROM student INNER JOIN student_marks 
ON rollno = rollno;

SHOW ERRORS;
-- Column 'rollno' in field list is ambiguous

SELECT student.rollno, name, marks
FROM student INNER JOIN student_marks 
ON student.rollno = student_marks.rollno;

-- YOu can replace table with its alias
SELECT st.rollno, name, marks
FROM student  st INNER JOIN student_marks  stm
ON st.rollno = stm.rollno;

SELECT st.rollno, name, marks
FROM student AS  st INNER JOIN student_marks AS stm
ON st.rollno = stm.rollno;

-- OUTER JOIN 
-- It show those record which satisfy the condition
-- But it also show other record which is not satisfy the condition
-- based upon the type of OUTER JOIN
-- 1. LEFT OUTER JOIN (SHOW all record of LEFT table of OUTER JOIN clause)
-- 2. RIGHT OUTER JOIN (SHOW all record of RIGHT table of OUTER JOIN clause) 
-- 3. FULL OUTER JOIN (SHOW all record of both table)
SELECT st.rollno, name, marks
FROM student AS  st LEFT OUTER JOIN student_marks AS stm
ON st.rollno = stm.rollno;

SELECT code, country.name, city.name as city_name
FROM country JOIN city
WHERE country.code = city.countryCode;

-- SELF JOIN 
-- Mostly JOIN have two table involve
-- But in SELF JOIN there is only one table
-- So that table must have a foreign key which is linked with itself
CREATE TABLE employee
(
	emp_id int primary key,
    name varchar(100),
    manager_id int
);

-- A manager is also an employee
-- Here manager_id has same value which is present inside emp_id
ALTER TABLE employee
ADD CONSTRAINT fk_employee_emp_id_manager_id 
FOREIGN KEY(manager_id) REFERENCES employee(emp_id);

SHOW INDEXES FROM employee;

INSERT INTO employee(emp_id,name,manager_id)
VALUES(1001,'Amit',NULL);

INSERT INTO employee(emp_id,name,manager_id)
VALUES(1002,'MIsha',1001),(1003,'Mehak',1001);

INSERT INTO employee(emp_id,name,manager_id)
VALUES(1004,'Akshay',1002),(1005,'Mukesh',1003);

SELECT * FROM employee;

-- Output requirement
-- Employee ID, Employee Name, Manager ID , Manager Name 
-- Column Alias means in output we see different name
SELECT e1.emp_id as EmployeeID , e1.name as 'Employee Name', 
e1.manager_id, e2.name as 'Manager Name'
FROM employee as e1 JOIN employee as e2
ON e1.manager_id = e2.emp_id;

SELECT e1.emp_id as EmployeeID , e1.name as 'Employee Name', 
e1.manager_id, e2.name as 'Manager Name'
FROM employee as e1 LEFT OUTER JOIN employee as e2
ON e1.manager_id = e2.emp_id;

SELECT e1.emp_id as EmployeeID , e1.name as 'Employee Name', 
e1.manager_id, ifnull(e2.name,'no manager') as 'Manager Name'
FROM employee as e1 LEFT OUTER JOIN employee as e2
ON e1.manager_id = e2.emp_id;