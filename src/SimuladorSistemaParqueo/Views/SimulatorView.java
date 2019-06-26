
package SimuladorSistemaParqueo.Views;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class SimulatorView extends javax.swing.JFrame {
    int step=10;
    String car_folder="red_car";
    
    public SimulatorView() {
        initComponents(); 
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        car = new javax.swing.JLabel();
        garita_entrada = new javax.swing.JLabel();
        sensor_1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        sensor_2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        sensor_3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sensor_4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        sensor_5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sensor_6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        sensor_7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        sensor_8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        rdif_entrada = new javax.swing.JLabel();
        garita_salida = new javax.swing.JLabel();
        rdif_salida = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(-1, -1));
        setPreferredSize(new java.awt.Dimension(1500, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        car.setForeground(new java.awt.Color(255, 255, 255));
        car.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimuladorSistemaParqueo/Images/red_car/down.png"))); // NOI18N
        car.setText("0eeff6bc-759d-11e9-bbf6-1c39471aaa9f");
        car.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(car);
        car.setBounds(30, 0, 150, 150);
        car.getAccessibleContext().setAccessibleName("car");

        garita_entrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimuladorSistemaParqueo/Images/garita/Garita_entrada_Cerrada_Transparent.png"))); // NOI18N
        getContentPane().add(garita_entrada);
        garita_entrada.setBounds(990, 100, 340, 260);
        garita_entrada.getAccessibleContext().setAccessibleName("garita_entrada");

        sensor_1.setBackground(new java.awt.Color(51, 255, 0));
        sensor_1.setPreferredSize(new java.awt.Dimension(70, 170));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel5.setText("1");

        javax.swing.GroupLayout sensor_1Layout = new javax.swing.GroupLayout(sensor_1);
        sensor_1.setLayout(sensor_1Layout);
        sensor_1Layout.setHorizontalGroup(
            sensor_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sensor_1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        sensor_1Layout.setVerticalGroup(
            sensor_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sensor_1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        getContentPane().add(sensor_1);
        sensor_1.setBounds(40, 530, 70, 170);
        sensor_1.getAccessibleContext().setAccessibleName("Sensor_1");
        sensor_1.getAccessibleContext().setAccessibleDescription("");

        sensor_2.setBackground(new java.awt.Color(51, 255, 0));
        sensor_2.setMinimumSize(new java.awt.Dimension(0, 0));
        sensor_2.setPreferredSize(new java.awt.Dimension(70, 170));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel3.setText("2");

        javax.swing.GroupLayout sensor_2Layout = new javax.swing.GroupLayout(sensor_2);
        sensor_2.setLayout(sensor_2Layout);
        sensor_2Layout.setHorizontalGroup(
            sensor_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sensor_2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        sensor_2Layout.setVerticalGroup(
            sensor_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sensor_2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        getContentPane().add(sensor_2);
        sensor_2.setBounds(220, 530, 70, 170);
        sensor_2.getAccessibleContext().setAccessibleName("Sensor_2");

        sensor_3.setBackground(new java.awt.Color(51, 255, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setText("3");

        javax.swing.GroupLayout sensor_3Layout = new javax.swing.GroupLayout(sensor_3);
        sensor_3.setLayout(sensor_3Layout);
        sensor_3Layout.setHorizontalGroup(
            sensor_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sensor_3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        sensor_3Layout.setVerticalGroup(
            sensor_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sensor_3Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        getContentPane().add(sensor_3);
        sensor_3.setBounds(390, 530, 70, 170);
        sensor_3.getAccessibleContext().setAccessibleName("Sensor_3");

        sensor_4.setBackground(new java.awt.Color(51, 255, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel6.setText("4");

        javax.swing.GroupLayout sensor_4Layout = new javax.swing.GroupLayout(sensor_4);
        sensor_4.setLayout(sensor_4Layout);
        sensor_4Layout.setHorizontalGroup(
            sensor_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sensor_4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        sensor_4Layout.setVerticalGroup(
            sensor_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sensor_4Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        getContentPane().add(sensor_4);
        sensor_4.setBounds(560, 530, 70, 170);
        sensor_4.getAccessibleContext().setAccessibleName("Sensor_4");

        sensor_5.setBackground(new java.awt.Color(51, 255, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setText("5");

        javax.swing.GroupLayout sensor_5Layout = new javax.swing.GroupLayout(sensor_5);
        sensor_5.setLayout(sensor_5Layout);
        sensor_5Layout.setHorizontalGroup(
            sensor_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sensor_5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        sensor_5Layout.setVerticalGroup(
            sensor_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sensor_5Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        getContentPane().add(sensor_5);
        sensor_5.setBounds(720, 530, 70, 170);
        sensor_5.getAccessibleContext().setAccessibleName("Sensor_5");

        sensor_6.setBackground(new java.awt.Color(51, 255, 0));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel8.setText("6");
        jLabel8.setIconTextGap(6);

        javax.swing.GroupLayout sensor_6Layout = new javax.swing.GroupLayout(sensor_6);
        sensor_6.setLayout(sensor_6Layout);
        sensor_6Layout.setHorizontalGroup(
            sensor_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(sensor_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sensor_6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        sensor_6Layout.setVerticalGroup(
            sensor_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(sensor_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sensor_6Layout.createSequentialGroup()
                    .addGap(0, 58, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 59, Short.MAX_VALUE)))
        );

        getContentPane().add(sensor_6);
        sensor_6.setBounds(900, 530, 70, 170);
        sensor_6.getAccessibleContext().setAccessibleName("Sensor_6");

        sensor_7.setBackground(new java.awt.Color(51, 255, 0));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel11.setText("7");

        javax.swing.GroupLayout sensor_7Layout = new javax.swing.GroupLayout(sensor_7);
        sensor_7.setLayout(sensor_7Layout);
        sensor_7Layout.setHorizontalGroup(
            sensor_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(sensor_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sensor_7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        sensor_7Layout.setVerticalGroup(
            sensor_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(sensor_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sensor_7Layout.createSequentialGroup()
                    .addGap(0, 58, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 59, Short.MAX_VALUE)))
        );

        getContentPane().add(sensor_7);
        sensor_7.setBounds(1070, 530, 70, 170);
        sensor_7.getAccessibleContext().setAccessibleName("Sensor_7");

        sensor_8.setBackground(new java.awt.Color(51, 255, 0));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel12.setText("8");

        javax.swing.GroupLayout sensor_8Layout = new javax.swing.GroupLayout(sensor_8);
        sensor_8.setLayout(sensor_8Layout);
        sensor_8Layout.setHorizontalGroup(
            sensor_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sensor_8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel12)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        sensor_8Layout.setVerticalGroup(
            sensor_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sensor_8Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        getContentPane().add(sensor_8);
        sensor_8.setBounds(1250, 530, 70, 170);
        sensor_8.getAccessibleContext().setAccessibleName("Sensor_8");

        rdif_entrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimuladorSistemaParqueo/Images/garita/ridf_entrada.png"))); // NOI18N
        getContentPane().add(rdif_entrada);
        rdif_entrada.setBounds(1260, 190, 140, 180);
        rdif_entrada.getAccessibleContext().setAccessibleName("rdif_entrada");

        garita_salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimuladorSistemaParqueo/Images/garita/Garita_Salida_Cerrada_Transparent.png"))); // NOI18N
        getContentPane().add(garita_salida);
        garita_salida.setBounds(70, 80, 340, 260);
        garita_salida.getAccessibleContext().setAccessibleName("garita_salida");

        rdif_salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimuladorSistemaParqueo/Images/garita/ridf_salida.png"))); // NOI18N
        getContentPane().add(rdif_salida);
        rdif_salida.setBounds(0, 170, 130, 180);
        rdif_salida.getAccessibleContext().setAccessibleName("rdif_salida");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimuladorSistemaParqueo/Images/infotep_logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(430, 120, 500, 270);
        jLabel4.getAccessibleContext().setAccessibleName("logo_infotep");

        background.setBackground(new java.awt.Color(51, 255, 0));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimuladorSistemaParqueo/Images/background/Background.png"))); // NOI18N
        background.setAlignmentY(0.0F);
        background.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        background.setMaximumSize(new java.awt.Dimension(1360, 750));
        background.setMinimumSize(new java.awt.Dimension(1360, 750));
        background.setName(""); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1360, 750));
        getContentPane().add(background);
        background.setBounds(0, 0, 1360, 710);
        background.getAccessibleContext().setAccessibleName("background");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_UP:
                
                car.setIcon(new ImageIcon(getClass().getClassLoader().getResource("SimuladorSistemaParqueo/Images/red_car/up.png")));
                 
                car.setLocation(car.getLocation().x,((car.getLocation().y)-step));        
                break;
                
            case KeyEvent.VK_DOWN:
                
                car.setIcon(new ImageIcon(getClass().getClassLoader().getResource("SimuladorSistemaParqueo/Images/red_car/down.png")));

                //car.setLocation(car_x,car_y+=10);                
                car.setLocation(car.getLocation().x,((car.getLocation().y)+step));        
                break;
                
            case KeyEvent.VK_LEFT:
                
                car.setIcon(new ImageIcon(getClass().getClassLoader().getResource("SimuladorSistemaParqueo/Images/red_car/left.png")));

                car.setLocation(((car.getLocation().x)-step),car.getLocation().y);        

                break;
                
                
            case KeyEvent.VK_RIGHT:
                
                car.setIcon(new ImageIcon(getClass().getClassLoader().getResource("SimuladorSistemaParqueo/Images/red_car/right.png")));
                
                
                car.setLocation(((car.getLocation().x)+step),car.getLocation().y);        
                
                break;

            default:
                break;
        }

        verify_sensor();
    }//GEN-LAST:event_formKeyPressed

    public void verify_sensor(){
        
        //sensor_1
        if((car.getLocation().y > (sensor_1.getLocation().y-car.getSize().height)) & (car.getLocation().y < (sensor_1.getLocation().y+sensor_1.getSize().height)) & 
           (car.getLocation().x > (sensor_1.getLocation().x-car.getSize().width)) & (car.getLocation().x < (sensor_1.getLocation().x+sensor_1.getSize().width)))
        {
            sensor_1.setBackground(Color.red);
        }else{
            sensor_1.setBackground(Color.green);
        }   
 
        
        //sensor_2
        if((car.getLocation().y > (sensor_2.getLocation().y-car.getSize().height)) & (car.getLocation().y < (sensor_2.getLocation().y+sensor_2.getSize().height)) & 
           (car.getLocation().x > (sensor_2.getLocation().x-car.getSize().width)) & (car.getLocation().x < (sensor_2.getLocation().x+sensor_2.getSize().width)))
        {
            sensor_2.setBackground(Color.red);
        }else{
            sensor_2.setBackground(Color.green);
        }   
 
        //sensor_3
        if((car.getLocation().y > (sensor_3.getLocation().y-car.getSize().height)) & (car.getLocation().y < (sensor_3.getLocation().y+sensor_3.getSize().height)) & 
           (car.getLocation().x > (sensor_3.getLocation().x-car.getSize().width)) & (car.getLocation().x < (sensor_3.getLocation().x+sensor_3.getSize().width)))
        {
            sensor_3.setBackground(Color.red);
        }else{
            sensor_3.setBackground(Color.green);
        }   
 
        //sensor_4
        if((car.getLocation().y > (sensor_4.getLocation().y-car.getSize().height)) & (car.getLocation().y < (sensor_4.getLocation().y+sensor_4.getSize().height)) & 
           (car.getLocation().x > (sensor_4.getLocation().x-car.getSize().width)) & (car.getLocation().x < (sensor_4.getLocation().x+sensor_4.getSize().width)))
        {
            sensor_4.setBackground(Color.red);
        }else{
            sensor_4.setBackground(Color.green);
        }   
 
        
        //sensor_5
        if((car.getLocation().y > (sensor_5.getLocation().y-car.getSize().height)) & (car.getLocation().y < (sensor_5.getLocation().y+sensor_5.getSize().height)) & 
           (car.getLocation().x > (sensor_5.getLocation().x-car.getSize().width)) & (car.getLocation().x < (sensor_5.getLocation().x+sensor_5.getSize().width)))
        {
            sensor_5.setBackground(Color.red);
        }else{
            sensor_5.setBackground(Color.green);
        }   
 
        //sensor_6
        if((car.getLocation().y > (sensor_6.getLocation().y-car.getSize().height)) & (car.getLocation().y < (sensor_6.getLocation().y+sensor_6.getSize().height)) & 
           (car.getLocation().x > (sensor_6.getLocation().x-car.getSize().width)) & (car.getLocation().x < (sensor_6.getLocation().x+sensor_6.getSize().width)))
        {
            sensor_6.setBackground(Color.red);
        }else{
            sensor_6.setBackground(Color.green);
        }   
        
        //sensor_7
        if((car.getLocation().y > (sensor_7.getLocation().y-car.getSize().height)) & (car.getLocation().y < (sensor_7.getLocation().y+sensor_7.getSize().height)) & 
           (car.getLocation().x > (sensor_7.getLocation().x-car.getSize().width)) & (car.getLocation().x < (sensor_7.getLocation().x+sensor_7.getSize().width)))
        {
            sensor_7.setBackground(Color.red);
        }else{
            sensor_7.setBackground(Color.green);
        }   
        
        
        //sensor_8
        if((car.getLocation().y > (sensor_8.getLocation().y-car.getSize().height)) & (car.getLocation().y < (sensor_8.getLocation().y+sensor_8.getSize().height)) & 
           (car.getLocation().x > (sensor_8.getLocation().x-car.getSize().width)) & (car.getLocation().x < (sensor_8.getLocation().x+sensor_8.getSize().width)))
        {
            sensor_8.setBackground(Color.red);
        }else{
            sensor_8.setBackground(Color.green);
        }   
        
        //ridf_garita
        if((car.getLocation().y > (rdif_entrada.getLocation().y-car.getSize().height)) & (car.getLocation().y < (rdif_entrada.getLocation().y+rdif_entrada.getSize().height)) & 
            (car.getLocation().x > (rdif_entrada.getLocation().x-car.getSize().width)) & (car.getLocation().x < (rdif_entrada.getLocation().x+rdif_entrada.getSize().width)))
        {
            garita_entrada.setIcon(new ImageIcon(getClass().getClassLoader().getResource("SimuladorSistemaParqueo/Images/garita/Garita_entrada_Abierta_Transparent.png")));
        }else{
            garita_entrada.setIcon(new ImageIcon(getClass().getClassLoader().getResource("SimuladorSistemaParqueo/Images/garita/Garita_entrada_Cerrada_Transparent.png")));
        }
        
        
        
        //ridf_garita
        if((car.getLocation().y > (rdif_salida.getLocation().y-car.getSize().height)) & (car.getLocation().y < (rdif_salida.getLocation().y+rdif_salida.getSize().height)) & 
            (car.getLocation().x > (rdif_salida.getLocation().x-car.getSize().width)) & (car.getLocation().x < (rdif_salida.getLocation().x+rdif_salida.getSize().width)))
        {
            garita_salida.setIcon(new ImageIcon(getClass().getClassLoader().getResource("SimuladorSistemaParqueo/Images/garita/Garita_Salida_Abierta_Transparent.png")));
        }else{
            garita_salida.setIcon(new ImageIcon(getClass().getClassLoader().getResource("SimuladorSistemaParqueo/Images/garita/Garita_Salida_Cerrada_Transparent.png")));
        }
    }
    
    public static void main(String[] args) {
        new SimulatorView().setVisible(true);
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel car;
    private javax.swing.JLabel garita_entrada;
    private javax.swing.JLabel garita_salida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel rdif_entrada;
    private javax.swing.JLabel rdif_salida;
    private javax.swing.JPanel sensor_1;
    private javax.swing.JPanel sensor_2;
    private javax.swing.JPanel sensor_3;
    private javax.swing.JPanel sensor_4;
    private javax.swing.JPanel sensor_5;
    private javax.swing.JPanel sensor_6;
    private javax.swing.JPanel sensor_7;
    private javax.swing.JPanel sensor_8;
    // End of variables declaration//GEN-END:variables
}
