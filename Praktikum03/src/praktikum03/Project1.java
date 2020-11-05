/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum03;

/**
 *
 * @author EfaSetiyani
 */
import java.util.Scanner;
public class Project1 {
    int random;
    int tebak;
    
    void tebakAngka(){
        random = (int)(Math.random()*100);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ GAME TEBAK ANGKA ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
        System.out.println("Hai, saya telah memilih bilangan bulat secara acak antara 0 s/d 100. Kuy tebak!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Tebakan Anda : ");
            tebak =input.nextInt();
            if (tebak > random)
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
            else if (tebak < random)
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            else
                System.out.println("Yeeee… Bilangan tebakan anda BENAR");
        } while(tebak!= random);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
