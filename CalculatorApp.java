import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number 1:");
        int number1=sc.nextInt();

        System.out.println("Enter the Number 2:");
        int number2=sc.nextInt();

        System.out.println("Enter an oprater: +,-,*,/");
        char oprater=sc.next().charAt(0);

        try{

            double result;
            switch (oprater) {
                case '+':
                    result= number1 + number2;
                    System.err.println("Addition of Two numbers: "+result);
                    break;
                case '-':
                    result= number1 - number2;
                    System.err.println("Substraction of Two numbers: "+result);
                    break;
                case '*':
                    result= number1 * number2;
                    System.err.println("Multiplication of Two numbers: "+result);
                    break;
                case '/':
                    if ( number2 == 0) {
                        throw new ArithmeticException("Error: cannot divide by zero");
                    } 
                    result= number1 / number2;
                    System.err.println("Division of Two numbers: "+result);
                    break;
                default:
                   System.out.println("Invalid opraters");
                   break;
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
