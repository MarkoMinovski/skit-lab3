package com.skit;


public class VaccineDosageCalculator {

    public static double calculateDosage(int age, double weight, boolean isHighRisk, boolean hasAllergy) {

        if ((age > 65 || isHighRisk) && weight < 50 && !hasAllergy) {

            return weight * 0.8;

        } else {

            return weight * 1.2 + age * 0.1;

        }

    }

    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }
}