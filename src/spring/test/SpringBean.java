package spring.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringBean {

	@Autowired
	UserMapper mapper;

	public void show() {

		List<Map<String, String>> retMap = mapper.getUserMap();
		for (Map<String, String> map : retMap) {
			//System.out.print(map.get("user_id"));
			System.out.print(map.get("user_name"));
		}
	}
}
