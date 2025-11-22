import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int [n];
		int totalsum = 0;
		
	
		for(int i=0 ; i<a.length ; i++){
		    
		    a[i] = sc.nextInt();
		    totalsum+=a[i];
		    
		}
		
		int leftsum=0;

		
		for(int i=0 ; i<a.length ; i++){
		    
		    totalsum-=a[i];
		    
		    if(totalsum==leftsum) {
		        System.out.print(i);
		        break;
		    }
		    
		    leftsum+=a[i];
		    
		    
		}
		
		

	}
}
