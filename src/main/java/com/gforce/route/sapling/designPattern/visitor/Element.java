package com.gforce.route.sapling.designPattern.visitor;

/**
 * @author tianyuan14
 * @create 2019/6/24 9:19 PM
 */
public interface Element {
    void accept(Visitor visitor);
}
