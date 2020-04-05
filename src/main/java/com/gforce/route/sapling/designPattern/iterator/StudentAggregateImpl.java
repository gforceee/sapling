package com.gforce.route.sapling.designPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianyuan14
 * @create 2019/11/3 9:01 PM
 */
public class StudentAggregateImpl implements StudentAggregate {
    private List<Student> list;

    public StudentAggregateImpl() {
        this.list = new ArrayList<Student>();
    }

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
