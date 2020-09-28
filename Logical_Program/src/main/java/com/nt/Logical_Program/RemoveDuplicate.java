package com.nt.Logical_Program;

public class RemoveDuplicate {
	public static int removeDuplicateElements(int a[], int n) {
		if(n==0 ||n== 1)
			return n;
		int temp[] = new int[n];
		int j=0;
		for(int i=0; i<n-1; i++) {
			if(a[i]==a[i+1]) {
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[n-1];
		for(int i=1; i<=j; i++) {
			a[i]=temp[i];
		}
		return j;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 2, 5, 5, 6, 6, 7, 2};
    	int len=a.length;
    	len=removeDuplicateElements(a,len);
    
    	System.out.print("Duplicate Numbers = " );
    	for(int i=0; i<len;i++) {
    		
    				System.out.print(a[i]+" " );
    			}
	}

}
