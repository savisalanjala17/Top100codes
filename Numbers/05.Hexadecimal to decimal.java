import java.util.*;
class Main {
    public static void main(String[] args) {
        String hex = "C9";
        System.out.println (convert (hex));
  }
  
  static int convert(String hex){  
    String digits = "0123456789ABCDEF";  
             hex = hex.toUpperCase();  
             int val = 0;  
             for (int i = 0; i < hex.length(); i++)  
             {  
                 char c = hex.charAt(i);  
                 int d = digits.indexOf(c);  
                 val = 16*val + d;  
             }  
             return val;  
       
    }
}


import java.util.*;
class Main {
    public static void main(String[] args) {
        int decimal = 1457;
        convert (decimal);
} 
 
static void convert (int num) 
  {
    char[] hexa = new char[100];
    int i = 0;
  
while (num != 0)
      
      {
    
             int rem = 0;
             rem = num % 16;
        if (rem < 10)
          {
           hexa[i] = (char) (rem + 48);
           i++;
         }                    
      else
     
       {
        
          hexa[i] = (char) (rem + 55);
          i++;
      } 
        
        num = num / 16;
      
} 

      System.out.println ("Hexadecimal:");
    
       for (int j = i - 1; j >= 0; j--)
      
           System.out.print (hexa[j]);

        } 
 
} 
