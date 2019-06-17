package com.guochenglong.utils;
/** 

* @author 作者 郭成龙: 

* @version 创建时间：2019年6月17日 上午9:35:43 

* 类说明 :

*/

import java.util.Date;

import org.junit.Test;

import com.guochenglong.bean.Person;

public class TestPerson {

	
	@Test
	public void  select() {
		for (int i = 0; i < 10000; i++) {
			
			Person cc=new Person(0,StringUtils.randomChineseString(3),RandonNum.random(0,120),StringUtils.randomChineseString(8),null, new Date());
			System.out.println(cc.toString());
		}
	}
}
