-- Query to create a database with name practice 
CREATE DATABASE practice;

-- Query to drop a database Here, drop means Delete 
DROP DATABASE practice;

-- Now we have three database here. 
-- So I need to create a table
-- If I am going to create a table then question is which database storing that table.
-- For creating a table, we need to select database first
-- Query to select a database
USE practice;

-- Now I need to execute CREATE TABLE query
-- Before creating table we must have structure in mind
-- Because CREATE TABLE actually decide the structure of table
-- While defining the structure we basically decide column name as well as its data type
CREATE TABLE student (
    rollno INT,
    name VARCHAR(100),
    dob DATE
);

-- DROP or DELETE the table
DROP TABLE student;

-- How to view data of a table
-- To see data inside a table there is SELECT statement
-- Below query select all columns with all data from student table
SELECT *
FROM student;

-- How to insert data in a table
-- While inserting data into table
-- all values must be enclosed in single quote except numeric family
-- By default format of date is YYYY-MM-DD in MySQL 
INSERT INTO student 
(rollno,name,dob)
VALUES (1001,'Misha','2000-11-11');

-- DATE 16 July 2024
USE practice;

-- use to show all table name present in selected database
SHOW TABLES;

SELECT * FROM student;

-- While creating table, we also need to apply constraint on values of fields.
-- There are many constraint (rules or validations) on data in table
-- PRIMARY KEY It ensure field can accept only unique values and doesn't accept NULL values.
-- For e.g. Roll No, Aadhar Card, Email ID, PAN Card, Debit Card, Credit Card, License, Employee Code etc.
-- There is a restriction which is a table can have only one primary key.
-- If there are two or more column which can have unique values then there is concept of 
-- UNIQUE KEY is just like PRIMARY KEY but it accept NULL values
-- NULL values means UNKNOWN or UNSPECIFIED
DROP TABLE student;

CREATE TABLE student
(
	rollno INT PRIMARY KEY,
	name VARCHAR(100) NOT NULL, -- which means it is a mandatory or required field
    dob date,
    email VARCHAR(100) UNIQUE
);

INSERT INTO student
(rollno,name,dob,email)
VALUES(1002,'Mehak','2000-11-11','mehak@gmail.com');

-- Error Code: 1062. Duplicate entry '1001' for key 'PRIMARY'
-- Error Code: 1062. Duplicate entry 'misha@gmail.com' for key 'email'

SELECT * FROM student;

-- below query delete all record of student table
DELETE FROM student;

-- to delete specific record there is WHERE clause
DELETE FROM student
WHERE rollno = 1002;

-- below query update all record name to M2
UPDATE student
SET name = 'M2';
-- Error Code: 1175. You are using safe update mode and you tried to update a table 
-- without a WHERE that uses a KEY column.  To disable safe mode, 
-- toggle the option in Preferences -> SQL Editor and reconnect.

UPDATE student
SET name = 'Madhav'
WHERE rollno = 1002;

SELECT * FROM student;

USE practice;

-- FOREIGN KEY it is a constraint which is used to ensure value of field must be same 
-- value of another field which is either UNIQUE or PRIMARY KEY
-- I want to store student test marks.
-- How many test a student can give?
-- More than one 
-- We need a way to store all student test marks.
-- So I am going to create a new table.
CREATE TABLE student_marks
(
	srno INT auto_increment PRIMARY KEY, -- AUTO Increment means this column value is generated 
    -- automatically begin from 1
    subject varchar(100) NOT NULL, -- It is a required field
    -- NULL means UNKNOWN or UNSPECIFIED
    rollno INT, 
    FOREIGN KEY(rollno) REFERENCES student(rollno),
    -- This foreign key ensure this column can have those value which are present
    -- inside rollno field of student table
    marks INT 
);

INSERT INTO student_marks(subject,rollno,marks)
VALUES('Math',1001,67);

SELECT * FROM student_marks;

INSERT INTO student_marks(subject,rollno,marks)
VALUES('Math',1004,67);

SELECT * FROM student;

SHOW ERRORS;
-- Cannot add or update a child row: a foreign key constraint fails 
-- (`practice`.`student_marks`, CONSTRAINT `student_marks_ibfk_1` FOREIGN KEY (`rollno`) 
-- REFERENCES `student` (`rollno`))

-- There are two table 
-- student (PARENT TABLE because it has primary key or unique key which is associate in a 
-- foreign key) 
-- student_marks (CHILD TABLE of student table because it has Foreign key linked with student
-- primary key)

-- WE cannot delete PARENT table record until it is present inside CHILD table
DELETE FROM student
WHERE rollno = 1001;

SHOW ERRORS;
-- Cannot delete or update a parent row: a foreign key constraint fails 
-- (`practice`.`student_marks`, CONSTRAINT `student_marks_ibfk_1` FOREIGN KEY (`rollno`) 
-- REFERENCES `student` (`rollno`))

-- There are different type of FOREIGN KEY
-- RESTRICT (default)
-- CASCADE means if parent record is deleted or updated then associated child record 
-- is also deleted
-- SET NULL means if parent record is deleted or updated then associated child record
-- is SET to NULL

CREATE TABLE t1
(
	no INT PRIMARY KEY,
	name varchar(100)
);

CREATE TABLE t2
(
	srno int auto_increment primary key,
	no INT,
    value INT,
    foreign key(no) references t1(no)
    ON DELETE CASCADE
    ON UPDATE CASCADE 
);

-- Single insert statement can insert more than one value in a single go
-- This is known as BATCH insert
INSERT INTO t1(no,name) 
VALUES(1001,'RAM'),(1002,'SHAM'),(1003,'AJAY');

SELECT * FROM t1;

INSERT INTO t2(no,value)
VALUES(1001,110),(1001,111),(1002,120),(1003,123);

SELECT * FROM t2;

DELETE FROM t1
WHERE no = 1001;

UPDATE t1
SET no = 1010
WHERE no = 1003;

CREATE TABLE t3
(
	no INT PRIMARY KEY,
	name varchar(100)
);

DROP TABLE t4;

CREATE TABLE t4
(
	srno int auto_increment primary key,
	no INT,
    value INT,
    foreign key(no) references t3(no)
    ON DELETE SET NULL
    ON UPDATE SET NULL
);

-- Single insert statement can insert more than one value in a single go
-- This is known as BATCH insert
INSERT INTO t3(no,name) 
VALUES(1001,'RAM'),(1002,'SHAM'),(1003,'AJAY');

SELECT * FROM t3;

INSERT INTO t4(no,value)
VALUES(1001,110),(1001,111),(1002,120),(1003,123);

SELECT * FROM t4;

DELETE FROM t3
WHERE no = 1001;

UPDATE t3
SET no = 1010
WHERE no = 1003;


-- QNA 
-- Can we create more than one PRIMARY KEY in a table?
-- Answer:- No
-- Can we create more than one UNIQUE KEY in a table?
-- Answer:- Yes
-- Can we create more than one FOREIGN KEY in a table?
-- Answer:- Yes
-- Can we create a FOREIGN KEY associated with UNIQUE KEY?
-- Answer:- Yes
-- Can we create a column which is PRIMARY KEY as well as FOREIGN KEY?
-- Answer:- Yes



























