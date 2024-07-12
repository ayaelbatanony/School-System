/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;


import javax.swing.JOptionPane;


public class gpa {
    
    
    public gpa(){
      
        int num=41;//number of subjects
    double sum=0.0,s=0;
    for (int i=num;i>0;i--){
       
         String num1=JOptionPane.showInputDialog(" ");
         int g=Integer.parseInt(num1);
        s+=g;
        if (g >= 90)
            sum+= 4;
        else if (g>= 85)
            sum+= 3.7;
        else if (g>= 80)
            sum+= 3.3;
        else if (g>= 75)
            sum+= 3;
        else if (g >= 70)
            sum+= 2.7;
        else if (g >= 65)
            sum+= 2.4;
        else if (g>= 60)
            sum+= 2.2;
        else if (g>= 50)
            sum+= 2;
        else
            sum+= 0;
    }
    double GPAsum = (3 * sum) / (123);// divided by number of hours
     JOptionPane.showMessageDialog(null,"total GPA in this year: "+GPAsum);
     JOptionPane.showMessageDialog(null,(s/4100)*100);//divided by total of scors
    //JOptionPane.showMessageDialog(null,(GPAsum/4)*100);
    
    
    } 
    
}
