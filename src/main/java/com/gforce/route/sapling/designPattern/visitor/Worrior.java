package com.gforce.route.sapling.designPattern.visitor;

/**
 * @author tianyuan14
 * @create 2019/6/24 9:21 PM
 */
public class Worrior implements Element {

    public void tank(){
        System.out.println("Worrior begin tank");
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
