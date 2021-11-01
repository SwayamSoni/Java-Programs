class Fun{
    
    
    // function calling
    
    int x =23;
    
    String name="I Destroy Bluej";
    
    void display(){
        
     System.out.println("This is display function");
     
     // function calls another function
     
     print();
        
    }
    
    void print(){
        
        System.out.println("This is print function");
        
    }
    
    
    public static void main(){
        
        Fun f = new Fun();
        f.display();
    }
    
}