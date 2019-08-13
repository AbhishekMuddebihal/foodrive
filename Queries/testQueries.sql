
SELECT 
drive.status, 
drive.max_volunteers,
drive.vol_select_method,
drive.start_time,
donor.address_line,
donor.city,
donor.state,
donor.country
FROM drive 
INNER JOIN donor 
ON drive.area_id=donor.area_id
WHERE drive.drive_id=1; 




SELECT needy_circle.address_line,
needy_circle.landmark,
distribute_to.food_quantity,
drive.end_time
FROM ((needy_circle
INNER JOIN distribute_to
ON needy_circle.circle_id=distribute_to.circle_id)
INNER JOIN drive
ON drive.area_id=needy_circle.area_id)
WHERE drive.area_id=1;
