
#----to get info about how many food is distributed by donor for particular drive
SELECT donor.donor_name, 
donor.address_line, 
collects_food_from.food_quantity,
drive.drive_id
FROM ((collects_food_from
INNER JOIN donor 
ON collects_food_from.donor_id=donor.donor_id)
INNER JOIN drive
ON collects_food_from.drive_id=drive.drive_id);


#----to get number of drives for which a particular donar is participated
SELECT donor.donor_id,
COUNT(drive.drive_id)
FROM donor
INNER JOIN drive 
ON donor.area_id=drive.area_id;


#----To get info about total food distributed by donor 
SELECT donor.donor_name,employeedonor
SUM(collects_food_from.food_quantity),
COUNT(drive.drive_id)
FROM ((collects_food_from
INNER JOIN donor 
ON collects_food_from.donor_id=donor.donor_id)
INNER JOIN drive 
ON collects_food_from.drive_id=drive.drive_id);



                        
##---All info about volunteer                       
SELECT member.member_id, 
member.fname, 
member.lname,
member.email,
member.phone,
member.alternate_phone,
member.dob,
member.gender,
member.points,
member.joindate,
volunteer.type,
area.area_id,
area.area_name,
area.city,
area.state,
area.country
FROM ((member
JOIN volunteer 
ON member.member_id=volunteer.member_id)
JOIN area
ON area.area_id=volunteer.area_id)
WHERE member.member_id=37;



#---TO Get all info about DRIVE
SELECT drive.drive_id,drive.monitor_id, 
drive.status, 
drive.max_volunteers,
drive.vol_select_method,
drive.start_time,
drive.end_time,
donor.address_line,
donor.city,
donor.state,
donor.country,
needy_circle.address_line,
needy_circle.landmark,
distribute_to.food_quantity,
area.area_id
FROM ((((drive
INNER JOIN donor 
ON drive.area_id=donor.area_id)
INNER JOIN needy_circle
ON drive.area_id=needy_circle.area_id)
INNER JOIN distribute_to
ON needy_circle.circle_id=distribute_to.circle_id)
INNER JOIN area
ON drive.area_id=area.area_id)
WHERE drive.drive_id=7
AND area.area_id=1;




########Stats for ADMIN##########3

#----list of  drives conducted 
SELECT drive_id,start_time,end_time from drive;

#----total number of drives conducted
SELECT count(drive_id) from drive;

#----drives conducted in particular chapter
SELECT d.drive_id,d.start_time,d.end_time,d.area_id,a.city,a.state,a.country,a.area_name
FROM drive AS d
NATURAL JOIN area AS a;

#----total number of drives in particular chapter
SELECT count(d.drive_id),d.area_id,a.city,a.state,a.country,a.area_name
FROM drive AS d
NATURAL JOIN area AS a;

#----drives conducted in particular chapter in particular Needy_Circle
SELECT needy_circle.circle_id,
needy_circle.address_line1, 
needy_circle.address_line2, 
needy_circle.area_id,
drive.drive_id,
drive.start_time,
drive.end_time,
area.area_name,
area.city,
area.state,
area.country
FROM ((needy_circle
INNER JOIN drive 
ON needy_circle.area_id=drive.area_id)
INNER JOIN area
ON needy_circle.area_id=area.area_id)
WHERE needy_circle.circle_id=3;


#----total number of drives conducted in particular chapter in particular Needy_Circle

SELECT needy_circle.circle_id,
needy_circle.address_line1, 
needy_circle.address_line2, 
needy_circle.area_id,
count(drive.drive_id),
area.area_name,
area.city,
area.state,
area.country
FROM ((needy_circle
INNER JOIN drive 
ON needy_circle.area_id=drive.area_id)
INNER JOIN area
ON needy_circle.area_id=area.area_id)
WHERE needy_circle.circle_id=3;
