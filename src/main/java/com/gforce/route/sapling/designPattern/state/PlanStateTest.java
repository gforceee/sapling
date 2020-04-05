package com.gforce.route.sapling.designPattern.state;

/**
 * @author tianyuan14
 * @create 2019/10/7 4:36 PM
 */
public class PlanStateTest {
    public static void main(String[] args) {
        PlanContext planContext = new PlanContext();
        planContext.setPlanState(new InitState());
        planContext.closePlan();
        planContext.signPlan();
        planContext.signPlan();
        planContext.closePlan();
    }
}
