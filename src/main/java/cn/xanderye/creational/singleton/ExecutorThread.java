package cn.xanderye.creational.singleton;

/**
 * @author XanderYe
 * @description:
 * @date 2022/3/8 19:16
 */
public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
