Create database car;
use car;
INSERT INTO CARS
VALUES('V002','SUV','UPO',2);

SELECT CAR_ID,CAR_NAME,CAR_TYPE FROM CARS
WHERE CAR_ID NOT IN(SELECT CAR_ID FROM RENTALS)
ORDER BY CAR_ID;

SELECT CAR_ID,CAR_NAME,OWNER_ID FROM CARS
WHERE CAR_NAME='POLO' OR CAR_NAME='BMW';

ALTER TABLE CARS 
ADD CAR_REGNO VARCHAR(20);
SELECT *FROM CARS;

SELECT CAR_ID,CAR_NAME,CAR_TYPE FROM CARS
RECORDS.CAR_NAME='SUV'.CAR_TYPE='UPO'.Data;

SELECT DISTINCT(OWNER_ID),OWNER_NAME,ADDRESS,PHONE_NO FROM OWNERS
WHERE OWNER_ID IN(SELECT CAR_NAME='MARUTI' FROM CARS);


SELECT DISTINCT(o.owner_id), o.owner_name, o.address, o.phone_no FROM owners o 
JOIN cars c ON o.owner_id = c.owner_id
WHERE c.car_name LIKE 'Maruthi%'
GROUP BY o.owner_id;


SELECT car_id,count(car_id) AS no_of_trips FROM RENTALS
GROUP BY CAR_ID
ORDER BY CAR_ID ASC;

select *from rentals;

INSERT INTO RENTALS(rental_id,customer_id,car_id,pickup_date,return_date,km_driven,fare_amount)
VALUES('R008','C004','V005','2022-05-08','2022-06-09',210,11000),
	  ('R009','C005','V006','2022-04-11','2022-04-11',278,665.14);



   