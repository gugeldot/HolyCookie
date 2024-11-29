package ClienteRMI.GUI;

import RMI.FabricaGalletasRemote;

import java.awt.Color;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JProgressBar;

public class MenuCliente extends javax.swing.JFrame implements Runnable {

    private FabricaGalletasRemote fabrica;
    private boolean toggle1 = false;
    private boolean toggle2 = false;
    private boolean toggle3 = false;
    private boolean toggle4 = false;
    private boolean toggle5 = false;

    public MenuCliente(FabricaGalletasRemote fabrica) {
        initComponents();
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setTitle("Fabrica Galletas -- Menu de Cliente Remoto "); // Asigna el título de la ventana
        this.fabrica = fabrica;

    }

    private void toggleButton(JButton boton, boolean toggle) {
        if (toggle) {
            boton.setText("RESUME");
            boton.setBackground(Color.red); // Cambiar el fondo a rojo
            boton.setForeground(Color.white);
        } else {
            boton.setText("PARAR");
            boton.setForeground(Color.black);
            boton.setBackground(new Color(204, 204, 204)); // Volver al color original  
        }
    }

    private void toggleAction(boolean toggle, int indiceRep) throws RemoteException {
        if (toggle) { // Parar
            fabrica.parar(indiceRep);
        } else { // Resume 
            fabrica.reanudar(indiceRep);
        }
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
        Label_galletasDesperdicio = new javax.swing.JLabel();
        Label_galletasGen = new javax.swing.JLabel();
        Label_galletasHorneadas = new javax.swing.JLabel();
        Label_Horneando = new javax.swing.JLabel();
        Label_galletasAlm = new javax.swing.JLabel();
        Label_galletasCons = new javax.swing.JLabel();
        barraH1 = new javax.swing.JProgressBar();
        barraH2 = new javax.swing.JProgressBar();
        barraH3 = new javax.swing.JProgressBar();
        estado_horno1 = new javax.swing.JLabel();
        estado_horno2 = new javax.swing.JLabel();
        estado_horno3 = new javax.swing.JLabel();
        estado_gen1 = new javax.swing.JLabel();
        estado_gen2 = new javax.swing.JLabel();
        estado_gen3 = new javax.swing.JLabel();
        estado_gen4 = new javax.swing.JLabel();
        estado_gen5 = new javax.swing.JLabel();
        estado_desperdicio1 = new javax.swing.JLabel();
        estado_desperdicio2 = new javax.swing.JLabel();
        estado_desperdicio3 = new javax.swing.JLabel();
        estado_desperdicio4 = new javax.swing.JLabel();
        estado_desperdicio5 = new javax.swing.JLabel();
        estado_consumidasAlm = new javax.swing.JLabel();
        estado_almacenadasAlm = new javax.swing.JLabel();
        boton_rep1 = new javax.swing.JButton();
        boton_rep2 = new javax.swing.JButton();
        boton_rep3 = new javax.swing.JButton();
        boton_rep4 = new javax.swing.JButton();
        boton_rep5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 700));
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

        Label_galletasDesperdicio.setBackground(new java.awt.Color(0, 0, 0));
        Label_galletasDesperdicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label_galletasDesperdicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_galletasDesperdicio.setText("Galletas desperdiciadas");
        jPanel1.add(Label_galletasDesperdicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, 36));

        Label_galletasGen.setBackground(new java.awt.Color(0, 0, 0));
        Label_galletasGen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label_galletasGen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_galletasGen.setText("Galletas generadas");
        jPanel1.add(Label_galletasGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 36));

        Label_galletasHorneadas.setBackground(new java.awt.Color(0, 0, 0));
        Label_galletasHorneadas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label_galletasHorneadas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_galletasHorneadas.setText("Galletas horneadas");
        jPanel1.add(Label_galletasHorneadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, 36));

        Label_Horneando.setBackground(new java.awt.Color(0, 0, 0));
        Label_Horneando.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label_Horneando.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_Horneando.setText("Horneando");
        jPanel1.add(Label_Horneando, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, 36));

        Label_galletasAlm.setBackground(new java.awt.Color(0, 0, 0));
        Label_galletasAlm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label_galletasAlm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_galletasAlm.setText("Galletas almacenadas");
        jPanel1.add(Label_galletasAlm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, 36));

        Label_galletasCons.setBackground(new java.awt.Color(0, 0, 0));
        Label_galletasCons.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Label_galletasCons.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_galletasCons.setText("Galletas consumidas");
        jPanel1.add(Label_galletasCons, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, 36));

        barraH1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(barraH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, 20));

        barraH2.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(barraH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, 20));

        barraH3.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(barraH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, 20));

        estado_horno1.setBackground(new java.awt.Color(255, 255, 255));
        estado_horno1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_horno1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_horno1.setText("<ESTADO>");
        estado_horno1.setToolTipText("");
        estado_horno1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_horno1.setOpaque(true);
        jPanel1.add(estado_horno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 140, -1));

        estado_horno2.setBackground(new java.awt.Color(255, 255, 255));
        estado_horno2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_horno2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_horno2.setText("<ESTADO>");
        estado_horno2.setToolTipText("");
        estado_horno2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_horno2.setOpaque(true);
        jPanel1.add(estado_horno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 140, -1));

        estado_horno3.setBackground(new java.awt.Color(255, 255, 255));
        estado_horno3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_horno3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_horno3.setText("<ESTADO>");
        estado_horno3.setToolTipText("");
        estado_horno3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_horno3.setOpaque(true);
        jPanel1.add(estado_horno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 140, -1));

        estado_gen1.setBackground(new java.awt.Color(255, 255, 255));
        estado_gen1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_gen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_gen1.setText("<ESTADO>");
        estado_gen1.setToolTipText("");
        estado_gen1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_gen1.setOpaque(true);
        jPanel1.add(estado_gen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, -1));

        estado_gen2.setBackground(new java.awt.Color(255, 255, 255));
        estado_gen2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_gen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_gen2.setText("<ESTADO>");
        estado_gen2.setToolTipText("");
        estado_gen2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_gen2.setOpaque(true);
        jPanel1.add(estado_gen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 130, -1));

        estado_gen3.setBackground(new java.awt.Color(255, 255, 255));
        estado_gen3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_gen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_gen3.setText("<ESTADO>");
        estado_gen3.setToolTipText("");
        estado_gen3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_gen3.setOpaque(true);
        jPanel1.add(estado_gen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 130, -1));

        estado_gen4.setBackground(new java.awt.Color(255, 255, 255));
        estado_gen4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_gen4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_gen4.setText("<ESTADO>");
        estado_gen4.setToolTipText("");
        estado_gen4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_gen4.setOpaque(true);
        jPanel1.add(estado_gen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 130, -1));

        estado_gen5.setBackground(new java.awt.Color(255, 255, 255));
        estado_gen5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_gen5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_gen5.setText("<ESTADO>");
        estado_gen5.setToolTipText("");
        estado_gen5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_gen5.setOpaque(true);
        jPanel1.add(estado_gen5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 130, -1));

        estado_desperdicio1.setBackground(new java.awt.Color(255, 255, 255));
        estado_desperdicio1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_desperdicio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_desperdicio1.setText("<ESTADO>");
        estado_desperdicio1.setToolTipText("");
        estado_desperdicio1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_desperdicio1.setOpaque(true);
        jPanel1.add(estado_desperdicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 160, -1));

        estado_desperdicio2.setBackground(new java.awt.Color(255, 255, 255));
        estado_desperdicio2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_desperdicio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_desperdicio2.setText("<ESTADO>");
        estado_desperdicio2.setToolTipText("");
        estado_desperdicio2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_desperdicio2.setOpaque(true);
        jPanel1.add(estado_desperdicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 160, -1));

        estado_desperdicio3.setBackground(new java.awt.Color(255, 255, 255));
        estado_desperdicio3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_desperdicio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_desperdicio3.setText("<ESTADO>");
        estado_desperdicio3.setToolTipText("");
        estado_desperdicio3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_desperdicio3.setOpaque(true);
        jPanel1.add(estado_desperdicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 160, -1));

        estado_desperdicio4.setBackground(new java.awt.Color(255, 255, 255));
        estado_desperdicio4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_desperdicio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_desperdicio4.setText("<ESTADO>");
        estado_desperdicio4.setToolTipText("");
        estado_desperdicio4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_desperdicio4.setOpaque(true);
        jPanel1.add(estado_desperdicio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 160, -1));

        estado_desperdicio5.setBackground(new java.awt.Color(255, 255, 255));
        estado_desperdicio5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_desperdicio5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_desperdicio5.setText("<ESTADO>");
        estado_desperdicio5.setToolTipText("");
        estado_desperdicio5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_desperdicio5.setOpaque(true);
        jPanel1.add(estado_desperdicio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 160, -1));

        estado_consumidasAlm.setBackground(new java.awt.Color(255, 255, 255));
        estado_consumidasAlm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_consumidasAlm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_consumidasAlm.setText("<ESTADO>");
        estado_consumidasAlm.setToolTipText("");
        estado_consumidasAlm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_consumidasAlm.setOpaque(true);
        jPanel1.add(estado_consumidasAlm, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 140, -1));

        estado_almacenadasAlm.setBackground(new java.awt.Color(255, 255, 255));
        estado_almacenadasAlm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_almacenadasAlm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_almacenadasAlm.setText("<ESTADO>");
        estado_almacenadasAlm.setToolTipText("");
        estado_almacenadasAlm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_almacenadasAlm.setOpaque(true);
        jPanel1.add(estado_almacenadasAlm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 140, -1));

        boton_rep1.setBackground(new java.awt.Color(204, 204, 204));
        boton_rep1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_rep1.setForeground(new java.awt.Color(0, 0, 0));
        boton_rep1.setText("PARAR");
        boton_rep1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_rep1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_rep1.setOpaque(true);
        boton_rep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rep1ActionPerformed(evt);
            }
        });
        jPanel1.add(boton_rep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 60, 20));

        boton_rep2.setBackground(new java.awt.Color(204, 204, 204));
        boton_rep2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_rep2.setForeground(new java.awt.Color(0, 0, 0));
        boton_rep2.setText("PARAR");
        boton_rep2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_rep2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_rep2.setOpaque(true);
        boton_rep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rep2ActionPerformed(evt);
            }
        });
        jPanel1.add(boton_rep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 60, 20));

        boton_rep3.setBackground(new java.awt.Color(204, 204, 204));
        boton_rep3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_rep3.setForeground(new java.awt.Color(0, 0, 0));
        boton_rep3.setText("PARAR");
        boton_rep3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_rep3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_rep3.setOpaque(true);
        boton_rep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rep3ActionPerformed(evt);
            }
        });
        jPanel1.add(boton_rep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 60, 20));

        boton_rep4.setBackground(new java.awt.Color(204, 204, 204));
        boton_rep4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_rep4.setForeground(new java.awt.Color(0, 0, 0));
        boton_rep4.setText("PARAR");
        boton_rep4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_rep4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_rep4.setOpaque(true);
        boton_rep4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rep4ActionPerformed(evt);
            }
        });
        jPanel1.add(boton_rep4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 60, 20));

        boton_rep5.setBackground(new java.awt.Color(204, 204, 204));
        boton_rep5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_rep5.setForeground(new java.awt.Color(0, 0, 0));
        boton_rep5.setText("PARAR");
        boton_rep5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_rep5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_rep5.setOpaque(true);
        boton_rep5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rep5ActionPerformed(evt);
            }
        });
        jPanel1.add(boton_rep5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_rep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rep3ActionPerformed
        try {
            toggle3 = !toggle3;
            toggleButton(boton_rep3, toggle3);
            toggleAction(toggle3, 2);
        } catch (RemoteException ex) {
            Logger.getLogger(MenuCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_boton_rep3ActionPerformed

    private void boton_rep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rep2ActionPerformed
        try {
            toggle2 = !toggle2;
            toggleButton(boton_rep2, toggle2);
            toggleAction(toggle2, 1);
        } catch (RemoteException ex) {
            Logger.getLogger(MenuCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boton_rep2ActionPerformed

    private void boton_rep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rep1ActionPerformed
        try {
            toggle1 = !toggle1;
            toggleButton(boton_rep1, toggle1);
            toggleAction(toggle1, 0);
        } catch (RemoteException ex) {
            Logger.getLogger(MenuCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boton_rep1ActionPerformed

    private void boton_rep4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rep4ActionPerformed
        try {
            toggle4 = !toggle4;
            toggleButton(boton_rep4, toggle4);
            toggleAction(toggle4, 3);
        } catch (RemoteException ex) {
            Logger.getLogger(MenuCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boton_rep4ActionPerformed

    private void boton_rep5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rep5ActionPerformed
        try {
            toggle5 = !toggle5;
            toggleButton(boton_rep5, toggle5);
            toggleAction(toggle5, 4);
        } catch (RemoteException ex) {
            Logger.getLogger(MenuCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boton_rep5ActionPerformed

    // 1 segundo de actualizacion es demasiado como para que la representacion sea fluida
    // se cambia a barra con colores 
    public void BarraSimple(JProgressBar barra, int indiceHorno) throws RemoteException {
        boolean horneando = fabrica.isHorneando(indiceHorno);
        boolean horneadas = fabrica.isHorneado(indiceHorno);
        if (horneando) { //horno.isHorneando()
            barra.setValue(100);
            barra.setForeground(Color.red);
        } else if (horneadas) {
            // Si el horno ha terminado, llenamos la barra
            barra.setValue(100);  // La barra se llena
            barra.setForeground(Color.green);
        } else if (!horneadas && !horneando) {
            // Se  vacia si esta cargandose 
            barra.setValue(0);  // La barra se llena

        }
    }

    public static void main(String args[]) {

    }

    @Override
    public void run() {
        final int SEGUNDOS_UPDATE = 1;
        while (true) {
            try {
                estado_almacenadasAlm.setText(String.valueOf(fabrica.getCapacidadAlmacen()));
                estado_consumidasAlm.setText(String.valueOf(fabrica.getGalletasConsumidas()));

                estado_gen1.setText(String.valueOf(fabrica.getGalletasGeneradas(0)));
                estado_gen2.setText(String.valueOf(fabrica.getGalletasGeneradas(1)));
                estado_gen3.setText(String.valueOf(fabrica.getGalletasGeneradas(2)));
                estado_gen4.setText(String.valueOf(fabrica.getGalletasGeneradas(3)));
                estado_gen5.setText(String.valueOf(fabrica.getGalletasGeneradas(4)));

                estado_desperdicio1.setText(String.valueOf(fabrica.getGalletasDesperdiciadas(0)));
                estado_desperdicio2.setText(String.valueOf(fabrica.getGalletasDesperdiciadas(1)));
                estado_desperdicio3.setText(String.valueOf(fabrica.getGalletasDesperdiciadas(2)));
                estado_desperdicio4.setText(String.valueOf(fabrica.getGalletasDesperdiciadas(3)));
                estado_desperdicio5.setText(String.valueOf(fabrica.getGalletasDesperdiciadas(4)));

                estado_horno1.setText(String.valueOf(fabrica.getGalletasHorneadas(0)));
                estado_horno2.setText(String.valueOf(fabrica.getGalletasHorneadas(1)));
                estado_horno3.setText(String.valueOf(fabrica.getGalletasHorneadas(2)));

                BarraSimple(barraH1, 0);
                BarraSimple(barraH2, 1);
                BarraSimple(barraH3, 2);

            } catch (RemoteException ex) {
                Logger.getLogger(MenuCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            // Descanso minimo para no saturar memoria
            try {
                Thread.sleep(SEGUNDOS_UPDATE * 1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Horneando;
    private javax.swing.JLabel Label_almacen;
    private javax.swing.JLabel Label_galletasAlm;
    private javax.swing.JLabel Label_galletasCons;
    private javax.swing.JLabel Label_galletasDesperdicio;
    private javax.swing.JLabel Label_galletasGen;
    private javax.swing.JLabel Label_galletasHorneadas;
    private javax.swing.JLabel Label_horno1;
    private javax.swing.JLabel Label_horno2;
    private javax.swing.JLabel Label_horno3;
    private javax.swing.JLabel Label_repostero1;
    private javax.swing.JLabel Label_repostero2;
    private javax.swing.JLabel Label_repostero3;
    private javax.swing.JLabel Label_repostero4;
    private javax.swing.JLabel Label_repostero5;
    private javax.swing.JProgressBar barraH1;
    private javax.swing.JProgressBar barraH2;
    private javax.swing.JProgressBar barraH3;
    private javax.swing.JButton boton_rep1;
    private javax.swing.JButton boton_rep2;
    private javax.swing.JButton boton_rep3;
    private javax.swing.JButton boton_rep4;
    private javax.swing.JButton boton_rep5;
    private javax.swing.JLabel estado_almacenadasAlm;
    private javax.swing.JLabel estado_consumidasAlm;
    private javax.swing.JLabel estado_desperdicio1;
    private javax.swing.JLabel estado_desperdicio2;
    private javax.swing.JLabel estado_desperdicio3;
    private javax.swing.JLabel estado_desperdicio4;
    private javax.swing.JLabel estado_desperdicio5;
    private javax.swing.JLabel estado_gen1;
    private javax.swing.JLabel estado_gen2;
    private javax.swing.JLabel estado_gen3;
    private javax.swing.JLabel estado_gen4;
    private javax.swing.JLabel estado_gen5;
    private javax.swing.JLabel estado_horno1;
    private javax.swing.JLabel estado_horno2;
    private javax.swing.JLabel estado_horno3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
