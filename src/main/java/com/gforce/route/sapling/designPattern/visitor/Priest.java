package com.gforce.route.sapling.designPattern.visitor;

/**
 * @author tianyuan14
 * @create 2019/6/25 8:55 PM
 */
public class Priest implements Element{

    public void heal(){
        System.out.println("Priest heal");
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
