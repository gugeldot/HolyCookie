package Server.GUI;

import Server.fabrica_galletas.Empaquetador;
import Server.fabrica_galletas.Cafeteria;
import Server.fabrica_galletas.Horno;
import Server.fabrica_galletas.Repostero;
import Server.fabrica_galletas.Almacen;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JProgressBar;

/**
 *
 * @author Gugeldot
 */
public class Principal extends javax.swing.JFrame implements Runnable {

    Horno[] hornos;
    Cafeteria cafe;
    Repostero[] reposteros;
    Almacen almacen;
    Empaquetador[] empaquetadores;

    public Principal(Cafeteria cafe, Repostero[] reposteros, Horno[] hornos, Empaquetador[] empaquetadores, Almacen almacen) {
        initComponents();

        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setTitle("Fabrica Galletas -- Menu Principal "); // Asigna el título de la ventana

        this.cafe = cafe;
        this.hornos = hornos;
        this.reposteros = reposteros;
        this.almacen = almacen;
        this.empaquetadores = empaquetadores;
    }

    public String getEstadoCafetera2() {
        String resultado = " ";
        for (Repostero rep : reposteros) {
            if (rep.isDescansando() && !rep.getID().equals(cafe.getIdOcupado())) {
                resultado += rep.getID() + ", ";
            }
        }

        // Eliminar la última coma y espacio si la longitud es mayor que 1
        if (resultado.length() > 1) {
            resultado = resultado.substring(0, resultado.length() - 2);
        }

        return resultado;
    }

// Retorna color de las casillas del estado empaquetador
    public Color colorTandaEmpaquetador(int indice, int pos) {
        // Se puede quitar si se quiere que cuando transporte se quede en rojo
        boolean blankLlenado = !hornos[indice].isHorneando();
        boolean blankTransporte = true; //!empaquetadores[indice].getEstado().equals("Transportando");
        if (empaquetadores[indice].getTanda() >= pos && blankLlenado && blankTransporte) {
            return Color.red;
        } else {
            return Color.white;
        }
    }

    // Variable para almacenar los hilos de animación de cada barra
    // Si no se crean la interfaz (hilo principal se congela) 
    private Thread hiloAnimacionBarraH1 = null;
    private Thread hiloAnimacionBarraH2 = null;
    private Thread hiloAnimacionBarraH3 = null;

    public void animacionBarra(JProgressBar barra, Horno horno, int hornoIndex) {
        // Verificar si ya existe un hilo para esta barra, y si no, crear uno nuevo
        if (horno.isHorneando()) {
            // Comprobar si el hilo ya está en ejecución para no creear uno nuevo 
            if ((hornoIndex == 0 && hiloAnimacionBarraH1 == null)
                    || (hornoIndex == 1 && hiloAnimacionBarraH2 == null)
                    || (hornoIndex == 2 && hiloAnimacionBarraH3 == null)) {

                // Crear el hilo solo si no está en ejecución
                Thread animacionThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            // Tiempo total de la animación (8 segundos)
                            int tiempoTotal = 8000;  // 8 segundos = 8000 milisegundos
                            int unidadesPorAvance = 1;  // Aumentar la barra en 1 unidad por vez
                            int totalAvances = 100 / unidadesPorAvance;  // Número de avances (100 avances)

                            // Configurar la barra para que empiece en 0
                            barra.setValue(0);
                            barra.setForeground(Color.red);

                            // Ciclo para actualizar la barra de progreso
                            for (int i = 0; i <= 100; i += unidadesPorAvance) {
                                barra.setValue(i);  // Actualiza el valor de la barra
                                Thread.sleep(tiempoTotal / totalAvances);  // Espera para cada avance (400 ms)
                            }
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        } finally {
                            // Al terminar, liberamos el hilo para que se pueda crear uno nuevo la próxima vez
                            if (hornoIndex == 0) {
                                hiloAnimacionBarraH1 = null;
                            }
                            if (hornoIndex == 1) {
                                hiloAnimacionBarraH2 = null;
                            }
                            if (hornoIndex == 2) {
                                hiloAnimacionBarraH3 = null;
                            }
                        }
                    }
                });

                // Iniciar el hilo de animación
                if (hornoIndex == 0) {
                    hiloAnimacionBarraH1 = animacionThread;
                }
                if (hornoIndex == 1) {
                    hiloAnimacionBarraH2 = animacionThread;
                }
                if (hornoIndex == 2) {
                    hiloAnimacionBarraH3 = animacionThread;
                }

                animacionThread.start();
            }
        } else if (horno.isHorneadas()) {
            // Si el horno ha terminado, llenamos la barra
            barra.setValue(100);  // La barra se llena
            barra.setForeground(Color.green);
        } else if (!horno.isHorneadas() && !horno.isHorneando()) {
            // Se  vacia si esta cargandose 
            barra.setValue(0);  // La barra se llena

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Label_repostero1 = new javax.swing.JLabel();
        Label_cafetera = new javax.swing.JLabel();
        estado_repostero = new javax.swing.JLabel();
        Label_repostero2 = new javax.swing.JLabel();
        estado_repostero2 = new javax.swing.JLabel();
        Label_repostero3 = new javax.swing.JLabel();
        estado_repostero3 = new javax.swing.JLabel();
        Label_repostero4 = new javax.swing.JLabel();
        estado_repostero4 = new javax.swing.JLabel();
        Label_repostero5 = new javax.swing.JLabel();
        estado_repostero5 = new javax.swing.JLabel();
        Label_horno1 = new javax.swing.JLabel();
        Label_horno2 = new javax.swing.JLabel();
        Label_horno3 = new javax.swing.JLabel();
        estado_cafetera = new javax.swing.JLabel();
        estado_cafetera2 = new javax.swing.JLabel();
        Label_numGalletas = new javax.swing.JLabel();
        Label_numGalletas2 = new javax.swing.JLabel();
        Label_numGalletas3 = new javax.swing.JLabel();
        numero_galletas = new javax.swing.JLabel();
        numero_galletas2 = new javax.swing.JLabel();
        numero_galletas3 = new javax.swing.JLabel();
        Label_horneando2 = new javax.swing.JLabel();
        Label_horneando = new javax.swing.JLabel();
        Label_horneando3 = new javax.swing.JLabel();
        Label_emp2 = new javax.swing.JLabel();
        Label_emp = new javax.swing.JLabel();
        Label_emp3 = new javax.swing.JLabel();
        estado_emp = new javax.swing.JLabel();
        estado_emp2 = new javax.swing.JLabel();
        estado_emp3 = new javax.swing.JLabel();
        Label_almacen = new javax.swing.JLabel();
        estado_almacen = new javax.swing.JLabel();
        tanda1_emp1 = new javax.swing.JLabel();
        tanda2_emp1 = new javax.swing.JLabel();
        tanda3_emp1 = new javax.swing.JLabel();
        tanda4_emp1 = new javax.swing.JLabel();
        tanda5_emp1 = new javax.swing.JLabel();
        tanda1_emp2 = new javax.swing.JLabel();
        tanda2_emp2 = new javax.swing.JLabel();
        tanda3_emp2 = new javax.swing.JLabel();
        tanda4_emp2 = new javax.swing.JLabel();
        tanda5_emp2 = new javax.swing.JLabel();
        tanda1_emp3 = new javax.swing.JLabel();
        tanda2_emp3 = new javax.swing.JLabel();
        tanda3_emp3 = new javax.swing.JLabel();
        tanda4_emp3 = new javax.swing.JLabel();
        tanda5_emp3 = new javax.swing.JLabel();
        Label_cafetera1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        barraH1 = new javax.swing.JProgressBar();
        barraH2 = new javax.swing.JProgressBar();
        barraH3 = new javax.swing.JProgressBar();
        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JButton();
        botonMin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1058, 695));
        setMinimumSize(new java.awt.Dimension(1058, 695));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1058, 695));
        setResizable(false);
        setSize(new java.awt.Dimension(1060, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));
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
        jPanel1.add(Label_repostero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 120, 36));

        Label_cafetera.setBackground(new java.awt.Color(0, 0, 0));
        Label_cafetera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_cafetera.setText("Cafetera");
        jPanel1.add(Label_cafetera, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 90, 36));

        estado_repostero.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero.setText("<ESTADO>");
        estado_repostero.setToolTipText("");
        estado_repostero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero.setOpaque(true);
        jPanel1.add(estado_repostero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, -1));

        Label_repostero2.setBackground(new java.awt.Color(0, 0, 0));
        Label_repostero2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_repostero2.setText("Repostero 2");
        jPanel1.add(Label_repostero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 110, 36));

        estado_repostero2.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero2.setText("<ESTADO>");
        estado_repostero2.setToolTipText("");
        estado_repostero2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero2.setOpaque(true);
        jPanel1.add(estado_repostero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 150, -1));

        Label_repostero3.setBackground(new java.awt.Color(0, 0, 0));
        Label_repostero3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_repostero3.setText("Repostero 3");
        jPanel1.add(Label_repostero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 110, 36));

        estado_repostero3.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero3.setText("<ESTADO>");
        estado_repostero3.setToolTipText("");
        estado_repostero3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero3.setOpaque(true);
        jPanel1.add(estado_repostero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 150, -1));

        Label_repostero4.setBackground(new java.awt.Color(0, 0, 0));
        Label_repostero4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_repostero4.setText("Repostero 4");
        jPanel1.add(Label_repostero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 120, 36));

        estado_repostero4.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero4.setText("<ESTADO>");
        estado_repostero4.setToolTipText("");
        estado_repostero4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero4.setOpaque(true);
        jPanel1.add(estado_repostero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 150, -1));

        Label_repostero5.setBackground(new java.awt.Color(0, 0, 0));
        Label_repostero5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_repostero5.setText("Repostero 5");
        jPanel1.add(Label_repostero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 110, 36));

        estado_repostero5.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero5.setText("<ESTADO>");
        estado_repostero5.setToolTipText("");
        estado_repostero5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero5.setOpaque(true);
        jPanel1.add(estado_repostero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 150, -1));

        Label_horno1.setBackground(new java.awt.Color(0, 0, 0));
        Label_horno1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_horno1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_horno1.setText("Horno 1");
        jPanel1.add(Label_horno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 115, 36));

        Label_horno2.setBackground(new java.awt.Color(0, 0, 0));
        Label_horno2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_horno2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_horno2.setText("Horno 2");
        jPanel1.add(Label_horno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 126, 36));

        Label_horno3.setBackground(new java.awt.Color(0, 0, 0));
        Label_horno3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_horno3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_horno3.setText("Horno 3");
        jPanel1.add(Label_horno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 112, 36));

        estado_cafetera.setBackground(new java.awt.Color(255, 255, 255));
        estado_cafetera.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_cafetera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_cafetera.setText("<ESTADO>");
        estado_cafetera.setToolTipText("");
        estado_cafetera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_cafetera.setOpaque(true);
        jPanel1.add(estado_cafetera, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 65, 200, -1));

        estado_cafetera2.setBackground(new java.awt.Color(255, 255, 255));
        estado_cafetera2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_cafetera2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        estado_cafetera2.setText("<ESTADO>");
        estado_cafetera2.setToolTipText("");
        estado_cafetera2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_cafetera2.setOpaque(true);
        jPanel1.add(estado_cafetera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 65, 500, -1));

        Label_numGalletas.setBackground(new java.awt.Color(0, 0, 0));
        Label_numGalletas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_numGalletas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_numGalletas.setText("Número de galletas");
        jPanel1.add(Label_numGalletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 255, 126, 36));

        Label_numGalletas2.setBackground(new java.awt.Color(0, 0, 0));
        Label_numGalletas2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_numGalletas2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_numGalletas2.setText("Número de galletas");
        jPanel1.add(Label_numGalletas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 255, 126, 36));

        Label_numGalletas3.setBackground(new java.awt.Color(0, 0, 0));
        Label_numGalletas3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_numGalletas3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_numGalletas3.setText("Número de galletas");
        jPanel1.add(Label_numGalletas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 255, 126, 36));

        numero_galletas.setBackground(new java.awt.Color(255, 255, 255));
        numero_galletas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numero_galletas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numero_galletas.setText("<X>");
        numero_galletas.setToolTipText("");
        numero_galletas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        numero_galletas.setOpaque(true);
        jPanel1.add(numero_galletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 297, 76, 33));

        numero_galletas2.setBackground(new java.awt.Color(255, 255, 255));
        numero_galletas2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numero_galletas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numero_galletas2.setText("<X>");
        numero_galletas2.setToolTipText("");
        numero_galletas2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        numero_galletas2.setOpaque(true);
        jPanel1.add(numero_galletas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 297, 74, 33));

        numero_galletas3.setBackground(new java.awt.Color(255, 255, 255));
        numero_galletas3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numero_galletas3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numero_galletas3.setText("<X>");
        numero_galletas3.setToolTipText("");
        numero_galletas3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        numero_galletas3.setOpaque(true);
        jPanel1.add(numero_galletas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 297, 76, 33));

        Label_horneando2.setBackground(new java.awt.Color(0, 0, 0));
        Label_horneando2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_horneando2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_horneando2.setText("Horneando");
        jPanel1.add(Label_horneando2, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 348, 82, 36));

        Label_horneando.setBackground(new java.awt.Color(0, 0, 0));
        Label_horneando.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_horneando.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_horneando.setText("Horneando");
        jPanel1.add(Label_horneando, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 348, 126, 36));

        Label_horneando3.setBackground(new java.awt.Color(0, 0, 0));
        Label_horneando3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_horneando3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_horneando3.setText("Horneando");
        jPanel1.add(Label_horneando3, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 348, 110, 36));

        Label_emp2.setBackground(new java.awt.Color(0, 0, 0));
        Label_emp2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_emp2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_emp2.setText("Empaquetador 2");
        jPanel1.add(Label_emp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 417, -1, 36));

        Label_emp.setBackground(new java.awt.Color(0, 0, 0));
        Label_emp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_emp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_emp.setText("Empaquetador 1");
        jPanel1.add(Label_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 417, -1, 36));

        Label_emp3.setBackground(new java.awt.Color(0, 0, 0));
        Label_emp3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_emp3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_emp3.setText("Empaquetador 3");
        jPanel1.add(Label_emp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 417, -1, 36));

        estado_emp.setBackground(new java.awt.Color(255, 255, 255));
        estado_emp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_emp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_emp.setText("<ESTADO>");
        estado_emp.setToolTipText("");
        estado_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_emp.setOpaque(true);
        jPanel1.add(estado_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 471, 144, -1));

        estado_emp2.setBackground(new java.awt.Color(255, 255, 255));
        estado_emp2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_emp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_emp2.setText("<ESTADO>");
        estado_emp2.setToolTipText("");
        estado_emp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_emp2.setOpaque(true);
        jPanel1.add(estado_emp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 471, 144, -1));

        estado_emp3.setBackground(new java.awt.Color(255, 255, 255));
        estado_emp3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_emp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_emp3.setText("<ESTADO>");
        estado_emp3.setToolTipText("");
        estado_emp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_emp3.setOpaque(true);
        jPanel1.add(estado_emp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 471, 144, -1));

        Label_almacen.setBackground(new java.awt.Color(0, 0, 0));
        Label_almacen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_almacen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_almacen.setText("Almacen");
        jPanel1.add(Label_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 149, 36));

        estado_almacen.setBackground(new java.awt.Color(255, 255, 255));
        estado_almacen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_almacen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_almacen.setText("<ESTADO>");
        estado_almacen.setToolTipText("");
        estado_almacen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_almacen.setOpaque(true);
        jPanel1.add(estado_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, 149, 42));

        tanda1_emp1.setBackground(new java.awt.Color(255, 255, 255));
        tanda1_emp1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda1_emp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda1_emp1.setToolTipText("");
        tanda1_emp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda1_emp1.setOpaque(true);
        jPanel1.add(tanda1_emp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 511, 25, 25));

        tanda2_emp1.setBackground(new java.awt.Color(255, 255, 255));
        tanda2_emp1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda2_emp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda2_emp1.setToolTipText("");
        tanda2_emp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda2_emp1.setOpaque(true);
        jPanel1.add(tanda2_emp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 511, 25, 25));

        tanda3_emp1.setBackground(new java.awt.Color(255, 255, 255));
        tanda3_emp1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda3_emp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda3_emp1.setToolTipText("");
        tanda3_emp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda3_emp1.setOpaque(true);
        jPanel1.add(tanda3_emp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 511, 25, 25));

        tanda4_emp1.setBackground(new java.awt.Color(255, 255, 255));
        tanda4_emp1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda4_emp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda4_emp1.setToolTipText("");
        tanda4_emp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda4_emp1.setOpaque(true);
        jPanel1.add(tanda4_emp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 511, 25, 25));

        tanda5_emp1.setBackground(new java.awt.Color(255, 255, 255));
        tanda5_emp1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda5_emp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda5_emp1.setToolTipText("");
        tanda5_emp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda5_emp1.setOpaque(true);
        jPanel1.add(tanda5_emp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 511, 25, 25));

        tanda1_emp2.setBackground(new java.awt.Color(255, 255, 255));
        tanda1_emp2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda1_emp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda1_emp2.setToolTipText("");
        tanda1_emp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda1_emp2.setOpaque(true);
        jPanel1.add(tanda1_emp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 511, 25, 25));

        tanda2_emp2.setBackground(new java.awt.Color(255, 255, 255));
        tanda2_emp2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda2_emp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda2_emp2.setToolTipText("");
        tanda2_emp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda2_emp2.setOpaque(true);
        jPanel1.add(tanda2_emp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 511, 25, 25));

        tanda3_emp2.setBackground(new java.awt.Color(255, 255, 255));
        tanda3_emp2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda3_emp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda3_emp2.setToolTipText("");
        tanda3_emp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda3_emp2.setOpaque(true);
        jPanel1.add(tanda3_emp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 511, 25, 25));

        tanda4_emp2.setBackground(new java.awt.Color(255, 255, 255));
        tanda4_emp2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda4_emp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda4_emp2.setToolTipText("");
        tanda4_emp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda4_emp2.setOpaque(true);
        jPanel1.add(tanda4_emp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 511, 25, 25));

        tanda5_emp2.setBackground(new java.awt.Color(255, 255, 255));
        tanda5_emp2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda5_emp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda5_emp2.setToolTipText("");
        tanda5_emp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda5_emp2.setOpaque(true);
        jPanel1.add(tanda5_emp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 511, 25, 25));

        tanda1_emp3.setBackground(new java.awt.Color(255, 255, 255));
        tanda1_emp3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda1_emp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda1_emp3.setToolTipText("");
        tanda1_emp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda1_emp3.setOpaque(true);
        jPanel1.add(tanda1_emp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 511, 25, 25));

        tanda2_emp3.setBackground(new java.awt.Color(255, 255, 255));
        tanda2_emp3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda2_emp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda2_emp3.setToolTipText("");
        tanda2_emp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda2_emp3.setOpaque(true);
        jPanel1.add(tanda2_emp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 511, 25, 25));

        tanda3_emp3.setBackground(new java.awt.Color(255, 255, 255));
        tanda3_emp3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda3_emp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda3_emp3.setToolTipText("");
        tanda3_emp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda3_emp3.setOpaque(true);
        jPanel1.add(tanda3_emp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 511, 25, 25));

        tanda4_emp3.setBackground(new java.awt.Color(255, 255, 255));
        tanda4_emp3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda4_emp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda4_emp3.setToolTipText("");
        tanda4_emp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda4_emp3.setOpaque(true);
        jPanel1.add(tanda4_emp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 511, 25, 25));

        tanda5_emp3.setBackground(new java.awt.Color(255, 255, 255));
        tanda5_emp3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda5_emp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda5_emp3.setToolTipText("");
        tanda5_emp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda5_emp3.setOpaque(true);
        jPanel1.add(tanda5_emp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 511, 25, 25));

        Label_cafetera1.setBackground(new java.awt.Color(0, 0, 0));
        Label_cafetera1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_cafetera1.setText("Descansando");
        jPanel1.add(Label_cafetera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 17, 134, 36));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("COMER");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, 149, 17));

        barraH1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(barraH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 390, -1, 17));

        barraH2.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(barraH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 390, 140, 17));

        barraH3.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(barraH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 390, 140, 17));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoSmall.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 160, 110));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 70, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        almacen.comer();
    }//GEN-LAST:event_jButton1ActionPerformed
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

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseClicked
       System.exit(0);
    }//GEN-LAST:event_botonCerrarMouseClicked

    private void botonCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseEntered
        
        botonCerrar.setBackground(Color.red);
    }//GEN-LAST:event_botonCerrarMouseEntered

    private void botonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseExited
        botonCerrar.setBackground(new Color(72,24,29));
    }//GEN-LAST:event_botonCerrarMouseExited

    private void botonMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinMouseClicked
       setState(Principal.ICONIFIED);
    }//GEN-LAST:event_botonMinMouseClicked

    private void botonMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinMouseEntered
        botonMin.setBackground(new Color(124,24,29));
    }//GEN-LAST:event_botonMinMouseEntered

    private void botonMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinMouseExited
       
       botonMin.setBackground(new Color(72,24,29));
    }//GEN-LAST:event_botonMinMouseExited

    private void botonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMinActionPerformed

    public void run() {
        while (true) {
            estado_cafetera.setText(cafe.getIdOcupado());
            estado_cafetera2.setText(getEstadoCafetera2());

            estado_repostero.setText(reposteros[0].getSituacion());
            estado_repostero2.setText(reposteros[1].getSituacion());
            estado_repostero3.setText(reposteros[2].getSituacion());
            estado_repostero4.setText(reposteros[3].getSituacion());
            estado_repostero5.setText(reposteros[4].getSituacion());

            numero_galletas.setText(String.valueOf(hornos[0].getCapacidad_actual()));
            numero_galletas2.setText(String.valueOf(hornos[1].getCapacidad_actual()));
            numero_galletas3.setText(String.valueOf(hornos[2].getCapacidad_actual()));

            animacionBarra(barraH1, hornos[0], 0);
            animacionBarra(barraH2, hornos[1], 1);
            animacionBarra(barraH3, hornos[2], 2);

            estado_emp.setText(empaquetadores[0].getEstado());
            estado_emp2.setText(empaquetadores[1].getEstado());
            estado_emp3.setText(empaquetadores[2].getEstado());

            tanda1_emp1.setBackground(colorTandaEmpaquetador(0, 1));
            tanda2_emp1.setBackground(colorTandaEmpaquetador(0, 2));
            tanda3_emp1.setBackground(colorTandaEmpaquetador(0, 3));
            tanda4_emp1.setBackground(colorTandaEmpaquetador(0, 4));
            tanda5_emp1.setBackground(colorTandaEmpaquetador(0, 5));

            tanda1_emp2.setBackground(colorTandaEmpaquetador(1, 1));
            tanda2_emp2.setBackground(colorTandaEmpaquetador(1, 2));
            tanda3_emp2.setBackground(colorTandaEmpaquetador(1, 3));
            tanda4_emp2.setBackground(colorTandaEmpaquetador(1, 4));
            tanda5_emp2.setBackground(colorTandaEmpaquetador(1, 5));

            tanda1_emp3.setBackground(colorTandaEmpaquetador(2, 1));
            tanda2_emp3.setBackground(colorTandaEmpaquetador(2, 2));
            tanda3_emp3.setBackground(colorTandaEmpaquetador(2, 3));
            tanda4_emp3.setBackground(colorTandaEmpaquetador(2, 4));
            tanda5_emp3.setBackground(colorTandaEmpaquetador(2, 5));

            estado_almacen.setText(String.valueOf(almacen.getCapacidad_actual()));

            // Descanso minimo para no saturar memoria
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_almacen;
    private javax.swing.JLabel Label_cafetera;
    private javax.swing.JLabel Label_cafetera1;
    private javax.swing.JLabel Label_emp;
    private javax.swing.JLabel Label_emp2;
    private javax.swing.JLabel Label_emp3;
    private javax.swing.JLabel Label_horneando;
    private javax.swing.JLabel Label_horneando2;
    private javax.swing.JLabel Label_horneando3;
    private javax.swing.JLabel Label_horno1;
    private javax.swing.JLabel Label_horno2;
    private javax.swing.JLabel Label_horno3;
    private javax.swing.JLabel Label_numGalletas;
    private javax.swing.JLabel Label_numGalletas2;
    private javax.swing.JLabel Label_numGalletas3;
    private javax.swing.JLabel Label_repostero1;
    private javax.swing.JLabel Label_repostero2;
    private javax.swing.JLabel Label_repostero3;
    private javax.swing.JLabel Label_repostero4;
    private javax.swing.JLabel Label_repostero5;
    private javax.swing.JProgressBar barraH1;
    private javax.swing.JProgressBar barraH2;
    private javax.swing.JProgressBar barraH3;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonMin;
    private javax.swing.JLabel estado_almacen;
    private javax.swing.JLabel estado_cafetera;
    private javax.swing.JLabel estado_cafetera2;
    private javax.swing.JLabel estado_emp;
    private javax.swing.JLabel estado_emp2;
    private javax.swing.JLabel estado_emp3;
    private javax.swing.JLabel estado_repostero;
    private javax.swing.JLabel estado_repostero2;
    private javax.swing.JLabel estado_repostero3;
    private javax.swing.JLabel estado_repostero4;
    private javax.swing.JLabel estado_repostero5;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel numero_galletas;
    private javax.swing.JLabel numero_galletas2;
    private javax.swing.JLabel numero_galletas3;
    private javax.swing.JLabel tanda1_emp1;
    private javax.swing.JLabel tanda1_emp2;
    private javax.swing.JLabel tanda1_emp3;
    private javax.swing.JLabel tanda2_emp1;
    private javax.swing.JLabel tanda2_emp2;
    private javax.swing.JLabel tanda2_emp3;
    private javax.swing.JLabel tanda3_emp1;
    private javax.swing.JLabel tanda3_emp2;
    private javax.swing.JLabel tanda3_emp3;
    private javax.swing.JLabel tanda4_emp1;
    private javax.swing.JLabel tanda4_emp2;
    private javax.swing.JLabel tanda4_emp3;
    private javax.swing.JLabel tanda5_emp1;
    private javax.swing.JLabel tanda5_emp2;
    private javax.swing.JLabel tanda5_emp3;
    // End of variables declaration//GEN-END:variables
}
