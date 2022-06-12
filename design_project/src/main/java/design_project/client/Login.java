/**
 *최초 작성자 : 이혜리, 이재혁
 *최초 작성일 : 
 * 목적 : 
 */
package design_project.client;

import design_project.FileSystem.CreateFile;
import design_project.beverage.beverage;
import design_project.cake.cake;
import design_project.md.MD;
import design_project.nutrition.AmericanoBuilder;
import design_project.nutrition.BlackteaBuilder;
import design_project.nutrition.CheeseappleCakeBuilder;
import design_project.nutrition.CheeseblueberryCakeBuilder;
import design_project.nutrition.CheesecherryCakeBuilder;
import design_project.nutrition.ChiffonappleCakeBuilder;
import design_project.nutrition.ChiffonblueberryCakeBuilder;
import design_project.nutrition.ChiffoncherryCakeBuilder;
import design_project.nutrition.ChocolateFrappuccinoBuilder;
import design_project.nutrition.Director;
import design_project.nutrition.KiwiSmoothieBuilder;
import design_project.nutrition.LatteBuilder;
import design_project.nutrition.MatchaBuilder;
import design_project.nutrition.Nutrition;
import design_project.nutrition.NutritionBuilder;
import design_project.nutrition.StrawberrySmoothieBuilder;
import design_project.nutrition.VanillaFrappuccinoBuilder;
import design_project.nutrition.WhippedappleCakeBuilder;
import design_project.nutrition.WhippedblueberryCakeBuilder;
import design_project.nutrition.WhippedcherryCakeBuilder;
import design_project.pickup.Pickup;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Login {

    String url = CreateFile.URL + "\\client.txt";

    String ID = null;
    String PW = null;
    int NID=0;

    public static String id = null; // 회원 아이디
    public static String nid = null; // 비회원 아이디

    MD m = new MD() {
        @Override
        public int cost() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String exhibit() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    beverage b = new beverage() {};

    cake c = new cake();
    
    Pickup p = new Pickup();

    public void DoLogin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("아이디 : ");
        ID = sc.nextLine();
        id = ID;

        System.out.println("비밀번호 : ");
        PW = sc.nextLine();

        LoginCheck();

    }

    public void non_member() {  // 비회원일 경우 숫자로 랜덤 아이디 부여
        Random random = new Random();
        NID = random.nextInt(100);
        nid = Integer.toString(NID);

        System.out.println(nid);
        show();
    }

    public boolean Compare(String url) {
        try {
            String str;
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(url));

            Path path = Paths.get(url);

            Charset cs = StandardCharsets.UTF_8;

            ArrayList<String> list = new ArrayList<String>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);

            ArrayList<String> list_temp = new ArrayList<String>();
            ArrayList<String> id_list = new ArrayList<String>();
            ArrayList<String> pw_list = new ArrayList<String>();

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");
                id_list.add(temp[1]);
                pw_list.add(temp[2]);
            }

            for (int i = 0; i < id_list.size(); i++) {
                if (ID.equals(id_list.get(i)) && PW.equals(pw_list.get(i))) {
                    is.close();
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void LoginCheck() {

        boolean id_temp = Compare(url);

        if (id_temp) {
            System.out.print("로그인 성공\n\n");
            show();
        } else {
            System.out.print("로그인 실패\n");
            DoLogin();
        }
    }

    public void show() {
        System.out.print("-----------------------음료 및 케이크 영양 정보를 제공합니다-----------------------\n");
        
        System.out.println("--------------- 커피 ----------------");
        
        NutritionBuilder nutritionBuilder = new AmericanoBuilder(); // 아메리카노
        Director director = new Director(nutritionBuilder);
        director.showNutrition();   // 작성 x -> 지정한 값을 받아오지 못함
        Nutrition nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new LatteBuilder();  // 라뗴
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        
        System.out.println("--------------- 티 ----------------");

        nutritionBuilder = new BlackteaBuilder();   // 홍차
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new MatchaBuilder(); // 말차
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        System.out.println("--------------- 프라푸치노 ----------------");
        
        nutritionBuilder = new VanillaFrappuccinoBuilder(); // 바닐라 프라푸치노
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new ChocolateFrappuccinoBuilder();   // 초코릿 프라푸치노
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        
        System.out.println("--------------- 스무디 ----------------");
        
        nutritionBuilder = new StrawberrySmoothieBuilder(); // 딸기 스무디
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new KiwiSmoothieBuilder();   // 키위 스무디
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        
        System.out.println("--------------- 치즈 케이크 ----------------");
        
        nutritionBuilder = new CheeseappleCakeBuilder();    // 사과 치즈 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new CheeseblueberryCakeBuilder();    // 블루베리 치즈 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new CheesecherryCakeBuilder();   // 체리 치즈 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        
        System.out.println("--------------- 시폰 케이크 ----------------");

        nutritionBuilder = new ChiffonappleCakeBuilder();   // 사과 시폰 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new ChiffonblueberryCakeBuilder();   // 블루베리 시폰 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new ChiffoncherryCakeBuilder();  // 체리 시폰 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        
        System.out.println("--------------- 생크림 케이크 ----------------");
        
        nutritionBuilder = new WhippedappleCakeBuilder();   // 사과 생크림 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new WhippedblueberryCakeBuilder();   // 블루베리 생크림 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition);

        nutritionBuilder = new WhippedcherryCakeBuilder();  // 체리 생크림 케이크
        director = new Director(nutritionBuilder);
        director.showNutrition();
        nutrition = director.getNutritoin();
        System.out.println(nutrition+"\n");
        
        b.orderCheck();
        c.orderCheck();
        m.buy();
        p.show();
    }
}
