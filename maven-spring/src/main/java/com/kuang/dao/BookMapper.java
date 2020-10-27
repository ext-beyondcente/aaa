package com.kuang.dao;
import java.util.List;

import com.kuang.pojo.Books;

import org.apache.ibatis.annotations.Param;

public interface BookMapper {
    // 增加一本书
    int addBook(Books books);

    // 删除一本书
    int deleteBookByID(@Param("bookId") int id);

    // 更新一本书
    int updateBook(Books books);

    // 查询一本书
    Books queryBookByID(@Param("bookId") int id);

    // 查询全部的书
    // List<Books> queryAllBook(int id);

	List<Books> queryAllBook();
}
