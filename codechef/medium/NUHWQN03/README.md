# NUHWQN03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are helping the head librarian at the Rare Books Repository. They need a consolidated report based on the `Books` collection.
Given a `Books` table with column `book_id`, `title`, `author`, `published_year` and `genre` in your database.
Your task is to write SQL queries to retrieve the following information:

- A list of all unique genre values available in the repository.
- The top 5 most recently published books. The most recent book should appear first.
### Expected Output

```
┌─────────────┐
│    genre    │
├─────────────┤
│ Thriller    │
│ Non-fiction │
│ Fiction     │
│ Self-help   │
│ Classic     │
└─────────────┘
┌─────────┬───────────────────────────────────────┬───────────────────┬────────────────┬─────────────┐
│ book_id │                 title                 │      author       │ published_year │    genre    │
├─────────┼───────────────────────────────────────┼───────────────────┼────────────────┼─────────────┤
│ 1       │ The Silent Patient                    │ Alex Michaelides  │ 2019           │ Thriller    │
│ 4       │ Atomic Habits                         │ James Clear       │ 2018           │ Self-help   │
│ 2       │ Sapiens: A Brief History of Humankind │ Yuval Noah Harari │ 2011           │ Non-fiction │
│ 3       │ The Alchemist                         │ Paulo Coelho      │ 1988           │ Fiction     │
│ 5       │ To Kill a Mockingbird                 │ Harper Lee        │ 1960           │ Classic     │
└─────────┴───────────────────────────────────────┴───────────────────┴────────────────┴─────────────┘

```

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T05:11:16.947Z  

```sql
-- Type each SQL query on a new line.
-- Your code here..
select distinct genre from books;
select  * from books  order by published_year desc limit 5 ;
```

---

[View on CodeChef](https://www.codechef.com/problems/NUHWQN03)