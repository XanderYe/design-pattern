package cn.xanderye.creational.abstarctFactory;

/**
 * @author XanderYe
 * @description:
 * @date 2022/3/8 18:54
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new ConcreateFactoryA();
        factory.makeProductA();
        factory.makeProductB();

        factory = new ConcreateFactoryB();
        factory.makeProductA();
        factory.makeProductB();
    }
}
