package com.gforce.route.sapling.designPattern.visitor;

/**
 * @author tianyuan14
 * @create 2019/6/25 8:59 PM
 */
public class RankVisitor implements Visitor {
    @Override
    public void visit(Mage mega) {
        mega.attack();
    }

    @Override
    public void visit(Priest priest) {
        priest.heal();
    }

    @Override
    public void visit(Worrior worrior) {
        worrior.tank();
    }
}
