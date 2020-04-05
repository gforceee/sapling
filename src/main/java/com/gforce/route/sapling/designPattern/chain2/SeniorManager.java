package com.gforce.route.sapling.designPattern.chain2;

/**
 * @author tianyuan14
 * @create 2019/10/5 10:17 PM
 */
public class SeniorManager extends Handler {

    @Override
    public void handleRelaxRequest(int day) {
        if (day <= 3){
            System.out.println("一级主管审批通过，天数" + day);
            return;
        }
        getSuccessor().handleRelaxRequest(day);
    }
}
