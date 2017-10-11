# --- !Ups

INSERT INTO admin (admin_id,alias,password,token) values ('1','admin','eatalot!','');

# --- !Downs

delete from admin;