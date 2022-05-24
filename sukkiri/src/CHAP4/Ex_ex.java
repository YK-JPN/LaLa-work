package CHAP4;
// 文字入力の際の比較がしっかり機能するかを確認する


public class Ex_ex{
    public static void main(String[] args) {
        System.out.println("s1に入力:");
        String s1 =new java.util.Scanner(System.in).nextLine();
        System.out.println("s2に入力:");
        String s2 =new java.util.Scanner(System.in).nextLine();
        if(s1==s2){
            System.out.println("OK. Judged by \"==\"");
        }else if(s1.equals(s2)){
            System.out.println("OK. Judged by \".equals\"");
        }
        else{
            System.out.println("TOO BAD!!");
        }
    }
}