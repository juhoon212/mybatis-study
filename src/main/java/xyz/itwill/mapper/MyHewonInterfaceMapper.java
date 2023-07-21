package xyz.itwill.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import xyz.itwill.dto.MyHewon;

// mybatis 프레임워크는 인터페이스만 사용하여 매퍼등록 가능
public interface MyHewonInterfaceMapper {
	
	// => 자동 매핑 기능을 사용하여 검색행을 객체로 생성하기 위해 검색행의 컬럼명과 객체를
	// 생성할 클래스의 필드명을 동일하게 작성해야함
	@Results(value = {
			@Result(column = "hewon_id", property = "id"),
			@Result(column = "hewon_name", property = "name"),
			@Result(column = "hewon_phone", property = "phone"),
			@Result(column = "hewon_email", property = "email"),
			@Result(column = "hewon_status", property = "status"),
			
	})
	@Select(value = "select * from myhewon order by hewon_id")
	List<MyHewon> selectHewonList();
	
	@Results(value = {
			@Result(column = "hewon_id", property = "id")	
			, @Result(column = "hewon_name", property = "name")	
			, @Result(column = "hewon_phone", property = "phone")	
			, @Result(column = "hewon_email", property = "email")	
			, @Result(column = "hewon_status", property = "status")	
		})
	@Select(value = "select * from myhewon where hewon_name = #{name} order by hewon_id")
	List<MyHewon> selectNameHewonList(String name);
}
