SELECT e.*
FROM events e
LEFT JOIN registrations r ON e.event_id = r.event_id
WHERE r.registration_id IS NULL;
