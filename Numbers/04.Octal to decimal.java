import java.util.*;
class Main {
    public static void main(String[] args) {
        int n=345;
        int decimal=0;
        int p=0;
      
       while(n!=0){
           int temp=n%10;
           decimal+=temp*Math.pow(8,p);
           n/=10;
           p++;
       }
       
       System.out.print(decimal);

       
    }
}


import java.util.*;
class Main {
    public static void main(String[] args) {
        int n=229;
        int o[]= new int[20];
        int i=0;
      
       while(n!=0){
           int temp=n%8;
           o[i++]=temp;
           n/=8;
       }
       
       for(int j=i-1;j>=0;j--){
           System.out.print(o[j]+" ");
       }

       
    }
}
