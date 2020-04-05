package com.gforce.route.sapling.designPattern.strategy;

/**
 * @author tianyuan14
 * @create 2019/10/4 4:35 PM
 */
public class PayTestWithoutStrategy {

    public static final String TYPE_ALI = "ali";
    public static final String TYPE_WECHAT = "wechat";

    public static void main(String[] args) {
        String input = "ali";
        if (TYPE_ALI.equals(input)) {
            //支付宝处理逻辑
        } else if (TYPE_WECHAT.equals(input)) {
            //微信处理逻辑
        }else {
            //其他处理逻辑
        }
    }
}
