package programmers;

class SummerT04 {
//	create table CART_PRODUCTS2 (
//			 ID int,
//			 CART_ID int,
//			 NAME varchar2(100),
//			 PRICE int
//			);
//	insert into CART_PRODUCTS2 values(1632, 83, 'Vegetable', 2480);
//	insert into CART_PRODUCTS2 values(1633, 83, 'Sausages', 3980);
//	insert into CART_PRODUCTS2 values(1634, 83, 'Vegetable', 2480);
//	insert into CART_PRODUCTS2 values(5510, 287, 'Vegetable', 2480);
//	insert into CART_PRODUCTS2 values(5513, 287, 'Sausages', 3980);
//	insert into CART_PRODUCTS2 values(5514, 287, 'Coffee', 24800);
	
//	SQL 피벗테이블
//	pivot : 행을 열로 변환하는 함수
//	select name_x, name_y, 장바구니 수
//	from CART_PRODUCTS2
//	pivot
	
//	select name as name_x,
//	name as name_y,
//	decode(name, 'Coffee', 'C', 'S') as 장바구니수
//	from CART_PRODUCTS2
//	order by name;
	
//	SQL 경우의 수
//	cube, roll up
//	select name as name_x,
//	name as name_y,
//	decode(name, 'Coffee', 'C', 'S') as 장바구니수
//	from CART_PRODUCTS2
//	group by grouping sets(name, name);
	
//	result
//	NAME_X  NAME Y  장바구니 수
//	Coffee  Sausages 1
//	Coffee Vegetable 1
//	Sausages Coffee 1
//	Sausages Vegetable 2
//	Vegetable Coffee 1
//	Vegetable Sausages 2
}
