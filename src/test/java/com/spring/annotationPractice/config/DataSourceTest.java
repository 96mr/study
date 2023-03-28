package com.spring.annotationPractice.config;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
public class DataSourceTest {
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void test() {
		try(Connection con = dataSource.getConnection()){
			System.out.println(con.getSchema());
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}

}
