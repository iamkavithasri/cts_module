SELECT DISTINCT e.event_id, e.name
FROM events e
JOIN reviews r ON e.event_id = r.event_id;
