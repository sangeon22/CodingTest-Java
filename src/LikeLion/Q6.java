package LikeLion;

import java.util.Scanner;

public class Q6 {
    public static String[][] stack = new String[2][9999];
    public static int size = 0;


    public static void main(String[] args) {
        String sender = "";
        String text = "";
        int i = 1;

        System.out.println("명령어 하나를 선택하세요 : 등록, 조회, 종료");
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("명령어) ");
            sender = sc.next();
            try {
                if (sender.equals("등록")) {
                    System.out.print("제목 : ");
                    text = sc.nextLine();
                    registerTitle(text);

                    System.out.print("내용 : ");
                    text = sc.next();
                    registerSentence(text);
                    System.out.println("[알림] "+i+"번글이 등록되었습니다.");
                    i++;
                }else if(sender.equals("조회")){
                    System.out.println("번호 / 제목");
                    System.out.println("-------------------");
                    for(int j=size-1; j>=0; j--) {
                        try {
                            System.out.println((j+1)+" / "+stack[0][j]);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }else if(sender.equals("종료")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }else {
                    System.out.println("등록, 조회, 종료 중 하나만 선택해주세요.");
                }
            }catch(Exception e) {
                continue;
            }
        }
    }

    public static void registerTitle(String item) {
        stack[0][size] = item;
        size ++;
    }

    public static void registerSentence(String item) {
        stack[1][size] = item;
    }
}
