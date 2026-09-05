# NUHWQN04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

The "Urban Greening Initiative" maintains a digital register of all trees planted across the city. As a database assistant, you are given a `Trees` table.
Your task is to write the SQL queries to retrieve the following information:

- A list of all unique tree species in the register.
- All trees located in either ward '14' or ward '20'.
- The complete tree register, ordered from the oldest to the newest tree.

 **Table: `Trees`** 

tree_id	species	planted_date	ward	caretaker
101	Mango	2018-06-15	12	Ramesh
102	Neem	2020-03-22	14	NULL
103	Banyan	2015-08-30	20	Sunita
104	Indian Neem	2020-05-10	14	Geeta
### Expected Output

```
┌─────────────┐
│   species   │
├─────────────┤
│ Mango       │
│ Neem        │
│ Banyan      │
│ Indian Neem │
└─────────────┘
┌─────────┬─────────────┬──────────────┬──────┬───────────┐
│ tree_id │   species   │ planted_date │ ward │ caretaker │
├─────────┼─────────────┼──────────────┼──────┼───────────┤
│ 102     │ Neem        │ 2020-03-22   │ 14   │ NULL      │
│ 103     │ Banyan      │ 2015-08-30   │ 20   │ Sunita    │
│ 104     │ Indian Neem │ 2020-05-10   │ 14   │ Geeta     │
└─────────┴─────────────┴──────────────┴──────┴───────────┘
┌─────────┬─────────────┬──────────────┬──────┬───────────┐
│ tree_id │   species   │ planted_date │ ward │ caretaker │
├─────────┼─────────────┼──────────────┼──────┼───────────┤
│ 103     │ Banyan      │ 2015-08-30   │ 20   │ Sunita    │
│ 101     │ Mango       │ 2018-06-15   │ 12   │ Ramesh    │
│ 102     │ Neem        │ 2020-03-22   │ 14   │ NULL      │
│ 104     │ Indian Neem │ 2020-05-10   │ 14   │ Geeta     │
└─────────┴─────────────┴──────────────┴──────┴───────────┘

```

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T05:21:45.843Z  

```sql
-- Type each SQL query on a new line.
-- Your code here..
select distinct species from Trees;
select * from Trees where ward=14 or ward=20;
select * from trees order by planted_date asc;

```

---

[View on CodeChef](https://www.codechef.com/problems/NUHWQN04)