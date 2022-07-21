package com.varxyz.jv200.mod005;

public class ArrayTest {	
	public static void main(String[] args) {
		
		
		double t = Math.random() * 1000;
		
		t = (int) t + 1;
		
		
		double cir[] = new double[700];
		for(int i = 0; i<cir.length; i++) {			
			cir[i] = i;
			if( t == cir[i]) {
				System.out.println("circle!!");
			}
		}
		
		double tri[] = new double[500];
		for(int i = 0; i<tri.length; i++) {
			
			tri[i] = i;
			if( t == cir[i]) {
				System.out.println("tri!!");
			}
		}
		
		
		
		double ract[] = new double[300];
		for(int i = 0; i<ract.length; i++) {
//			double getNum = Math.random() * 1000;
//			getNum = (int) getNum;
//			ract[i] = getNum;
			ract[i] = i;
			if( t == cir[i]) {
				System.out.println("ract!!");
			}
		}
		
		double panta[] = new double[50];
		for(int i = 0; i<panta.length; i++) {
		
			panta[i] = i;
			if( t == cir[i]) {
				System.out.println("panta!!");
			}
		}
		
		double sixth[] = new double[10];
		for(int i = 0; i<sixth.length; i++) {
			
			sixth[i] = i;
			if( t == cir[i]) {
				System.out.println("sixth!!");
			}
		}
		
		double eighth[] = new double[10];
		for(int i = 0; i<eighth.length; i++) {
			
			eighth[i] = i;
			if( t == cir[i]) {
				System.out.println("eigth!!");
			}
		}
		
		double star[] = new double[1];
		for(int i = 0; i<star.length; i++) {
		
			star[i] = i;
			if( t == cir[i]) {
				System.out.println("star!!");
			}
		}
				
		
//		
//		int[] a = new int[5];
//		int[] b = new int[3];
//		
//		for(int i = 0; i<a.length; i++) {
//			a[i] = i;	
//		}
//		for(int i = 0; i<b.length; i++) {
//			b[i] = i-5;			
//		}
//		
//		if(a[a.length-1] < b[0]) {
//			System.out.println("확실히 넌 오른쪽 밖이야");
//		}else if(a[0] > b[b.length-1]) {
//			System.out.println("확실히 넌 왼쪽 밖이야");
//		}else if ((b[0] >= a[0]) & (b[b.length -1] <=a[a.length-1])) {
//			System.out.println("확실히 넌 왼쪽 안이겠지");
//		}else if((b[0] < a[0]) & (b[b.length -1] <=a[a.length-1])){
//			System.out.println("왼쪽걸침");
//		}else if((b[0] >= a[0]) & (b[b.length -1] > a[a.length-1])){
//			System.out.println("오른쪽 걸침");
//		}		
	}

}
