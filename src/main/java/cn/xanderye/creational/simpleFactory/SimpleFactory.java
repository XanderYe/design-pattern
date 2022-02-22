package cn.xanderye.creational.simpleFactory;

/**
 * @author XanderYe
 * @description:
 * @date 2022/2/22 19:06
 */
public class SimpleFactory {
    public static IProduct makeProduct(int kind) {
        switch (kind) {
            case Const.PRODUCT_A:
                return new ProductA();
            case Const.PRODUCT_B:
                return new ProductB();
            case Const.PRODUCT_C:
                return new ProductC();
        }
        return null;
    }
}
