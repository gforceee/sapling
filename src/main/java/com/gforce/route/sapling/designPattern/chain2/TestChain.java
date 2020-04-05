package com.gforce.route.sapling.designPattern.chain2;

/**
 * @author tianyuan14
 * @create 2019/10/5 10:21 PM
 */
public class TestChain {
    public static void main(String[] args) {
        SeniorManager seniorManager = new SeniorManager();
        DeptManager deptManager = new DeptManager();
        seniorManager.setSuccessor(deptManager);

        seniorManager.handleRelaxRequest(4);
        seniorManager.handleRelaxRequest(2);
    }
}
