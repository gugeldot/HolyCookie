package INTERFAZ;

import fabrica_galletas.*;

/**
 *
 * @author Gugeldot
 */
public class Principal extends javax.swing.JFrame implements Runnable {

    Horno[] hornos;
    Cafeteria cafe;
    Repostero[] reposteros;

    public Principal(Cafeteria cafe, Repostero[] reposteros, Horno[] hornos) {
        initComponents();
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setTitle("Fabrica Galletas -- Menu Principal "); // Asigna el título de la ventana

        this.cafe = cafe;
        this.hornos = hornos;
        this.reposteros = reposteros;

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
        estado_horno = new javax.swing.JLabel();
        estado_horno2 = new javax.swing.JLabel();
        estado_horno3 = new javax.swing.JLabel();
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
        botonComer = new javax.swing.JToggleButton();
        Label_cafetera1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);

        Label_repostero1.setBackground(new java.awt.Color(0, 0, 0));
        Label_repostero1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_repostero1.setText("Repostero 1");

        Label_cafetera.setBackground(new java.awt.Color(0, 0, 0));
        Label_cafetera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_cafetera.setText("Cafetera");

        estado_repostero.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero.setText("<ESTADO>");
        estado_repostero.setToolTipText("");
        estado_repostero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero.setOpaque(true);

        Label_repostero2.setBackground(new java.awt.Color(0, 0, 0));
        Label_repostero2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_repostero2.setText("Repostero 2");

        estado_repostero2.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero2.setText("<ESTADO>");
        estado_repostero2.setToolTipText("");
        estado_repostero2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero2.setOpaque(true);

        Label_repostero3.setBackground(new java.awt.Color(0, 0, 0));
        Label_repostero3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_repostero3.setText("Repostero 3");

        estado_repostero3.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero3.setText("<ESTADO>");
        estado_repostero3.setToolTipText("");
        estado_repostero3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero3.setOpaque(true);

        Label_repostero4.setBackground(new java.awt.Color(0, 0, 0));
        Label_repostero4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_repostero4.setText("Repostero 4");

        estado_repostero4.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero4.setText("<ESTADO>");
        estado_repostero4.setToolTipText("");
        estado_repostero4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero4.setOpaque(true);

        Label_repostero5.setBackground(new java.awt.Color(0, 0, 0));
        Label_repostero5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_repostero5.setText("Repostero 5");

        estado_repostero5.setBackground(new java.awt.Color(255, 255, 255));
        estado_repostero5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_repostero5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_repostero5.setText("<ESTADO>");
        estado_repostero5.setToolTipText("");
        estado_repostero5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_repostero5.setOpaque(true);

        Label_horno1.setBackground(new java.awt.Color(0, 0, 0));
        Label_horno1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_horno1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_horno1.setText("Horno 1");

        Label_horno2.setBackground(new java.awt.Color(0, 0, 0));
        Label_horno2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_horno2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_horno2.setText("Horno 2");

        Label_horno3.setBackground(new java.awt.Color(0, 0, 0));
        Label_horno3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_horno3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_horno3.setText("Horno 3");

        estado_cafetera.setBackground(new java.awt.Color(255, 255, 255));
        estado_cafetera.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_cafetera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_cafetera.setText("<ESTADO>");
        estado_cafetera.setToolTipText("");
        estado_cafetera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_cafetera.setOpaque(true);

        estado_cafetera2.setBackground(new java.awt.Color(255, 255, 255));
        estado_cafetera2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_cafetera2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        estado_cafetera2.setText("<ESTADO>");
        estado_cafetera2.setToolTipText("");
        estado_cafetera2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_cafetera2.setOpaque(true);

        Label_numGalletas.setBackground(new java.awt.Color(0, 0, 0));
        Label_numGalletas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_numGalletas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_numGalletas.setText("Número de galletas");

        Label_numGalletas2.setBackground(new java.awt.Color(0, 0, 0));
        Label_numGalletas2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_numGalletas2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_numGalletas2.setText("Número de galletas");

        Label_numGalletas3.setBackground(new java.awt.Color(0, 0, 0));
        Label_numGalletas3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_numGalletas3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_numGalletas3.setText("Número de galletas");

        numero_galletas.setBackground(new java.awt.Color(255, 255, 255));
        numero_galletas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numero_galletas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numero_galletas.setText("<X>");
        numero_galletas.setToolTipText("");
        numero_galletas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        numero_galletas.setOpaque(true);

        numero_galletas2.setBackground(new java.awt.Color(255, 255, 255));
        numero_galletas2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numero_galletas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numero_galletas2.setText("<X>");
        numero_galletas2.setToolTipText("");
        numero_galletas2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        numero_galletas2.setOpaque(true);

        numero_galletas3.setBackground(new java.awt.Color(255, 255, 255));
        numero_galletas3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numero_galletas3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numero_galletas3.setText("<X>");
        numero_galletas3.setToolTipText("");
        numero_galletas3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        numero_galletas3.setOpaque(true);

        Label_horneando2.setBackground(new java.awt.Color(0, 0, 0));
        Label_horneando2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_horneando2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_horneando2.setText("Horneando");

        Label_horneando.setBackground(new java.awt.Color(0, 0, 0));
        Label_horneando.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_horneando.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_horneando.setText("Horneando");

        Label_horneando3.setBackground(new java.awt.Color(0, 0, 0));
        Label_horneando3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_horneando3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_horneando3.setText("Horneando");

        Label_emp2.setBackground(new java.awt.Color(0, 0, 0));
        Label_emp2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_emp2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_emp2.setText("Empaquetador 2");

        Label_emp.setBackground(new java.awt.Color(0, 0, 0));
        Label_emp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_emp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_emp.setText("Empaquetador 1");

        Label_emp3.setBackground(new java.awt.Color(0, 0, 0));
        Label_emp3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_emp3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_emp3.setText("Empaquetador 3");

        estado_emp.setBackground(new java.awt.Color(255, 255, 255));
        estado_emp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_emp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_emp.setText("<ESTADO>");
        estado_emp.setToolTipText("");
        estado_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_emp.setOpaque(true);

        estado_emp2.setBackground(new java.awt.Color(255, 255, 255));
        estado_emp2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_emp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_emp2.setText("<ESTADO>");
        estado_emp2.setToolTipText("");
        estado_emp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_emp2.setOpaque(true);

        estado_emp3.setBackground(new java.awt.Color(255, 255, 255));
        estado_emp3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_emp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_emp3.setText("<ESTADO>");
        estado_emp3.setToolTipText("");
        estado_emp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_emp3.setOpaque(true);

        Label_almacen.setBackground(new java.awt.Color(0, 0, 0));
        Label_almacen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_almacen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_almacen.setText("Almacen");

        estado_almacen.setBackground(new java.awt.Color(255, 255, 255));
        estado_almacen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_almacen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_almacen.setText("<ESTADO>");
        estado_almacen.setToolTipText("");
        estado_almacen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_almacen.setOpaque(true);

        estado_horno.setBackground(new java.awt.Color(255, 255, 255));
        estado_horno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_horno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_horno.setText("BARRA");
        estado_horno.setToolTipText("");
        estado_horno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_horno.setOpaque(true);

        estado_horno2.setBackground(new java.awt.Color(255, 255, 255));
        estado_horno2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_horno2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_horno2.setText("BARRA");
        estado_horno2.setToolTipText("");
        estado_horno2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_horno2.setOpaque(true);

        estado_horno3.setBackground(new java.awt.Color(255, 255, 255));
        estado_horno3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estado_horno3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado_horno3.setText("BARRA");
        estado_horno3.setToolTipText("");
        estado_horno3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        estado_horno3.setOpaque(true);

        tanda1_emp1.setBackground(new java.awt.Color(255, 255, 255));
        tanda1_emp1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda1_emp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda1_emp1.setToolTipText("");
        tanda1_emp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda1_emp1.setOpaque(true);

        tanda2_emp1.setBackground(new java.awt.Color(255, 255, 255));
        tanda2_emp1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda2_emp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda2_emp1.setToolTipText("");
        tanda2_emp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda2_emp1.setOpaque(true);

        tanda3_emp1.setBackground(new java.awt.Color(255, 255, 255));
        tanda3_emp1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda3_emp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda3_emp1.setToolTipText("");
        tanda3_emp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda3_emp1.setOpaque(true);

        tanda4_emp1.setBackground(new java.awt.Color(255, 255, 255));
        tanda4_emp1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda4_emp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda4_emp1.setToolTipText("");
        tanda4_emp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda4_emp1.setOpaque(true);

        tanda5_emp1.setBackground(new java.awt.Color(255, 255, 255));
        tanda5_emp1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda5_emp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda5_emp1.setToolTipText("");
        tanda5_emp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda5_emp1.setOpaque(true);

        tanda1_emp2.setBackground(new java.awt.Color(255, 255, 255));
        tanda1_emp2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda1_emp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda1_emp2.setToolTipText("");
        tanda1_emp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda1_emp2.setOpaque(true);

        tanda2_emp2.setBackground(new java.awt.Color(255, 255, 255));
        tanda2_emp2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda2_emp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda2_emp2.setToolTipText("");
        tanda2_emp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda2_emp2.setOpaque(true);

        tanda3_emp2.setBackground(new java.awt.Color(255, 255, 255));
        tanda3_emp2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda3_emp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda3_emp2.setToolTipText("");
        tanda3_emp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda3_emp2.setOpaque(true);

        tanda4_emp2.setBackground(new java.awt.Color(255, 255, 255));
        tanda4_emp2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda4_emp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda4_emp2.setToolTipText("");
        tanda4_emp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda4_emp2.setOpaque(true);

        tanda5_emp2.setBackground(new java.awt.Color(255, 255, 255));
        tanda5_emp2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda5_emp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda5_emp2.setToolTipText("");
        tanda5_emp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda5_emp2.setOpaque(true);

        tanda1_emp3.setBackground(new java.awt.Color(255, 255, 255));
        tanda1_emp3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda1_emp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda1_emp3.setToolTipText("");
        tanda1_emp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda1_emp3.setOpaque(true);

        tanda2_emp3.setBackground(new java.awt.Color(255, 255, 255));
        tanda2_emp3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda2_emp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda2_emp3.setToolTipText("");
        tanda2_emp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda2_emp3.setOpaque(true);

        tanda3_emp3.setBackground(new java.awt.Color(255, 255, 255));
        tanda3_emp3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda3_emp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda3_emp3.setToolTipText("");
        tanda3_emp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda3_emp3.setOpaque(true);

        tanda4_emp3.setBackground(new java.awt.Color(255, 255, 255));
        tanda4_emp3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda4_emp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda4_emp3.setToolTipText("");
        tanda4_emp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda4_emp3.setOpaque(true);

        tanda5_emp3.setBackground(new java.awt.Color(255, 255, 255));
        tanda5_emp3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tanda5_emp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanda5_emp3.setToolTipText("");
        tanda5_emp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tanda5_emp3.setOpaque(true);

        botonComer.setBackground(new java.awt.Color(204, 204, 204));
        botonComer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonComer.setText("COMER");
        botonComer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonComer.setOpaque(true);
        botonComer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComerActionPerformed(evt);
            }
        });

        Label_cafetera1.setBackground(new java.awt.Color(0, 0, 0));
        Label_cafetera1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_cafetera1.setText("Descansando");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(estado_horno, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_emp))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estado_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tanda1_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanda2_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanda3_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanda4_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanda5_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(Label_numGalletas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(Label_horno1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tanda1_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tanda2_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tanda3_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tanda4_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tanda5_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tanda1_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tanda2_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tanda3_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tanda4_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tanda5_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(botonComer, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estado_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(estado_horno2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Label_emp2)
                                        .addComponent(estado_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Label_horno2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(Label_numGalletas2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Label_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(174, 174, 174)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label_emp3)
                                        .addComponent(estado_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(estado_horno3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(Label_numGalletas3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Label_horno3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(121, 121, 121))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(Label_horneando, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(numero_galletas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_horneando2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero_galletas2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(numero_galletas3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(Label_horneando3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(141, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Label_repostero1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(estado_repostero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Label_repostero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(estado_repostero2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Label_repostero3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(estado_repostero3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Label_repostero4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(estado_repostero4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Label_repostero5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(estado_repostero5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estado_cafetera, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label_cafetera, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_cafetera1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estado_cafetera2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_cafetera, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_cafetera1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado_cafetera)
                    .addComponent(estado_cafetera2))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Label_repostero2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Label_repostero1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(estado_repostero2))
                        .addComponent(estado_repostero)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Label_repostero3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(estado_repostero3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Label_repostero4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(estado_repostero4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_repostero5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estado_repostero5)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_horno1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_horno2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_horno3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_numGalletas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_numGalletas2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_numGalletas3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero_galletas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero_galletas2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero_galletas3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_horneando2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_horneando3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_horneando, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado_horno)
                    .addComponent(estado_horno2)
                    .addComponent(estado_horno3))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado_emp)
                    .addComponent(estado_emp2)
                    .addComponent(estado_emp3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tanda1_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanda2_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanda3_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanda4_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanda5_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanda1_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanda2_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanda3_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanda4_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanda5_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanda3_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanda4_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanda5_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanda2_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanda1_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(Label_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estado_almacen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonComer)
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonComerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonComerActionPerformed

    public void run() {
        while (true) {
            estado_cafetera.setText(cafe.getIdOcupado());
            estado_cafetera2.setText(getEstadoCafetera2());
            numero_galletas.setText(String.valueOf(hornos[0].getCapacidad_actual()));
            numero_galletas2.setText(String.valueOf(hornos[1].getCapacidad_actual()));
            numero_galletas3.setText(String.valueOf(hornos[2].getCapacidad_actual()));

            estado_horno.setText(String.valueOf(hornos[0].isHorneando()));
            estado_horno2.setText(String.valueOf(hornos[1].isHorneando()));
            estado_horno3.setText(String.valueOf(hornos[2].isHorneando()));
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
    private javax.swing.JToggleButton botonComer;
    private javax.swing.JLabel estado_almacen;
    private javax.swing.JLabel estado_cafetera;
    private javax.swing.JLabel estado_cafetera2;
    private javax.swing.JLabel estado_emp;
    private javax.swing.JLabel estado_emp2;
    private javax.swing.JLabel estado_emp3;
    private javax.swing.JLabel estado_horno;
    private javax.swing.JLabel estado_horno2;
    private javax.swing.JLabel estado_horno3;
    private javax.swing.JLabel estado_repostero;
    private javax.swing.JLabel estado_repostero2;
    private javax.swing.JLabel estado_repostero3;
    private javax.swing.JLabel estado_repostero4;
    private javax.swing.JLabel estado_repostero5;
    private javax.swing.JPanel jPanel1;
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
