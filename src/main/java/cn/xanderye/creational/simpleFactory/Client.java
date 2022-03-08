package cn.xanderye.creational.simpleFactory;

import cn.xanderye.creational.common.IProduct;

/**
 * @author XanderYe
 * @description:
 * @date 2022/2/22 19:10
 */
public class Client {
    public static void main(String[] args) {
        IProduct product = SimpleFactory.makeProduct(1);
        if (product != null) {
            product.doSomething();
        } else {
            System.out.println("Can't find a product.");
        }
    }
}
