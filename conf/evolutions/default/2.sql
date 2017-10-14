# --- !Ups

INSERT INTO admin (admin_id,alias,password,token) values ('1','admin','eatalot!','');

INSERT INTO address (address_id, unit_number, street_name, community_name, is_community) VALUES ('3','29',  'Verdun Road',    'Robinvale', TRUE );
INSERT INTO address (address_id, unit_number, street_name, community_name, is_community) VALUES ('6','5',   'Verdun Road',    'The Orchard', TRUE );
INSERT INTO address (address_id, unit_number, street_name, community_name, is_community) VALUES ('7','3',   'University Road','', TRUE );
INSERT INTO address (address_id, unit_number, street_name, community_name, is_community) VALUES ('8','105', 'Summer Road',    '', TRUE );
INSERT INTO address (address_id, unit_number, street_name, community_name, is_community) VALUES ('9','303', 'Main Road',      '', TRUE );

INSERT INTO order_schedule (order_sched_id, title, is_active) VALUES ('1', 'Standard Schedule', TRUE );
INSERT INTO order_schedule (order_sched_id, title, is_active) VALUES ('2', 'My food', FALSE );
INSERT INTO order_schedule (order_sched_id, title, is_active) VALUES ('3', 'All Orders', TRUE );
INSERT INTO order_schedule (order_sched_id, title, is_active) VALUES ('4', 'My order schedule', FALSE );
INSERT INTO order_schedule (order_sched_id, title, is_active) VALUES ('5', 'Normal', FALSE );

INSERT INTO customer (user_id, name, surname, password, email, cell_number, token, is_student, email_verified, is_complete, balance, address_address_id, order_schedule_order_sched_id) VALUES ('1',  'Charles',    'Dyason',     '12345678', 'k4gcybex@gmail.com',           '0720398806', '.', FALSE, TRUE,   TRUE,   200.00,   '3', '1');
INSERT INTO customer (user_id, name, surname, password, email, cell_number, token, is_student, email_verified, is_complete, balance, address_address_id, order_schedule_order_sched_id) VALUES ('3',  'Dylan',      'Francis',    '12345678', 'dyalan.francis@nmmu.ac.za',    '0711234567', '.', TRUE,  FALSE,  FALSE,  1500.00,  '6', '2');
INSERT INTO customer (user_id, name, surname, password, email, cell_number, token, is_student, email_verified, is_complete, balance, address_address_id, order_schedule_order_sched_id) VALUES ('8',  'Aavishkar',  'Bhagwandin', '12345678', 'aviskhar.b@gmail.com',         '0823457894', '.', FALSE, FALSE,  TRUE ,  500.00,   '7', '3');
INSERT INTO customer (user_id, name, surname, password, email, cell_number, token, is_student, email_verified, is_complete, balance, address_address_id, order_schedule_order_sched_id) VALUES ('10', 'John',       'Doe',        '12345678', 'john.doe@nmmu.ac.za',          '',           '.', TRUE,  TRUE,   FALSE,  80.00,    '9', '4');
INSERT INTO customer (user_id, name, surname, password, email, cell_number, token, is_student, email_verified, is_complete, balance, address_address_id, order_schedule_order_sched_id) VALUES ('11', 'Adam',       'Smith',      '12345678', 'adam.smaith@live.nmmu.ac.za',  '',           '.', TRUE,  FALSE,  FALSE,  0.00,     '8', '5');

# --- !Downs

DELETE FROM admin;
DELETE FROM address;
DELETE FROM order_schedule;
DELETE FROM customer;
