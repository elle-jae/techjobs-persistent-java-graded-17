--Part 1

--column: techjob_id INTEGER PRIMARY KEY AUTO_INCREMENT
--column: name VARCHAR(40)
--column: employer VARCHAR (50)
--column: skill VARCHAR (200)

--Part 2


SELECT name
FROM employer
WHERE location = "St. Louis City";

--Part 3
DROP TABLE job;

--Part 4
SELECT *
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;