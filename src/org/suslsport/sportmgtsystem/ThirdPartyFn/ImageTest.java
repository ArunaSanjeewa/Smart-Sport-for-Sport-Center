/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.suslsport.sportmgtsystem.ThirdPartyFn;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author RedHunter
 */
public class ImageTest {
    public static void setImage(JPanel jp,ImageIcon icon){
        ImagePanel panel = new ImagePanel(icon.getImage());
        panel.setSize(1360, 610);
        
        jp.add(panel);
        panel.setVisible(true);
        
        
        
    
    }

//  public static void main(String[] args) {
//      JPanel jp = new JPanel();
//      jp.setSize(1360, 610);
//    ImagePanel panel = new ImagePanel(new ImageIcon("G:\\Java Learning\\Smart_Sport\\test\\SmartSportTest\\02.jpg").getImage());
//
//    JFrame frame = new JFrame();
//    frame.setSize(1360, 610);
//    frame.add(jp);
//    
//    jp.add(panel);
//    jp.setVisible(true);
//    frame.setVisible(true);
//  }
}

class ImagePanel extends JPanel {

  private Image img;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img) {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }

  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }

}