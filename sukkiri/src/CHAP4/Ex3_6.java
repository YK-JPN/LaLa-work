package CHAP4;
public class Ex3_6{
    public static void main(String[] args) {
        System.out.println("[数当てゲーム]");
        int ans=new java.util.Random().nextInt(10);
        // System.out.println("com:"+ans);
        for(int i=1;i<=5;i++){
            System.out.println("0～9の数字を入力してください");
            int num=new java.util.Scanner(System.in).nextInt();
            if(num==ans){
                System.out.println("アタリ！！！！！！！！！！！！");
                break;
            }else{// よくよく考えればそもそもここにelseは不要。
                System.out.println("チ　ガ　ウ　ヨ");
            }
        }
        System.out.println("ゲームを終了します");
    }
}