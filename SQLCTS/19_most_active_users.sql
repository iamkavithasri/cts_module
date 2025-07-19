SELECT u.name, COUNT(r.event_id) AS total_events
FROM users u
JOIN registrations r ON u.user_id = r.user_id
GROUP BY u.user_id
ORDER BY total_events DESC
LIMIT 3;
