/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.client;

import java.util.Scanner;

/**
 *
 * @author 이혜리
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Signup s = new Signup();
        //login l = new login();
        //file f = new file();

        //f.createfile();
        System.out.print("\n");

        while (true) {

            System.out.println("------- 메뉴 선택 -------");
            System.out.println("1. 회원가입");
            System.out.println("2. 로 그 인");
            System.out.println("9. 프로그램 종료");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s.register();
                case 2:
                    //l.clogin();
                case 9:
                    System.out.println("프로그램 종료");
                    return;
            }

        }
    }
    
}
