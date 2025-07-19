SELECT user_id
FROM registrations
GROUP BY user_id
HAVING COUNT(DISTINCT event_id) > 1;
