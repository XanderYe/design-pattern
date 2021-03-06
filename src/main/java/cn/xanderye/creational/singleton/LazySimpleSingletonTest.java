package cn.xanderye.creational.singleton;

/**
 * @author XanderYe
 * @description:
 * @date 2022/3/8 19:15
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
