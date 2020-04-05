package com.gforce.route.sapling.designPattern.iterator;


import java.util.List;

/**
 * @author tianyuan14
 * @create 2019/11/3 9:03 PM
 */
public class StudentIteratorImpl implements StudentIterator {
    private List<Student> list;
    private int position = 0;
    private Student currentStudent;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hashNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        currentStudent = list.get(position);
        position++;
        return currentStudent;
    }


}
