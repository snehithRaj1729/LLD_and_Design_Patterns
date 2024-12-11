package org.example;

import org.example.Adaptee.weighingMachineForBabiesImpl;
import org.example.Adapter.WeighingMachineAdapter;
import org.example.Adapter.weighingMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        //This is the client

        WeighingMachineAdapter weighingMachineAdapter = new weighingMachineAdapterImpl(new weighingMachineForBabiesImpl());
        System.out.println("Weight of baby is: "+ weighingMachineAdapter.weightInKilograms()+"Kgs");


    }
}