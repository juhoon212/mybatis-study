package xyz.itwill.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import xyz.itwill.dto.MyMember;

// mybatis 프레임워크에서는 인터페이스를 이용하여 매퍼 파일을 작성
// => 추상 메소드의 mybatis 어노테이션(Annotation)을 사용하여 SQL 명령 등록
public interface MyMemberInterfaceMapper {
	// @Insert : 추상메소드에 insert명령을 등록하기 위한 어노테이션
	// value 속성 : 추상메소드에 등록될 SQL명령을 속성값으로 설정
	// => value 속성외에 다른 속성이 없는 경우 속성값만 설정 가능
	
	@Insert(value = "insert into mymember values (#{id}, #{name}, #{phone}, #{email})")
	int insertMember(MyMember member);
	
	// @Update : 추상메소드에 UPDATE 명령을 등록하기 위한 어노테이션
	@Update("update mymember set name = #{name}, phone= #{phone}, email = #{email} where id = #{id}")
	int updateMember(MyMember member);
	
	
	@Delete("delete from mymember where id=#{id}")
	int deleteMember(String id);
	
	@Select("select * from mymember where id = #{id}")
	MyMember selectMember(String id);
	
	@Select("select * from member")
	List<MyMember> selectAllMember();
	
}
