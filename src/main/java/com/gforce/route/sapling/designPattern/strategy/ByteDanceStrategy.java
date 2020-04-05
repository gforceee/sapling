package com.gforce.route.sapling.designPattern.strategy;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author tianyuan14
 * @create 2019/7/30 9:09 PM
 */
public class ByteDanceStrategy implements Strategy {
    @Override
    public int increaseFans() {
        System.out.println("拍个视屏");
        return 1000;
    }

}
