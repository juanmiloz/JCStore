--Defined basic user roles
INSERT INTO "USER_ROLE" (role_id, role_name, description)
VALUES ('7832c0fe-d0f0-425a-8d36-d32693c57aff','BUYER','The buyer will be our main customer and will only have permissions to perform actions related to the purchase.');

INSERT INTO "USER_ROLE" (role_id, role_name, description)
VALUES ('cbe5ea52-0edb-4d2e-a883-1488f1520b20','ADMIN','The admin will be able to manage the stores orders, items and users');

--Possible permissions
INSERT INTO user_permission (permission_id, uri, permission_key, permission_method)
VALUES ('ccc7ff73-1989-413a-ab52-9bec7a049e33', '/users', 'create.user', 'POST');

--Permission's of an specific role
INSERT INTO role_permission (role_id, permission_id)
VALUES ('7832c0fe-d0f0-425a-8d36-d32693c57aff', 'ccc7ff73-1989-413a-ab52-9bec7a049e33');

INSERT INTO role_permission (role_id, permission_id)
VALUES ('cbe5ea52-0edb-4d2e-a883-1488f1520b20', 'ccc7ff73-1989-413a-ab52-9bec7a049e33');

--Base admin user
INSERT INTO users (id, name, email, password, address, phone, role_id)
VALUES ('69a91b05-4621-4a79-9c94-372fa108d132', 'admin', 'admin@gmail.com', 'Admin#1', 'Home', '+57123456789', 'cbe5ea52-0edb-4d2e-a883-1488f1520b20');

--Initial client user
INSERT INTO users (id, name, email, password, address, phone, role_id)
VALUES ('f8c3de3d-1fea-4d7c-a8b0-29f63c4c3454', 'client', 'client@gmail.com', 'Client#1', 'House', '+57123456789', '7832c0fe-d0f0-425a-8d36-d32693c57aff');