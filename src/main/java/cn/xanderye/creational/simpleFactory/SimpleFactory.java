package cn.xanderye.creational.simpleFactory;

import cn.xanderye.creational.common.IProduct;
import cn.xanderye.creational.common.ProductA;
import cn.xanderye.creational.common.ProductB;
import cn.xanderye.creational.common.ProductC;

/**
 * @author XanderYe
 * @description:
 * @date 2022/2/22 19:06
 */
public class SimpleFactory {
    public static IProduct makeProduct(int kind) {
        switch (kind) {
            case Const.PRODUCT_A:
                return new ProductA();
            case Const.PRODUCT_B:
                return new ProductB();
            case Const.PRODUCT_C:
                return new ProductC();
        }
        return null;
    }
}
