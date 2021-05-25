package com.company.fuel;

/**
 * Дизельное топливо
 */
public class Diesel extends AbstractFuel {

    /**
     * Количество CO2 выделяемое при использовании дизельного топлива
     */
    private static final int DIESEL_FUEL_CARBON_EMISSION = 100;
    /**
     * Наименование дизельного топлива
     */
    private static final String DIESEL_FUEL_NAME = "Солярка";

    /**
     * Конструктор, который использует обязательный конструктор абстрактного класса
     */
    public Diesel() {
        super(DIESEL_FUEL_CARBON_EMISSION);
    }

    @Override
    public String getFuelName() {
        return DIESEL_FUEL_NAME;
    }
}
