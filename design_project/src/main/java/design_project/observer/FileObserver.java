/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.observer;

import design_project.FileSystem.CreateFile;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author 윤채민
 */
public class FileObserver implements Observer{
    public String type;
    public String ID;
    public String Description;
    public int cost;
    public int otime;
    private Subject orderdata;
    
    String url = CreateFile.URL+"\\order.txt";
    
    public FileObserver(Subject orderdata){
        this.orderdata = orderdata;
        orderdata.registerObserver(this);
    }
    
    //변경 내용 업데이트
    public void update(String type, String ID, String Description, int cost, int otime){
        this.type = type;
        this.ID=ID;
        this.Description = Description;
        this.cost= cost;
        this.otime=otime;
        display();
    }
    
    //메모장에 입력
    public void display(){
        String costString = Integer.toString(cost);
        String otimeString = Integer.toString(otime);
        try {
            String s = "/";
            String n = "\n";

           File file = new File(url);
           FileWriter writer;

           // Charset cs = StandardCharsets.UTF_8;

            // type/ID/Description/cost/otime 형태로 메모장에 저장
            writer = new FileWriter(file, true);
            writer.write(type);
            writer.write(s);
            writer.write(ID);
            writer.write(s);
            writer.write(Description);
            writer.write(s);
            writer.write(costString);
            writer.write(s);
            writer.write(otimeString);
            writer.write(n);
            
            writer.flush();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
