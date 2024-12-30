package com.example.librarymanage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.librarymanage.pojo.Books;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BooksMapper extends BaseMapper<Books> {
}
