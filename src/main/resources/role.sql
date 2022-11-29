INSERT INTO "USER_ROLE" (role_id, role_name, description)
VALUES ('7832c0fe-d0f0-425a-8d36-d32693c57aff','BUYER','The buyer will be our main customer and will only have permissions to perform actions related to the purchase.');

INSERT INTO user_permission (permission_id, uri, permission_key, permission_method)
VALUES ('ccc7ff73-1989-413a-ab52-9bec7a049e33', '/users', 'create.user', 'POST');

INSERT INTO role_permission (role_id, permission_id)
VALUES ('7832c0fe-d0f0-425a-8d36-d32693c57aff', 'ccc7ff73-1989-413a-ab52-9bec7a049e33');
