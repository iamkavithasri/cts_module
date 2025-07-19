SELECT u.name, e.name AS event_name, rv.rating, rv.comment
FROM reviews rv
JOIN users u ON rv.user_id = u.user_id
JOIN events e ON rv.event_id = e.event_id;
