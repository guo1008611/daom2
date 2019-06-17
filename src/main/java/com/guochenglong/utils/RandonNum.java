package com.guochenglong.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/** 

* @author 作者 郭成龙: 

* @version 创建时间：2019年6月17日 上午8:45:47 

* 类说明 :随机数

*/
public class RandonNum {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		Random cc=new Random();
		return cc.nextInt((max-min+1)+min);
	//TODO 实现代码
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static String subRandom (int min, int max, int subs){
		Set<Integer> cc=new HashSet<Integer>();
		for(int i=0;i<subs;i++) {
			cc.add(random(min,max));
		}
		return cc.toString();
		
	//TODO 实现代码
	}
	
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		
		String str="qwertyuiopasdfghjklzxcvbnm7418529630";
		
		return (char)random(0,str.length()-1);	
		
		
		
	
		
	//TODO 实现代码
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		String strr="";
		for (int i=0;i<length;i++) {
			strr+=randomCharacter();
		}
		return strr;
	
	}
	
	
	
	
	
}
