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
        
        //test neural network
        Network testNetwork = new Network();
        double result = 0.0;
        
        double[] test = new double[]{2,3};
        result = testNetwork.feedForward(test);
        System.out.println(result);
        
        //test MSE loss
        double[] inputs = new double[]{1,0,0,1};
        double[] predictions = new double[]{0,0,0,0};
        
        System.out.println(testNetwork.calcLoss(inputs,predictions));
        
        

    }
    
}
