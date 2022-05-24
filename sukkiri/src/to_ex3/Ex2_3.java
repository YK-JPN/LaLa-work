package to_ex3;
import java.util.Random;
import java.util.Scanner;

public class Ex2_3{
    public static void main(String[] args) {
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");
        String name=new java.util.Scanner(System.in).nextLine();
        
        System.out.println("あなたの年齢を入力してください");
        String ageString=new java.util.Scanner(System.in).nextLine();
        int age=Integer.parseInt(ageString);
        int fortune=new Random().nextInt(4);// ここの書き方が何かおかしい、
        // というかScannerとの記述方法の統一がなされていなくて兎に角変。
        fortune++;

        System.out.println("占いの結果が出ました！");
        System.out.println(age+"歳の"+name+"さん、あなたの運気番号は"+fortune+"です！");
        System.out.println("1:大吉　2:中吉　3:吉　4:凶");
    }
}