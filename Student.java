class Student extends College{   // child
    
    int bomb = 34;
    
    void koibhi(){
        
        System.out.println("this is koibhi method");
    }
    
        void print(){
        
        super.display();   // super keyword refers to the parent class object   
        this.koibhi();   // this keyword refers to the current class object
        
        System.out.println(super.x);
        System.out.println(super.name);
        
    }
    public static void main(){
        
    
        Student s = new Student();
        
        s.print();
        
    }
}