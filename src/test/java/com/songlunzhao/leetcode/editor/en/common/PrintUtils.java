package com.songlunzhao.leetcode.editor.en.common;

import java.util.Arrays;
import java.util.List;

public class PrintUtils <T>{
    public static void print2DStringList(List<List<String>> input) {
        for(List<String> objects : input) {
            Object[] arr = objects.toArray();
            System.out.println(Arrays.deepToString(arr));
        }
    }
    public void print2DList(List<List<T>> input) {
        for(List<T> objects : input) {
            Object[] arr = objects.toArray();
            System.out.println(Arrays.deepToString(arr));
        }
    }

    public static void print2DIntegerList(List<List<Integer>> input) {
        for(List<Integer> objects : input) {
            Object[] arr = objects.toArray();
            System.out.println(Arrays.deepToString(arr));
        }
    }

    public static void printList(List<Integer> input) {
        Object[] arr = input.toArray();
        System.out.println(Arrays.deepToString(arr));
    }
    public static void print2DArray(int[][] input) {
        System.out.println(Arrays.deepToString(input));
    }

    public static void printArray(Object[] input) {
        System.out.println(Arrays.deepToString(input));
    }
    public static void printArray(int[] input) {
        System.out.println(Arrays.deepToString(Arrays.asList(input).toArray()));
    }

}
