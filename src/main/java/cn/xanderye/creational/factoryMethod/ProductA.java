package cn.xanderye.creational.factoryMethod;

/**
 * @author XanderYe
 * @description:
 * @date 2022/2/22 19:07
 */
public class ProductA implements IProduct {
    @Override
    public void doSomething() {
        System.out.println("I am Product A.");
    }
}
