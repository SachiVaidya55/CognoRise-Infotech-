// import java.util.Random;
// import java.util.Scanner;

// public class RandomJavaExmp {
//   public static void main(String[] args) {
//     Random random=new Random();
//     int r=random.nextInt(100);
    
//     Scanner sc =new Scanner(System.in);
    
//     int i=1;
//     int guess=0;
//     System.out.println("Number Guessing Game ");
//     System.out.println("Guess the number out of 1 to 100");

//     while (i<=10) {

//       System.out.println("The guess No."+i);
//       guess=sc.nextInt();
  
//       if (r < guess) {
//         System.out.println("too high");
//       }else if (r > guess) {
//         System.out.println("too low");
//       }else{
//         System.err.println("You gueseed it right.");
//         break;
//       }
//       i++;
//     }
//     System.out.println("Random Number: "+ r);
//     System.out.println("Guess Number: "+ guess);

//   }
// }