package com.varxyz.jv200.mod007;

public class Libary {
	
	//static 이면 로드댈때 미리 하나 생성해둠
	private static Libary lib = new Libary();
	
	private static int bookArea = 1;
	private static int bookNum = 0;
	private static Book[] book = new Book[bookArea * 100];
	
	private Libary() {
		
	}
	
	
	public static Libary getLibary() {
		return lib;
	}
	
	public static void addBook(Book b) {
	  book[bookNum] = b;
	  System.out.println(b.getSerial() +"책이 등록됬습니다 책 위치는"+book[bookNum] + bookNum);
	  bookNum ++;	  
	  
	  if(bookNum >= 100) {
		  bookArea = 2;
	  } 
	  
	}
	
	public static void getBook(int serial) {
		  for(int i = 0; i <= book.length - 1; i++) {
			 if( serial == book[i].getSerial()) {
				 System.out.println(serial + "로 된 책이 대출됩니다");
			 }else {
				 System.out.println("도서관에 등록된 책이 존재 하지 않습니다");
			 }
		  }
		  
	}

}
