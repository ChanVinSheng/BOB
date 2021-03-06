package runningman;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RecordResults extends javax.swing.JFrame {

  private List<Runner> runnerList = new ArrayList<>();
  private List<Runner> finisherList;   
  private int currentPosition = 1;
  private Runner runner;

  public RecordResults() {
    this.finisherList = new ArrayList<>();
    initComponents();
    jtfCurrentPosition.setText("" + currentPosition);
    initializeList();
    jtfNumber.grabFocus();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jlblTitle = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jbtAdd = new javax.swing.JButton();
    jbtConfirm = new javax.swing.JButton();
    jtfName = new javax.swing.JTextField();
    jtfNumber = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jtfCurrentPosition = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    jtaResults = new javax.swing.JTextArea();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jlblTitle.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
    jlblTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jlblTitle.setText("Marathon Finishers");

    jLabel2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
    jLabel2.setText("Runner's name");

    jLabel3.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
    jLabel3.setText("Runner's number");

    jbtAdd.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
    jbtAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/runningman/image/runner.jpg"))); // NOI18N
    jbtAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jbtAddActionPerformed(evt);
      }
    });

    jbtConfirm.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
    jbtConfirm.setText("Confirm");
    jbtConfirm.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jbtConfirmActionPerformed(evt);
      }
    });

    jtfName.setEditable(false);
    jtfName.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N

    jtfNumber.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
    jtfNumber.setForeground(new java.awt.Color(0, 102, 255));
    jtfNumber.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jtfNumberActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
    jLabel1.setText("Finishing Position");

    jtfCurrentPosition.setEditable(false);
    jtfCurrentPosition.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N

    jtaResults.setColumns(20);
    jtaResults.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
    jtaResults.setRows(5);
    jScrollPane1.setViewportView(jtaResults);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jbtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 19, Short.MAX_VALUE))
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jtfNumber)
              .addComponent(jtfName)
              .addComponent(jtfCurrentPosition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jbtConfirm))
          .addComponent(jlblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(2, 2, 2))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jlblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jtfCurrentPosition))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jtfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jbtConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(99, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(jbtAdd)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddActionPerformed
  }//GEN-LAST:event_jbtAddActionPerformed

  private void jbtConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConfirmActionPerformed
    
      runner = new Runner(Integer.parseInt(jtfNumber.getText()));
      
      runner.setFinishPosition(currentPosition);
      runner.setName(jtfName.getText());
      jtfNumber.setText("");
    jtfName.setText("");
    jtfNumber.grabFocus();
    
    
    /********************************************/
    // Complete the code for this section:
       // 1. Update the finishing position for this runner
      jtfCurrentPosition.setText(""+ ++currentPosition);
      
      // 2. Add the current runner to the list of finishers
      finisherList.add(runner);
      // 3. Display the updated list of finishers
      jtaResults.setText(formatFinisherList());
      // 4. Update the current position textfield to show the next position

    
    /******************************************/
  }//GEN-LAST:event_jbtConfirmActionPerformed

  private void jtfNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumberActionPerformed
    int number = Integer.parseInt(jtfNumber.getText());
           
    /********************************************/
    // Complete the code for this section:
    // 1. Retrieve the entry for the runner with this number
    initializeList();
   for(int i=0;i<runnerList.size();i++){
        if(number==runnerList.get(i).getNumber()){
    
    // 2. Display the runner's name   
    
            jtfName.setText(runnerList.get(i).getName());
        }
    }
   
    
    /******************************************/
  }//GEN-LAST:event_jtfNumberActionPerformed
  
  /* This method reads from the binary file created by running Registration.java 
   * and populates runnerList with the Runner objects stored in runners.dat */
  private void initializeList() {
    try {
      ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("runners.dat"));
      runnerList = (ArrayList) (oiStream.readObject());
      oiStream.close();
      
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
  }

  /* This method formats the data fields of the Runner entries in finisherList.
   * It is to be invoked for obtaining a formatted output for display in the 
   * text area jtaResults */
  public String formatFinisherList() {
    String outputStr = "MARATHON RESULTS\n";
    for (int i = 0; i < finisherList.size(); ++i) {
      outputStr += (i + 1) + ". " + finisherList.get(i)+"\n";
    }
    return outputStr;
  }

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
      java.util.logging.Logger.getLogger(RecordResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(RecordResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(RecordResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(RecordResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new RecordResults().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton jbtAdd;
  private javax.swing.JButton jbtConfirm;
  private javax.swing.JLabel jlblTitle;
  private javax.swing.JTextArea jtaResults;
  private javax.swing.JTextField jtfCurrentPosition;
  private javax.swing.JTextField jtfName;
  private javax.swing.JTextField jtfNumber;
  // End of variables declaration//GEN-END:variables
}
