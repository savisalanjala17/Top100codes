
import java.util.*;
class Main {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        
        int res=Math.max(a,b);
        
       while(true){
           if(res%a==0 && res%b==0){
               System.out.print(res);
               break;
           }
           res++;
       }
        
       
    }
}



import java.util.*;
class Main {
    public static void main(String[] args) {
        int a=3;
        int b=7;
        
        int prod=a*b;
        
       while(a!=0 && b!=0){
           if(a>b){
               a=a%b;
           }
           else{
               b=b%a;
           }
       }
       
       if(a!=0){
           System.out.print(prod/a);
       }
       
       else{
           System.out.print(prod/b);
       }
          
          
        
       
    }
}
