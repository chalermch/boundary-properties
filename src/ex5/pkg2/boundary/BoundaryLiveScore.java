/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5.pkg2.boundary;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BoundaryLiveScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LiveScoreBean live = new LiveScoreBean();
        Subscriber sub = new Subscriber();
        Scanner in = new Scanner(System.in);
        live.addPropertyChangeListener(sub);
        live.addPropertyChangeListener(sub);
        while(true){
            System.out.print("Enter Score ");
            String score = in.nextLine();
            if(score.equals(""))break;
            live.setSomeData(score);
        }
        
    }
    
}
