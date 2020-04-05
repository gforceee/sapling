package com.gforce.route.sapling.designPattern.iterator;

import java.util.LinkedList;

/**
 * @author tianyuan14
 * @create 2019/11/3 9:04 PM
 */
public class Test {
    public static void main(String[] args) {
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("张三", 1));
        studentAggregate.addStudent(new Student("李四", 2));
        studentAggregate.addStudent(new Student("王五", 3));
        studentAggregate.addStudent(new Student("赵六", 4));

        StudentIterator iterator = studentAggregate.getStudentIterator();
        while (iterator.hashNext()){
            Student student = iterator.next();
            student.count();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.iterator();
    }
}
