import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int [n];
		int max = Integer.MIN_VALUE;
		
		for(int i=0 ; i<a.length ; i++){
		    
		    a[i] = sc.nextInt();
		    if(a[i]>max) max=a[i];
		    
		    
		}
		
		System.out.print(max);
		
		

	

	}
}
