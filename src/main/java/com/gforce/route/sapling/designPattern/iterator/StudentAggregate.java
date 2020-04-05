package com.gforce.route.sapling.designPattern.iterator;

/**
 * @author tianyuan14
 * @create 2019/11/3 9:01 PM
 */
public interface StudentAggregate {
    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
