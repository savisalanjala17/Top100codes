import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=2 ; i<=n/2 ;i++){
		    
		    if(isprime(i) && isprime(n-i)){
		        System.out.println(i+" "+(n-i));
		    }
		}
	}
	
	public static boolean isprime(int n){
	    
	    for(int i=2 ; i<= Math.sqrt(n) ; i++){
	        
	        if(n%i == 0) return false;
	    }
	    
	    return true;
	}
}
