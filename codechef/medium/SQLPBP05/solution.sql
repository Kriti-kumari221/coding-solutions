-- your code goes here
select m.match_id, m.player_1, m.player_2, m.winner, m.match_date, p.score from Matches m join players p on m.winner=p.player_name order by m.match_date desc limit 5  