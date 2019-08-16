package spring.test;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {

	@Select("SELECT user_name FROM t_user")
	List<Map<String, String>> getUserMap();
}
