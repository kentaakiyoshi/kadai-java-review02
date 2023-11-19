package Clock;

public class Review02 {

    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            if(i%3==0&&i%5==0) {
                //3で割り切れ、かつ5で割り切れる場合
                System.out.println("FizzBuzz");
            }else if(i%3==0) {
                //3で割り切れる場合
                System.out.println("Fizz");
            }else if(i%5==0) {
                //5で割り切れる場合
                System.out.println("Fizz");
            }else {
                //それ以外の数
                System.out.println(i);
            }
        }
    }
}
