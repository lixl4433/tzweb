package com.web.tz.web.contorller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.tz.kernel.entity.Person;
import com.web.tz.kernel.mapper.PersonMapper;
import com.web.tz.web.contorller.constants.ForwardConstants;
import com.web.tz.web.contorller.constants.PageView;

@Controller
@RequestMapping("/person/")
public class PersonController {
	@Inject
    private PersonMapper personMapper;
	@RequestMapping("list")
	public String listUI() {
		return ForwardConstants.PERSON + ForwardConstants.LIST;
	}
	
	@RequestMapping("page_list")
	@ResponseBody
	public PageView page_list(String pageNow, String pageSize, String column, String sort) {
		pageNow = null == pageNow ? "0" : pageNow;
		int page_now = Integer.parseInt(pageNow);
		int page_size = Integer.parseInt(pageSize);
		int begin = null == pageNow || "0".equals(pageNow) ? 0 : (page_now-1)*page_size;
		List<Person> datas = personMapper.find_page(String.valueOf(begin), String.valueOf(page_size));
		PageView pv = new PageView();
		pv.setRecords(datas);
		pv.setPageNow(Integer.parseInt(pageNow));
		int data_size = personMapper.data_count();
		int page_count = (data_size+Integer.parseInt(pageSize)-1)/Integer.parseInt(pageSize);
		pv.setPageCount(page_count);
		pv.setRowCount(data_size);
		return pv;
	}
	
}
