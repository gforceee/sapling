package com.gforce.route.sapling.designPattern.state;

/**
 * @author tianyuan14
 * @create 2019/10/7 4:28 PM
 */
public class EffectiveState implements PlanState {
    @Override
    public void signPlan(PlanContext planContext) {
        System.out.println("不能重复生效");
    }

    @Override
    public void closePlan(PlanContext planContext) {
        System.out.println("关闭成功");
    }
}
