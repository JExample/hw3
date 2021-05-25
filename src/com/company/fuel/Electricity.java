package com.company.fuel;

/**
 * Электричество
 */
public class Electricity extends AbstractFuel {

    /**
     * Количество CO2 выделяемое при использовании дизельного топлива
     */
    private static final int ELECTRICITY_CARBON_EMISSION = 0;
    /**
     * Названия электрического топлва
     */
    private static final String ELECTRICITY_FUEL_NAME = "Электроэнергия";

    /**
     * Конструктор, который использует обязательный конструктор абстрактного класса
     */
    public Electricity() {
        super(ELECTRICITY_CARBON_EMISSION);
    }

    @Override
    public String getFuelName() {
        return ELECTRICITY_FUEL_NAME;
    }
}
