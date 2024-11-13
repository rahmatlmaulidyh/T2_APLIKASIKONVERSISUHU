package aplikasikonversisuhu;
import javax.swing.*;
import java.awt.event.*;

public class AplikasiKonversiSuhuFrame extends javax.swing.JFrame {

    public AplikasiKonversiSuhuFrame() {
               initComponents();
        
        // KeyAdapter untuk memastikan input hanya berupa angka
        suhuField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.') {
                    e.consume(); // Hanya menerima angka dan titik desimal
                }
            }
        });
        
        ButtonGroup group = new ButtonGroup();
        group.add(celciusRadioButton);
        group.add(fahrenheitRadioButton);
        group.add(kelvinRadioButton);
        group.add(reamurRadioButton);

        // ActionListener untuk tombol Convert
        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Ambil nilai suhu dari input
                    double inputTemperature = Double.parseDouble(suhuField.getText());
                    String selectedScale = (String) suhuComboBox.getSelectedItem();
                    double result = 0.0;

                    // Tentukan arah konversi berdasarkan RadioButton yang dipilih
                        if (selectedScale.equals("Celsius")) {
                            if (celciusRadioButton.isSelected()) {
                                result = celsiusToCelsius(inputTemperature);
                            } else if (fahrenheitRadioButton.isSelected()) {
                                result = celsiusToFahrenheit(inputTemperature);
                            } else if (kelvinRadioButton.isSelected()) {
                                result = celsiusToKelvin(inputTemperature);
                            } else if (reamurRadioButton.isSelected()) {
                                result = celsiusToReamur(inputTemperature);
                            }
                        } else if (selectedScale.equals("Fahrenheit")) {
                            if (celciusRadioButton.isSelected()) {
                                result = fahrenheitToCelsius(inputTemperature);
                            } else if (fahrenheitRadioButton.isSelected()) {
                                result = fahrenheitToFahrenheit(inputTemperature);
                            } else if (kelvinRadioButton.isSelected()) {
                                result = fahrenheitToKelvin(inputTemperature);
                            } else if (reamurRadioButton.isSelected()) {
                                result = fahrenheitToReamur(inputTemperature);
                            }
                        } else if (selectedScale.equals("Kelvin")) {
                            if (celciusRadioButton.isSelected()) {
                                result = kelvinToCelsius(inputTemperature);
                            } else if (fahrenheitRadioButton.isSelected()) {
                                result = kelvinToFahrenheit(inputTemperature);
                            } else if (kelvinRadioButton.isSelected()) {
                                result = kelvinToKelvin(inputTemperature);
                            } else if (reamurRadioButton.isSelected()) {
                                result = kelvinToReamur(inputTemperature);
                            }
                        } else if (selectedScale.equals("Reamur")) {
                            if (celciusRadioButton.isSelected()) {
                                result = reamurToCelsius(inputTemperature);
                            } else if (fahrenheitRadioButton.isSelected()) {
                                result = reamurToFahrenheit(inputTemperature);
                            } else if (kelvinRadioButton.isSelected()) {
                                result = reamurToKelvin(inputTemperature);
                            } else if (reamurRadioButton.isSelected()) {
                                result = reamurToReamur(inputTemperature);
                            }
                        }

                    // Tampilkan hasil konversi di label
                    hasil.setText("Hasil Konversi: " + result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    
    // Metode konversi suhu
    // Konversi dari celci
    private double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
    private double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    private double celsiusToReamur(double celsius) {
        return celsius * 4 / 5;
    }
    // Konversi dari faren
     private double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    private double fahrenheitToKelvin(double fahrenheit) {
       return (fahrenheit - 32) * 5 / 9 + 273.15;
   }
   private double fahrenheitToReamur(double fahrenheit) {
       return (fahrenheit - 32) * 4 / 9;
   }
   
        // Konversi dari Kelvin
     private double kelvinToCelsius(double kelvin) {
         return kelvin - 273.15;
     }

     private double kelvinToFahrenheit(double kelvin) {
         return (kelvin - 273.15) * 9 / 5 + 32;
     }

     private double kelvinToReamur(double kelvin) {
         return (kelvin - 273.15) * 4 / 5;
     }

     // Konversi dari Reamur
     private double reamurToCelsius(double reamur) {
         return reamur * 5 / 4;
     }

     private double reamurToFahrenheit(double reamur) {
         return reamur * 9 / 4 + 32;
     }

     private double reamurToKelvin(double reamur) {
         return reamur * 5 / 4 + 273.15;
     }

     // Menangani kasus konversi ke skala yang sama (mengembalikan nilai asli)
     private double celsiusToCelsius(double celsius) {
         return celsius;
     }

     private double fahrenheitToFahrenheit(double fahrenheit) {
         return fahrenheit;
     }

     private double kelvinToKelvin(double kelvin) {
         return kelvin;
     }

     private double reamurToReamur(double reamur) {
         return reamur;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        suhuField = new javax.swing.JTextField();
        suhuComboBox = new javax.swing.JComboBox<>();
        btnConvert = new javax.swing.JButton();
        celciusRadioButton = new javax.swing.JRadioButton();
        fahrenheitRadioButton = new javax.swing.JRadioButton();
        kelvinRadioButton = new javax.swing.JRadioButton();
        reamurRadioButton = new javax.swing.JRadioButton();
        hasil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Masukan Suhu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 7;
        jPanel1.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel1.add(suhuField, gridBagConstraints);

        suhuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Kelvin", "Fahrenheit", "Reamur" }));
        suhuComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suhuComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.ipady = 2;
        jPanel1.add(suhuComboBox, gridBagConstraints);

        btnConvert.setText("Konversi");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel1.add(btnConvert, gridBagConstraints);

        celciusRadioButton.setText("Celcius.");
        celciusRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celciusRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(celciusRadioButton, gridBagConstraints);

        fahrenheitRadioButton.setText("Fahrenheit.");
        fahrenheitRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fahrenheitRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel1.add(fahrenheitRadioButton, gridBagConstraints);

        kelvinRadioButton.setText("Kelvin.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel1.add(kelvinRadioButton, gridBagConstraints);

        reamurRadioButton.setText("Reamur.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        jPanel1.add(reamurRadioButton, gridBagConstraints);

        hasil.setText("Hasil :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        jPanel1.add(hasil, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void suhuComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suhuComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suhuComboBoxActionPerformed

    private void celciusRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celciusRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celciusRadioButtonActionPerformed

    private void fahrenheitRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fahrenheitRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fahrenheitRadioButtonActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConvertActionPerformed
 public static void main(String[] args) {
        // Membuat instance dari JFrame yang sudah diatur di designer
        SwingUtilities.invokeLater(() -> {
            AplikasiKonversiSuhuFrame frame = new AplikasiKonversiSuhuFrame();
            frame.setVisible(true);
        });
    }

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JRadioButton celciusRadioButton;
    private javax.swing.JRadioButton fahrenheitRadioButton;
    private javax.swing.JLabel hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton kelvinRadioButton;
    private javax.swing.JRadioButton reamurRadioButton;
    private javax.swing.JComboBox<String> suhuComboBox;
    private javax.swing.JTextField suhuField;
    // End of variables declaration//GEN-END:variables
}
