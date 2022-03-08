package cn.xanderye.creational.factoryMethod;

import cn.xanderye.creational.common.IFactory;
import cn.xanderye.creational.common.IProduct;
import cn.xanderye.creational.common.ProductC;

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
