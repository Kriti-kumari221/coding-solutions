-- your code goes here
select distinct p.player_name, p.score from players p join matches m on p.player_name=m.winner order by p.score desc