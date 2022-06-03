/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.FileSystem;

import design_project.client.First;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author 이혜리
 */
public class CreateFile {

    public static String URL = "C:\\git\\cafe_management_system\\design_project\\src\\main\\java\\design_project\\info";

    public void Create() {
        //Scanner sc = new Scanner(System.in);

        //System.out.print("파일 경로를 입력하세요(※info 경로까지만 입력 부탁드립니다.) : ");
        //URL =  sc.nextLine();
        File client = new File(URL + "\\client.txt");
        File beverage = new File(URL + "\\beverage.txt");
        File cake = new File(URL + "\\cake.txt");
        File MD = new File(URL + "\\MD.txt");

        try {
            if (client.createNewFile()) {
                System.out.println("고객 파일 생성 완료");
            } else {
                System.out.println("이미 고객 파일이 생성되어 있습니다.");
            }

            if (beverage.createNewFile()) {
                System.out.println("음료 파일 생성 완료");
            } else {
                System.out.println("이미 주문 파일이 생성되어 있습니다.");
            }

            if (cake.createNewFile()) {
                System.out.println("케이크 파일 생성 완료");
            } else {
                System.out.println("이미 주문 파일이 생성되어 있습니다.");
            }

            if (MD.createNewFile()) {
                System.out.println("MD 파일 생성 완료");
            } else {
                System.out.println("이미 주문 파일이 생성되어 있습니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        First f = new First(URL);
        f.Show();
    }
}
