package com.varxyz.jv200.mod003;

public class PassTest {	
//	public static void changeInt(int value) {
//		value = 55;
//	}	
//	public static void changeObjectRef(MyDate ref) {
//		ref = new MyDate(1,1,2000);
//	}	
//	public static void changeObjectAttr(MyDate ref) {
//		ref.setDay(4);
//	}		
	public static void main(String[] args) {
//		MyDate date;
//		// 클래스 변수 선언
		
//		int val;
//		val = 11;
//		changeInt(val);
//		System.out.println("int value is" + val);
//		
//		date = new MyDate(22,7,1964);
//		changeObjectRef(date);
//		System.out.println("MyDate ref is" + date);
//		
//		changeObjectAttr(date);
//		System.out.println("MyDate day is" + date );
		
		
//		for(int j = 1; j < 10; j++) {				
//				
//			for (int i = 2; i < 10; i++) {
//				System.out.print(i + "*" + j + "=" + i*j +"\t");
//				
//			}
//			System.out.println("");
//				
//		}
		
//		for(int i = 2; i < 1000; i++) {
//			// 핵심: 소수의 갯수가 중요.
//			// 소수의 특징: 몫이 1과 자기자신
//			// 무조건 알수있는거 무조건 내가 아니 몫의 갯수는 '2개' 인 것
//			// 그래서 따로 countPrime 이라고 숫자를 둔거임
//			// countPrime이 2면 개는 소수
//			// 만약 소수가 아니라면 2개 초과된 몫의 갯수가 나온다.
//			// 그래서 중첩 반복을 돌린다. 만약 내가 나누는 몫으 1부터 나누는 값까지 했을때. 나머지가 0이 나온다는 것은 몫이 떨어진다는 것이고,
//			// 그것은 몫이 된다. 그 갯수를 카운팅 하는데, 그게 2개라면 소수 아니라면 소수가 아님
//			int countPrime = 0;
//			for (int j = 1; j<=i; j++) {
//			    if(i % j == 0) {
//			    	countPrime ++;
//			    } 			    
//			}	
//			if(countPrime == 2) {
//		    	System.out.println(i);
//		    } 	
//		}
		
		
		String text = "The cat in the hat";	
//		System.out.println(text.length());
		
//		isSubString("hat", text);
		System.out.println(isSubString("ca", text));
	}	
	
	public static boolean isSubString(String item, String line) {
		int lineLeng = line.length();
		int itemLeng = item.length();
		boolean collec = false;
		char lineChar = line.charAt(0);
		char itemChar = item.charAt(0);
		boolean repeatCheck = true;
		
		for (int i = 0; i < lineLeng; i++) {
			lineChar = line.charAt(i);
			
			if(lineChar == itemChar & repeatCheck == true) {
				
				for(int j = 0; j < itemLeng; j++) {
					itemChar = item.charAt(j);
					lineChar = line.charAt(i + j);
					if (lineChar != itemChar) {
						System.out.println(i+"F만남");
						System.out.println(j+"F만남");
						itemChar = item.charAt(0);
						System.out.println("itemchar 재설정");
						collec = false;
					}else {
						System.out.println(i+"T만남");
						System.out.println(j+"T만남");
						collec = true;
					}
					if(j == itemLeng - 1 & collec == true) {
						repeatCheck = false;
					}
				}
			}
		}		
		System.out.println("");
		return collec;
	}
	
	
	
	
}
	
	

 

