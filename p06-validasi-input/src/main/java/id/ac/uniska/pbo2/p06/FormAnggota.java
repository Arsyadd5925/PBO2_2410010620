/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.uniska.pbo2.p06;

import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author MSI SERIES
 */
public class FormAnggota extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormAnggota.class.getName());

    /**
     * Creates new form FormAnggota
     */
    public FormAnggota() {
        initComponents();
        
        judulLabel.putClientProperty("FlatLaf.styleClass", "h2");
    keteranganLabel.putClientProperty("FlatLaf.styleClass", "small");
    dataAnggotaLabel.putClientProperty("FlatLaf.styleClass", "h4");
    kontakLabel.putClientProperty("FlatLaf.styleClass", "h4");

    npmField.putClientProperty("JTextField.placeholderText", "Contoh: 2410010123");
    emailField.putClientProperty("JTextField.placeholderText", "nama@contoh.com");
    hpField.putClientProperty("JTextField.placeholderText", "08xxxxxxxxxx");

    for (javax.swing.JLabel pesan : java.util.List.of(
            npmPesanLabel,
            namaPesanLabel,
            prodiPesanLabel,
            emailPesanLabel,
            hpPesanLabel)) {

        pesan.putClientProperty("FlatLaf.styleClass", "small");
        pesan.setForeground(warnaKesalahan());
    }

    statusLabel.setForeground(warnaKesalahan());

    getRootPane().setDefaultButton(daftarButton);

    pack();
    setMinimumSize(getSize());
    setLocationRelativeTo(null);
    }
    
    private java.awt.Color warnaKesalahan() {
    if (com.formdev.flatlaf.FlatLaf.isLafDark()) {
        return new java.awt.Color(255, 120, 120);
    }

    return new java.awt.Color(190, 40, 40);
}
    
    private void tandai(
        javax.swing.JComponent komponen,
        javax.swing.JLabel labelPesan,
        String pesan) {

    if (pesan == null) {
    labelPesan.setText(" ");
    komponen.setBorder(null);
    komponen.setToolTipText(null);
} else {
    labelPesan.setText(pesan);
    komponen.setBorder(
            javax.swing.BorderFactory.createLineBorder(warnaKesalahan())
    );
    komponen.setToolTipText(pesan);
}
}
    
    private void periksaNpm() {
    String pesan = Validator.npm(npmField.getText());

    tandai(npmField, npmPesanLabel, pesan);
}
    
    private void periksaNama() {
    String pesan = Validator.nama(namaField.getText());
    tandai(namaField, namaPesanLabel, pesan);
}
    
    private void periksaProdi() {
    String prodi = (String) prodiCombo.getSelectedItem();
    String pesan = "Pilih program studi".equals(prodi)
            ? "Program studi wajib dipilih"
            : null;

    tandai(prodiCombo, prodiPesanLabel, pesan);
}
    
    private void periksaEmail() {
    String pesan = Validator.email(emailField.getText());
    tandai(emailField, emailPesanLabel, pesan);
}
    
    private void periksaHp() {
    String pesan = Validator.nomorHp(hpField.getText());
    tandai(hpField, hpPesanLabel, pesan);
}
    
    private void kosongkan() {
    npmField.setText("");
    namaField.setText("");
    prodiCombo.setSelectedIndex(0);

    jenisGroup.clearSelection();
    mahasiswaRadio.setSelected(true);

    emailField.setText("");
    hpField.setText("");
    alamatArea.setText("");

    setujuCheck.setSelected(false);

    npmPesanLabel.setText(" ");
    namaPesanLabel.setText(" ");
    prodiPesanLabel.setText(" ");
    emailPesanLabel.setText(" ");
    hpPesanLabel.setText(" ");

    statusLabel.setText(" ");
    npmField.setBorder(javax.swing.UIManager.getBorder("TextField.border"));
    namaField.setBorder(javax.swing.UIManager.getBorder("TextField.border"));
    prodiCombo.setBorder(javax.swing.UIManager.getBorder("ComboBox.border"));
    emailField.setBorder(javax.swing.UIManager.getBorder("TextField.border"));
    hpField.setBorder(javax.swing.UIManager.getBorder("TextField.border"));

    npmField.setToolTipText("Hanya angka, tepat 10 digit");
    namaField.setToolTipText(null);
    prodiCombo.setToolTipText(null);
    emailField.setToolTipText(null);
    hpField.setToolTipText(null);

    npmField.requestFocusInWindow();
}
    
    private void batal() {
    
    boolean adaIsi = !npmField.getText().isBlank()
            || !namaField.getText().isBlank()
            || prodiCombo.getSelectedIndex() != 0
            || !emailField.getText().isBlank()
            || !hpField.getText().isBlank()
            || !alamatArea.getText().isBlank();

    if (!adaIsi) {
        kosongkan();
        return;
    }

    int pilihan = javax.swing.JOptionPane.showConfirmDialog(
            this,
            "Apakah Anda yakin ingin menghapus semua isian?",
            "Konfirmasi",
            javax.swing.JOptionPane.YES_NO_OPTION
    );

    if (pilihan == javax.swing.JOptionPane.YES_OPTION) {
        kosongkan();
        statusLabel.setText("Form berhasil dikosongkan.");
    }
}
    
    private void daftar() {
    periksaNpm();
    periksaNama();
    periksaProdi();
    periksaEmail();
    periksaHp();
    
    int jumlahEror = 0;

if (!npmPesanLabel.getText().isBlank()) jumlahEror++;
if (!namaPesanLabel.getText().isBlank()) jumlahEror++;
if (!prodiPesanLabel.getText().isBlank()) jumlahEror++;
if (!emailPesanLabel.getText().isBlank()) jumlahEror++;
if (!hpPesanLabel.getText().isBlank()) jumlahEror++;

    if (npmPesanLabel.getText().isBlank()
            && namaPesanLabel.getText().isBlank()
            && prodiPesanLabel.getText().isBlank()
            && emailPesanLabel.getText().isBlank()
            && hpPesanLabel.getText().isBlank()) {

        statusLabel.setText("Pendaftaran berhasil diproses!");

        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Data anggota berhasil didaftarkan.",
                "Pendaftaran Berhasil",
                javax.swing.JOptionPane.INFORMATION_MESSAGE
        );

    } else {
        statusLabel.setText("Masih ada " + jumlahEror + " kesalahan. Periksa kembali isian Anda.");

        if (!npmPesanLabel.getText().isBlank()) {
            npmField.requestFocusInWindow();
        } else if (!namaPesanLabel.getText().isBlank()) {
            namaField.requestFocusInWindow();
        } else if (!prodiPesanLabel.getText().isBlank()) {
            prodiCombo.requestFocusInWindow();
        } else if (!emailPesanLabel.getText().isBlank()) {
            emailField.requestFocusInWindow();
        } else if (!hpPesanLabel.getText().isBlank()) {
            hpField.requestFocusInWindow();
        }
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jenisGroup = new javax.swing.ButtonGroup();
        headerPanel = new javax.swing.JPanel();
        judulLabel = new javax.swing.JLabel();
        keteranganLabel = new javax.swing.JLabel();
        isiPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        dataAnggotaLabel = new javax.swing.JLabel();
        npmLabel = new javax.swing.JLabel();
        npmField = new javax.swing.JTextField();
        npmPesanLabel = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        namaPesanLabel = new javax.swing.JLabel();
        prodiLabel = new javax.swing.JLabel();
        prodiCombo = new javax.swing.JComboBox<>();
        prodiPesanLabel = new javax.swing.JLabel();
        jenisLabel = new javax.swing.JLabel();
        jenisPanel = new javax.swing.JPanel();
        mahasiswaRadio = new javax.swing.JRadioButton();
        dosenRadio = new javax.swing.JRadioButton();
        umumRadio = new javax.swing.JRadioButton();
        kontakLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        emailPesanLabel = new javax.swing.JLabel();
        hpLabel = new javax.swing.JLabel();
        hpField = new javax.swing.JTextField();
        hpPesanLabel = new javax.swing.JLabel();
        alamatLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatArea = new javax.swing.JTextArea();
        setujuCheck = new javax.swing.JCheckBox();
        bawahPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        tombolPanel = new javax.swing.JPanel();
        batalButton = new javax.swing.JButton();
        daftarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pendaftaran Anggota Perpustakaan");

        headerPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 8, 16));
        headerPanel.setLayout(new javax.swing.BoxLayout(headerPanel, javax.swing.BoxLayout.Y_AXIS));

        judulLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        judulLabel.setText("Pendaftaran Anggota Perpustakaan");
        headerPanel.add(judulLabel);

        keteranganLabel.setText("Silakan isi data anggota dengan benar");
        headerPanel.add(keteranganLabel);

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        isiPanel.setLayout(new java.awt.BorderLayout());

        formPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 16, 8, 16));
        formPanel.setLayout(new java.awt.GridBagLayout());

        dataAnggotaLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dataAnggotaLabel.setText("Data Anggota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 0);
        formPanel.add(dataAnggotaLabel, gridBagConstraints);

        npmLabel.setDisplayedMnemonic('P');
        npmLabel.setLabelFor(npmField);
        npmLabel.setText("NPM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(npmLabel, gridBagConstraints);

        npmField.setToolTipText("Hanya angka, tepat 10 digit");
        npmField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                npmFieldFocusLost(evt);
            }
        });
        npmField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                npmFieldKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(npmField, gridBagConstraints);

        npmPesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        formPanel.add(npmPesanLabel, gridBagConstraints);

        namaLabel.setDisplayedMnemonic('N');
        namaLabel.setLabelFor(namaField);
        namaLabel.setText("Nama Lengkap");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(namaLabel, gridBagConstraints);

        namaField.setToolTipText("");
        namaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                namaFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(namaField, gridBagConstraints);

        namaPesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        formPanel.add(namaPesanLabel, gridBagConstraints);

        prodiLabel.setDisplayedMnemonic('R');
        prodiLabel.setLabelFor(prodiCombo);
        prodiLabel.setText("Program Studi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(prodiLabel, gridBagConstraints);

        prodiCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih program studi", "Teknik Informatika", "Sistem Informasi", "Manajemen Informatika" }));
        prodiCombo.addItemListener(this::prodiComboItemStateChanged);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(prodiCombo, gridBagConstraints);

        prodiPesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        formPanel.add(prodiPesanLabel, gridBagConstraints);

        jenisLabel.setDisplayedMnemonic('J');
        jenisLabel.setLabelFor(mahasiswaRadio);
        jenisLabel.setText("Jenis Anggota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(jenisLabel, gridBagConstraints);

        jenisPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 12, 5));

        jenisGroup.add(mahasiswaRadio);
        mahasiswaRadio.setMnemonic('M');
        mahasiswaRadio.setSelected(true);
        mahasiswaRadio.setText("Mahasiswa");
        jenisPanel.add(mahasiswaRadio);

        jenisGroup.add(dosenRadio);
        dosenRadio.setMnemonic('D');
        dosenRadio.setText("Dosen");
        jenisPanel.add(dosenRadio);

        jenisGroup.add(umumRadio);
        umumRadio.setMnemonic('U');
        umumRadio.setText("Umum");
        jenisPanel.add(umumRadio);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(jenisPanel, gridBagConstraints);

        kontakLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kontakLabel.setText("Kontak");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 6, 0);
        formPanel.add(kontakLabel, gridBagConstraints);

        emailLabel.setDisplayedMnemonic('E');
        emailLabel.setLabelFor(emailField);
        emailLabel.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(emailLabel, gridBagConstraints);

        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(emailField, gridBagConstraints);

        emailPesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        formPanel.add(emailPesanLabel, gridBagConstraints);

        hpLabel.setDisplayedMnemonic('H');
        hpLabel.setLabelFor(hpField);
        hpLabel.setText("Nomor HP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(hpLabel, gridBagConstraints);

        hpField.setToolTipText("");
        hpField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                hpFieldFocusLost(evt);
            }
        });
        hpField.addActionListener(this::hpFieldActionPerformed);
        hpField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hpFieldKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(hpField, gridBagConstraints);

        hpPesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        formPanel.add(hpPesanLabel, gridBagConstraints);

        alamatLabel.setDisplayedMnemonic('L');
        alamatLabel.setLabelFor(alamatArea);
        alamatLabel.setText("Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(alamatLabel, gridBagConstraints);

        alamatArea.setColumns(20);
        alamatArea.setRows(5);
        jScrollPane1.setViewportView(alamatArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(jScrollPane1, gridBagConstraints);

        setujuCheck.setMnemonic('T');
        setujuCheck.setText("Saya menyetujui ketentuan pendaftaran");
        setujuCheck.addItemListener(this::setujuCheckItemStateChanged);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 4, 0);
        formPanel.add(setujuCheck, gridBagConstraints);
        setujuCheck.getAccessibleContext().setAccessibleDescription("");

        isiPanel.add(formPanel, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(isiPanel, java.awt.BorderLayout.CENTER);

        bawahPanel.setLayout(new java.awt.BorderLayout());

        statusLabel.setText(" ");
        bawahPanel.add(statusLabel, java.awt.BorderLayout.CENTER);

        tombolPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 8, 0));

        batalButton.setMnemonic('B');
        batalButton.setText("Batal");
        batalButton.addActionListener(this::batalButtonActionPerformed);
        tombolPanel.add(batalButton);

        daftarButton.setText("Daftar");
        daftarButton.setEnabled(false);
        daftarButton.addActionListener(this::daftarButtonActionPerformed);
        tombolPanel.add(daftarButton);

        bawahPanel.add(tombolPanel, java.awt.BorderLayout.LINE_END);

        getContentPane().add(bawahPanel, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setujuCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_setujuCheckItemStateChanged
        // TODO add your handling code here:
        daftarButton.setEnabled(setujuCheck.isSelected());
    }//GEN-LAST:event_setujuCheckItemStateChanged

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        // TODO add your handling code here:
        daftar();
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void npmFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npmFieldKeyTyped
        // TODO add your handling code here:
        
        boolean penuh = npmField.getText().length() >= 10
        && npmField.getSelectedText() == null;

if (!Character.isDigit(evt.getKeyChar()) || penuh) {
    evt.consume();
    }
    }//GEN-LAST:event_npmFieldKeyTyped

    private void npmFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_npmFieldFocusLost
        // TODO add your handling code here:
        if (!npmField.getText().isBlank()) {
        periksaNpm();
    }
    }//GEN-LAST:event_npmFieldFocusLost

    private void namaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaFieldFocusLost
        // TODO add your handling code here:
        if (!namaField.getText().isBlank()) {
        periksaNama();
    }
    }//GEN-LAST:event_namaFieldFocusLost

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        // TODO add your handling code here:
        if (!emailField.getText().isBlank()) {
        periksaEmail();
    }
    }//GEN-LAST:event_emailFieldFocusLost

    private void hpFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hpFieldFocusLost
        // TODO add your handling code here:
        if (!hpField.getText().isBlank()) {
        periksaHp();
    }
    }//GEN-LAST:event_hpFieldFocusLost

    private void prodiComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_prodiComboItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
        periksaProdi();
    }
    }//GEN-LAST:event_prodiComboItemStateChanged

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        // TODO add your handling code here:
        batal();
    }//GEN-LAST:event_batalButtonActionPerformed

    private void hpFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hpFieldActionPerformed

    private void hpFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hpFieldKeyTyped
        // TODO add your handling code here:
        boolean penuh = hpField.getText().length() >= 13
            && hpField.getSelectedText() == null;

    if (!Character.isDigit(evt.getKeyChar()) || penuh) {
        evt.consume();
    }
    }//GEN-LAST:event_hpFieldKeyTyped
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormAnggota().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatArea;
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JButton batalButton;
    private javax.swing.JPanel bawahPanel;
    private javax.swing.JButton daftarButton;
    private javax.swing.JLabel dataAnggotaLabel;
    private javax.swing.JRadioButton dosenRadio;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailPesanLabel;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JTextField hpField;
    private javax.swing.JLabel hpLabel;
    private javax.swing.JLabel hpPesanLabel;
    private javax.swing.JPanel isiPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jenisGroup;
    private javax.swing.JLabel jenisLabel;
    private javax.swing.JPanel jenisPanel;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel keteranganLabel;
    private javax.swing.JLabel kontakLabel;
    private javax.swing.JRadioButton mahasiswaRadio;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel namaPesanLabel;
    private javax.swing.JTextField npmField;
    private javax.swing.JLabel npmLabel;
    private javax.swing.JLabel npmPesanLabel;
    private javax.swing.JComboBox<String> prodiCombo;
    private javax.swing.JLabel prodiLabel;
    private javax.swing.JLabel prodiPesanLabel;
    private javax.swing.JCheckBox setujuCheck;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel tombolPanel;
    private javax.swing.JRadioButton umumRadio;
    // End of variables declaration//GEN-END:variables
}
