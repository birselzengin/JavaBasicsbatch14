package com.styntax.class8J;

public class WhileLoopDemo1 {

    public static void main(String[] args) {

        int time = 10;

        if (time < 12) {
            System.out.println("good morning inside if statement");
        }

        /* infinite loop
         * 
         * while (time < 12) {
         * 
         * System.out.println("good morning"); }
         */

        while (time < 12) {
            System.out.println("good morning inside while loop");
            time++;
        }

    }

﻿}