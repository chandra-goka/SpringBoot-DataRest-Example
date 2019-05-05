package com.onlinetutorialspoint;

import com.onlinetutorialspoint.repo.ItemRepository;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDataRestExampleApplicationTests {

	@Autowired
	ItemRepository itemRepository;
	@Test
	public void contextLoads() {
	}

	@Test
	public void findByCategoryTest(){
		Assert.assertThat(itemRepository.findByCategory("Books"), CoreMatchers.not(Matchers.emptyIterable()));
	}
	@Test
	public void findAllTest(){
		Assert.assertThat(itemRepository.findAll(), CoreMatchers.not(Matchers.emptyIterable()));
	}
}
