package cn.xanderye.creational.abstarctFactory;

/**
 * @author XanderYe
 * @description:
 * @date 2022/3/8 18:50
 */
public class ConcreateProductBWithFamilyA implements IProductB {
    @Override
    public void doB() {
        System.out.println("The ProductB be part of FamilyA");
    }
}
