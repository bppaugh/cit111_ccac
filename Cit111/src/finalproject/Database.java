/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author brody.paugh
 */
public class Database extends JPanel {

    private static boolean DEBUG = false;
    

    public Database() {
        super(new GridLayout(1, 0));
        ExtractInfo stats = new ExtractInfo();

        String[] ColumnNames = {"Team", "Left Tackle", "Left Guard", "Center",
            "Right Guard", "Right Tackle", "Overall Rank"};

        Object[][] data = {
            {stats.Team, stats.LTackle, stats.LGuard, stats.Center, stats.RGuard,
                stats.RTackle, stats.ranking}

        };

        final JTable table = new JTable(data, ColumnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);

        if (DEBUG) {
            table.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    printDebugData(table);
                }
            });

        }
        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane);

    }//end database

    private void printDebugData(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();

        System.out.println("Value of data: ");
        for (int i = 0; i < numRows; i++) {
            System.out.print("  row" + i + ":");
            for (int j = 0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------");

    }//end printDebugData

    private static void creatAndShowGUI() {
        JFrame frame = new JFrame("oline Database");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Database newContentPane = new Database();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        frame.pack();
        frame.setVisible(true);
    }//end createAndSgowGUI

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                creatAndShowGUI();
            }
        });
    }

    public static void pullData() {
        ExtractInfo lineup = new ExtractInfo();
        boolean more = true;
        while (more == true) {
            System.out.println(lineup.lineup[0]);

        }
    }
}//end class


