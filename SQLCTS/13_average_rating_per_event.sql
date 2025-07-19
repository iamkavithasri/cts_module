SELECT event_id, AVG(rating) AS avg_rating
FROM reviews
GROUP BY event_id;
