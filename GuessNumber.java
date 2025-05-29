import java.util.Scanner;

public class GuessNumber{
    public static void main(String[] args){
        //MINI PROJECT

         Scanner sc = new Scanner(System.in);
        int myNum = (int) (Math.random() * 100) ;
        int num = 0;
        //loop
        do{
            //taking input
            System.out.println("Guess My Number(1-100) : ");
            num = sc.nextInt();
            
            //if else statement
            if(num == myNum){
                System.out.println("Hurrah! ..... Correct Number");
                break;
            }
            else if(num > myNum){
                System.out.println("Your number is bigger");
                System.out.println("Try Again...");
            }
            else if(num < myNum){
                System.out.println("Your number is Smaller");
                System.out.println("Try Again...");
            }
            else{
                System.out.println("Invalid Input");
            }
        }while(num != myNum);
    
    
    System.out.println("My number was : " + myNum);
    }
}
