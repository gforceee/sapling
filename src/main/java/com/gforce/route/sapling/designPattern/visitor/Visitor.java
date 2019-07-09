package com.gforce.route.sapling.designPattern.visitor;

/**
 * @author tianyuan14
 * @create 2019/6/24 9:11 PM
 */
public interface Visitor {
    void visit(Mage mega);

    void visit(Priest priest);

    void visit(Worrior worrior);
}
