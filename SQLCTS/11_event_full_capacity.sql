SELECT e.event_id, e.name
FROM events e
JOIN (
    SELECT event_id, COUNT(*) AS registered
    FROM registrations
    GROUP BY event_id
) r ON e.event_id = r.event_id
WHERE r.registered >= e.total_seats;
