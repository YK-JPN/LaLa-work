package to_ex3;
public class Ex3_3{
    public static void main(String[] args) {
        int isHungry=0;
        // int isHungry=1;
        String food="soba";
        System.out.println("こんにちは！！！！！！！！！！！！");
         String mes =(isHungry == 0) ? "お腹がいっぱいです" : "はらぺこです";
        System.out.println(mes);
        if(isHungry==0){
            System.out.println("お腹がいっぱいです");
        }else if(isHungry==1){
            System.out.println("はらぺこです");
            System.out.println(food+"をいただきます");
        }
        System.out.println("ごちそうさまでした。");
    }
}