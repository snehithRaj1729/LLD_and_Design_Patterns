package org.example.Adapter;

import org.example.Adaptee.WeighingMachine;

public class weighingMachineAdapterImpl implements WeighingMachineAdapter {
    private WeighingMachine weighingMachine;

    public weighingMachineAdapterImpl(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double weightInKilograms() {
        return weighingMachine.weightInPounds() * 0.45;
    }
}
