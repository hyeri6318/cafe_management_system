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
public class First {

    String URL = null;

    public First(String URL) {
        this.URL = URL + "\\client.txt";
    }

    public void Show() {
        Signup s = new Signup(URL);
        Login l = new Login(URL);

        while (true) {
            System.out.println("------- 환엽합니다 -----------");
            System.out.println("1. 회원");
            System.out.println("2. 비회원");
            System.out.println("3. 회원가입");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    l.DoLogin();
                    return;
                case 2:
                    System.out.print("비회원");
                    return;

                case 3:
                    s.Register();

            }
        }

    }
}