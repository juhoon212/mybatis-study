package xyz.itwill.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import xyz.itwill.dto.MyHewon;

public interface MyHewonMapper {
	
	int insertHewon(MyHewon hewon);
	
	List<MyHewon> selectHewonList();
	
	List<MyHewon> selectDiscriminatorHewonList();
	
	List<MyHewon> selectStatusHewonList();
	
	String selectBeanHewonId(MyHewon hewon);
	
	String selectMapHewonId(Map<String, Object> map);
	
	String selectParamHewonId(@Param(value = "#{id}") String name , @Param(value = "#{email}") String email);
}