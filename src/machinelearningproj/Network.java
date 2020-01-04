/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinelearningproj;

/**
 *
 * @author Ken Wood
 */
public class Network {
    Neuron n1 = new Neuron();       //Set of two neurons used for processing result
    Neuron n2 = new Neuron();
    Neuron nResult = new Neuron();  //Neuron using results from other neurons
    
    public Network(){
        n1.setBias(0);
        n1.setWeights(0, 1);
        n2.setBias(0);
        n2.setWeights(0, 1);
        nResult.setBias(0);
        nResult.setWeights(0, 1);
        
    }
    
    
    public double feedForward(double[] input) {
        double[] combined = new double[2]; //Array with results from two neurons 
        combined[0] = n1.output(input); 
        combined[1] = n2.output(input);
        
     return nResult.output(combined);   
    }
    
    
}
