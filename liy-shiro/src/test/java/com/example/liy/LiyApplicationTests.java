package com.example.liy;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LiyApplicationTests {

	@Test
	public void contextLoads() {


		int[] s = {1,2,3,4,5};
		System.out.print(JSON.toJSONString(s));


	}

}
