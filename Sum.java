class Sum{
    
    int printSum(int range){
        
        while(range>0){
            return range + printSum(range-1);
        }
        
        return 0;
        
        
        // 10 + printSum(9){9+printSum(8)}
    }
    
    public static void main(){
        
        Sum s = new Sum();
        
        System.out.println(s.printSum(10));
        
    }
    
}