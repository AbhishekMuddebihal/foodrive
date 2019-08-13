INSERT INTO attendance VALUES(34,0,NOW(),1);

UPDATE attendance SET attendance_flag=1 WHERE member_id=34;

DELETE FROM attendance WHERE member_id=34;