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
        Network testNetwork = new Network();
        double result = 0.0;
        
        double[] test = new double[]{2,3};
        result = testNetwork.feedForward(test);
        System.out.println(result);

    }
    
}
