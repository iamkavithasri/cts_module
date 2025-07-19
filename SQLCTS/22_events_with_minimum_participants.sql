SELECT e.name, COUNT(r.user_id) AS participants
FROM events e
LEFT JOIN registrations r ON e.event_id = r.event_id
GROUP BY e.event_id
HAVING participants < 5;
