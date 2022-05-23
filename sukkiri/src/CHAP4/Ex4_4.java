package CHAP4;

public class Ex4_4{
    public static void main(String[] args) {
        int[] numbers={3,4,9};
        System.out.println("1桁の数字を入力してください。");
        int input =new java.util.Scanner(System.in).nextInt();
        String mes="";
        for(int i=0;i<numbers.length;i++){
            mes=(input==numbers[i])?"アタリ！！！！！！！！！！！！":"";
            System.out.print(mes);
        }
    }
}