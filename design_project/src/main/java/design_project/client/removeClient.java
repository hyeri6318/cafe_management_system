/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 이재혁, 이혜리
 */
public class removeClient {
    String URL = null;
    String ID = null;
    
    public removeClient(String URL){
        this.URL=URL;
    }
    
    public void doRemove(){
           Scanner sc = new Scanner(System.in);
           
           System.out.print("아이디 : ");
           ID = sc.nextLine();
           
           remove();
    }
    
    public void remove(){
        try{
            String str;
            String[] array=null;
            
            BufferedReader is = new BufferedReader(new FileReader(URL));
            
            Path path = Paths.get(URL);
            
            Charset cs = StandardCharsets.UTF_8;
           
            ArrayList<String> list = new ArrayList<String>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);
            
            ArrayList<String> list_temp = new ArrayList<String>();
            ArrayList<String> name_list = new ArrayList<String>();
            ArrayList<String> id_list = new ArrayList<String>();
            ArrayList<String> pw_list = new ArrayList<String>();
            
            for(String i:list){
                array = i.split("\n");
                list_temp.add(array[0]);
            }
            
            for(String i: list_temp){
                String[] temp=i.split("/");
                
                name_list.add(temp[0]);
                id_list.add(temp[1]);
                pw_list.add(temp[2]);
            }
            
            int ch=-1; // 0이면 true, -1이면 false
            
            for(int i=0;i<id_list.size();i++){
                if(ID.equals(id_list.get(i))){
                    ch=0;
                    break;
                }
            }
            
            int end=-1; //0은 정상 삭제. -1은 정보가 없는경우
            
            if(ch==0){
                File file = new File(URL);
                FileWriter writer;
                writer = new FileWriter(file,false);
                
                for(int i=0;i<id_list.size();i++){
                    if(ID.equals(id_list.get(i))){
                        continue;
                    } else{
                        String s="/";
                        String n="\n";
                        writer.write(name_list.get(i));
                        writer.write(s);
                        writer.write(id_list.get(i));
                        writer.write(s);
                        writer.write(pw_list.get(i));
                        writer.write(n);
                        
                        writer.flush();
                    }
                }
                end=0;
                System.out.println("회원 탈퇴 성공\n");
            }
            
            if(end==-1){
                System.out.print("없는 정보 입니다.\n");
            }
                    
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}