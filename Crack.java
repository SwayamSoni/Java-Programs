class Crack{
    
    void display(int x,String name){
        
        System.out.println(x+" "+name);
        
        display(x,name);
            
    }
    
    public static void main(){
        
        Crack c = new Crack();
        
        c.display(12,"tops");
    }
    
}