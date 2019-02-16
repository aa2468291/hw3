package com.box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("Please enter object's length");
                float length = input.nextFloat();
                System.out.println("Please enter object's width");
                float width = input.nextFloat();
                System.out.println("Please enter object's height");
                float height = input.nextFloat();
                Box3 box3 = new Box3();
                Box5 box5 = new Box5();
                if (box3.validate(length,width,height)) {
                    System.out.println("應使用Box3的箱子");
                } else if (box5.validate(length,width,height)){
                    System.out.println("應使用Box5的箱子");
                } else {
                    System.out.println("尺寸太大，沒有可選的箱子");
                }

            }
        }


