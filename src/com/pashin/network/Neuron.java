package com.pashin.network;

import java.util.ArrayList;

public abstract class Neuron {

    protected ArrayList<Double> weights;

    protected double inputValue;

    protected double outputValue;

    protected Neuron(int numberOfRelations) {
        weights = new ArrayList<>();
        for (int i = 0; i < numberOfRelations; i++) {
            weights.add(Math.random() / 10);
        }
    }

    protected void correctWeight() {
        // TODO: корректировка весов
    }

    public ArrayList<Double> getWeights() {
        return weights;
    }

    public double getInputValue() {
        return inputValue;
    }

    public void setInputValue(double inputValue) {
        this.inputValue = inputValue;
    }

    public double getOutputValue() {
        return outputValue;
    }

}