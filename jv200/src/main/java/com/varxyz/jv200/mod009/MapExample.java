package com.varxyz.jv200.mod009;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(Integer.valueOf(1), "유비");
		map.put(Integer.valueOf(2), "관우");
		map.put(Integer.valueOf(3), "장비");
		map.put(Integer.valueOf(4), "유비");
		map.put(5, "장비");
			
		System.out.println(map.get(Integer.valueOf(2)));
		//이거도 어느 세월에 이렇게 바뀜 new를 안해도 대는건 valueOf 가 static이여서 동적으로 할당이 가능
		
		System.out.println(map.get(5));
		//자바 5.0부터 이런 참조형 변수랑 찐 변수랑 서로서로 바꿔주는 오토박싱 개념이 적용가능
		//그래서 저건 문법적으로는 틀린거지만, 의미는 아다리가 맞으니깐 쓰도록 자바님께서 허용해줌
		
		Set<Integer> set = map.keySet();
		for(Integer integer : set) {
			System.out.print(integer);
			System.out.println("   n                          = " + map.get(integer));
		}
	}

}
