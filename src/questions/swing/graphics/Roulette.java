package questions.swing.graphics;

import questions.swing.logic.Logic;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Roulette {
    private JFrame mainFrame;
    private JPanel contentPanel;
    private LabelTextFieldPanel labelTextFieldPanel;
    private ButtonPanel buttonPanel;

    public Roulette(){
        initialize();
        setMenuBar();
        contentPanel.setLayout(new BorderLayout(10,0));
        contentPanel.setBorder(new EmptyBorder(10,10,10,10));

        contentPanel.add(labelTextFieldPanel.getContentPanel(),BorderLayout.CENTER);
        contentPanel.add(buttonPanel.getContentPanel(),BorderLayout.EAST);

        mainFrame.add(contentPanel);
        mainFrame.setSize(640,360);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
    private void initialize(){
        mainFrame = new JFrame();
        mainFrame.setTitle("Q15");
        contentPanel = new JPanel();
        labelTextFieldPanel = new LabelTextFieldPanel();
        buttonPanel = new ButtonPanel();

        Logic.getInstance().addTopLabelSetText(labelTextFieldPanel.topLabelSetText());
        Logic.getInstance().addMidLabelSetText(labelTextFieldPanel.midLabelSetText());
        Logic.getInstance().addBotLabelSetText(labelTextFieldPanel.botLabelSetText());
    }
    private void setMenuBar(){
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("List");
        JMenuItem display = new JMenuItem("Display");

        display.addActionListener(event -> new ListWindow());

        menu.add(display);
        menuBar.add(menu);
        mainFrame.setJMenuBar(menuBar);
    }
}
