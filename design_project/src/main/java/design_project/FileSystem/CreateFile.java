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

    public static String URL = System.getProperty("user.dir")+"\\src\\main\\java\\design_project\\info";
    
    public void Create() {
        File client = new File(URL + "\\client.txt");
        File order = new File(URL +"\\order.txt");

        try {
            if (client.createNewFile()) {
                System.out.println("고객 파일 생성 완료");
            } else {
                System.out.println("이미 고객 파일이 생성되어 있습니다.");
            }
            
            if (order.createNewFile()){
                System.out.println("주문 파일 생성 완료");
            } else{
                System.out.println("이미 주문 파일이 생성되어 있습니다");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        First f = new First();
        f.Show();
    }
}
