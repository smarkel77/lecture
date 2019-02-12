-- ORDERING RESULTS

-- Populations of all countries in descending order
SELECT name, population FROM country
ORDER BY population DESC, name DESC
;



--Names of countries and continents in ascending order

SELECT name, continent
FROM country
ORDER BY continent ASC, name ASC
;


-- LIMITING RESULTS
-- The name and average life expectancy of the countries with the 10 highest life expectancies.

SELECT name, lifeexpectancy
FROM country
WHERE lifeexpectancy IS NOT NULL
ORDER BY lifeexpectancy DESC
LIMIT 10
;



-- CONCATENATING OUTPUTS

-- The name & state of all cities in California, Oregon, or Washington.
-- "city, state", sorted by state then city


SELECT name || ', ' || district AS name_and_state
FROM city
WHERE district IN ('California', 'Oregon', 'Washington')
ORDER BY district, name
;


-- AGGREGATE FUNCTIONS
-- Average Life Expectancy in the World
SELECT AVG(lifeexpectancy) AS when_youre_gonna_die FROM country;

-- Total population in Ohio
SELECT SUM(population) AS morons FROM city WHERE district = 'Ohio';


-- The surface area of the smallest country in the world
SELECT MIN(surfacearea) AS smallest_country_in_the_world FROM country;
SELECT MAX(surfacearea) AS largest_country_in_the_world FROM country;


-- The 10 largest countries in the world
SELECT * FROM country ORDER BY surfacearea DESC LIMIT 10;






-- The number of countries who declared independence in 1991
SELECT COUNT(*) FROM country
WHERE indepyear = 1991
;




-- GROUP BY EXERCISES
-- Count the number of countries where each language is spoken, order show them from most countries to least
SELECT language, COUNT(*) AS number_of_countries 
FROM countrylanguage
GROUP BY language
ORDER BY number_of_countries DESC
;


-- Average life expectancy of each continent ordered from highest to lowest
SELECT continent, AVG(lifeexpectancy)
FROM country
WHERE lifeexpectancy IS NOT NULL
GROUP BY continent
ORDER BY avg DESC
;


-- Exclude Antarctica from consideration for average life expectancy
SELECT continent, AVG(lifeexpectancy)
FROM country
WHERE continent <> 'Antarctica'
GROUP BY continent
ORDER BY avg DESC
;
-- Sum of the population of cities in each state in the USA ordered by state name

SELECT district, SUM(population) AS state_population
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY state_population
;


-- The average population of cities in each state in the USA ordered by state name
SELECT district, AVG(population) AS state_avg_population
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district
;




-- SUBQUERIES
-- Find the names of cities under a given government leader


SELECT name, district
FROM city
WHERE countrycode IN 
(
  SELECT code 
  FROM country
  WHERE headofstate = 'Elisabeth II'
)
;


-- Find the names of cities whose country they belong to has not declared independence yet

SELECT name, district
FROM city
WHERE countrycode IN
(
  SELECT DISTINCT code
  FROM country
  WHERE indepyear IS NULL
)
ORDER BY district
;

-- Additional samples
-- You may alias column and table names to provide more descriptive names
--SELECT name AS CityName FROM city AS cities;

-- Alias can also be used to create shorthand references, such c for city and co for country.
--SELECT c.name, co.name FROM city AS c, country AS co;

-- Ordering allows columns to be displayed in ascending order, or descending order (Look at Arlington)
--SELECT name, population FROM city WHERE countryCode='USA' ORDER BY name ASC, population DESC;

-- Limiting results allows rows to be returned in 'limited' clusters where LIMIT says how many, and an optional OFFSET specifies number of rows to skip
--SELECT name, population FROM city LIMIT 10 OFFSET 10;

-- Postgres has a number of string functions like SUBSTR. It also supports string concatenation, so we can build completed sentences if desired
--SELECT (name || ' is in the state of ' || district) AS city_state FROM city WHERE countryCode='USA';

-- Aggregate functions provide the ability to COUNT, SUM, AVG, and determine MIN and MAX. Only returns a single row of value(s).

-- GROUP BY clusters rows by a column value
