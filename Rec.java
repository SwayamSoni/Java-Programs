class Rec{
    
    //recursive function
    
    // when function calls itself
    
    void display(){
        
        System.out.println("Kill all bluej");
        display();
    }
    public static void main(){
        
        Rec r =new Rec();
        
        r.display();
    }
}