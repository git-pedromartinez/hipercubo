/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Cubes.Cubes;
import Cubes.CubesJFrame;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Jiro
 */
public class pantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form pantallaPrincipal
     */
    CubesJFrame cubesJFrame;
    public pantallaPrincipal() {
        initComponents();
        this.setTitle("Hipercubos");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpControles = new javax.swing.JPanel();
        txtReceptor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmisor = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jpRutas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jspRutas = new javax.swing.JScrollPane();
        txtRutas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtReceptor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReceptorKeyTyped(evt);
            }
        });

        jLabel3.setText("Receptor:");

        jLabel4.setText("Emisor:");

        txtEmisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmisorActionPerformed(evt);
            }
        });
        txtEmisor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmisorKeyTyped(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpControlesLayout = new javax.swing.GroupLayout(jpControles);
        jpControles.setLayout(jpControlesLayout);
        jpControlesLayout.setHorizontalGroup(
            jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpControlesLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlesLayout.createSequentialGroup()
                        .addComponent(btnEnviar)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlesLayout.createSequentialGroup()
                        .addGroup(jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtReceptor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmisor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpControlesLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addContainerGap(110, Short.MAX_VALUE)))
        );
        jpControlesLayout.setVerticalGroup(
            jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnEnviar)
                .addContainerGap())
            .addGroup(jpControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpControlesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4)
                    .addGap(26, 26, 26)
                    .addComponent(jLabel3)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );

        jLabel1.setText("Posibles Rutas:");

        txtRutas.setEditable(false);
        txtRutas.setColumns(20);
        txtRutas.setRows(5);
        jspRutas.setViewportView(txtRutas);

        javax.swing.GroupLayout jpRutasLayout = new javax.swing.GroupLayout(jpRutas);
        jpRutas.setLayout(jpRutasLayout);
        jpRutasLayout.setHorizontalGroup(
            jpRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRutasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRutasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspRutas, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
        );
        jpRutasLayout.setVerticalGroup(
            jpRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRutasLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspRutas, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpRutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpRutas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmisorActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        this.txtRutas.setText("");
        if(this.txtEmisor.getText().length()<4 ||this.txtReceptor.getText().length()<4){
        }else{
            ArrayList<String> caminos=obtenerCamino(2,xor(this.txtEmisor.getText(), this.txtReceptor.getText()),this.txtEmisor.getText());
            Object[] arreglo;
            Object[] arreglo2;
            arreglo2=obtenerCamino(1,xor(this.txtEmisor.getText(), this.txtReceptor.getText()),this.txtEmisor.getText()).toArray();
            int[] camino=new int[arreglo2.length];
            arreglo = caminos.toArray();
            for(int i = 0; i < arreglo.length; i++) {
                this.txtRutas.append(arreglo[i].toString());
                this.txtRutas.append("\n");
            }
            for(int i = 0; i < arreglo2.length; i++) {
                camino[i]=Integer.parseInt (arreglo2[i].toString());
            }
            /////////////////////////////////////checar
            cubesJFrame= new CubesJFrame(camino,Arrays.toString(camino));
            
            ///////////////////////////////////////
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtEmisorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmisorKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo 0's y 1's");
        } else if (this.txtEmisor.getText().length()>=4) {
            if( validar=='8'||validar=='9'||validar=='2' || validar=='3'||validar=='4' || validar=='5'||validar=='6' || validar=='7'){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "solo se permiten direcciones de 4 digitos y que sean 0's o 1's");
        }else{
            evt.consume();
            if(this.txtReceptor.getText().length()==4){
            this.btnEnviar.requestFocus();
            }else{this.txtReceptor.requestFocus();}
            }
        }else if( validar=='8'||validar=='9'||validar=='2' || validar=='3'||validar=='4' || validar=='5'||validar=='6' || validar=='7'){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo 0's y 1's");
        }
    }//GEN-LAST:event_txtEmisorKeyTyped

    private void txtReceptorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReceptorKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo 0's y 1's");
        } else if (this.txtReceptor.getText().length()>=4) {
            if( validar=='8'||validar=='9'||validar=='2' || validar=='3'||validar=='4' || validar=='5'||validar=='6' || validar=='7'){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "solo se permiten direcciones de 4 digitos y que sean 0's o 1's");
        }else{
            evt.consume();
            this.btnEnviar.requestFocus();
            }
        }else if( validar=='8'||validar=='9'||validar=='2' || validar=='3'||validar=='4' || validar=='5'||validar=='6' || validar=='7'){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo 0's y 1's");
        }
    }//GEN-LAST:event_txtReceptorKeyTyped
 
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
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaPrincipal().setVisible(true);
            }
        });
    }
    public static String xor(String emisor,String receptor){
        String resultado="";
        char[] emisorc = emisor.toCharArray();
        char[] receptorc = receptor.toCharArray();
        for(int i=0;i<4;i++){
           if(emisorc[i]==receptorc[i]){
               resultado=resultado.concat("0");
           }else{
               resultado = resultado.concat("1");
           }
        }
        
        return resultado;
    }
    public static ArrayList obtenerCamino(int tipo,String path,String emisor){
        /*
        devuelve un array con todos los nodos a visitar.
        */
        ArrayList camino = new ArrayList();
        camino=aDecimal(tipo,path,emisor);
        
        return camino;
    }
    private static ArrayList aDecimal(int tipo, String path, String emisor) {
         /*
        salto diagonal    vertical    horizontal
        1     1           1           1
        devuelve un array con todos los nodos a visitar o todos los caminos si se elige un tipo diferente de 1.
        path ejemplo: "sdh" (segun la letra cambia el digito y posteriormente se guarda en un array)
        emisor ejemplo: 0110
        receptor ejemplo: 1011
        emisor              0110->6
                            s
                            1110->14
                             d
                            1010->10
                               h
        receptor            1011->11
        */
        ArrayList<String> caminos = generarCaminos(path);
        ArrayList caminosDecimal = new ArrayList();
        long numeroDecimal;
        String elegido = "";
        int size;
        if (tipo == 1) {
            elegido = caminos.get((int) (Math.random() * (caminos.size() )));
            size = 1;
        } else {
            elegido = caminos.get(0);
            size = caminos.size();
            
        }
        ArrayList camino = new ArrayList();
        for (int k = 0; k < size; k++) {
            numeroDecimal = Long.parseLong(emisor, 2);
            camino.add(numeroDecimal);
            char[] elegidochar = elegido.toCharArray();
            String aux = "";
            char[] direccion = emisor.toCharArray();
            for (int i = 0; i < elegidochar.length; i++) {
                switch (elegidochar[i]) {
                    case 's':
                        if (direccion[0] == '1') {
                            direccion[0] = '0';
                        } else {
                            direccion[0] = '1';
                        }

                        for (int j = 0; j < 4; j++) {
                            aux = aux.concat(direccion[j] + "");
                        }
                        numeroDecimal = Long.parseLong(aux, 2);
                        camino.add(numeroDecimal);
                        aux = "";
                        break;
                    case 'd':
                        if (direccion[1] == '1') {
                            direccion[1] = '0';
                        } else {
                            direccion[1] = '1';
                        }

                        for (int j = 0; j < 4; j++) {
                            aux = aux.concat(direccion[j] + "");
                        }
                        numeroDecimal = Long.parseLong(aux, 2);
                        camino.add(numeroDecimal);
                        aux = "";
                        break;
                    case 'v':
                        if (direccion[2] == '1') {
                            direccion[2] = '0';
                        } else {
                            direccion[2] = '1';
                        }

                        for (int j = 0; j < 4; j++) {
                            aux = aux.concat(direccion[j] + "");
                        }
                        numeroDecimal = Long.parseLong(aux, 2);
                        camino.add(numeroDecimal);
                        aux = "";
                        break;
                    case 'h':
                        if (direccion[3] == '1') {
                            direccion[3] = '0';
                        } else {
                            direccion[3] = '1';
                        }

                        for (int j = 0; j < 4; j++) {
                            aux = aux.concat(direccion[j] + "");
                        }
                        numeroDecimal = Long.parseLong(aux, 2);
                        camino.add(numeroDecimal);
                        aux = "";
                        break;
                    default:
                        break;
                }
            }
            if (tipo != 1 && k+1 <caminos.size()) {
                caminosDecimal.add(k, camino.clone());
                elegido = caminos.get(k+1);
                camino.clear();
            }else if(tipo != 1){
                caminosDecimal.add(k, camino.clone());
            }
        }
        if (tipo == 1) {
            return camino;
        } else {
            return caminosDecimal;
        }
    }

    public static ArrayList generarCaminos(String valor) {
        /*
        salto diagonal    vertical    horizontal
        1     1           1           1
        devuelve un array con todos los posibles caminos mediante una semilla
        path ejemplo: "1101" (segun la posicion del 1 se cambia a una letra ignorando los 0's y posteriormente se guarda en un array)
        1101->s101
        s101->sd01
        sd01->sd 1
        sd 1->sd h
        path con formato direccion: sdh
        se crean las permutaciones de sdh y se guardan en un arraylist que regresado
        */
        ArrayList<String> caminos = new ArrayList<>();
        String path2 = "";
        char[] path = valor.toCharArray();
        if (path[0] == '1') {
            path2 = path2 + 's';
        }
        if (path[1] == '1') {
            path2 = path2 + 'd';
        }
        if (path[2] == '1') {
            path2 = path2 + 'v';
        }
        if (path[3] == '1') {
            path2 = path2 + 'h';
        }
        permuta(path2, caminos);
        return caminos;
    }

    private static void permuta(String str, ArrayList caminos) {
        StringBuffer strBuf = new StringBuffer(str);
        doPerm(strBuf, str.length(), caminos);
        int i = 0;
    }

    private static void doPerm(StringBuffer str, int index, ArrayList caminos) {

        if (index <= 0) {
            caminos.add(str.toString());
        } else { //recursively solve this by placing all other chars at current first pos 
            doPerm(str, index - 1, caminos);
            int currPos = str.length() - index;
            for (int i = currPos + 1; i < str.length(); i++) {//start swapping all other chars with current first char 
                swap(str, currPos, i);
                doPerm(str, index - 1, caminos);
                swap(str, i, currPos);//restore back my string buffer 
            }
        }
    }

    private static void swap(StringBuffer str, int pos1, int pos2) {
        char t1 = str.charAt(pos1);
        str.setCharAt(pos1, str.charAt(pos2));
        str.setCharAt(pos2, t1);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jpControles;
    private javax.swing.JPanel jpRutas;
    private javax.swing.JScrollPane jspRutas;
    private javax.swing.JTextField txtEmisor;
    private javax.swing.JTextField txtReceptor;
    private javax.swing.JTextArea txtRutas;
    // End of variables declaration//GEN-END:variables
}
