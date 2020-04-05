package com.gforce.route.sapling.designPattern.state;

/**
 * @author tianyuan14
 * @create 2019/10/7 4:30 PM
 */
public class PlanContext {

    private PlanState planState;

    public PlanState getPlanState() {
        return planState;
    }

    public void setPlanState(PlanState planState) {
        this.planState = planState;
    }

    public void closePlan(){
        planState.closePlan(this);
    }

    public void signPlan(){
        planState.signPlan(this);
    }
}
