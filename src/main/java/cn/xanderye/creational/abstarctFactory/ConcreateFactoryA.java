package cn.xanderye.creational.abstarctFactory;

/**
 * @author XanderYe
 * @description:
 * @date 2022/3/8 18:55
 */
public class ConcreateFactoryA implements IFactory {
    @Override
    public IProductA makeProductA() {
        return new ConcreateProductAWithFamilyA();
    }

    @Override
    public IProductB makeProductB() {
        return new ConcreateProductBWithFamilyB();
    }
}
