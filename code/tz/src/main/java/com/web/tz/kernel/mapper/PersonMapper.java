package com.web.tz.kernel.mapper;

import java.util.List;

import com.web.tz.kernel.entity.Person;

public interface PersonMapper {
	public List<Person> find_page(String begin, String page_size);
	public int data_count();
}
