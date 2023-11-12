
public class NotArithmeticException {

    public static void main(String[] args) {
        // double型10.0をdoble型0.0で除算
        double a = 10.0 / 0.0; // この場合、例外が発生しない！

        // この下の出力は実行される！！
        System.out.println(a);
    }
}
