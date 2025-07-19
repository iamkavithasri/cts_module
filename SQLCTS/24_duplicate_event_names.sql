SELECT name, COUNT(*) AS occurrences
FROM events
GROUP BY name
HAVING COUNT(*) > 1;
