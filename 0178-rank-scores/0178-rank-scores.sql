# Write your MySQL query statement below
SELECT s.score,
    (SELECT COUNT(DISTINCT (ss.score)) + 1
    FROM Scores AS ss
    WHERE ss.score > s.score)
    AS 'rank'
FROM Scores AS s
ORDER BY s.score DESC