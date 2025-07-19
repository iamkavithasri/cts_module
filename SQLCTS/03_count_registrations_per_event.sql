SELECT event_id, COUNT(*) AS total_registrations
FROM registrations
GROUP BY event_id;
