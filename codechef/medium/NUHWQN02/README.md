# NUHWQN02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

The city council maintains a digital archive of local events in a table named `City_Events` to help them better manage and to retrieve information about these events.
Your task is to write the SQL queries for the following challenges:

- Find all events happening in 'Delhi'.
- List all events where the event_name starts with 'Tech'.
- List all events, ordered by their date from the latest to the earliest.

 **Table: `City_Events`** 

event_name	location	event_date
Music Fest	Mumbai	2023-11-20
Tech Summit	Bangalore	2023-12-05
Art Exhibition	Bangalore	2023-11-15
Book Fair	Delhi	2024-01-10
### Expected Output

```
┌────────────┬──────────┬────────────┐
│ event_name │ location │ event_date │
├────────────┼──────────┼────────────┤
│ Book Fair  │ Delhi    │ 2024-01-10 │
└────────────┴──────────┴────────────┘
┌─────────────┬───────────┬────────────┐
│ event_name  │ location  │ event_date │
├─────────────┼───────────┼────────────┤
│ Tech Summit │ Bangalore │ 2023-12-05 │
└─────────────┴───────────┴────────────┘
┌────────────────┬───────────┬────────────┐
│   event_name   │ location  │ event_date │
├────────────────┼───────────┼────────────┤
│ Book Fair      │ Delhi     │ 2024-01-10 │
│ Tech Summit    │ Bangalore │ 2023-12-05 │
│ Music Fest     │ Mumbai    │ 2023-11-20 │
│ Art Exhibition │ Bangalore │ 2023-11-15 │
└────────────────┴───────────┴────────────┘

```

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T05:06:45.094Z  

```sql
-- Type each SQL query on a new line.
-- Your code here..
select * from City_events where location="Delhi";
select * from City_events where event_name like "Tech%";
select * from City_events order by event_date desc;


```

---

[View on CodeChef](https://www.codechef.com/problems/NUHWQN02)