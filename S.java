class S{
    
    public static void main(){
        
        // string is a collection of characters
        
        // non primitive  // array  // String // object // heap
        
        String name="tops";
        
        String data = new String("tops");
        
        for(int i=0;i<name.length();i++){
            
            System.out.println(name.charAt(i));
            
        }
        
        char arr[]={'t','o','p','s','5','2','6','6'};
        
        String hohoho = new String(arr);
        
        System.out.println(hohoho); // "tops5266"
        
        System.out.println(hohoho.length());

        String newHohoho = hohoho.substring(2,5);
        
        System.out.println(newHohoho);
        
        ///////////////////////////////////////////////////////////////////////
        
        
        String goa = "";  // unique empty string // with length zero  // empty string
        
        String jump = null; // null value  // null String
        
        System.out.println(jump);
        System.out.println(goa);
        
        String ko =hohoho.concat(name);
        
        System.out.println(ko);
        
        System.out.println(name);
    }
}