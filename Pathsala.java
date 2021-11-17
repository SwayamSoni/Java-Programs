class Pathsala{
    
    private int x;  // 1
    private String name;   // Bahut Bda Number
    
    Pathsala(int x,String name){
        
        this.x=x;
        this.name=name;
        
    }
    
    Pathsala(Pathsala p){    // copy constructor
        
        x=p.x;
        name=p.name;
     
    }
    
    public static void main(){
        
        Pathsala p =new Pathsala(1,"Bahut Bda Number");
        
        Pathsala p2 =new Pathsala(p);
        
        // to make an exact copy of another object
                
    }
    
    
}