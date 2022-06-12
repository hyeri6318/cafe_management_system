/**
 *최초 작성자 : 이혜리, 이재혁
 *최초 작성일 :
 * 목적 : 파일이 생성된 후 처음 실행되는 클래스로 로그인, 회원가입, 비밀번호 변경, 회원 탈퇴가 가능하게 함
 */
package design_project.client;

import design_project.FileSystem.CreateFile;
import java.util.Scanner;

public class First {

    public void Show() {
        Signup s = new Signup();
        Login l = new Login();
        changePW c = new changePW();
        removeClient r = new removeClient();

        while (true) {
            System.out.println("------- 환영합니다 -----------");
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
