package to_ex3;
import java.util.Random;

public class main{
    public static void main(String[] args) {
        Random rnd=new Random();
        int r=rnd.nextInt(1);
        System.out.println("あなたは"+r+"歳ですね？");
    }
}