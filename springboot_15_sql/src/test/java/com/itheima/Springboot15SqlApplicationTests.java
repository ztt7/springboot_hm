package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Springboot15SqlApplicationTests {
	@Autowired
	private BookDao bookDao;

	@Test
	void test(){
		bookDao.selectById(1);
	}

	//形式一
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//	@Test
//	void testJdbcTemplate(){
//
//	}


	//形式二
	@Test
	void testJdbcTemplate(@Autowired JdbcTemplate jdbcTemplate){
		String sql = "select * from tbl_book";
//		List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
//		System.out.println(maps);

		RowMapper<Book> rm = new RowMapper<Book>() {
			@Override
			public Book mapRow(ResultSet rs, int i) throws SQLException {
				Book temp = new Book();
				temp.setId(rs.getInt("id"));
				temp.setName(rs.getString("name"));
				temp.setType(rs.getString("type"));
				temp.setDescription(rs.getString("description"));
				return temp;
			}
		};
		List<Book> list = jdbcTemplate.query(sql, rm);
		System.out.println(list);
	}

//	@Test
//	void testJdbcTemplateSave(@Autowired JdbcTemplate jdbcTemplate){
//		String sql = "insert into tbl_book values(null,'springboot1','springboot2','springboot3')";
//		jdbcTemplate.update(sql);
//	}

	//使用h2
	@Test
	void testJdbcTemplateSave(@Autowired JdbcTemplate jdbcTemplate){
		String sql = "insert into tbl_book values(2,'springboot1','springboot2','springboot3')";
		jdbcTemplate.update(sql);
	}
}
