/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.show;

import design_project.FileSystem.CreateFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 이혜리, 최주호
 */
public class BeverageorderDisplay_2 implements Observer, DisplayElement {
    String ID = null;
    String URL = CreateFile.URL + "\\beverage.txt";
    
    private int production;
    private int time;
    private int waiting;
    private Subject orderstatusData;

    public BeverageorderDisplay_2(Subject orderstatusData) {

        this.orderstatusData = orderstatusData;
        orderstatusData.registerobserver(this);

    }

    public void update(int waiting, int production, int time) {
        this.waiting = waiting;
        this.production = production;
        this.time = time;
        //display();
    }

    /*
  public void display() {
      System.out.print("\n음료 주문현황==>");
   System.out.print("대기 인원 :" + waiting);
   System.out.print("\t제작 현황 :" + production);
  System.out.print("\t예상 시간 :" + time);
  }
     */
    public void show() {
        Scanner sc = new Scanner(System.in);

        System.out.println("음료 주문 조회를 시작합니다");
        System.out.println("아이디 입력");
        ID = sc.nextLine();

        display();
    }
    
    public boolean CompareID() {
        try {
            String str;
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(URL));

            Path path = Paths.get(URL);

            Charset cs = StandardCharsets.UTF_8;

            ArrayList<String> list = new ArrayList<String>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);

            ArrayList<String> list_temp = new ArrayList<String>();
            ArrayList<String> id_list = new ArrayList<String>();

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");
                id_list.add(temp[0]);
            }

            for (int i = 0; i < id_list.size(); i++) {
                if (ID.equals(id_list.get(i))) {
                    //  ch = 0;
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void display() {

        if (CompareID() == true) {
            System.out.println("[음료 주문 내역]");
            try {
                String str;
                String[] array = null;

                BufferedReader is = new BufferedReader(new FileReader(URL));

                Path path = Paths.get(URL);

                Charset cs = StandardCharsets.UTF_8;

                ArrayList<String> list = new ArrayList<String>();
                list = (ArrayList<String>) Files.readAllLines(path, cs);

                ArrayList<String> list_temp = new ArrayList<String>();
                ArrayList<String> id_list = new ArrayList<String>();
                ArrayList<String> beverage_list = new ArrayList<String>();

                for (String i : list) {
                    array = i.split("\n");
                    list_temp.add(array[0]);
                }

                for (String i : list_temp) {
                    String[] temp = i.split("/");
                    id_list.add(temp[0]);
                    beverage_list.add(temp[1]);
                }

                for (int i = 0; i < beverage_list.size(); i++) {
                    if (ID.equals(id_list.get(i))) {
                        System.out.println(beverage_list.get(i));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("아이디 불일치\n");
            show();
        }
    }
}
