-- Type each SQL query on a new line.
-- Your code here..
select distinct category from produce_Sales ;
select item_name, price_per_kg from produce_Sales where seller_name="Maya" and price_per_kg>50 ;
select * from produce_Sales order by price_per_kg desc;