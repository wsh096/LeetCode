# Write your MySQL query statement below
SELECT query_name, 
ROUND(AVG(CAST(rating AS decimal) / position), 2) AS quality, 
ROUND(SUM(CASE WHEN rating < 3 then 1 else 0 end) * 100 / count(*), 2) AS poor_query_percentage
FROM queries
GROUP BY query_name;