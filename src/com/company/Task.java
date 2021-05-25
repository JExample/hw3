package com.company;

import com.company.fuel.AbstractFuel;
import com.company.fuel.Diesel;
import com.company.fuel.Electricity;

public class Task {

    /**
     * Задание 2
     * Написать программу (только одну из 3-х):
     *
     * (у вас такой нет)
     * 4) Содержащую иерархию топлива. Создать все виды топлива и определить, какие из них являются
     * безопасными для окружающей среды, а если они не безопасны, то показать количество выделяемого CO2.
     */
    public static void main(String[] args) {
        AbstractFuel[] fuels = new AbstractFuel[]{new Diesel(), new Electricity()};

        for (AbstractFuel fuel : fuels) {
            System.out.print(fuel.getFuelName());
            if (fuel.isEcoFriendly()) {
                System.out.println(" - безопасно для окружающей среды");
            } else {
                System.out.println(" - не безопасно для окрущающей среды, " + fuel.getCarbonEmission() + "% CO2");
            }
        }
    }
}
