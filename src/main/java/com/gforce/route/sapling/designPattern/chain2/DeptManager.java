package com.gforce.route.sapling.designPattern.chain2;

/**
 * @author tianyuan14
 * @create 2019/10/5 10:20 PM
 */
public class DeptManager extends Handler {
    @Override
    public void handleRelaxRequest(int day) {
        System.out.println("二级主管审批通过，天数" + day);
    }
}
