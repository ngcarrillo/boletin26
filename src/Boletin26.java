
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Boletin26 extends javax.swing.JFrame {

    /**
     * Creates new form Boletin26
     */
    public Boletin26() {
        initComponents();
        setLocationRelativeTo(null);
        
       
    }

   public void elegirNum(int num){
       int num = num;
       this.num = num;
       
      
       ArrayList<Integer> numeros = new ArrayList<Integer>();              
        for(int i = 0; i <6; i++){
            numeros.add(num);              
        }    
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        n1 = new javax.swing.JToggleButton();
        n2 = new javax.swing.JToggleButton();
        n3 = new javax.swing.JToggleButton();
        n4 = new javax.swing.JToggleButton();
        n5 = new javax.swing.JToggleButton();
        n6 = new javax.swing.JToggleButton();
        n7 = new javax.swing.JToggleButton();
        n14 = new javax.swing.JToggleButton();
        n12 = new javax.swing.JToggleButton();
        n13 = new javax.swing.JToggleButton();
        n10 = new javax.swing.JToggleButton();
        n11 = new javax.swing.JToggleButton();
        n9 = new javax.swing.JToggleButton();
        n8 = new javax.swing.JToggleButton();
        n15 = new javax.swing.JToggleButton();
        n16 = new javax.swing.JToggleButton();
        n17 = new javax.swing.JToggleButton();
        n18 = new javax.swing.JToggleButton();
        n19 = new javax.swing.JToggleButton();
        n20 = new javax.swing.JToggleButton();
        n21 = new javax.swing.JToggleButton();
        n22 = new javax.swing.JToggleButton();
        n23 = new javax.swing.JToggleButton();
        n24 = new javax.swing.JToggleButton();
        n25 = new javax.swing.JToggleButton();
        n26 = new javax.swing.JToggleButton();
        n27 = new javax.swing.JToggleButton();
        n28 = new javax.swing.JToggleButton();
        n29 = new javax.swing.JToggleButton();
        n30 = new javax.swing.JToggleButton();
        n31 = new javax.swing.JToggleButton();
        n32 = new javax.swing.JToggleButton();
        n33 = new javax.swing.JToggleButton();
        n34 = new javax.swing.JToggleButton();
        n35 = new javax.swing.JToggleButton();
        n36 = new javax.swing.JToggleButton();
        n37 = new javax.swing.JToggleButton();
        n38 = new javax.swing.JToggleButton();
        n39 = new javax.swing.JToggleButton();
        n40 = new javax.swing.JToggleButton();
        n41 = new javax.swing.JToggleButton();
        n42 = new javax.swing.JToggleButton();
        n43 = new javax.swing.JToggleButton();
        n44 = new javax.swing.JToggleButton();
        n45 = new javax.swing.JToggleButton();
        n46 = new javax.swing.JToggleButton();
        n47 = new javax.swing.JToggleButton();
        n48 = new javax.swing.JToggleButton();
        n49 = new javax.swing.JToggleButton();
        jugar = new javax.swing.JButton();
        nElegidos = new javax.swing.JPanel();
        numElegido = new javax.swing.JTextField();
        nPremiados = new javax.swing.JPanel();
        nPremiado = new javax.swing.JTextField();
        nAciertos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bonoloto");

        n1.setText("1");
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        n2.setText("2");

        n3.setText("3");

        n4.setText("4");

        n5.setText("5");

        n6.setText("6");

        n7.setText("7");

        n14.setText("14");

        n12.setText("12");

        n13.setText("13");

        n10.setText("10");

        n11.setText("11");

        n9.setText("9");

        n8.setText("8");

        n15.setText("15");

        n16.setText("16");

        n17.setText("17");

        n18.setText("18");

        n19.setText("19");

        n20.setText("20");

        n21.setText("21");

        n22.setText("22");

        n23.setText("23");

        n24.setText("24");

        n25.setText("25");

        n26.setText("26");

        n27.setText("27");

        n28.setText("28");

        n29.setText("29");

        n30.setText("30");

        n31.setText("31");

        n32.setText("32");

        n33.setText("33");

        n34.setText("34");

        n35.setText("35");

        n36.setText("36");

        n37.setText("37");

        n38.setText("38");

        n39.setText("39");

        n40.setText("40");

        n41.setText("41");

        n42.setText("42");

        n43.setText("43");

        n44.setText("44");

        n45.setText("45");

        n46.setText("46");

        n47.setText("47");

        n48.setText("48");

        n49.setText("49");

        jugar.setText("Jugar");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });

        nElegidos.setBorder(javax.swing.BorderFactory.createTitledBorder("NUMEROS ELEGIDOS"));

        javax.swing.GroupLayout nElegidosLayout = new javax.swing.GroupLayout(nElegidos);
        nElegidos.setLayout(nElegidosLayout);
        nElegidosLayout.setHorizontalGroup(
            nElegidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(numElegido)
        );
        nElegidosLayout.setVerticalGroup(
            nElegidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(numElegido, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        nPremiados.setBorder(javax.swing.BorderFactory.createTitledBorder("NUMEROS PREMIADOS"));

        nPremiado.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        nPremiado.setToolTipText("");

        javax.swing.GroupLayout nPremiadosLayout = new javax.swing.GroupLayout(nPremiados);
        nPremiados.setLayout(nPremiadosLayout);
        nPremiadosLayout.setHorizontalGroup(
            nPremiadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nPremiadosLayout.createSequentialGroup()
                .addComponent(nPremiado, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );
        nPremiadosLayout.setVerticalGroup(
            nPremiadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nPremiado, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        nAciertos.setBorder(javax.swing.BorderFactory.createTitledBorder("NUMERO DE ACIERTOS"));

        javax.swing.GroupLayout nAciertosLayout = new javax.swing.GroupLayout(nAciertos);
        nAciertos.setLayout(nAciertosLayout);
        nAciertosLayout.setHorizontalGroup(
            nAciertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );
        nAciertosLayout.setVerticalGroup(
            nAciertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(n8)
                                            .addGap(30, 30, 30))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(n15)
                                            .addGap(22, 22, 22)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(n22)
                                        .addGap(22, 22, 22)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(n9)
                                    .addComponent(n16)
                                    .addComponent(n23)
                                    .addComponent(n2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n29)
                                .addGap(18, 18, 18)
                                .addComponent(n30))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n36)
                                .addGap(18, 18, 18)
                                .addComponent(n37))
                            .addComponent(n1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jugar)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(n43)
                                    .addGap(18, 18, 18)
                                    .addComponent(n44))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n10)
                            .addComponent(n17)
                            .addComponent(n24)
                            .addComponent(n31)
                            .addComponent(n3)
                            .addComponent(n38)
                            .addComponent(n45))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n11)
                            .addComponent(n18)
                            .addComponent(n25)
                            .addComponent(n32)
                            .addComponent(n4)
                            .addComponent(n39)
                            .addComponent(n46))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(n12)
                                    .addComponent(n19)
                                    .addComponent(n26)
                                    .addComponent(n33)
                                    .addComponent(n5))
                                .addComponent(n40))
                            .addComponent(n47))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n13)
                            .addComponent(n20)
                            .addComponent(n27)
                            .addComponent(n34)
                            .addComponent(n6)
                            .addComponent(n41)
                            .addComponent(n48))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n49)
                            .addComponent(n42)
                            .addComponent(n7)
                            .addComponent(n35)
                            .addComponent(n28)
                            .addComponent(n21)
                            .addComponent(n14)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nElegidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nPremiados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addComponent(nAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nElegidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nPremiados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(nAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n1)
                    .addComponent(n2)
                    .addComponent(n3)
                    .addComponent(n4)
                    .addComponent(n5)
                    .addComponent(n6)
                    .addComponent(n7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n8)
                    .addComponent(n9)
                    .addComponent(n10)
                    .addComponent(n11)
                    .addComponent(n12)
                    .addComponent(n13)
                    .addComponent(n14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n15)
                    .addComponent(n16)
                    .addComponent(n17)
                    .addComponent(n18)
                    .addComponent(n19)
                    .addComponent(n20)
                    .addComponent(n21))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n22)
                    .addComponent(n23)
                    .addComponent(n24)
                    .addComponent(n25)
                    .addComponent(n26)
                    .addComponent(n27)
                    .addComponent(n28))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n29)
                    .addComponent(n30)
                    .addComponent(n31)
                    .addComponent(n32)
                    .addComponent(n33)
                    .addComponent(n34)
                    .addComponent(n35))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n36)
                    .addComponent(n37)
                    .addComponent(n38)
                    .addComponent(n39)
                    .addComponent(n40)
                    .addComponent(n41)
                    .addComponent(n42))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n43)
                    .addComponent(n44)
                    .addComponent(n45)
                    .addComponent(n46)
                    .addComponent(n47)
                    .addComponent(n48)
                    .addComponent(n49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jugar)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        // TODO add your handling code here:
      
        int num = 0;
        int repetir = 0;
        int premiado[] = new int[6];
        for (int i=0; i<premiado.length; i++){
            do{
                for (int j=0; j<premiado.length; j++){
                    num = (int)(Math.random()*(49) + 1);
                        if (num == premiado[j]){
                            repetir = 1;
                            break;
                        }else{
                        repetir = 0;}
                        
                }        
                    premiado[i]= num;
            }while(repetir == 1);

        }
        String numPremiados = "";
        for(int i=0; i<premiado.length; i++){
            numPremiados = numPremiados + " "+ premiado[i];
        }
        nPremiado.setText(numPremiados);
        
        
            
       
       
    }//GEN-LAST:event_jugarActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
       int num = 1;
       elegirNum(num);
        
        
    }//GEN-LAST:event_n1ActionPerformed

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
            java.util.logging.Logger.getLogger(Boletin26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boletin26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boletin26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boletin26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boletin26().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jugar;
    private javax.swing.JToggleButton n1;
    private javax.swing.JToggleButton n10;
    private javax.swing.JToggleButton n11;
    private javax.swing.JToggleButton n12;
    private javax.swing.JToggleButton n13;
    private javax.swing.JToggleButton n14;
    private javax.swing.JToggleButton n15;
    private javax.swing.JToggleButton n16;
    private javax.swing.JToggleButton n17;
    private javax.swing.JToggleButton n18;
    private javax.swing.JToggleButton n19;
    private javax.swing.JToggleButton n2;
    private javax.swing.JToggleButton n20;
    private javax.swing.JToggleButton n21;
    private javax.swing.JToggleButton n22;
    private javax.swing.JToggleButton n23;
    private javax.swing.JToggleButton n24;
    private javax.swing.JToggleButton n25;
    private javax.swing.JToggleButton n26;
    private javax.swing.JToggleButton n27;
    private javax.swing.JToggleButton n28;
    private javax.swing.JToggleButton n29;
    private javax.swing.JToggleButton n3;
    private javax.swing.JToggleButton n30;
    private javax.swing.JToggleButton n31;
    private javax.swing.JToggleButton n32;
    private javax.swing.JToggleButton n33;
    private javax.swing.JToggleButton n34;
    private javax.swing.JToggleButton n35;
    private javax.swing.JToggleButton n36;
    private javax.swing.JToggleButton n37;
    private javax.swing.JToggleButton n38;
    private javax.swing.JToggleButton n39;
    private javax.swing.JToggleButton n4;
    private javax.swing.JToggleButton n40;
    private javax.swing.JToggleButton n41;
    private javax.swing.JToggleButton n42;
    private javax.swing.JToggleButton n43;
    private javax.swing.JToggleButton n44;
    private javax.swing.JToggleButton n45;
    private javax.swing.JToggleButton n46;
    private javax.swing.JToggleButton n47;
    private javax.swing.JToggleButton n48;
    private javax.swing.JToggleButton n49;
    private javax.swing.JToggleButton n5;
    private javax.swing.JToggleButton n6;
    private javax.swing.JToggleButton n7;
    private javax.swing.JToggleButton n8;
    private javax.swing.JToggleButton n9;
    private javax.swing.JPanel nAciertos;
    private javax.swing.JPanel nElegidos;
    private javax.swing.JTextField nPremiado;
    private javax.swing.JPanel nPremiados;
    private javax.swing.JTextField numElegido;
    // End of variables declaration//GEN-END:variables
}
