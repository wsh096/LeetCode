# Write your MySQL query statement below
SELECT teacher_id, COUNT(DISTINCT subject_id) AS CNT 
FROM teacher 
GROUP BY teacher_id;