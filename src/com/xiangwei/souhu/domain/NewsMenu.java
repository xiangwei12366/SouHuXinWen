package com.xiangwei.souhu.domain;

import java.util.ArrayList;

/**
 * 分类信息封装 使用Gson解析时,对象书写技巧: 1. 逢{}创建对象, 逢[]创建集合(ArrayList) 2.
 * 所有字段名称要和json返回字段高度一致
 * 
 * @author Administrator
 * 
 */
public class NewsMenu {
	public int result;
	private ArrayList<NewsMenuData> data;
	
	public class NewsMenuData{
		public String ctime;
		public String title;
		public String description;
		public String picUrl;
		public String url;
	}
}