package com.gforce.route.sapling.designPattern.state;

/**
 * @author tianyuan14
 * @create 2019/10/7 4:26 PM
 */
public class InitState implements PlanState {
    @Override
    public void signPlan(PlanContext planContext) {
        System.out.println("签约方案成功");
        planContext.setPlanState(new EffectiveState());
    }

    @Override
    public void closePlan(PlanContext planContext) {
        System.out.println("未生效方案不能关闭");
    }
}
