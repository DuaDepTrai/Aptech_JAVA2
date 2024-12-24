/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.E4;

import java.util.ArrayList;

/**
 *
 * @author DUADEPTRAI
 */

public class Group<T> {
    T items[]; // Mảng lưu các phần tử trong nhóm
    int num = 0; // Số phần tử hiện tại trong nhóm

    public Group(Class<T> dataType, int length) {
        this.items = (T[]) java.lang.reflect.Array.newInstance(dataType, length);
    }

    public void addItem(T t) {
        if (num < items.length) {
            items[num++] = t;
        } else {
            System.out.println("Nhóm đã đầy.");
        }
    }

    public T getItem(int index) {
        if (index >= 0 && index < num) {
            return items[index];
        }
        throw new IndexOutOfBoundsException("Index không hợp lệ.");
    }

    public int getNumberItems() {
        return num;
    }

    public static void main(String[] args) {
        Group<Integer> groupInt = new Group<>(Integer.class, 100);
        groupInt.addItem(10);
        groupInt.addItem(20);
        System.out.println("Phần tử tại index 0: " + groupInt.getItem(0));
        System.out.println("Số phần tử: " + groupInt.getNumberItems());

        Group<String> groupStr = new Group<>(String.class, 100);
        groupStr.addItem("Hello");
        groupStr.addItem("World");
        System.out.println("Phần tử tại index 1: " + groupStr.getItem(1));
        System.out.println("Số phần tử: " + groupStr.getNumberItems());
    }
    
    public static <T> boolean areArraysEqual(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}

