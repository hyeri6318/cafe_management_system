/**
 *최초 작성자 : 이혜리
 *최초 작성일 : 
 * 목적 : client(고객파일), order(주문파일) 생성
 */
package design_project.FileSystem;

import design_project.client.First;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    // URL : 파일 절대 경로를 입력 받기 위한 변수
    // getProperty : 프로젝트가 실행되는 파일의 위치를 읽여들여 현재 위치를 불러옴.
    public static String URL = System.getProperty("user.dir")+"\\src\\main\\java\\design_project\\info";
    
    public void Create() {
        File client = new File(URL + "\\client.txt");
        File order = new File(URL +"\\order.txt");

        try {
            if (client.createNewFile()) {   // 고객 정보 메모장 생성
                System.out.println("고객 파일 생성 완료");
            } else {
                System.out.println("이미 고객 파일이 생성되어 있습니다.");
            }
            
            if (order.createNewFile()){ // 주문 정보 메모장 생성
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
