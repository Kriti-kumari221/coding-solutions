# NUHWQN01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are helping manage the data for a local farmer's market. You have a table `Produce_Sales` that tracks all the items being sold.
Your task is to write the SQL queries to solve the following challenges:

- Generate a list of all unique categories available.
- Find the names and prices of items sold by 'Maya' that cost more than ₹50 per kg.
- Retrieve all the details of items for sale, ordered by price from highest to lowest.

 **`Produce_Sales` table:** 

item_name	category	price_per_kg	seller_name
Apple	Fruit	120	Ravi
Spinach	Leafy Green	40	Maya
Carrot	Root Vegetable	30	Ravi
Mango	Fruit	80	Maya
Potato	Root Vegetable	25	Sunil
Broccoli	Vegetable	90	Maya
### Expected Output

```
┌────────────────┐
│    category    │
├────────────────┤
│ Fruit          │
│ Leafy Green    │
│ Root Vegetable │
│ Vegetable      │
└────────────────┘
┌───────────┬──────────────┐
│ item_name │ price_per_kg │
├───────────┼──────────────┤
│ Mango     │ 80           │
│ Broccoli  │ 90           │
└───────────┴──────────────┘
┌───────────┬────────────────┬──────────────┬─────────────┐
│ item_name │    category    │ price_per_kg │ seller_name │
├───────────┼────────────────┼──────────────┼─────────────┤
│ Apple     │ Fruit          │ 120          │ Ravi        │
│ Broccoli  │ Vegetable      │ 90           │ Maya        │
│ Mango     │ Fruit          │ 80           │ Maya        │
│ Spinach   │ Leafy Green    │ 40           │ Maya        │
│ Carrot    │ Root Vegetable │ 30           │ Ravi        │
│ Potato    │ Root Vegetable │ 25           │ Sunil       │
└───────────┴────────────────┴──────────────┴─────────────┘

```

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T05:02:55.595Z  

```sql
-- Type each SQL query on a new line.
-- Your code here..
select distinct category from produce_Sales ;
select item_name, price_per_kg from produce_Sales where seller_name="Maya" and price_per_kg>50 ;
select * from produce_Sales order by price_per_kg desc;
```

---

[View on CodeChef](https://www.codechef.com/problems/NUHWQN01)