import java.util.*;
class Main {
    public static void main(String[] args) {
        int a=20;
        int b=15;
        
        int min=Math.min(a,b);
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                System.out.print("HCF is: "+i);
                break;
            }
        }
    }
}




import java.util.*;
class Main {
    public static void main(String[] args) {
        int a=173;
        int b=133;
        
       while(a!=b){
           if(a>b){
               a=a-b;
           }
           else{
               b=b-a;
           }
       }
           
       System.out.print(a);
    }
}



import java.util.*;
class Main {
    public static void main(String[] args) {
        int a=20;
        int b=15;
        
       while(a!=0 && b!=0){
           if(a>b){
               a=a%b;
           }
           else{
               b=b%a;
           }
       }
        
        if(a==0)   
       System.out.print(b);
       else System.out.print(a);
    }
}

