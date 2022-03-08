package cn.xanderye.creational.abstarctFactory;

/**
 * @author XanderYe
 * @description:
 * @date 2022/3/8 18:50
 */
public class ConcreateProductAWithFamilyA implements IProductA {
    @Override
    public void doA() {
        System.out.println("The ProductA be part of FamilyA");
    }
}
