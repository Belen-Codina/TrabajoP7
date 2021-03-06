/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajop7;

import java.util.HashSet;

/**
 *
 * @author belen
 */
public class Menu extends javax.swing.JFrame {
 private static HashSet<Alumno> alumnos = new HashSet(); 
  private static HashSet<Materia> materias = new HashSet(); 
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMSalir = new javax.swing.JMenu();
        jMInstitucion = new javax.swing.JMenu();
        jMIformMaterias = new javax.swing.JMenuItem();
        jMIformAlumnes = new javax.swing.JMenuItem();
        jMIformInscripcion = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMSalir.setText("Salir");
        jMenuBar1.add(jMSalir);

        jMInstitucion.setText("Institucion");

        jMIformMaterias.setText("Formulario de Materias");
        jMIformMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIformMateriasActionPerformed(evt);
            }
        });
        jMInstitucion.add(jMIformMaterias);

        jMIformAlumnes.setText("Formulario de Alumnes");
        jMIformAlumnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIformAlumnesActionPerformed(evt);
            }
        });
        jMInstitucion.add(jMIformAlumnes);

        jMIformInscripcion.setText("Formulario de inscripcion");
        jMIformInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIformInscripcionActionPerformed(evt);
            }
        });
        jMInstitucion.add(jMIformInscripcion);

        jMenuBar1.add(jMInstitucion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIformMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIformMateriasActionPerformed
        // TODO add your handling code here:

     escritorio.removeAll();
     escritorio.repaint();
     VistaFormularioDeMaterias vfm= new VistaFormularioDeMaterias();
     vfm.setVisible(true);
     escritorio.add(vfm);
    }//GEN-LAST:event_jMIformMateriasActionPerformed

    private void jMIformAlumnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIformAlumnesActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();;
        escritorio.repaint();
          VistaFormularioDeAlumnos vfa= new VistaFormularioDeAlumnos();
            vfa.setVisible(true);
     escritorio.add(vfa);
    }//GEN-LAST:event_jMIformAlumnesActionPerformed

    private void jMIformInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIformInscripcionActionPerformed
        // TODO add your handling code here:
         escritorio.removeAll();;
        escritorio.repaint();
          VistaFormularioDeInscripcion vfi= new VistaFormularioDeInscripcion();
            vfi.setVisible(true);
     escritorio.add(vfi);
    }//GEN-LAST:event_jMIformInscripcionActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    public static  void agregarAlumnos(Alumno alumno){
       alumnos.add(alumno);
    }
     public static void agregarMaterias(Materia materia){
        materias.add(materia);
}

    public static HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    public static HashSet<Materia> getMaterias() {
        return materias;
    }
    
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMIformAlumnes;
    private javax.swing.JMenuItem jMIformInscripcion;
    private javax.swing.JMenuItem jMIformMaterias;
    private javax.swing.JMenu jMInstitucion;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
