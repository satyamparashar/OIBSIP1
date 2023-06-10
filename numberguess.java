import java.util.Random;
import java.util.*;
public class guessgame
{
    public static final Random RANDOM = new Random();
    public static final int MAX_NUMBER= 100;
    public static void main(String[] args)
    {
        int numbergenerate= RANDOM.nextInt(MAX_NUMBER)+1;
        Scanner inputuser = new Scanner(System.in);
        int tries=0, userguess=0;
        System.out.println("NOTE: YOU HAVE ONLY 7 TRIES");
        while(userguess!=numbergenerate)
        {
            System.out.println("GUESS A NUMBER BETWEEN 1 AND 100");
            userguess=inputuser.nextInt();
            tries++;
            if(userguess<1||userguess>MAX_NUMBER)
            {
                System.out.println("OOPS! YOU HAVE ENTERED WRONG NUMBER...TRY WITHIN RANGE SPECIFIED");
            }
            else if(userguess>numbergenerate)
            {
                System.out.println("THE NUMBER YOU HAVE ENTERED IS TOO HIGH!");
            }
            else if(userguess<numbergenerate)
            {
                System.out.println("THE NUMBER YOU HAVE ENTERED IS TOO LOW!");
            }
            else
            {
                System.out.println("CONGRATULATIONS! YOU GUESSED THE RIGHT NUMBER "+numbergenerate+" in "+tries+" tries");
                break;
            }
            if(tries==7){
                System.out.println("OOPS! YOUR 7 TRIES ARE OVER");
            break;
            }
        }
    }
}