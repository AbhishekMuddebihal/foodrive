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