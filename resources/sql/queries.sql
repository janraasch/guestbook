-- name: save-message!
-- creates a new message
INSERT INTO guestbook
(name, message, timestamp)
VALUES (:name, :message, :timestamp)

-- name: get-messages
-- selects all available messages
SELECT * FROM guestbook
