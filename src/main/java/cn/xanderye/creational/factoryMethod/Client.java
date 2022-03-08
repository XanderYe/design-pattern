package cn.xanderye.creational.factoryMethod;

import cn.xanderye.creational.common.IFactory;
import cn.xanderye.creational.common.IProduct;

/**
 * @author XanderYe
 * @description:
 * @date 2022/2/22 19:17
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new FactoryA();
        IProduct product = factory.makeProduct();
        product.doSomething();
    }
}
