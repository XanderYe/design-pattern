package cn.xanderye.creational.abstarctFactory;

import cn.xanderye.creational.common.IProduct;

/**
 * @author XanderYe
 * @description:
 * @date 2022/2/22 19:14
 */
public interface IFactory {
    IProductA makeProductA();
    IProductB makeProductB();
}
