/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password_randomizer;

/**
 *
 * @author jowin
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Password_randomizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        
        int [] pin = new int [4];
        int [] sec = new int [10];
        int [] comp = new int [4];
        int [] pass = new int [4];
        int [] num = new int [4];
        boolean flag = true;
        
        //Get user pin number
        for (int i = 0; i < pin.length; i++)
        {
            System.out.println("Please create a pin number. ");
            //num = keyboard.nextInt();
            pin[i] = keyboard.nextInt();
            }
        //Fill array ith random numbers
        for (int i = 0; i < sec.length; i++)
        {
            sec[i] = rand.nextInt(10);
        }
        
        //Create pass with random numbers
        for (int i = 0; i < pin.length; i++)
        {
            switch (pin[i]) {
                case 0:
                    pass[i] = sec[0];
                    break;
                case 1:
                    pass[i] = sec[1];
                    break;
                case 2:
                    pass[i] = sec[2];
                    break;
                case 3:
                    pass[i] = sec[3];
                    break;
                case 4:
                    pass[i] = sec[4];
                    break;
                case 5:
                    pass[i] = sec[5];
                    break;
                case 6:
                    pass[i] = sec[6];
                    break;
                case 7:
                    pass[i] = sec[7];
                    break;
                case 8:
                    pass[i] = sec[8];
                    break;
                case 9:
                    pass[i] = sec[9];
                    break;
                default:
                    System.out.println("Incorrect pin input.");
                    break;
            }
        }
        
        //Print encryption key
    //  System.out.println(Arrays.toString(pin)); //prints user pin
        System.out.println("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9] is now");
        System.out.println(Arrays.toString(sec)); //prints random array
    //  System.out.println(Arrays.toString(pass)); //prints pass
        
        //Get User input for temp code
        for (int t = 0; t < pin.length; t++)    
        {    
            num[t] = keyboard.nextInt();
        }
        
        //Compare user input num[] to pass[]
        if (Arrays.equals(num, pass))
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Incorrect entry.");
        } 
        }
        
    }
