package com.rizkykhapidsyah;

/* Created by Rizky Khapidsyah */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class FormUtama extends JFrame {

    JLabel LabelUtama;
    JList ListUtama;
    String daftarPemrograman[] = {
            "Pemrograman Assembly",
            "Pemrograman C",
            "Pemrograman C++",
            "Pemrograman C#",
            "Pemrograman Java",
            "Pemrograman JavaScript",
            "Pemrograman Kotlin"
    };

    public FormUtama() {
        super("ToolTips Dengan Gambar");
        InisialisasiKomponen();
    }

    public void InisialisasiKomponen() {
        aturKomponen_ToolTips();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void aturKomponen_ToolTips() {
        LabelUtama = new JLabel("Programming");
        LabelUtama.setToolTipText("<html>" + "<img src=\"file:images/assembly.jpg\">" + "</html>");
        LabelUtama.setFont(new Font("Tahoma", Font.BOLD, 16));
        LabelUtama.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        add(LabelUtama, BorderLayout.NORTH);

        ListUtama = new JList() {
            public String getToolTipText(MouseEvent e) {
                int Indeks = locationToIndex(e.getPoint());

                if (-1 < Indeks) {
                    String Biji = "<html>" + "<img src=\"file:images/" + daftarPemrograman[Indeks] + ".jpg\">" + "</html>";
                    return Biji;
                } else {
                    return null;
                }
            }
        };

        ListUtama.setListData(daftarPemrograman);
        ListUtama.setFont(new Font("Tahoma", Font.PLAIN, 14));
        ListUtama.setPreferredSize(new Dimension(300, 200));
        add(ListUtama, BorderLayout.CENTER);
    }

}
