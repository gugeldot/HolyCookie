package ClienteRMI.GUI;

/***************************************************
 *           Interfaz de cliente RMI 
 *************************************************/


import RMI.FabricaGalletasRemote;
import java.awt.Color;
import java.rmi.RemoteException;
import javax.swing.JButton;
import javax.swing.JProgressBar;

public class MenuCliente extends javax.swing.JFrame implements Runnable {

    // Clase de RMI
    private FabricaGalletasRemote fabrica;

    // Booleano por cada boton de parar/resume
    private boolean toggle1 = false, toggle2 = false, toggle3 = false, toggle4 = false, toggle5 = false;

    /*
    * Constructor
     */
    public MenuCliente(FabricaGalletasRemote fabrica) {
        initComponents();
        // Centra la ventana en la pantalla
        setLocationRelativeTo(null);
        this.fabrica = fabrica;
    }

    /*
            OBJ: Animacion cambio de aspecto y texto de un boton en funcion de
                 una variable booleana
            PRE: -
            POST:
            NOTA: Parte solo estética
     */
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

    /*
            OBJ: Segun el estado del booleano perteneciente a su boton parar/resume
                 correspondiente para o reanuda el repostero indicado
            PRE: Indice repostero en limites existentes [0-2]
            POST: Repostero parado/reanudado
     */
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

        jPanel2 = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JButton();
        botonMin = new javax.swing.JButton();
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
        jPanel3 = new javax.swing.JPanel();
        botonCerrar1 = new javax.swing.JButton();
        botonMin1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        botonCerrar2 = new javax.swing.JButton();
        botonMin2 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(72, 24, 29));

        botonCerrar.setBackground(new java.awt.Color(72, 24, 29));
        botonCerrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonCerrar.setForeground(new java.awt.Color(255, 255, 255));
        botonCerrar.setText("X");
        botonCerrar.setBorder(null);
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonCerrar.setFocusable(false);
        botonCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCerrar.setOpaque(true);
        botonCerrar.setPreferredSize(new java.awt.Dimension(35, 35));
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCerrarMouseExited(evt);
            }
        });
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        botonMin.setBackground(new java.awt.Color(72, 24, 29));
        botonMin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonMin.setForeground(new java.awt.Color(255, 255, 255));
        botonMin.setText("_");
        botonMin.setToolTipText("");
        botonMin.setBorder(null);
        botonMin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonMin.setFocusable(false);
        botonMin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMin.setOpaque(true);
        botonMin.setPreferredSize(new java.awt.Dimension(35, 35));
        botonMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMinMouseExited(evt);
            }
        });
        botonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(botonMin, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(601, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(660, 602));
        setMinimumSize(new java.awt.Dimension(660, 602));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(660, 602));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setMaximumSize(new java.awt.Dimension(662, 602));
        jPanel1.setMinimumSize(new java.awt.Dimension(662, 602));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(662, 602));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
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
        boton_rep1.setText("PARAR");
        boton_rep1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_rep1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boton_rep1.setOpaque(true);
        boton_rep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rep1ActionPerformed(evt);
            }
        });
        jPanel1.add(boton_rep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 60, 20));

        boton_rep2.setBackground(new java.awt.Color(204, 204, 204));
        boton_rep2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_rep2.setText("PARAR");
        boton_rep2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_rep2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boton_rep2.setOpaque(true);
        boton_rep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rep2ActionPerformed(evt);
            }
        });
        jPanel1.add(boton_rep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 60, 20));

        boton_rep3.setBackground(new java.awt.Color(204, 204, 204));
        boton_rep3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_rep3.setText("PARAR");
        boton_rep3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_rep3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boton_rep3.setOpaque(true);
        boton_rep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rep3ActionPerformed(evt);
            }
        });
        jPanel1.add(boton_rep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 60, 20));

        boton_rep4.setBackground(new java.awt.Color(204, 204, 204));
        boton_rep4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_rep4.setText("PARAR");
        boton_rep4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_rep4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boton_rep4.setOpaque(true);
        boton_rep4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rep4ActionPerformed(evt);
            }
        });
        jPanel1.add(boton_rep4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 60, 20));

        boton_rep5.setBackground(new java.awt.Color(204, 204, 204));
        boton_rep5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_rep5.setText("PARAR");
        boton_rep5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_rep5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boton_rep5.setOpaque(true);
        boton_rep5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rep5ActionPerformed(evt);
            }
        });
        jPanel1.add(boton_rep5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 60, 20));

        jPanel3.setBackground(new java.awt.Color(72, 24, 29));

        botonCerrar1.setBackground(new java.awt.Color(72, 24, 29));
        botonCerrar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonCerrar1.setForeground(new java.awt.Color(255, 255, 255));
        botonCerrar1.setText("X");
        botonCerrar1.setBorder(null);
        botonCerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonCerrar1.setFocusable(false);
        botonCerrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCerrar1.setOpaque(true);
        botonCerrar1.setPreferredSize(new java.awt.Dimension(35, 35));
        botonCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCerrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCerrar1MouseExited(evt);
            }
        });
        botonCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrar1ActionPerformed(evt);
            }
        });

        botonMin1.setBackground(new java.awt.Color(72, 24, 29));
        botonMin1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonMin1.setForeground(new java.awt.Color(255, 255, 255));
        botonMin1.setText("_");
        botonMin1.setToolTipText("");
        botonMin1.setBorder(null);
        botonMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonMin1.setFocusable(false);
        botonMin1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMin1.setOpaque(true);
        botonMin1.setPreferredSize(new java.awt.Dimension(35, 35));
        botonMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMin1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMin1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMin1MouseExited(evt);
            }
        });
        botonMin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCerrar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(botonMin1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(botonCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(601, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 70, 700));

        jPanel4.setBackground(new java.awt.Color(72, 24, 29));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        botonCerrar2.setBackground(new java.awt.Color(72, 24, 29));
        botonCerrar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonCerrar2.setForeground(new java.awt.Color(255, 255, 255));
        botonCerrar2.setText("X");
        botonCerrar2.setBorder(null);
        botonCerrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonCerrar2.setFocusable(false);
        botonCerrar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCerrar2.setOpaque(true);
        botonCerrar2.setPreferredSize(new java.awt.Dimension(35, 35));
        botonCerrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCerrar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCerrar2MouseExited(evt);
            }
        });
        botonCerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrar2ActionPerformed(evt);
            }
        });

        botonMin2.setBackground(new java.awt.Color(72, 24, 29));
        botonMin2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonMin2.setForeground(new java.awt.Color(255, 255, 255));
        botonMin2.setText("_");
        botonMin2.setToolTipText("");
        botonMin2.setBorder(null);
        botonMin2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonMin2.setFocusable(false);
        botonMin2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMin2.setOpaque(true);
        botonMin2.setPreferredSize(new java.awt.Dimension(35, 35));
        botonMin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMin2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMin2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMin2MouseExited(evt);
            }
        });
        botonMin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMin2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonCerrar2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addComponent(botonMin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(botonCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMin2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 497, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 60, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_rep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rep3ActionPerformed
        try {
            // Cambio sistematico del valor del booleano (switch)
            toggle3 = !toggle3;
            toggleButton(boton_rep3, toggle3);
            toggleAction(toggle3, 2);
        } catch (RemoteException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_boton_rep3ActionPerformed

    private void boton_rep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rep2ActionPerformed
        try {
            // Cambio sistematico del valor del booleano (switch)
            toggle2 = !toggle2;
            toggleButton(boton_rep2, toggle2);
            toggleAction(toggle2, 1);
        } catch (RemoteException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_boton_rep2ActionPerformed

    private void boton_rep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rep1ActionPerformed
        try {
            // Cambio sistematico del valor del booleano (switch)
            toggle1 = !toggle1;
            toggleButton(boton_rep1, toggle1);
            toggleAction(toggle1, 0);
        } catch (RemoteException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_boton_rep1ActionPerformed

    private void boton_rep4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rep4ActionPerformed
        try {
            // Cambio sistematico del valor del booleano (switch)
            toggle4 = !toggle4;
            toggleButton(boton_rep4, toggle4);
            toggleAction(toggle4, 3);
        } catch (RemoteException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_boton_rep4ActionPerformed

    private void boton_rep5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rep5ActionPerformed
        try {
            // Cambio sistematico del valor del booleano (switch)
            toggle5 = !toggle5;
            toggleButton(boton_rep5, toggle5);
            toggleAction(toggle5, 4);
        } catch (RemoteException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_boton_rep5ActionPerformed

    private void botonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonCerrarMouseClicked

    private void botonCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseEntered
        botonCerrar.setBackground(Color.red);
    }//GEN-LAST:event_botonCerrarMouseEntered

    private void botonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseExited
        botonCerrar.setBackground(new Color(72, 24, 29));
    }//GEN-LAST:event_botonCerrarMouseExited

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinMouseClicked
        setState(MenuCliente.ICONIFIED); // Minimizar
    }//GEN-LAST:event_botonMinMouseClicked

    private void botonMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinMouseEntered
        botonMin.setBackground(new Color(124, 24, 29));
    }//GEN-LAST:event_botonMinMouseEntered

    private void botonMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinMouseExited

        botonMin.setBackground(new Color(72, 24, 29));
    }//GEN-LAST:event_botonMinMouseExited

    private void botonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMinActionPerformed

    private void botonCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrar1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonCerrar1MouseClicked

    private void botonCerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrar1MouseEntered
        botonCerrar.setBackground(Color.red);
    }//GEN-LAST:event_botonCerrar1MouseEntered

    private void botonCerrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrar1MouseExited
        botonCerrar.setBackground(new Color(72, 24, 29));
    }//GEN-LAST:event_botonCerrar1MouseExited

    private void botonCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCerrar1ActionPerformed

    private void botonMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMin1MouseClicked
        setState(MenuCliente.ICONIFIED);
    }//GEN-LAST:event_botonMin1MouseClicked

    private void botonMin1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMin1MouseEntered
        botonMin.setBackground(new Color(124, 24, 29));
    }//GEN-LAST:event_botonMin1MouseEntered

    private void botonMin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMin1MouseExited

        botonMin.setBackground(new Color(72, 24, 29));
    }//GEN-LAST:event_botonMin1MouseExited

    private void botonMin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMin1ActionPerformed

    private void botonCerrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrar2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonCerrar2MouseClicked

    private void botonCerrar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrar2MouseEntered

        botonCerrar2.setBackground(Color.red);
    }//GEN-LAST:event_botonCerrar2MouseEntered

    private void botonCerrar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrar2MouseExited
        botonCerrar2.setBackground(new Color(72, 24, 29));
    }//GEN-LAST:event_botonCerrar2MouseExited

    private void botonCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCerrar2ActionPerformed

    private void botonMin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMin2MouseClicked
        setState(MenuCliente.ICONIFIED);
    }//GEN-LAST:event_botonMin2MouseClicked

    private void botonMin2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMin2MouseEntered
        botonMin2.setBackground(new Color(124, 24, 29));
    }//GEN-LAST:event_botonMin2MouseEntered

    private void botonMin2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMin2MouseExited

        botonMin2.setBackground(new Color(72, 24, 29));
    }//GEN-LAST:event_botonMin2MouseExited

    private void botonMin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMin2ActionPerformed
    private int xMouse, yMouse;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    
    /*
            OBJ: Animacion barra de situacion de cada horno
            PRE: indiceHorno dentro de valores existentes en array hornos [0-2]
            POST: - 
            NOTA: Como dice el enunciado, 1 segundo de refresco, demasiado para 
                  que la animacion de la barra no de problemas de latencia.
                  Se ha decidido que sea una barra estática de un color u otro
                  dependiendo de la situacion del horno.
     */
    
    public void BarraSimple(JProgressBar barra, int indiceHorno) throws RemoteException {
        boolean horneando = fabrica.isHorneando(indiceHorno);
        boolean horneadas = fabrica.isHorneado(indiceHorno);
        if (horneando) { 
            // Estado horneado en proceso
            barra.setValue(100);
            barra.setForeground(Color.red);
        } else if (horneadas) {
            // Si el horno ha terminado, llenamos la barra
            barra.setValue(100);  
            barra.setForeground(Color.green);
        } else if (!horneadas && !horneando) {
            // Se  vacia si esta cargandose 
            barra.setValue(0);  
        }
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
                
                // Ventana de error en caso de perdida de conexión con el objeto remoto
                javax.swing.JOptionPane.showMessageDialog(this, "Se perdió la conexión con el servidor. La aplicación se cerrará.", "Error de conexion RMI", javax.swing.JOptionPane.ERROR_MESSAGE);

                // Salida de la aplicación
                System.exit(0);
            }
            // Descanso minimo para no saturar memoria
            try { Thread.sleep(SEGUNDOS_UPDATE * 1000); }catch (InterruptedException ex) {}
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
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonCerrar1;
    private javax.swing.JButton botonCerrar2;
    private javax.swing.JButton botonMin;
    private javax.swing.JButton botonMin1;
    private javax.swing.JButton botonMin2;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
