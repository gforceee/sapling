package com.gforce.route.sapling.other;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * @author tianyuan14
 * @create 2019/6/28 2:14 PM
 */
public class MapTest {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        Map<Integer, List<Integer>> map = Maps.newHashMap();
        for (Integer i : list){
            if (map.containsKey(i)){
                map.get(i).add(i);
            }else {
                map.put(i, Lists.newArrayList(i));
            }
        }
        System.out.println(map.toString());

    }
}
