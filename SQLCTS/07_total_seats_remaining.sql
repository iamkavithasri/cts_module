SELECT e.event_id, e.name, (e.total_seats - COUNT(r.user_id)) AS seats_remaining
FROM events e
LEFT JOIN registrations r ON e.event_id = r.event_id
GROUP BY e.event_id;
