class Student{
    
    private int x=1;
    
    private String name;
    
    void setValues(int x,String name){
        
        this.x=x;
        this.name=name;
        
        System.out.println(this.x);
        
        
        // this refers to the current class object
    }
    
    void getValues(){
        
        System.out.println(x+" "+name);
        
    }
    
    
    
}