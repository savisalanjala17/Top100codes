import java.util.*;
class Main {
    public static void main(String[] args) {
        int n=1011;
        int decimal=0;
        int p=0;
      
       while(n!=0){
           int temp=n%10;
           decimal+=temp*Math.pow(2,p);
           n/=10;
           p++;
       }
       
       System.out.print(decimal);

       
    }
}



import java.util.*;
class Main {
    public static void main(String[] args) {
        int n=20;
        int b[]= new int[20];
        int i=0;
      
       while(n!=0){
           int temp=n%2;
           b[i++]=temp;
           n/=2;
       }
       
       for(int j=i-1;j>=0;j--){
           System.out.print(b[j]+" ");
       }

       
    }
}
