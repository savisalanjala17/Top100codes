import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int [n];
		int min = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		
		for(int i=0 ; i<a.length ; i++){
		    
		    a[i] = sc.nextInt();
		    if(a[i]<min) {
		        min2=min;
		        min=a[i];
		    }
		    
		    else if(a[i]>min && a[i]<min2){
		        min2=a[i];
		    }
		}
		
		System.out.print(min2);
		
		

	

	}
}



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int [n];
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		
		for(int i=0 ; i<a.length ; i++){
		    
		    a[i] = sc.nextInt();
		    if(a[i]>max) {
		        max2=max;
		        max=a[i];
		    }
		    
		    else if(a[i]<max&& a[i]>max2){
		        max2=a[i];
		    }
		}
		
		System.out.print(max2);
		
		

	

	}
}

