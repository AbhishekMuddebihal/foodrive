SELECT m.member_id,m.fname,m.lname,m.gender 
FROM attendance a
JOIN member m 
ON a.member_id=m.member_id
WHERE a.drive_id=8
AND CONCAT_WS(',',m.fname,m.lname,m.gender,a.member_id) LIKE '%Akash%'
AND a.attendance_flag<>3;