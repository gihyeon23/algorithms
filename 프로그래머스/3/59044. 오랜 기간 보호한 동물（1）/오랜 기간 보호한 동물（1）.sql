-- 코드를 입력하세요
-- 코드를 입력하세요
SELECT name, datetime
    from animal_ins a
    where not exists (select 1 from animal_outs b where a.animal_id = b.animal_id)
    order by a.datetime
    fetch first 3 rows only;