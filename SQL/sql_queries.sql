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


