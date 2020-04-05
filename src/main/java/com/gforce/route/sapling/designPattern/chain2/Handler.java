package com.gforce.route.sapling.designPattern.chain2;

/**
 * @author tianyuan14
 * @create 2019/10/5 10:15 PM
 */
public abstract class Handler {
    /**
     * 持有下一个处理请求的对象
     */
    protected Handler successor = null;
    /**
     * 取值方法
     */
    public Handler getSuccessor() {
        return successor;
    }
    /**
     * 设置下一个处理请求的对象
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理休假的申请
     * @param day    休假天数
     */
    public abstract void handleRelaxRequest(int day);

}
