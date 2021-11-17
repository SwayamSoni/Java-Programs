class CopyConstructorClass

{
    
    private int x;   // 12
    private String name;  // tops
    private float f;  // 2323.23f
    
    CopyConstructorClass(int x,String name,float f){   // setter
        
        this.x=x;
        this.name=name;
        this.f=f;
        
    }
    CopyConstructorClass(CopyConstructorClass m){
        
        this.x = m.x;
        this.name = m.name;
        this.f = m.f;
    }
    
    public static void main(){
        
        CopyConstructorClass obj1 = new CopyConstructorClass(12,"tops",2323.23f);
        
        CopyConstructorClass obj2 = new CopyConstructorClass(obj1);
        
        CopyConstructorClass obj3 = new CopyConstructorClass(obj1);
        
        System.out.println(obj2.x+" "+obj2.name+" "+obj2.f);
        
        
    }
    
}