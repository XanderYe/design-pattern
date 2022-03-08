package cn.xanderye.creational.factoryMethod;

import cn.xanderye.creational.common.IFactory;
import cn.xanderye.creational.common.IProduct;
import cn.xanderye.creational.common.ProductB;

/**
 * @author XanderYe
 * @description:
 * @date 2022/2/22 19:14
 */
public class FactoryB implements IFactory {
    @Override
    public IProduct makeProduct() {
        return new ProductB();
    }
}
