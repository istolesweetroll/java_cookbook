/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ksiazkakucharska;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author aldil
 */
public class View {

    public void wyswietl_caly_przepis(Recipe przepis, JLabel miejscenazdjecie, JLabel miejscenatekst, String tekstprzepisu) {
        ImageIcon iconLogo = new ImageIcon(przepis.getImagePath());
        miejscenazdjecie.setIcon(iconLogo);
        miejscenatekst.setText(tekstprzepisu);
    }

    public void wyswietl_zdjecie_i_tytul(Recipe przepis, JLabel miejscenazdjecie, JLabel miejscenatekst) {
        ImageIcon iconLogo = new ImageIcon(przepis.getImagePath());
        miejscenazdjecie.setText("");
        miejscenazdjecie.setIcon(iconLogo);
        miejscenatekst.setText(przepis.getTitle());
    }
}
