package com.gforce.route.sapling.designPattern.state;

/**
 * @author tianyuan14
 * @create 2019/10/7 4:05 PM
 */
public interface PlanState {

    void signPlan(PlanContext planContext);


    void closePlan(PlanContext planContext);
}
