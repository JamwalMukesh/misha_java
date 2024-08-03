CREATE DATABASE demos;

USE demos;

create table sample
(
	id int primary key auto_increment,
    info json
);

-- Create table
CREATE TABLE Products (
    ProductID INT AUTO_INCREMENT PRIMARY KEY,
    ProductName VARCHAR(255) NOT NULL,
    ProductDetails JSON
);

-- Insert JSON data
INSERT INTO Products (ProductName, ProductDetails) VALUES
('Laptop', '{ "Brand": "Dell", "Model": "XPS 13", "Specifications": { "CPU": "Intel i7", "RAM": "16GB", "Storage": "512GB SSD" } }'),
('Smartphone', '{ "Brand": "Apple", "Model": "iPhone 13", "Specifications": { "CPU": "A15 Bionic", "RAM": "6GB", "Storage": "128GB" } }');

-- Select JSON data
SELECT ProductName, ProductDetails->>'$.Brand' AS Brand, ProductDetails->>'$.Specifications.CPU' AS CPU
FROM Products;

-- Filter data using JSON attributes
SELECT ProductName
FROM Products
WHERE ProductDetails->>'$.Brand' = 'Apple';

-- Update JSON data
UPDATE Products
SET ProductDetails = JSON_SET(ProductDetails, '$.Specifications.Storage', '256GB')
WHERE ProductName = 'Smartphone';

-- Add elements to JSON data
UPDATE Products
SET ProductDetails = JSON_SET(ProductDetails, '$.Specifications.Camera', '12MP')
WHERE ProductName = 'Smartphone';

-- Remove elements from JSON data
UPDATE Products
SET ProductDetails = JSON_REMOVE(ProductDetails, '$.Specifications.RAM')
WHERE ProductName = 'Laptop';

-- Insert JSON array
INSERT INTO Products (ProductName, ProductDetails) VALUES
('Tablet', '{ "Brand": "Samsung", "Model": "Galaxy Tab S7", "Specifications": { "CPU": "Snapdragon 865+", "RAM": "8GB", "Storage": "256GB" }, "Accessories": ["Keyboard", "Stylus"] }');

-- Query JSON array
SELECT ProductName, JSON_UNQUOTE(JSON_EXTRACT(ProductDetails, '$.Accessories[0]')) AS FirstAccessory
FROM Products;

-- Create virtual column and index it
ALTER TABLE Products ADD COLUMN Brand VARCHAR(255) GENERATED ALWAYS AS (ProductDetails->>'$.Brand') STORED;

CREATE INDEX idx_brand ON Products (Brand);

SELECT * FROM Products;

SELECT ProductDetails->>'$.Specifications' 
FROM Products;

SELECT ProductDetails->>'$.Accessories' 
FROM Products;