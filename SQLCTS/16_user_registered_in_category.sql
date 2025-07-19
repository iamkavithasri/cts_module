SELECT u.name, e.category
FROM users u
JOIN registrations r ON u.user_id = r.user_id
JOIN events e ON r.event_id = e.event_id
WHERE e.category = 'Workshop';
