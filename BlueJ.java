class BlueJ{

    BlueJ(){
        
        this(12);
        System.out.println("From Default Construtor");

    }

    BlueJ(int x){

        // we can also call one construtor inside another constructor inside a same class
        
        
        System.out.println("From Parameterized Construtor");

        
    }
}