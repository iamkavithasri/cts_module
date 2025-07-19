SELECT event_id, COUNT(*) AS registration_count
FROM registrations
GROUP BY event_id
ORDER BY registration_count DESC
LIMIT 5;
