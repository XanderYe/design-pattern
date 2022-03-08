package cn.xanderye.creational.abstarctFactory;

/**
 * @author XanderYe
 * @description:
 * @date 2022/3/8 18:55
 */
public class ConcreateFactoryB implements IFactory {
    @Override
    public IProductA makeProductA() {
        return new ConcreateProductAWithFamilyB();
    }

    @Override
    public IProductB makeProductB() {
        return new ConcreateProductBWithFamilyB();
    }
}
