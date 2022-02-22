package cn.xanderye.creational.factoryMethod;

/**
 * @author XanderYe
 * @description:
 * @date 2022/2/22 19:14
 */
public class FactoryC implements IFactory {
    @Override
    public IProduct makeProduct() {
        return new ProductC();
    }
}
