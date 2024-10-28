-- This file allows us to load static data into the test database before tests are run.

-- Passwords are in the format: Password<UserLetter>123. Unless specified otherwise.
-- Encrypted using https://www.javainuse.com/onlineBcrypt
-- INSERT INTO local_user (email, first_name, last_name, password, username)
--     VALUES ('UserA@junit.com', 'UserA-FirstName', 'UserA-LastName', 'MySecretPassword123', 'UserA')
--     , ('UserB@junit.com', 'UserB-FirstName', 'UserB-LastName', 'MySecretPassword123', 'UserB');