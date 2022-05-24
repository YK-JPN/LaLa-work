package to_ex3;
public class Ex2_1{
    public static void main(String[] args) {
        int x=5;
        int y=10;
        // String ans="x+yは、"+x+y;←これは誤り
        // 別解:z=x+y;の設定
        String ans="x+yは、"+(x+y);
        System.out.println(ans);
    }
}