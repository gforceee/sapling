package com.gforce.route.sapling.designPattern.strategy;

/**
 * @author tianyuan14
 * @create 2019/10/4 4:05 PM
 */
public class PayTest {
    public static final String TYPE_ALI = "ali";
    public static final String TYPE_WECHAT = "wechat";


    public static void main(String[] args) {
        PayContext aliPayContext = new PayContext(getPayStrategy(TYPE_ALI));
        aliPayContext.payMoney(100);

        PayContext weChatPayContext = new PayContext(getPayStrategy(TYPE_WECHAT));
        weChatPayContext.payMoney(200);
    }

    public static PayStrategy getPayStrategy(String type) {
        PayStrategy product = null;
        if (TYPE_ALI.equals(type)) {
            product = new AliPayStrategy();
        } else if (TYPE_WECHAT.equals(type)) {
            product = new WeChatPayStrategy();
        }
        return product;
    }
}
