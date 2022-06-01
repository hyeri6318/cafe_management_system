/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_project.md;

import java.util.Scanner;

/**
 *
 * @author 이혜리
 */
public abstract class MD {
    Scanner sc = new Scanner(System.in);
    int response=0;

    protected wrapBehavior wrapbehavior;
    protected messageBehavior messagebehavior;
    String mdName = null;

    public abstract void cost();

    public abstract void exhibit();

    public void performMessage() {
        messagebehavior.message();
    }

    public void performWrap() {
        wrapbehavior.wrap();
    }

    public void setMessageBehavior(messageBehavior mb) {
        messagebehavior = mb;
    }

    public void setWrapBehavior(wrapBehavior wb) {
        wrapbehavior = wb;
    }

    public void buy() {
        boolean question1=true;
        
        while(question1){
            System.out.print("MD를 주문하시겠습니까?\n 1.예 2.아니오");
            response=sc.nextInt();
            
            if(response==1){
                System.out.print("MD를 주문합니다.");
                break;
            } else if(response==2){
                System.out.print("MD를 주문하지 않습니다.");
                question1=false;
            } else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
    
    public void md_buy(){
        boolean question2=true;
        System.out.print("주문할 MD를 선택해 주세요.\n 1.텀블러 2.다이어리 3.컵 4.티백");
        response=sc.nextInt();
        
        if(response==1){
            MD tumbler = new tumbler();
        } else if(response==2){
            MD diary = new diary();
        } else if(response==3){
            MD cup = new cup();
        } else if(response==4){
            MD teabag = new teabag();
        } else{
            System.out.println("잘못된 입력입니다.");
        }
    }
}
