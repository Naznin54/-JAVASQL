use naznin;
CREATE TABLE transactions (
    city VARCHAR(255),
	pricewithmaterial INT,
	pricewithoutmaterial INT
);

INSERT INTO transactions (city,pricewithmaterial,pricewithoutmaterial)
VALUES ("Tvm",1200,1000),("Kochi",1000,900),("Chennai",1300,1100),("Hyderabad",1500,1200);

SELECT SUM() AS total_amount
FROM transactions
WHERE city = "Chennai";





