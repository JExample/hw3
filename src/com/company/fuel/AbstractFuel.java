package com.company.fuel;

/**
 * Класс, описывающий абстрактное топливо
 */
public abstract class AbstractFuel {

    /**
     * Колическтво выделяемого CO2
     */
    private final int carbonEmission;

    /**
     * Обязательный конструктор абстрактного класса
     *
     * @param carbonEmission колическтво выделяемого CO2
     */
    protected AbstractFuel(int carbonEmission) {
        this.carbonEmission = carbonEmission;
    }

    /**
     * Получить количество выделяемого CO2
     *
     * @return количество выделяемого CO2
     */
    public int getCarbonEmission() {
        return carbonEmission;
    }

    /**
     * Метод для получения наименования топлива
     *
     * @return наименование топлива
     */
    public abstract String getFuelName();

    /**
     * Узнать, является ли топлово экологичным (не выделяет CO2)
     */
    public boolean isEcoFriendly() {
        return carbonEmission == 0;
    }
}
