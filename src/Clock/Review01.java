package Clock;

public class Review01 {

    public static void main(String[] args) {
        double productPrice = 1000; // 商品価格（例として1000円）

        // 消費税の計算
        double tax = tax(productPrice);

        // 税込価格の計算
        double totalPrice = productPrice + tax;

        // 結果の出力
        System.out.println("商品の価格：" + productPrice + "円");
        System.out.println("消費税：" + tax + "円");
        System.out.println("税込価格：" + totalPrice + "円");
    }

    /**
     * 商品価格に基づいて消費税を計算するメソッド
     *
     * @param price 商品価格
     * @return 消費税額
     */
    public static double tax(double price) {
        double taxRate = 0.10; // 消費税率（10%）
        return price * taxRate;

    }

}
