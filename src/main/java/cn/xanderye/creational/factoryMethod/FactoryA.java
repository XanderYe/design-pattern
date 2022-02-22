package cn.xanderye.creational.factoryMethod;

/**
 * @author XanderYe
 * @description:
 * @date 2022/2/22 19:14
 */
public class FactoryA implements IFactory {
    @Override
    public IProduct makeProduct() {
        return new ProductA();
    }
}
