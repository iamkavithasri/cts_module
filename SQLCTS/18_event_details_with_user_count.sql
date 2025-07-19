SELECT e.name, e.category, COUNT(r.user_id) AS total_users
FROM events e
LEFT JOIN registrations r ON e.event_id = r.event_id
GROUP BY e.event_id;
