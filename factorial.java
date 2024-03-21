public class Factorial {  
    public static void main(String args[]) {  
        int i, fact=1;  
        int numb=5; 
        for(i=1;i<=numb;i++) {    
            fact*=i;    
        }    
        System.out.println("Factorial of " + numb + " is: " + fact);    
    }  
}  

