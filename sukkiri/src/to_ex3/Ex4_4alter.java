package to_ex3;
public class Ex4_4alter{
    public static void main(String[] args) {
        // int[] numbers={3,4,9};
        int[] numbers=new int[2];
        numbers[0]=new java.util.Random().nextInt(9)+1;
        do {
            numbers[1]=new java.util.Random().nextInt(9)+1;
        }while(numbers[0]==numbers[1]);

        // 確認用:必要に応じコメントアウト推奨
        System.out.println(numbers[0]+" "+numbers[1]);
        // 確認用ここまで
        
        System.out.println("1桁の数字を入力してください。");
        int input =new java.util.Scanner(System.in).nextInt();
        String mes="";
        for(int i=0;i<numbers.length;i++){
            mes=(input==numbers[i])?"アタリ！！！！！！！！！！！！":"";
            System.out.print(mes);
        }
    }
}