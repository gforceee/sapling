package com.gforce.route.sapling.designPattern.visitor;

/**
 * @author tianyuan14
 * @create 2019/6/24 9:23 PM
 */
public class Mage implements Element{

    public void attack(){
        System.out.println("mega heal");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
