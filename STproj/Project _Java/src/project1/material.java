/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;


import javax.swing.*;
import java.awt.*;



/**
 *
 * @author h p
 */
public class material extends JFrame{
    
    JPanel p;
    
    JLabel l1; JLabel l2; JLabel l3; JLabel l4;
    JLabel ll1;JLabel ll2; JLabel ll3; JLabel ll4;JLabel ll5;JLabel ll6; JLabel ll7; JLabel ll8;
    
    JCheckBox b1;JCheckBox b2;JCheckBox b3;JCheckBox b4;JCheckBox b5;JCheckBox b6;JCheckBox b7;JCheckBox b8;JCheckBox b9;
    JCheckBox b10;JCheckBox b11;JCheckBox b12;JCheckBox b13;JCheckBox b14;JCheckBox b15;JCheckBox b16;JCheckBox b17;
    JCheckBox b18; JCheckBox b19;JCheckBox b20;JCheckBox b21;JCheckBox b22;JCheckBox b23;JCheckBox b24;JCheckBox b25;
    JCheckBox bb1;JCheckBox bb2;JCheckBox bb3;JCheckBox bb4;JCheckBox bb5;JCheckBox bb6;JCheckBox bb7;JCheckBox bb8;JCheckBox bb9;
    JCheckBox bb10;JCheckBox bb11;JCheckBox bb12;JCheckBox bb13;JCheckBox bb14;JCheckBox bb15;JCheckBox bb16;JCheckBox bb17;
    JCheckBox bb18; JCheckBox bb19;JCheckBox bb20;JCheckBox bb21;JCheckBox bb22;JCheckBox bb23;JCheckBox bb24;JCheckBox bb25;
    
    
    JProgressBar pb1 ; JProgressBar pb2 ;  JProgressBar pb3 ;JProgressBar pb4 ;
    
    ButtonGroup bg;
    
    public material(){
        
        p= new JPanel();
        p.setLayout(null);
        this.add(p);
         
        l1=new JLabel(" FRIST YEAR "); l2=new JLabel(" SECOND YEAR ");l3=new JLabel(" THIRD YEAR ");l4=new JLabel(" FOURTH YEAR");
        ll1=new JLabel(" Frist term ");ll2=new JLabel(" Second term ");ll3=new JLabel("Frist term ");ll4=new JLabel(" Second term ");
        ll5=new JLabel(" Frist term ");ll6=new JLabel(" Second term ");ll7=new JLabel("Frist term ");ll8=new JLabel(" Second term ");
        
        b1=new JCheckBox(" مبادئ برمجه "); b2=new JCheckBox(" اشباه موصلات "); b3=new JCheckBox(" احصاء و احتمالات"); b4=new JCheckBox(" مقدمه الكترونيات "); b5=new JCheckBox( " اخلاقيات الحاسب "); b6=new JCheckBox(" حقوق الانسان");
        b7=new JCheckBox(" مبادئ إداره"); b8=new JCheckBox(" مقدمه في الحاسبات"); b9=new JCheckBox(" رياضيات _0"); b10=new JCheckBox(" رياضيات _1"); b11=new JCheckBox(" رياضيات_2"); b12=new JCheckBox(" نظم معلومات");
        b13=new JCheckBox(" برمجه _1"); b14=new JCheckBox(" تصميم مواقع الويب"); b15=new JCheckBox( " وسائط متعدده"); b16=new JCheckBox(" هياكل البيانات"); b17=new JCheckBox( " تحليل النظم"); b18=new JCheckBox(" مقدمه في بحوث العمليات");
        b19=new JCheckBox( " برمجه حاسبات _2"); b20=new JCheckBox(" نظم التشغيل"); b21=new JCheckBox("معماريه الحاسب"); b22=new JCheckBox("شبكات الحاسب_1"); b23=new JCheckBox(" النمذجه و المحاكاه"); b24=new JCheckBox(" النمذجه و المحاكاه");
        b25=new JCheckBox(" رياضيات _3");
        bb1=new JCheckBox(" مهارات التفاوض والاتصال"); bb2=new JCheckBox("التفكير الابداعى "); bb3=new JCheckBox("مقدمة الكترونيات"); bb4=new JCheckBox(" نظم وقواعد البيانات "); bb5=new JCheckBox( " اتنظيم الملفات "); bb6=new JCheckBox("برمجة منطقبة");
        bb7=new JCheckBox("طرق احصائية"); bb8=new JCheckBox(" ذكاء اصطناعى"); bb9=new JCheckBox("التشفير والامان"); bb10=new JCheckBox(" هندسة البرماجيات"); bb11=new JCheckBox(" برمجة العاب"); bb12=new JCheckBox("اتصال الانسان بالحاسب");
        bb13=new JCheckBox("النظم المتوازية"); bb14=new JCheckBox(" نظم تشغيل-2 "); bb15=new JCheckBox( " تعليم الاله"); bb16=new JCheckBox(" حاسبات الانترنت"); bb17=new JCheckBox( "برمجة لاسلكية"); bb18=new JCheckBox(" تعريب الحاسبات");
        bb19=new JCheckBox( " الذكاء المطور"); bb20=new JCheckBox("اتصال الانسان باحاسب "); bb21=new JCheckBox("برمجةحاسبات -3"); bb22=new JCheckBox("الكائنات الالية"); bb23=new JCheckBox(" الانظمة المطورة"); bb24=new JCheckBox(" بناء المترجمات");
        bb25=new JCheckBox("خورزمات تحليل الصور");
        bg=new ButtonGroup(); bg.add(b24);bg.add(b25);
  
        pb1=new JProgressBar();pb2=new JProgressBar();pb3=new JProgressBar();pb4=new JProgressBar();

p.add(pb1);p.add(pb2);p.add(pb3);p.add(pb4);p.setLayout( new GridLayout(2,3,5,20));
        pb1.setBackground( new Color (204,204,255));pb2.setBackground(new Color (204,204,255));pb3.setBackground(new Color (204,204,255));pb4.setBackground(new Color (204,204,255));
        
         
        
     pb1.add(l1);pb1.add(ll1); pb1.add(b1);pb1.add(b2); pb1.add(b3);pb1.add(b4);pb1.add(b5);pb1.add(b6);pb1.add(ll2);
     pb1.add(b8);pb1.add(b7);pb1.add(b9);pb1.add(b10);pb1.add(b11);pb1.add(b12);
     pb1.setLayout(null);
      l1.setFont(new Font("bold", 2, 20)); // NOI18N
      l1.setForeground(new Color(255, 255, 255));
      ll1.setFont(new Font("Times New Roman", 2, 16)); // NOI18N
      ll1.setForeground(new Color(255, 255, 255));
      ll2.setFont(new Font("Times New Roman", 2, 16)); // NOI18N
      ll2.setForeground(new Color(255, 255, 255));
     l1.setBounds(20,10,150, 50);ll1.setBounds(30,70, 100,35);b1.setBounds(150, 70, 150, 35);b2.setBounds(320, 70, 150, 35);b3.setBounds(490, 70, 150, 35);b4.setBounds(150,130, 150, 35);b5.setBounds(320, 130, 150, 35);b6.setBounds(490, 130, 150, 35);
      ll2.setBounds(30,200, 100,35);b7.setBounds(150, 200, 150, 35);b8.setBounds(320, 200, 150, 35);b9.setBounds(490, 200, 150, 35);b10.setBounds(150, 250, 150, 35);b11.setBounds(320, 250, 150, 35);b12.setBounds(490, 250, 150, 35);
    
    
    pb2.add(l2);pb2.add(ll3); pb2.add(b13);pb2.add(b14); pb2.add(b15);pb2.add(b16);pb2.add(b17);pb2.add(b18);pb2.add(ll4);
     pb2.add(b19);pb2.add(b20);pb2.add(b21);pb2.add(b22);pb2.add(b23);pb2.add(b24);
     pb2.setLayout(null);
      l2.setFont(new Font("bold", 2, 20)); // NOI18N
      l2.setForeground(new Color(255, 255, 255));
      ll3.setFont(new Font("Times New Roman", 2, 16)); // NOI18N
      ll3.setForeground(new Color(255, 255, 255));
      ll4.setFont(new Font("Times New Roman", 2, 16)); // NOI18N
      ll4.setForeground(new Color(255, 255, 255));
     l2.setBounds(20,10,150, 50);ll3.setBounds(30,70, 100,35);b13.setBounds(150, 70, 150, 35);b14.setBounds(320, 70, 150, 35);b15.setBounds(490, 70, 150, 35);b16.setBounds(150, 130, 150, 35);b17.setBounds(320, 130, 150, 35);b18.setBounds(490,130, 150, 35);
      ll4.setBounds(30,200, 100,35);b19.setBounds(150, 200, 150, 35);b20.setBounds(320, 200, 150, 35);b21.setBounds(490, 200, 150, 35);b22.setBounds(150, 250, 150, 35);b23.setBounds(320, 250, 150, 35);b24.setBounds(490, 250, 150, 35);
    
    pb3.add(l3);pb3.add(ll5); pb3.add(bb1);pb3.add(bb2); pb3.add(bb3);pb3.add(bb4);pb3.add(bb5);pb3.add(bb6);pb3.add(ll6);
     pb3.add(bb8);pb3.add(bb7);pb3.add(bb9);pb3.add(bb10);pb3.add(bb11);pb3.add(bb12);
     pb3.setLayout(null);
      l3.setFont(new Font("bold", 2, 20)); // NOI18N
      l3.setForeground(new Color(255, 255, 255));
      ll5.setFont(new Font("Times New Roman", 2, 16)); // NOI18N
      ll5.setForeground(new Color(255, 255, 255));
      ll6.setFont(new Font("Times New Roman", 2, 16)); // NOI18N
      ll6.setForeground(new Color(255, 255, 255));
     l3.setBounds(20,10,150, 50);ll5.setBounds(30,70, 100,35);bb1.setBounds(150, 70, 150, 35);bb2.setBounds(320, 70, 150, 35);bb3.setBounds(490, 70, 150, 35);bb4.setBounds(150, 130, 150, 35);bb5.setBounds(320, 130, 150, 35);bb6.setBounds(490, 130, 150, 35);
      ll6.setBounds(30,200, 100,35);bb7.setBounds(150, 200, 150, 35);bb8.setBounds(320, 200, 150, 35);bb9.setBounds(490, 200, 150, 35);bb10.setBounds(150, 250, 150, 35);bb11.setBounds(320, 250, 150, 35);bb12.setBounds(490, 250, 150, 35);
    
     pb4.add(l4);pb4.add(ll7); pb4.add(bb13);pb4.add(bb14); pb4.add(bb15);pb4.add(bb16);pb4.add(bb17);pb4.add(bb18);pb4.add(ll8);
     pb4.add(bb19);pb4.add(bb20);pb4.add(bb21);pb4.add(bb22);pb4.add(bb23);pb4.add(bb24);
     pb4.setLayout(null);
      l4.setFont(new Font("bold", 2, 20)); // NOI18N
l4.setForeground(new Color(255, 255, 255));
      ll7.setFont(new Font("Times New Roman", 2, 16)); // NOI18N
      ll7.setForeground(new Color(255, 255, 255));
      ll8.setFont(new Font("Times New Roman", 2, 16)); // NOI18N
      ll8.setForeground(new Color(255, 255, 255));

l4.setBounds(20,10,150, 50);ll7.setBounds(30,70, 100,35);bb13.setBounds(150, 70, 150, 35);bb14.setBounds(320, 70, 150, 35);bb15.setBounds(490, 70, 150, 35);bb16.setBounds(150, 130, 150, 35);bb17.setBounds(320, 130, 150, 35);bb18.setBounds(490, 130, 150, 35);
      ll8.setBounds(30,200, 100,35);bb19.setBounds(150, 200, 150, 35);bb20.setBounds(320, 200, 150, 35);bb21.setBounds(490, 200, 150, 35);bb22.setBounds(150, 250, 150, 35);bb23.setBounds(320, 250, 150, 35);bb24.setBounds(490, 250, 150, 35);
    
    }
    
}