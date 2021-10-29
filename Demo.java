class Demo{
    
    public static void main(){
        
        Manager m =new Manager();
        Employee e = new Employee();
        
        m.name="Arpit";
        m.age=45;
        m.phone_no=12356789;
        m.salary=3434.3434f;
        m.address="blah blah blah";
        
        System.out.println(m.name+"\n"+m.age+"\n"+m.phone_no+"\n"+m.salary+"\n"+m.address);
        
        m.printSalary(343434.343f);
        
        
    }
    
}