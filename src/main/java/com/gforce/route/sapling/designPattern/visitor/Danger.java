package com.gforce.route.sapling.designPattern.visitor;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author tianyuan14
 * @create 2019/6/25 9:05 PM
 */
public class Danger {
    public static void main(String[] args) {
        Visitor visitor = new RankVisitor();
        List<Element> elements = Lists.newArrayList(new Worrior(), new Mage(), new Mage(),new Priest(), new Priest());
        for (Element element : elements){
            element.accept(visitor);

        }
    }
}
