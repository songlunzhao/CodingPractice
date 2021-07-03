package com.songlunzhao.leetcode.editor.en.common;

import java.util.Arrays;
import java.util.List;

public class PrintUtils <T>{
    public void print2DList(List<List<T>> input) {
        for(List<T> objects : input) {
            Object[] arr = objects.toArray();
            System.out.println(Arrays.deepToString(arr));
        }
    }
    public void printList(List<T> input) {
        Object[] arr = input.toArray();
        System.out.println(Arrays.deepToString(arr));
    }

    public void printArray(T[][] input) {
        System.out.println(Arrays.deepToString(input));
    }

    public static void printArray(Object[] input) {
        System.out.println(Arrays.deepToString(input));
    }

}
