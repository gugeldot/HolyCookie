package ProgramacionDistribuida.Cliente.INTERFAZ;

public class MenuCliente extends javax.swing.JFrame implements Runnable {

    public MenuCliente() {
        initComponents();
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setTitle("Fabrica Galletas -- Menu de Cliente Remoto "); // Asigna el título de la ventana

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Label_repostero1 = new javax.swing.JLabel();
        Label_repostero2 = new javax.swing.JLabel();
        Label_repostero3 = new javax.swing.JLabel();
        Label_repostero4 = new javax.swing.JLabel();
        Label_repostero5 = new javax.swing.JLabel();
        Label_horno1 = new javax.swing.JLabel();
        Label_horno2 = new javax.swing.JLabel();
        Label_horno3 = new javax.swing.JLabel();
        Label_almacen = new javax.swing.JLabel();
        Label_numGalletas = new javax.swing.JLabel();
        Label_numGalletas1 = new javax.swing.JLabel();
        Label_numGalletas2 = new javax.swing.JLabel();
        Label_numGalletas3 = new javax.swing.JLabel();
        Label_numGalletas4 = new javax.swing.JLabel();
        Label_numGalletas5 = new javax.swing.JLabel();
        barraH1 = new javax.swing.JProgressBar();
        barraH2 = new javax.swing.JProgressBar();
        barraH3 = new javax.swing.JProgressBar();
        estado_repostero = new javax.swing.JLabel();
        estado_repostero1 = new javax.swing.JLabel();
        estado_repostero2 = new javax.swing.JLabel();
        estado_repostero3 = new javax.swing.JLabel();
        estado_repostero4 = new javax.swing.JLabel();
        estado_repostero5 = new javax.swing.JLabel();
        estado_repostero6 = new javax.swing.JLabel();
        estado_repostero7 = new javax.swing.JLabel();
        estado_repostero8 = new javax.swing.JLabel();
        estado_repostero9 = new javax.swing.JLabel();
        estado_repostero10 = new javax.swing.JLabel();
        estado_repostero11 = new javax.swing.JLabel();
        estado_repostero12 = new javax.swing.JLabel();
        estado_repostero13 = new javax.swing.JLabel();
        estado_repostero14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 700));
        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_repostero1.setBackground(new java.awt.Color(0, 0, 0));
        Label_repostero1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_repostero1.setText("Repostero 1");
        jPanel1.add(Label_repostero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 36));

        Label_repostero2.setBackground(new java.awt.Color(0, 0, 0));
        Label_repostero2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_repostero2.setText("Repostero 2");
        jPanel1.add(Label_repostero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 36));

        Label_repostero3.setBackground(new java.awt.Color(0, 0, 0));
        Label_repostero3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_repostero3.setText("Repostero 3");
        jPanel1.add(Label_repostero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 36));

        Label_repostero4.setBackground(new java.awt.Color(0, 0, 0));
        Label_repostero4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_repostero4.setText("Repostero 4");
        jPanel1.add(Label_repostero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 36));

        Label_repostero5.setBackground(new java.awt.Color(0, 0, 0));
        Label_repostero5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_repostero5.setText("Repostero 5");
        jPanel1.add(Label_repostero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 36));

        Label_horno1.setBackground(new java.awt.Color(0, 0, 0));
        Label_horno1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_horno1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_horno1.setText("Horno 1");
        jPanel1.add(Label_horno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 36));

        Label_horno2.setBackground(new java.awt.Color(0, 0, 0));
        Label_horno2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_horno2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_horno2.setText("Horno 2");
        jPanel1.add(Label_horno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 36));

        Label_horno3.setBackground(new java.awt.Color(0, 0, 0));
        Label_horno3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_horno3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_horno3.setText("Horno 3");
        jPanel1.add(Label_horno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 36));

        Label_almacen.setBackground(new java.awt.Color(0, 0, 0));
        Label_almacen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_almacen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_almacen.setText("Almacen");
        jPanel1.add(Label_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 520, 95, 36));

        Label_numGalletas.setBackground(new java.awt.Color(0, 0, 0));
        Label_numGalletas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label_numGalletas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_numGalletas.setText("Galletas desperdiciadas");
        jPanel1.add(Label_numGalletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, 36));

        Label_numGalletas1.setBackground(new java.awt.Color(0, 0, 0));
        Label_numGalletas1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label_numGalletas1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_numGalletas1.setText("Galletas generadas");
        jPanel1.add(Label_numGalletas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 36));

        Label_numGalletas2.setBackground(new java.awt.Color(0, 0, 0));
        Label_numGalletas2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label_numGalletas2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_numGalletas2.setText("Galletas horneadas");
        jPanel1.add(Label_numGalletas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 266, -1, 36));

        Label_numGalletas3.setBackground(new java.awt.Color(0, 0, 0));
        Label_numGalletas3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label_numGalletas3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_numGalletas3.setText("Horneando");
        jPanel1.add(Label_numGalletas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 266, -1, 36));

        Label_numGalletas4.setBackground(new java.awt.Color(0, 0, 0));
        Label_numGalletas4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label_numGalletas4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_numGalletas4.setText("Galletas almacenadas");
        jPanel1.add(Label_numGalletas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, 36));

        Label_numGalletas5.setBackground(new java.awt.Color(0, 0, 0));
        Label_numGalletas5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label_numGalletas5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_numGalletas5.setText("Galletas consumidas");
        jPanel1.add(Label_numGalletas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, 36));

        barraH1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(barraH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, 20));

        barraH2.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(barraH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, 20));

        barraH3.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(barraH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, 20));

        estado_repostero.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero.setText("<ESTADO>");
        estado_repostero.setToolTipText("");
        estado_repostero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero.setOpaque(true);
        jPanel1.add(estado_repostero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 140, -1));

        estado_repostero1.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero1.setText("<ESTADO>");
        estado_repostero1.setToolTipText("");
        estado_repostero1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero1.setOpaque(true);
        jPanel1.add(estado_repostero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 160, -1));

        estado_repostero2.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero2.setText("<ESTADO>");
        estado_repostero2.setToolTipText("");
        estado_repostero2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero2.setOpaque(true);
        jPanel1.add(estado_repostero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 130, -1));

        estado_repostero3.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero3.setText("<ESTADO>");
        estado_repostero3.setToolTipText("");
        estado_repostero3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero3.setOpaque(true);
        jPanel1.add(estado_repostero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 130, -1));

        estado_repostero4.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero4.setText("<ESTADO>");
        estado_repostero4.setToolTipText("");
        estado_repostero4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero4.setOpaque(true);
        jPanel1.add(estado_repostero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 130, -1));

        estado_repostero5.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero5.setText("<ESTADO>");
        estado_repostero5.setToolTipText("");
        estado_repostero5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero5.setOpaque(true);
        jPanel1.add(estado_repostero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, -1));

        estado_repostero6.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero6.setText("<ESTADO>");
        estado_repostero6.setToolTipText("");
        estado_repostero6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero6.setOpaque(true);
        jPanel1.add(estado_repostero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 160, -1));

        estado_repostero7.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero7.setText("<ESTADO>");
        estado_repostero7.setToolTipText("");
        estado_repostero7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero7.setOpaque(true);
        jPanel1.add(estado_repostero7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 160, -1));

        estado_repostero8.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero8.setText("<ESTADO>");
        estado_repostero8.setToolTipText("");
        estado_repostero8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero8.setOpaque(true);
        jPanel1.add(estado_repostero8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 160, -1));

        estado_repostero9.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero9.setText("<ESTADO>");
        estado_repostero9.setToolTipText("");
        estado_repostero9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero9.setOpaque(true);
        jPanel1.add(estado_repostero9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 160, -1));

        estado_repostero10.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero10.setText("<ESTADO>");
        estado_repostero10.setToolTipText("");
        estado_repostero10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero10.setOpaque(true);
        jPanel1.add(estado_repostero10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 130, -1));

        estado_repostero11.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero11.setText("<ESTADO>");
        estado_repostero11.setToolTipText("");
        estado_repostero11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero11.setOpaque(true);
        jPanel1.add(estado_repostero11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 140, -1));

        estado_repostero12.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero12.setText("<ESTADO>");
        estado_repostero12.setToolTipText("");
        estado_repostero12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero12.setOpaque(true);
        jPanel1.add(estado_repostero12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 140, -1));

        estado_repostero13.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero13.setText("<ESTADO>");
        estado_repostero13.setToolTipText("");
        estado_repostero13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero13.setOpaque(true);
        jPanel1.add(estado_repostero13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 140, -1));

        estado_repostero14.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero14.setText("<ESTADO>");
        estado_repostero14.setToolTipText("");
        estado_repostero14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero14.setOpaque(true);
        jPanel1.add(estado_repostero14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuCliente().setVisible(true);
            }
        });
    }

    @Override
    public void run() {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_almacen;
    private javax.swing.JLabel Label_horno1;
    private javax.swing.JLabel Label_horno2;
    private javax.swing.JLabel Label_horno3;
    private javax.swing.JLabel Label_numGalletas;
    private javax.swing.JLabel Label_numGalletas1;
    private javax.swing.JLabel Label_numGalletas2;
    private javax.swing.JLabel Label_numGalletas3;
    private javax.swing.JLabel Label_numGalletas4;
    private javax.swing.JLabel Label_numGalletas5;
    private javax.swing.JLabel Label_repostero1;
    private javax.swing.JLabel Label_repostero2;
    private javax.swing.JLabel Label_repostero3;
    private javax.swing.JLabel Label_repostero4;
    private javax.swing.JLabel Label_repostero5;
    private javax.swing.JProgressBar barraH1;
    private javax.swing.JProgressBar barraH2;
    private javax.swing.JProgressBar barraH3;
    private javax.swing.JLabel estado_repostero;
    private javax.swing.JLabel estado_repostero1;
    private javax.swing.JLabel estado_repostero10;
    private javax.swing.JLabel estado_repostero11;
    private javax.swing.JLabel estado_repostero12;
    private javax.swing.JLabel estado_repostero13;
    private javax.swing.JLabel estado_repostero14;
    private javax.swing.JLabel estado_repostero2;
    private javax.swing.JLabel estado_repostero3;
    private javax.swing.JLabel estado_repostero4;
    private javax.swing.JLabel estado_repostero5;
    private javax.swing.JLabel estado_repostero6;
    private javax.swing.JLabel estado_repostero7;
    private javax.swing.JLabel estado_repostero8;
    private javax.swing.JLabel estado_repostero9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
