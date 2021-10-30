package com.pashin.network;

import java.util.ArrayList;

public abstract class Layer<N extends Neuron> {

    protected ArrayList<N> listOfNeurons;

    protected int numberOfNeuronsInLayer;

    protected Layer(int numberOfNeuronsInLayer) {
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
        this.listOfNeurons = new ArrayList<>();
    }

    public ArrayList<N> getListOfNeurons() {
        return listOfNeurons;
    }

    public void setListOfNeurons(ArrayList<N> listOfNeurons) {
        this.listOfNeurons = listOfNeurons;
        this.numberOfNeuronsInLayer = listOfNeurons.size();
    }

    public int getNumberOfNeuronsInLayer() {
        return numberOfNeuronsInLayer;
    }

}