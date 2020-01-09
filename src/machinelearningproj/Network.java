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
    
    
    //Passes the results from two neurons into a third one 
    public double feedForward(double[] input) { 
        double[] combined = new double[2]; //Array with results from two neurons 
        combined[0] = n1.output(input); 
        combined[1] = n2.output(input);
        
     return nResult.output(combined); //Returns the result from the third neuron 
    }
   
    /*
        Calculates the mean squared error (MSE) loss
        Adds square of the difference between input and predicted
        input from each array entry to the total then divides the
        total by the number of entries
    */
    public double calcLoss(double[] inputs, double[] predictions){
        double result = 0.0;
        
        for(int i = 0; i < inputs.length; i++){
            result += Math.pow((inputs[i] - predictions[i]),2); 
        }
        result = result / inputs.length;
    return result;
    }
}
