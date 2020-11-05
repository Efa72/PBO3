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
public class Project2 {
    // Membuat Atribut//
    int random;
    int tebak;
    int score;
    int bonus;
    
    // Membuat method//
    void tebakAngka2(){
        random = (int)(Math.random()*100);
        System.out.println("                           GAME TEBAK ANGKA 2                                  ");
        System.out.println(" ");
        System.out.println("Hai, saya telah memilih bilangan bulat secara acak antara 0 s/d 100. Kuy tebak lagi!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Score Awal Anda : 100");
        Scanner input = new Scanner(System.in);
        score=100;
        do {
            System.out.print("Tebakan Anda : ");
            tebak =input.nextInt();
            if (score>0){
                if(tebak<random){
                    score-=2;
                    System.out.println("Tebakan anda terlalu kecil");
                    System.out.println("Score anda : " + score);
                }
                else if (tebak>random){
                    score-=2;
                    System.out.println("Tebakan anda terlalu besar");
                    System.out.println("Score anda : " + score);
                }
                else if(score>=92){
                    bonus=50;                    
                    System.out.println("Hebat...Tebakan anda benar");
                    System.out.println("Score anda : " + score);
                }
                else{
                    System.out.println("Hore...anda benar");
                    System.out.println("Score anda : " + score);
                }     
            }else {
                break;}
        }while (tebak!=random);
        System.out.println("   ");
        System.out.println("Score anda : " + score);
        System.out.println("Bonus : " + bonus);
        System.out.println("Total score : " + (score+bonus));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
}
