package com.varxyz.jv200.mod009;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExample2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//리스트는 순서도 맞춰주고, 중복을 여러번 해도 괜찮음
		
		list.add("one");
		list.add("second");
		list.add("3rd");				
		list.add("second");
		list.add("one");
		list.add("second");
		list.add("3rd");	
		list.add(null);
		
		for(String s : list) {
			System.out.println(s + " ");
		}
		
//		list.add(132);
		//리스트 안에 들어갈 값을 타입을 <String 이라고 지어 줫으므로 난 그 이외릐 타입으로 지정할 수 없음>		
		System.out.println(list);
		
		//--------------------
		
		List<Integer> list2 = new ArrayList<Integer>();
		//리스트는 순서도 맞춰주고, 중복을 여러번 해도 괜찮음
		
		list2.add(213);
		list2.add(123);
		list2.add(2161);
		list2.add(12613);
		list2.add(2173);
		list2.add(1123);
		list2.add(26813);
		list2.add(123);
		list2.add(21763);
		list2.add(1923);
		
		list2.add(null);
		
		
//		list.add(132);
		//리스트 안에 들어갈 값을 타입을 <String 이라고 지어 줫으므로 난 그 이외릐 타입으로 지정할 수 없음>		
		System.out.println(list2);
		
		//-------------------------------------		
		
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("second");
		set.add("3rd");			
		set.add("second");
		set.add(null);
		
		
		System.out.println(set);
		
		
		
		
		
		
		
	}

}
