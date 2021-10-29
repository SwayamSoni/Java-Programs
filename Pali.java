class Pali{
    
    public static void main(){
        
        
        int x =123454321;
        int reverse = 0;
        int last_digit;
        
        int y =x;
        
        while(x>0){
            
            last_digit = x%10;   // 4
            
            reverse = reverse *10 + last_digit;
            
            x=x/10;
            
        }
        
        if(y==reverse){
            
            System.out.println("Number is Palindrome");
        }else{
            
            System.out.println("Number is not Palindrome");
        }
    }
}