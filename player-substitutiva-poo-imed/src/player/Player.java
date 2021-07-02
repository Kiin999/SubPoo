package player;



import entidades.Compositor;
import entidades.Musica;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import playlist.Playlist;
import playlist.PlaylistBase;




public class Player extends javax.swing.JFrame implements InterfacePlayerBar {

    
    public Player() {
        initComponents();
        createPlaylists();
        lista();
        selectMusic();
        
    }
    ArrayList<Playlist> playlist1 = new ArrayList();
    DefaultListModel<String> lista = new DefaultListModel<>();
    int lista_index = 0;
    int musica_index = 0;
          
            
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeMusica = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        btnProxima = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        lblVolume = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstGeneros = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btnAumentaVolume = new javax.swing.JButton();
        btnDiminuiVolume = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeMusica.setBackground(new java.awt.Color(255, 255, 255));
        lblNomeMusica.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNomeMusica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeMusica.setText("Nome da música - Autor (genero)");
        lblNomeMusica.setToolTipText("");

        btnPlay.setText("Pause/Play");
        btnPlay.setToolTipText("");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        btnProxima.setText("Próxima");
        btnProxima.setToolTipText("Próxima música");
        btnProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximaActionPerformed(evt);
            }
        });

        btnAnterior.setText("Anterior");
        btnAnterior.setToolTipText("Voltar à música anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        lblVolume.setText("Volume");

        lstGeneros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstGenerosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstGeneros);

        jLabel2.setText("Playlists");

        btnAumentaVolume.setText("+");
        btnAumentaVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentaVolumeActionPerformed(evt);
            }
        });

        btnDiminuiVolume.setText("-");
        btnDiminuiVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiminuiVolumeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addComponent(jLabel2))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAnterior)
                                        .addGap(92, 92, 92)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnPlay)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnDiminuiVolume)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAumentaVolume)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProxima))
                            .addComponent(lblNomeMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(lblVolume)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblNomeMusica)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlay)
                    .addComponent(btnProxima)
                    .addComponent(btnAnterior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVolume)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDiminuiVolume)
                    .addComponent(btnAumentaVolume))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     int volume = 0;
     
    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        
        if (btnPlay.getText() == "Pause/Play"){
            btnPlay.setText("Pause");
        }
        else if ("Pause" == btnPlay.getText()){
            btnPlay.setText("Play");
    }
        else if (btnPlay.getText() == "Play")   
            btnPlay.setText("Pause");
    }//GEN-LAST:event_btnPlayActionPerformed
        
    
    private void btnAumentaVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentaVolumeActionPerformed
        volume = volume + 1;
        if (volume > 10){
            volume = 10;
        }
        String volumeStr = String.valueOf(volume);
        lblVolume.setText(volumeStr); 
        
            
    }//GEN-LAST:event_btnAumentaVolumeActionPerformed

    
    private void btnDiminuiVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiminuiVolumeActionPerformed
        volume = volume - 1;
        if (volume < 0){
            volume = 0;
        }
        String volumeStr = String.valueOf(volume);
        lblVolume.setText(volumeStr);                
    }//GEN-LAST:event_btnDiminuiVolumeActionPerformed

    
    private void lstGenerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstGenerosMouseClicked
        lista_index = lstGeneros.getSelectedIndex();
        musica_index = 0;
        selectMusic();
        
    }//GEN-LAST:event_lstGenerosMouseClicked

    
    private void btnProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximaActionPerformed
        changeIndex(true);
    }//GEN-LAST:event_btnProximaActionPerformed

    
    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        changeIndex(false);
    }//GEN-LAST:event_btnAnteriorActionPerformed
    public void selectMusic(){
        Musica aux = playlist1.get(lista_index).getMusica(musica_index);
        lblNomeMusica.setText(aux.getNome() + " - " + aux.getCompositor().getCompositor() + "(" + aux.getGenero() + ")");
    }
    
    public void changeIndex(boolean change){
        if (change){
            musica_index++;          
        }
        else
            musica_index--;
        if (musica_index >= playlist1.get(lista_index).getSize()){
            musica_index = 0;
            lista_index++;
            if (lista_index >= playlist1.size()){
                lista_index = 0;               
            }       
        }
        else if (musica_index < 0){           
            lista_index--;
            if (lista_index <0){
                lista_index = playlist1.size()-1;
            }
            musica_index = playlist1.get(lista_index).getSize()-1;           
        }
        selectMusic();
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Player().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnAumentaVolume;
    private javax.swing.JButton btnDiminuiVolume;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnProxima;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeMusica;
    private javax.swing.JLabel lblVolume;
    private javax.swing.JList<String> lstGeneros;
    // End of variables declaration//GEN-END:variables
    public void createPlaylists(){
        Playlist pl1 = new Playlist("Pagode","Zeca Pagodinho");
        ;
        pl1.addMusica(new Musica("Verdade", "Compositor", "Gênero"));
        pl1.addMusica(new Musica("Conflito ", "Compositor", "Gênero"));
        pl1.addMusica(new Musica("Vou Botar Teu Nome Na Macumba", "Compositor", "Gênero"));                
        playlist1.add(pl1);
        
        pl1 = new Playlist("Alternativo", "Rogério Skylab");
        pl1.addMusica(new Musica("Motosserra", "Compositor", "Gênero"));
        pl1.addMusica(new Musica("Chico Xavier", "Compositor", "Gênero"));
        pl1.addMusica(new Musica("Matador de Passarinho", "Compositor", "Gênero"));        
        playlist1.add(pl1);
        
        pl1 = new Playlist("Lofi", "Tim Maia");
        pl1.addMusica(new Musica("Primavera", "Compositor", "Gênero"));
        pl1.addMusica(new Musica("Ela Partiu", "Compositor", "Gênero"));
        pl1.addMusica(new Musica("Azul da Cor do Mar", "Compositor", "Gênero"));
        playlist1.add(pl1);
             
    }
        private void lista(){
            this.lstGeneros.setModel(lista);
            for (Playlist pl : playlist1){
                this.lista.addElement(pl.getNome() + "(" + pl.getGenero() + ")");
            }
       
        }
    @Override
    public void addPlaylist(PlaylistBase playlist) {
    }

    @Override
    public PlaylistBase getPlaylist(int indice) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlaylistBase getPlaylist(PlaylistBase playlist) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Musica getMusicaAtual() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean tocandoUltimaMusica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean tocandoPrimeiraMusica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Musica proximaMusica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Musica musicaAnterior() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
