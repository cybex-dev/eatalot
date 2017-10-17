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

INSERT INTO staff (user_id, name, surname, password, email, cell_number, token, is_kitchen_staff, alias) VALUES ('2', 'Sousy',  'Helper',   '123456789', 'sousy@eatalot.com',     '0123456789', '.', TRUE ,   'sousy');
INSERT INTO staff (user_id, name, surname, password, email, cell_number, token, is_kitchen_staff, alias) VALUES ('1', 'Johnny', 'Chef',     '123456789', 'headchef@eatalot.com',  '0123456789', '.', TRUE ,   'main man');
INSERT INTO staff (user_id, name, surname, password, email, cell_number, token, is_kitchen_staff, alias) VALUES ('6', 'Bear',   'Grills',   '123456789', 'bgrils@eatalot.com',    '0123456789', '.', TRUE ,   'griller');
INSERT INTO staff (user_id, name, surname, password, email, cell_number, token, is_kitchen_staff, alias) VALUES ('23', 'Gary',   'Waiter',  '123456789', 'garyw@eatalot.com',     '0123456789', '.', FALSE ,  'mrdeliver');
INSERT INTO staff (user_id, name, surname, password, email, cell_number, token, is_kitchen_staff, alias) VALUES ('4', 'Harry',  'Houdini',  '123456789', 'hh@eatalot.com',        '0123456789', '.', FALSE ,  'x');

INSERT INTO queue_type (type_id, type, description) VALUES ('1', 'Cancelled', 'The order was cancelled');
INSERT INTO queue_type (type_id, type, description) VALUES ('2', 'Unsubmitted', 'The order has been saved, but not placed');
INSERT INTO queue_type (type_id, type, description) VALUES ('3', 'Pending', 'The order is in awaiting preparation');
INSERT INTO queue_type (type_id, type, description) VALUES ('4', 'Preparing', 'The order is being prepared');
INSERT INTO queue_type (type_id, type, description) VALUES ('5', 'Ready', 'The order is ready for delivery');
INSERT INTO queue_type (type_id, type, description) VALUES ('6', 'Delivering', 'The order is being delivered');
INSERT INTO queue_type (type_id, type, description) VALUES ('7', 'Delivered', 'The order has been delivered');
INSERT INTO queue_type (type_id, type, description) VALUES ('8', 'Not Delivered', 'The order has cannot be delivered');

INSERT INTO voucher (voucher_id, voucher_code, value) VALUES ('1', 'welcome', 1000);
INSERT INTO voucher (voucher_id, voucher_code, value) VALUES ('2', 'winner', 500);
INSERT INTO voucher (voucher_id, voucher_code, value) VALUES ('3', 'free meal', 100);
INSERT INTO voucher (voucher_id, voucher_code, value) VALUES ('4', 'a free lunch', 80);
INSERT INTO voucher (voucher_id, voucher_code, value) VALUES ('5', 'teaser', 50);

# --- !Downs

DELETE FROM admin;
DELETE FROM address;
DELETE FROM order_schedule;
DELETE FROM customer;
DELETE FROM staff;
DELETE FROM queue_type;
