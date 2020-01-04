static void fibonacci(int x){
    int a = 1; 
    int b = 1;
    int c = a+b;
    System.out.println(a);
    System.out.println(b);
    for(int i = 0; i < x; i++){
        System.out.println(c);
        b = c;
        c = a + c;
        a = b;
    }
}
    
public static void main(String[] args){  
        
    fibonacci(10);
        
}  
