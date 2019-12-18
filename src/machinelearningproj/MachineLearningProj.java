/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinelearningproj;

/**
 *
 * @author 
 */
public class MachineLearningProj {
    
    public static void main(String[] args) {
        /* sigmoid testing
        double randNumber = 0;
        for(int i=1; i<100; i++) {
            randNumber = Math.random() * 1000 - 500;
            System.out.println(randNumber + " - " + sigmoid(randNumber));
        }
        */
        Neuron testNeuron = new Neuron();
        testNeuron.setBias(4);
        testNeuron.setWeights(0,1);
        
        /*test functions
        System.out.println("bias: " + testNeuron.getBias());
        System.out.println("weight1: " + testNeuron.getWeightProd());
        System.out.println("output: " + testNeuron.output(2,3));
        */

    }
    
}
