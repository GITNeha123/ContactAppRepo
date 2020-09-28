package com.nt.Logical_Program;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 2, 5, 5, 6, 6, 7, 2};
    	int  res=0;
    	System.out.print("Duplicate Numbers = " );
    	for(int i=1; i<a.length;i++) {
    		for(int j=i+1; j<a.length;j++) {
    			if(a[i]==a[j]) {
    				//res+=1;
        			
        			
    				System.out.print(a[j]+" ," );
    				//System.out.print(res );
    				
    			}
    			
        		
    		}
    	}
      
    				
	}

}
