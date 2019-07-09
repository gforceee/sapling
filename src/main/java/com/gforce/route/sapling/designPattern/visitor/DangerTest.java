package com.gforce.route.sapling.designPattern.visitor;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author tianyuan14
 * @create 2019/6/26 9:24 PM
 */
public class DangerTest {
    public static void main(String[] args) {
        List<Element> elements = Lists.newArrayList(new Worrior(), new Mage(), new Mage(),new Mage(), new Priest());
        for (Element element : elements){
            if (element instanceof Worrior){
               ((Worrior) element).tank();
            }else if (element instanceof Mage){
                ((Mage) element).attack();
            }else if (element instanceof Priest){
                ((Priest) element).heal();
            }
        }
    }
}
