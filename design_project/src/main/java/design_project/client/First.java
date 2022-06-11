/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.client;

import design_project.FileSystem.CreateFile;
import java.util.Scanner;

/**
 *
 * @author 이혜리, 이재혁
 */
public class First {

    public void Show() {
        Signup s = new Signup();
        Login l = new Login();
        changePW c = new changePW();
        removeClient r = new removeClient();

        while (true) {
            System.out.println("------- 환엽합니다 -----------");
            System.out.println("1. 회원");
            System.out.println("2. 비회원");
            System.out.println("3. 회원가입");
            System.out.println("4. 비밀번호 변경");
            System.out.println("5. 회원 탈퇴");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    l.DoLogin();
                    return;
                case 2:
                    l.non_member();
                    return;

                case 3:
                    s.Register();
                    break;
                    
                case 4:
                    c.doChangePW();
                    break;
                    
                case 5:
                    r.doRemove();
                    break;

            }
        }

    }
}
