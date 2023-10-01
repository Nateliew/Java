import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // String[] rps = {"rock", "paper", "scissors"};
        // String computerMove = rps[new Random().nextInt(rps.length)];
        int computerMove = new Random().nextInt(10);

        Scanner scanner = new Scanner(System.in);
        int playerMove;

        while(true){
        System.out.println("Please guess a number:");
        playerMove = Integer.parseInt(scanner.nextLine());
            if(playerMove > 10){
            System.out.println(playerMove + "is out of bound");
             break;

            }
        
        // if(playerMove.equals(computerMove)){
        if(playerMove == computerMove){

        System.out.println("its a tie");
        }
        else if(playerMove != computerMove){
        System.out.println("try again!");

        }
        else {
        System.out.println("Yay!");

        }
    }
    
}
}
