/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.observer;

import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author mikwang
 */
public class File implements Observer {

    public String type;
    public String ID;
    public String Description;
    public int cost;
    public int otime;
    
    public void File(){
        try {
            String s = "/";
            String n = "\n";

            java.io.File file = new java.io.File("C:\\project\\design_project_observer\\src\\main\\java\\observer\\observertest.txt"); //URL 경로 입력 필요
            FileWriter writer;

            Charset cs = StandardCharsets.UTF_8;

            // type/ID/Description/cost/otime 형태로 메모장에 저장
            writer = new FileWriter(file, true);
            writer.write(type);
            writer.write(s);
            writer.write(ID);
            writer.write(s);
            writer.write(Description);
            writer.write(s);
            writer.write(cost);
            writer.write(s);
            writer.write(otime);
            writer.write(n);
            writer.flush();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void update(String type, String ID, String Description, int cost, int otime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
