 
 import java.util.*;
 class GuessNumber{
    public static void main(String[] args) {
        int Random_number;
        int User_number=(int)(Math.random()*100);
        System.out.println("Here , A Random number will be generated between 1 to 100");
        System.out.println("you have to guess that number");
        
        do{
            System.out.println("Guess the number : ");
            Scanner sc= new Scanner(System.in);
            Random_number=sc.nextInt();
            if(Random_number==User_number){
                System.out.println("Congratulation ! You guess the right number.");
                break;
            }
            else if(Random_number>User_number){
                System.out.println("Sorry ! You guess the Wrong Number");
                System.out.println("Enter the smaller number");
            }
            else{
                System.out.println("Sorry ! You guess the wrong number");
                System.out.println("Enter the greater number");
            }
            System.out.println("");
       
        } while(Random_number >= 0);
    }
    
}
