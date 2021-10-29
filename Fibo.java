import java.util.*;
class Fibo{
    
    // fibo
    
    Fibo(int x){
        
        // 0 1 1 2 3 5 8 13 21 34 55 
        
         int p =0;    // 1   // 1
         int q =1,r;
        
        for(int i=0;i<x;i++){
            
           System.out.println(p);  // p=0  , 1
            r = p+q;  // r=1   // r=2
            p=q; // p=1; 1
            q = r; //  q = 1 , 2
            
            
        }
    }
    
    public static void main(){
        
        System.out.println("Enter Size Of Fibonacci series");
        
        Scanner sc = new Scanner(System.in);
        
        int z =sc.nextInt();
        
        Fibo f =new Fibo(z);
        
    }
}