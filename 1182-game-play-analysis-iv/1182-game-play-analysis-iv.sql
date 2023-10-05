# Write your MySQL query statement below
SELECT COALESCE(ROUND(
         COUNT(DISTINCT a.player_id) / total_players, 2
       ), 0) AS fraction
FROM (
       SELECT player_id, MIN(event_date) AS first_login
       FROM Activity
       GROUP BY player_id
     ) AS first_logins
JOIN Activity AS a
ON a.player_id = first_logins.player_id
AND DATE_SUB(a.event_date, INTERVAL 1 DAY) = first_logins.first_login
CROSS JOIN (
             SELECT COUNT(DISTINCT player_id) AS total_players
             FROM Activity
           ) AS total