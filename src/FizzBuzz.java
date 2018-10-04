/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Quentin.Bloomfield
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<=100; i++){
            String test = "";
            test += i%3 == 0 ? "Fizz" : "";
            test += i%5 ==0 ? "Buzz" : "";
            System.out.println(!test.isEmpty() ? test : i);
        }
    }
    
}
