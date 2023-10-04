insert into membertbl values ('Figure', '연아', '경기도 군포시 당정동');

select * from membertbl;

update membertbl set memberAddress = '서울 강남구 역삼동' where membername = '연아';

delete from membertbl where membername = '연아';

create table deletedmembertbl(
memberID char(8),
memberName char(5),
memberAddress char(20),
deletedDate date -- 삭제한 날짜
);

DELIMITER //
create trigger trg_deletedmembertbl -- 트리거 이름
	after delete -- 삭제 후에 작동하게 지정
	on membertbl -- 트리거를 부착할 테이블
	for each row -- 각 행마다 적용시킴
begin
	-- old 테이블의 내용을 백업 테이블에 삽입
    insert into deletedmembertbl values (old.memberid, old.membername, old.memberaddress, curdate() );
end //
DELIMITER ;

delete from membertbl where memberName = '당탕이';

select * from deletedmembertbl;
