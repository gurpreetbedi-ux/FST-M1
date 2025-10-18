-- Add the 'grade' column to the 'salesman' table
ALTER TABLE salesman
ADD  grade INT;

-- Set the 'grade' value to 100 for all rows
UPDATE salesman
SET grade = 100;

-- Display all columns from the 'salesman' table, including the new 'grade' column
SELECT *
FROM salesman;