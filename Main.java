import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    static Scanner in;
    public static void main(String args[]){
        in = new Scanner(System.in);
        System.out.println("Hello, welcome to Exotic Pets. Would you like to adopt a frog ('F') or a monkey ('M')?");
        Animal a;
        Boolean selected = false;

        char c = select();

        if(c == 'F'){
            a = new Frog();
        } else{
            a = new Monkey();
        }
    
        System.out.println("You have selected " + a.getType());
        System.out.println("What would you like to name your " + a.getType() + "?");

        a.setName(in.next());

        System.out.println(a.getName() + " says "); a.makeNoise();
    }

    public static char select(){
        try{
            char c = in.next().charAt(0);
            if(c == 'F'){
                return c;
            } else if(c == 'M'){
                return c;
            } else {
                System.out.println(c + " is not on the menu. Please select a valid option");
                return select();
            }
        } catch(InputMismatchException e){
            System.out.println("That is not a valid input. Please try again.");
            return select();
        }
        //return c;
        
    }
}