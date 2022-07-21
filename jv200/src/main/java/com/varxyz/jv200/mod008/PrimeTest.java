package com.varxyz.jv200.mod008;

public class PrimeTest {
	public static void main(String[] args){
		try {
			PrimeGo(3512);
		}catch(PrimeException e) {
			e.getMessage();
			System.out.println(e.getMessage());
		}		
	}
	
	
	public static void PrimeGo(int checkNum) throws PrimeException {
		int countPrime = 0;
		
		
		for(int i = 2; i <= checkNum; i++) {			
			    if(checkNum % i == 0) {
			    	countPrime ++;			    	
			   }  			 
		}
		
			if(countPrime == 1) {
				
		    	System.out.println( checkNum + "는 소수입니다");
		    	
		    }else if(countPrime != 1) {
		    	
		    	System.out.println( checkNum + " 은 소수가 아닙니다.");
		    	
		    	//약수 구하기
		    	System.out.print( checkNum + " 의 약수는 ");		    	
		    	for(int j = 1; j <= checkNum; j++) {		    		
		    		if(checkNum % j == 0) {		    			
		    			System.out.print(j + " " );		    			
		    		}				    		
		    	}		    	
		    	//약수 구하기 끝
		    	
		    	
		    	//곱으로 나타내기
		    	
		    	//곱으로 나타내기 끝
		    
		    	System.out.println("");		    	
		    	
		    	throw new PrimeException("에러 발생으로 종료합니다.");		    	
		    } 
			
	}			
	
			
		
	


}


	


