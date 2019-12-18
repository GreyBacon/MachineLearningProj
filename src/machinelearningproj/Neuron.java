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
public class Neuron {
    double weight1 = 0; 
    double weight2 = 0;
    double bias = 0;
    
    //Sigmoid function narrows down input between 1 and 0
    public static double sigmoid(double x) {
        return (1 / (1 + Math.exp(-x)));
    }
    
    public void setBias(double bias){
        this.bias = bias;
    }
    public double getBias() {
        return bias;
    }
    public void setWeights(double weight1, double weight2) {
        this.weight1 = weight1;
        this.weight2 = weight2;
    }
    public double getWeightProd() {
        return weight1 * weight2;
    }
    
    public double output(double input1, double input2) {
        double result = 0.0;
        result = sigmoid((input1 * weight1) + (input2 * weight2) + bias); //Calculates both inputs weighted with a signmoid function
        
        return result;
    }
}