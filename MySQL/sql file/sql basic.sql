-- drop database if EXISTS sqldb; -- 만약 sqldb가 존재하면 우선 삭제
-- CREATE DATABASE sqldb;

-- use sqldb;
-- drop DATABASE if EXISTS usertbl;
-- CREATE TABLE usertbl -- 회원 테이블
-- (
-- userID char(8) not null PRIMARY key, -- 사용자 아이디(PK)
-- name varchar(10) not null, -- 이름
-- birthYear int not null, -- 출생년도
-- addr char(2) not null, -- 지역경기, 서울, 경남 식으로 2글자만 입력
-- mobile1 char(3), -- 휴대폰의 국번
-- mobile2 char(8), -- 휴대폰의 나머지 전하번호
-- height SMALLINT, -- 키
-- mDate date -- 회원 가입일
-- );
-- CREATE TABLE buytbl -- 회원 구매 테이블
-- (
-- num int AUTO_INCREMENT not null PRIMARY KEY, -- 순번(PK)
-- userID char(8) not null, -- 아이디(FK)
-- prodName char(6) not null, -- 물품명
-- groupName char(4), -- 분류
-- price int not null, -- 단가
-- amount smallint not null, -- 수량
-- Foreign key (userID) references usertbl(userID)
-- );

-- SELECT * from buytbl;

-- INSERT INTO usertbl VALUES('LSG', '이승기', 1987, '서울', '011', '1111111', 182, '2008-8-8');
-- INSERT INTO usertbl VALUES('KBS', '김범수', 1979, '경남', '011', '2222222', 173, '2012-4-4');
-- INSERT INTO usertbl VALUES('KKH', '김경호', 1971, '전남', '019', '3333333', 177, '2007-7-7');
-- INSERT INTO usertbl VALUES('JYP', '조용필', 1950, '경기', '011', '4444444', 166, '2009-4-4');
-- INSERT INTO usertbl VALUES('SSK', '성시경', 1979, '서울', NULL  , NULL      , 186, '2013-12-12');
-- INSERT INTO usertbl VALUES('LJB', '임재범', 1963, '서울', '016', '6666666', 182, '2009-9-9');
-- INSERT INTO usertbl VALUES('YJS', '윤종신', 1969, '경남', NULL  , NULL      , 170, '2005-5-5');
-- INSERT INTO usertbl VALUES('EJW', '은지원', 1972, '경북', '011', '8888888', 174, '2014-3-3');
-- INSERT INTO usertbl VALUES('JKW', '조관우', 1965, '경기', '018', '9999999', 172, '2010-10-10');
-- INSERT INTO usertbl VALUES('BBK', '바비킴', 1973, '서울', '010', '0000000', 176, '2013-5-5');
-- INSERT INTO buytbl VALUES(NULL, 'KBS', '운동화', NULL   , 30,   2);
-- INSERT INTO buytbl VALUES(NULL, 'KBS', '노트북', '전자', 1000, 1);
-- INSERT INTO buytbl VALUES(NULL, 'JYP', '모니터', '전자', 200,  1);
-- INSERT INTO buytbl VALUES(NULL, 'BBK', '모니터', '전자', 200,  5);
-- INSERT INTO buytbl VALUES(NULL, 'KBS', '청바지', '의류', 50,   3);
-- INSERT INTO buytbl VALUES(NULL, 'BBK', '메모리', '전자', 80,  10);
-- INSERT INTO buytbl VALUES(NULL, 'SSK', '책'    , '서적', 15,   5);
-- INSERT INTO buytbl VALUES(NULL, 'EJW', '책'    , '서적', 15,   2);
-- INSERT INTO buytbl VALUES(NULL, 'EJW', '청바지', '의류', 50,   1);
-- INSERT INTO buytbl VALUES(NULL, 'BBK', '운동화', NULL   , 30,   2);
-- INSERT INTO buytbl VALUES(NULL, 'EJW', '책'    , '서적', 15,   1);
-- INSERT INTO buytbl VALUES(NULL, 'BBK', '운동화', NULL   , 30,   2);

-- SELECT * from buytbl;
-- SELECT * from usertbl;

-- use sqldb;
-- SELECT * from usertbl;

-- SELECT * from usertbl where name = '김경호';
-- SELECT userID, name from usertbl where birthYear >= 1970 and height >= 182;
-- SELECT userID, name from usertbl where birthYear >= 1970 or height >= 182;

-- SELECT name, height from usertbl where height >= 180 and height <= 183;
-- SELECT name, height from usertbl where height BETWEEN 180 and 183;

-- SELECT name, addr FROM usertbl where addr = '경남' or addr = '전남' or addr = '경북';
-- SELECT name, addr FROM usertbl where addr in ('경남', '전남', '경북');


