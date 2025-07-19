SELECT location, COUNT(r.user_id) AS registrations
FROM events e
JOIN registrations r ON e.event_id = r.event_id
GROUP BY location;
