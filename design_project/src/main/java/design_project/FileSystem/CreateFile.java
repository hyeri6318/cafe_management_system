/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.FileSystem;

import design_project.client.first;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author 이혜리
 */
public class createFile {

    public static String URL = "C:\\git\\cafe_management_system\\design_project\\src\\main\\java\\design_project\\info";

    public void Create() {
        //Scanner sc = new Scanner(System.in);

        //System.out.print("파일 경로를 입력하세요(※info 경로까지만 입력 부탁드립니다.) : ");
        //URL =  sc.nextLine();
        File client = new File(URL + "\\client.txt");
        File order = new File(URL + "\\order.txt");

        try {
            if (client.createNewFile()) {
                System.out.println("고객 파일 생성 완료\n");
            } else {
                System.out.println("이미 고객 파일이 생성되어 있습니다.\n");
            }

            if (order.createNewFile()) {
                System.out.println("주문 파일 생성 완료\n");
            } else {
                System.out.println("이미 주문 파일이 생성되어 있습니다.\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        first f = new first(URL);
        f.Show();
    }
}
