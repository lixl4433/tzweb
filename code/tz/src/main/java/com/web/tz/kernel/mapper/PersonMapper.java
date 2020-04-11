package com.web.tz.kernel.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.web.tz.kernel.entity.Person;

public interface PersonMapper {
	public List<Person> find_page(@Param("begin") String begin, @Param("page_size") String page_size);
	public int data_count();
}
