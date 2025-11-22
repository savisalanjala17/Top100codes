import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int [n];
		int sum = 0;

		
		
		for(int i=0 ; i<a.length ; i++){
		    
		    a[i] = sc.nextInt();
		    
		}
		
		
		int left=0;
		int right=a.length-1;
		
		while(left<right){
		    int temp = a[left];
		    a[left]=a[right];
		    a[right]=temp;
		    
		    left++;
		    right--;
		}
		
		
		
		for(int i=0 ; i<a.length ; i++){
		    
		    System.out.print(a[i]+" ");
		    
		}
		
		
		
		

	

	}
}
