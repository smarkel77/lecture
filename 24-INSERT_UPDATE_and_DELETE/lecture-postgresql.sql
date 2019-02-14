-- INSERT

-- 1. Add Klingon as a spoken language in the USA
SELECT * FROM countrylanguage;
INSERT INTO countrylanguage
VALUES ('USA', 'Klingon', false, 0.01);

-- 2. Add Klingon as a spoken language in Great Britain
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
VALUES ('GBR', 'Klingon', false, 0.02);



-- UPDATE

-- 1. Update the capital of the USA to Pittsburgh
SELECT * FROM country WHERE code = 'USA';
SELECT * FROM city WHERE id = 3813;
SELECT * FROM city WHERE name = 'Pittsburgh';

UPDATE country
SET capital = 3844
WHERE code = 'USA';

-- 2. Update the capital of the USA to Washington DC and the head of state
UPDATE country
SET capital = 3813, headofstate = 'Very Stable Genius'
WHERE code = 'USA';



-- DELETE

-- 1. Delete English as a spoken language in the USA
SELECT * FROM countrylanguage;
DELETE FROM countrylanguage
WHERE language = 'English' AND countrycode = 'USA'
;

-- 2. Delete all occurrences of the Klingon language 
DELETE FROM countrylanguage
WHERE language = 'Klingon'
;


-- REFERENTIAL INTEGRITY

-- 1. Try just adding Elvish to the country language table.
INSERT INTO countrylanguage (language)
VALUES ('Elvish');


-- 2. Try inserting English as a spoken language in the country ZZZ. What happens?
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
VALUES ('ZZZ', 'English', true, 99.9);


-- 3. Try deleting the country USA. What happens?
DELETE FROM country WHERE code = 'USA';



-- CONSTRAINTS

-- 1. Try inserting English as a spoken language in the USA
INSERT INTO countrylanguage 
VALUES ('USA', 'Murican', true, 100);


-- 2. Try again. What happens?
INSERT INTO countrylanguage 
VALUES ('USA', 'Murican', true, 100);

-- 3. Let's relocate the USA to the continent - 'Outer Space'
SELECT * FROM country WHERE code = 'USA';
UPDATE country SET continent = 'Outer Space!' WHERE code = 'USA';


-- How to view all of the constraints

SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS;
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE;
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS;


-- TRANSACTIONS

-- 1. Try deleting all of the rows from the country language table and roll it back.
INSERT INTO countrylanguage
VALUES ('USA', 'Tomish', false, 100);

COMMIT;
ROLLBACK;


SELECT * FROM countrylanguage;

DELETE FROM countrylanguage;

-- 2. Try updating all of the cities to be in the USA and roll it back
UPDATE city SET countrycode = 'USA';
SELECT * FROM city;

DELETE FROM city WHERE district = 'Ohio';

-- 3. Demonstrate two different SQL connections trying to access the same table where one happens to be inside of a transaction but hasn't committed yet.

---- DBViz is one connection, terminal is another connection 
---- Transactions are on a PER-CONNECTION basis, so it isn't until after a COMMIT happens that all users can see the impact
