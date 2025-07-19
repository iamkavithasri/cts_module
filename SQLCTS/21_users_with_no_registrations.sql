SELECT * 
FROM users u
WHERE NOT EXISTS (
    SELECT 1 
    FROM registrations r 
    WHERE r.user_id = u.user_id
);
