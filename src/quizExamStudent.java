import Project.ConnectionProvider;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patan
 */
public class quizExamStudent extends javax.swing.JFrame {
    public String questionId="1";
    public int questionIdTemp;
    public String answer;
    public int min=0;
    public int sec=0;
    public int marks=0;
    public int i=0;
    public String QuestionNo1;
    public boolean flag=true;
    public boolean flagNew=true;
    public String rollNo1;
    Timer time;
    
    //int[] myAnswer=new int[Integer.parseInt(QuestionNo1)];
    //ArrayList<String> list = new ArrayList<String>(); 
    
    public void answerCheck()
    {
        String studentAnswer="";
        if(jRadioButton1.isSelected())
        {
            studentAnswer=jRadioButton1.getText();
        }
        else if(jRadioButton2.isSelected())
        {
            studentAnswer=jRadioButton2.getText();
        }
        else if(jRadioButton3.isSelected())
        {
            studentAnswer=jRadioButton3.getText();
        }
        else if(jRadioButton4.isSelected())
        {
            studentAnswer=jRadioButton4.getText();
        }
        else
        {
            studentAnswer="";
        }
        if(studentAnswer.equals(answer))
        {
            marks=marks+1;
            String marks1=String.valueOf(marks);
            jLabel19.setText(marks1);
            
            
            
        }/*
        if(flag)
        {
            flagNew=true;
            if(studentAnswer.equals(jRadioButton1.getText()))
                {
                    list.add(i,"1");
                    i++;
                }
            else if(studentAnswer.equals(jRadioButton2.getText()))
                {
                    list.add(i,"2");
                    i++;
                }
            else if(studentAnswer.equals(jRadioButton3.getText()))
            {
                list. add(i,"3");
                i++;
            }
            else if(studentAnswer.equals(jRadioButton4.getText()))
            {
                list. add(i,"4");
                i++;
            }
            else
            {
                list.add(i,"5");
                i++;
            }
        }
        else if(!flag)
        {
            if(studentAnswer.equals(jRadioButton1.getText()))
                {
                    list.set(i,"1");
                    i++;
                    flag=true;
                }
            else if(studentAnswer.equals(jRadioButton2.getText()))
                {
                    list.set(i,"2");
                    i++;
                    flag=true;
                }
            else if(studentAnswer.equals(jRadioButton3.getText()))
            {
                list. set(i,"3");
                i++;
                flag=true;
            }
            else if(studentAnswer.equals(jRadioButton4.getText()))
            {
                list. set(i,"4");
                i++;
                flag=true;
            }
            else
            {
                list.set(i, "5");
                i++;
                flag=true;
            }
        }
        //question number change*/
        
        int questionId1=Integer.parseInt(questionId);
        questionId1=questionId1+1; 
        questionId=String.valueOf(questionId1);
        /*
        if(questionId1>1)
        {
            jButton3.setVisible(true);
        }*/
        /*
        if(flagNew)
        {
            newQuestionOption();
        }*/
        newQuestionOption();
        //clear jRadioButton
        /*
        */
        
        //last question
        
        if(questionId.equals(QuestionNo1))
        {
            jButton1.setVisible(false);
        }
    }
    public void newQuestionOption()
    {
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
    }
    public void question()
    {
        /*
        if(questionId.equals("1"))
        {
            jButton3.setVisible(false);
        }
        if(!questionId.equals("1"))
        {
            jButton3.setVisible(true);
        }
        if(!questionId.equals(QuestionNo1))
        {
            jButton1.setVisible(true);
        }*/
        try {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            
            ResultSet rs1=st.executeQuery("SELECT * FROM question WHERE id="+questionId);
            while(rs1.next())
            {
                jLabel17.setText(rs1.getString(1));
                jLabel20.setText(rs1.getString(2));
                jRadioButton1.setText(rs1.getString(3));
                jRadioButton2.setText(rs1.getString(4));
                jRadioButton3.setText(rs1.getString(5));
                jRadioButton4.setText(rs1.getString(6));
                answer=rs1.getString(7);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            
        }
    }
    /*
    public void backQuestion()
    {
        if(questionId.equals("1"))
        {
            jButton3.setVisible(false);
        }
        else
        {
            //jButton3.setVisible(true);
            int questionId1=Integer.parseInt(questionId);
            questionId1=questionId1-1; 
            questionId=String.valueOf(questionId1);
            /*
            if(jRadioButton1.isSelected())
            {
                jRadioButton1.setSelected(true);
            }
            else if(jRadioButton2.isSelected())
            {
                jRadioButton2.setSelected(true);
            }
            else if(jRadioButton3.isSelected())
            {
                jRadioButton3.setSelected(true);
            }
            else if(jRadioButton4.isSelected())
            {
                jRadioButton4.setSelected(true);
            }*/
            /*
            i--;
            flagNew=false;
            question();
            flag=false;
            if(list.get(i).toString().equals("1"))
            {
                jRadioButton1.setSelected(true);
                jRadioButton3.setSelected(false);
                jRadioButton4.setSelected(false);
                jRadioButton2.setSelected(false);
            }
            else if(list.get(i).toString().equals("2"))
            {
                jRadioButton2.setSelected(true);
                jRadioButton1.setSelected(false);
                jRadioButton3.setSelected(false);
                jRadioButton4.setSelected(false);
            }
            else if(list.get(i).toString().equals("3"))
            {
                jRadioButton3.setSelected(true);
                jRadioButton1.setSelected(false);
                jRadioButton2.setSelected(false);
                jRadioButton4.setSelected(false);
            }
            else if(list.get(i).toString().equals("4"))
            {
                jRadioButton4.setSelected(true);
                jRadioButton2.setSelected(false);
                jRadioButton1.setSelected(false);
                jRadioButton3.setSelected(false);
            }
            else if(list.get(i).toString().equals("5"))
            {
                jRadioButton4.setSelected(false);
                jRadioButton2.setSelected(false);
                jRadioButton1.setSelected(false);
                jRadioButton3.setSelected(false);
            }
            //answerCheck();
        }
    }*/
    public void submit()
    {
        String rollNo=jLabel11.getText();
        answerCheck();
        try {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            //st.executeUpdate("UPDATE student SET marks="+marks+" WHERE rollNo="+rollNo);
            st.executeUpdate("update student set marks='"+marks+"' where rollNo='"+rollNo+"'");
            String marks1=String.valueOf(marks);
            //JOptionPane.showMessageDialog(null,marks1);
            setVisible(false);
            new successfullySubmited(marks1,QuestionNo1,rollNo1).setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Creates new form quizExamStudent
     */
    public quizExamStudent() {
        initComponents();
    }
    
    public quizExamStudent(String rollNo,String QuestionNo) {
        initComponents();
        jLabel11.setText(rollNo);
        //jLabel15.setText(QuestionNo);
        jLabel15.setText(QuestionNo);
        jLabel6.setText(QuestionNo+" min");
        QuestionNo1=QuestionNo;
        rollNo1=rollNo;
        //jButton3.setVisible(false);
        
        //date
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        jLabel4.setText(dFormat.format(date));
        
        //first question and student details
        
        try {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM student WHERE rollNo='"+rollNo+"'");
            while(rs.next())
            {
                jLabel13.setText(rs.getString("name"));
            }
            ResultSet rs1=st.executeQuery("SELECT * FROM question WHERE id="+questionId);
            while(rs1.next())
            {
                jLabel17.setText(rs1.getString(1));
                jLabel20.setText(rs1.getString(2));
                jRadioButton1.setText(rs1.getString(3));
                jRadioButton2.setText(rs1.getString(4));
                jRadioButton3.setText(rs1.getString(5));
                jRadioButton4.setText(rs1.getString(6));
                answer=rs1.getString(7);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            
        }
        
        //time program
        setLocationRelativeTo(this);
        time=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel9.setText(String.valueOf(sec));
                jLabel8.setText(String.valueOf(min));
                
                if(sec==60)
                    {
                        sec=0;
                        if(min<10)
                            {
                                jLabel8.setText("0"+min);
                                min++;
                            }
                        else
                        {
                            min++;
                        }
                        if(min==(Integer.valueOf(QuestionNo1)))
                            {
                                time.stop();
                                answerCheck();
                                submit();
                            }
                    }
                else
                {
                    if(sec<10)
                        {
                            jLabel9.setText("0"+sec);
                            sec++;
                            if(min<10)
                            {
                                jLabel8.setText("0"+min);
                            }
                            else
                            {
                                jLabel8.setText(String.valueOf(min));
                            }
                        }
                    else
                    {
                        sec++;
                        if(min<10)
                            {
                                jLabel8.setText("0"+min);
                            }
                            else
                            {
                                jLabel8.setText(String.valueOf(min));
                            }
                    }
                }
            }
        });
        time.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel10.setText("Roll Number : ");

        jLabel11.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel11.setText("100000");

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel12.setText("Name : ");

        jLabel13.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel13.setText("Nachiket Patange");

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel14.setText("Total Question :");

        jLabel15.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel15.setText("10");

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel16.setText("Question Number:");

        jLabel17.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel17.setText("00");

        jLabel18.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel18.setText("Your Marks : ");

        jLabel19.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel19.setText("00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 410, 410));

        jLabel20.setFont(new java.awt.Font("Cambria", 1, 26)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Question Demo ?");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 153, -1, -1));

        jRadioButton1.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 247, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 346, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 443, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 541, -1, -1));

        jButton1.setBackground(new java.awt.Color(122, 38, 69));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Next.png"))); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 661, -1, -1));

        jButton2.setBackground(new java.awt.Color(122, 38, 69));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 660, -1, -1));

        jLabel4.setBackground(new java.awt.Color(122, 38, 69));
        jLabel4.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        jLabel3.setBackground(new java.awt.Color(122, 38, 69));
        jLabel3.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Time Taken : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("00");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("10 min");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Time : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("00");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentIcon.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel21.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText(":");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1248, 49, 10, -1));

        kGradientPanel1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setInheritsPopupMenu(true);
        kGradientPanel1.setkEndColor(new java.awt.Color(51, 2, 11));
        kGradientPanel1.setkStartColor(new java.awt.Color(240, 192, 180));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel2.setText("Welcome");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addContainerGap(1072, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(684, Short.MAX_VALUE))
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        answerCheck();
        question();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to Submit","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            answerCheck();
            submit();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected())
        {
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected())
        {
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton3.isSelected())
        {
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton4.isSelected())
        {
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(quizExamStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quizExamStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quizExamStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quizExamStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quizExamStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
