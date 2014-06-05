package generator;

/**
 *
 * @author Piotr Szulc
 */
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.swing.SwingUtilities;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JFrame;

import javax.swing.JSlider;
import javax.swing.JButton;

import java.awt.Rectangle;
import java.awt.event.*;

import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import java.util.Hashtable;
import java.util.Random;
import javax.swing.JComboBox;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Generator extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel jContentPane = null;

    private JSlider jFreqSlider = null;

    public static JSlider jLengthSlider = null;

    public static JSlider jVolumeSlider = null;

    private JButton jGenButton = null;

    private JTextField jFreqText = null;

    private ButtonGroup group = null;

    private static JComboBox jComboBox = null;

    private JButton jButton = null;

    private JButton jButton1 = null;

    private JFrame jSyrenaFrame = null;

    private JPanel jSyranePanel = null;

    private JTextField jTextPocz = null;

    private static JTextField jTextKoniec = null;

    private JButton jButton2 = null;

    private JButton jButton3 = null;

    private JButton jButton4 = null;

    private JFrame jSumaFrame = null;

    private JPanel jContentPane1 = null;

    public static JComboBox jSygnal1 = null;

    public static JComboBox jSygnal2 = null;

    public static JComboBox jSygnal3 = null;

    public static JTextField jTextF1 = null;

    public static JTextField jTextF2 = null;

    public static JTextField jTextF3 = null;

    private JButton jButton5 = null;

    private JLabel jLabel = null;

    private JLabel jLabel1 = null;

    private JLabel jLabel2 = null;

    private JMenuBar jJMenuBar = null;

    private JMenu jMenu1 = null;

    private JMenuItem jMenuItem = null;

    private JMenu jMenu2 = null;

    private JLabel jLabel3 = null;

    private JLabel jLabel4 = null;

    private JMenuItem jMenuItem1 = null;

    private JFrame jFrameHelp = null;

    private JPanel jContentPane2 = null;

    private JLabel jLabel5 = null;

    private JLabel jLabel6 = null;

    private JLabel jLabel7 = null;

    private JLabel jLabel8 = null;

    private JLabel jLabel9 = null;

    private JLabel jLabel10 = null;

    private JButton jButton6 = null;

    private JLabel jLabel11 = null;

    private JSlider jLengthSlider1 = null;

    private JSlider jVolumeSlider1 = null;

    private static JSlider jLengthSlider2 = null;

    private static JSlider jVolumeSlider2 = null;

    private static JTextField jTextA1 = null;

    private static JTextField jTextA2 = null;

    private static JTextField jTextA3 = null;

    private JLabel jLabel12 = null;

    /**
     * This method initializes jFreqSlider
     *
     * @return javax.swing.JSlider
     */
    private JSlider getJFreqSlider() {
        if (jFreqSlider == null) {
            jFreqSlider = new JSlider();
            jFreqSlider.setOrientation(JSlider.VERTICAL);
            jFreqSlider.setBounds(new Rectangle(15, 5, 71, 250));
            jFreqSlider.setMaximum(22000);
            jFreqSlider.setMinimum(200);
            jFreqSlider.setValue(440);
            jFreqSlider.setPaintLabels(true);
            jFreqSlider.setPaintTicks(true);
            jFreqSlider.setMajorTickSpacing(1500);
            jFreqSlider.setMinorTickSpacing(1500);
            jFreqSlider.setToolTipText("Czestotliwosc [hz]");
            jFreqSlider.setFont(new Font("Dialog", Font.BOLD, 10));
            jFreqSlider.setBorder(new TitledBorder("Frequency"));

            Hashtable labelTable = new Hashtable();
            labelTable.put(new Integer(200), new JLabel("200"));
            labelTable.put(new Integer(jFreqSlider.getMaximum() / 10), new JLabel("2k"));
            labelTable.put(new Integer(2 * jFreqSlider.getMaximum() / 10), new JLabel("4k"));
            labelTable.put(new Integer(3 * jFreqSlider.getMaximum() / 10), new JLabel("6k"));
            labelTable.put(new Integer(4 * jFreqSlider.getMaximum() / 10), new JLabel("8,5k"));
            labelTable.put(new Integer(5 * jFreqSlider.getMaximum() / 10), new JLabel("11k"));
            labelTable.put(new Integer(6 * jFreqSlider.getMaximum() / 10), new JLabel("13k"));
            labelTable.put(new Integer(7 * jFreqSlider.getMaximum() / 10), new JLabel("15k"));
            labelTable.put(new Integer(8 * jFreqSlider.getMaximum() / 10), new JLabel("17,5k"));
            labelTable.put(new Integer(9 * jFreqSlider.getMaximum() / 10), new JLabel("19,5k"));
            labelTable.put(new Integer(jFreqSlider.getMaximum()), new JLabel("22k"));
            jFreqSlider.setLabelTable(labelTable);

            jFreqSlider.addChangeListener(new javax.swing.event.ChangeListener() {
                @Override
                public void stateChanged(javax.swing.event.ChangeEvent e) {
                    //System.out.println("stateChanged()"); // 
                    int x = jFreqSlider.getValue();
                    jFreqText.setText(Integer.toString(x));
                }
            });
        }
        return jFreqSlider;
    }

    /**
     * This method initializes jLengthSlider
     *
     * @return javax.swing.JSlider
     */
    private JSlider getJLengthSlider() {
        if (jLengthSlider == null) {
            jLengthSlider = new JSlider();
            jLengthSlider.setOrientation(JSlider.VERTICAL);
            jLengthSlider.setBounds(new Rectangle(100, 5, 65, 250));
            jLengthSlider.setMaximum(10000);
            jLengthSlider.setMinimum(0);
            jLengthSlider.setValue(1000);
            jLengthSlider.setPaintLabels(true);
            jLengthSlider.setPaintTicks(true);
            jLengthSlider.setMajorTickSpacing(500);
            jLengthSlider.setMinorTickSpacing(500);
            jLengthSlider.setToolTipText("Czas trwania generowanego sygnalu");
            jLengthSlider.setBorder(new TitledBorder("Length"));
            Hashtable labelTable = new Hashtable();
            labelTable.put(new Integer(0), new JLabel("0"));
            labelTable.put(new Integer(jLengthSlider.getMaximum()), new JLabel("10s"));
            labelTable.put(new Integer(1 * jLengthSlider.getMaximum() / 10), new JLabel("1s"));
            labelTable.put(new Integer(2 * jLengthSlider.getMaximum() / 10), new JLabel("2s"));
            labelTable.put(new Integer(3 * jLengthSlider.getMaximum() / 10), new JLabel("3s"));
            labelTable.put(new Integer(4 * jLengthSlider.getMaximum() / 10), new JLabel("4s"));
            labelTable.put(new Integer(5 * jLengthSlider.getMaximum() / 10), new JLabel("5s"));
            labelTable.put(new Integer(6 * jLengthSlider.getMaximum() / 10), new JLabel("6s"));
            labelTable.put(new Integer(7 * jLengthSlider.getMaximum() / 10), new JLabel("7s"));
            labelTable.put(new Integer(8 * jLengthSlider.getMaximum() / 10), new JLabel("8s"));
            labelTable.put(new Integer(9 * jLengthSlider.getMaximum() / 10), new JLabel("9s"));
            jLengthSlider.setLabelTable(labelTable);
        }
        return jLengthSlider;
    }

    /**
     * This method initializes jVolumeSlider
     *
     * @return javax.swing.JSlider
     */
    private JSlider getJVolumeSlider() {
        if (jVolumeSlider == null) {
            jVolumeSlider = new JSlider();
            jVolumeSlider.setOrientation(JSlider.VERTICAL);
            jVolumeSlider.setBounds(new Rectangle(180, 5, 65, 250));
            jVolumeSlider.setMaximum(100);
            jVolumeSlider.setMinimum(0);
            jVolumeSlider.setValue(20);
            jVolumeSlider.setPaintLabels(true);
            jVolumeSlider.setPaintTicks(true);
            jVolumeSlider.setSnapToTicks(false);
            jVolumeSlider.setMajorTickSpacing(20);
            jVolumeSlider.setMinorTickSpacing(10);
            jVolumeSlider.setToolTipText("Glosnosc");
            jVolumeSlider.setBorder(new TitledBorder("Volume"));
        }
        return jVolumeSlider;
    }

    /**
     * This method initializes jGenButton
     *
     * @return javax.swing.JButton
     */
    private JButton getJGenButton() {
        if (jGenButton == null) {
            jGenButton = new JButton();//280,110,100,25
            jGenButton.setBounds(new Rectangle(280, 110, 100, 25));
            jGenButton.setToolTipText("Nacisnij by wygenerowac wybrany sygnal");
            jGenButton.setText("Play");
            jGenButton.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    //	System.out.println("actionPerformed()"); // 
                    //	System.out.println(jRadioPil.isSelected());
                    int hz = jFreqSlider.getValue();
                    int dl = jLengthSlider.getValue();
                    int vol = jVolumeSlider.getValue();
                    try {
                        play(hz, dl, vol);

                    } catch (LineUnavailableException e1) {
                        // 
                        e1.printStackTrace();
                    }
                }
            });
        }
        return jGenButton;
    }

    /**
     * This method initializes jFreqText
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJFreqText() {
        if (jFreqText == null) {
            jFreqText = new JTextField();
            jFreqText.setBounds(new Rectangle(15, 270, 50, 25));
            jFreqText.setToolTipText("Wprowadz recznie czestotliwosc generowanego sygnalu");
            jFreqText.setText("440");
            jFreqText.addKeyListener(new java.awt.event.KeyAdapter() {
                @Override
                public void keyPressed(java.awt.event.KeyEvent e) {
                    System.out.println("keyPressed()"); // 
                    int key = e.getKeyCode();
                    if (key == KeyEvent.VK_ENTER) {
                        System.out.println("chuj");
                        jFreqSlider.setValue(Integer.parseInt(jFreqText.getText()));
                    }
                }
            });
        }
        return jFreqText;
    }

    /**
     * This method initializes jComboBox
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getJComboBox() {
        if (jComboBox == null) {
            String[] sygnaly = {"sinus", "pila", "prostokat"};
            jComboBox = new JComboBox(sygnaly);
            jComboBox.setBounds(new Rectangle(280, 70, 100, 25));
            jComboBox.setEnabled(true);
            jComboBox.setVisible(true);
            jComboBox.setToolTipText("<html>Wybierz typ sygnalu<br>-sinusoidalny<br>-prostokatny<br>-piloksztaltny</html>");
        }

        return jComboBox;
    }

    /**
     * This method initializes jButton
     *
     * @return javax.swing.JButton
     */
    private JButton getJButton() {
        if (jButton == null) {
            jButton = new JButton();
            jButton.setBounds(new Rectangle(305, 117, 0, 0));
        }
        return jButton;
    }

    /**
     * This method initializes jButton1
     *
     * @return javax.swing.JButton
     */
    private JButton getJButton1() {
        if (jButton1 == null) {
            jButton1 = new JButton();
            jButton1.setBounds(new Rectangle(280, 230, 100, 25));
            jButton1.setToolTipText("Nacisnij aby przejsc do okna generowania syreny");
            jButton1.setText("Syrena");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    JFrame SSS = getJSyrenaFrame();
                    //SSS.show();
                    SSS.setVisible(true);
                }
            });
        }
        return jButton1;
    }

    /**
     * This method initializes jSyrenaFrame
     *
     * @return javax.swing.JFrame
     */
    private JFrame getJSyrenaFrame() {
        if (jSyrenaFrame == null) {
            jSyrenaFrame = new JFrame();
            jSyrenaFrame.setSize(new Dimension(299, 258));
            jSyrenaFrame.setTitle("Syrena");
            jSyrenaFrame.setResizable(false);
            jSyrenaFrame.setContentPane(getJSyranePanel());
        }
        return jSyrenaFrame;
    }

    /**
     * This method initializes jSyranePanel
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJSyranePanel() {
        if (jSyranePanel == null) {
            jLabel1 = new JLabel();
            jLabel1.setBounds(new Rectangle(20, 75, 80, 20));
            jLabel1.setToolTipText("Wpisz koncowa czestotliwosc sygnalu");
            jLabel1.setText("Koniec");
            jLabel = new JLabel();
            jLabel.setBounds(new Rectangle(20, 15, 80, 20));
            jLabel.setToolTipText("Wpisz poczatkowa czestotliwosc sygnalu");
            jLabel.setText("Poczatek");
            jSyranePanel = new JPanel();
            jSyranePanel.setLayout(null);
            jSyranePanel.add(getJTextPocz(), null);
            jSyranePanel.add(getJTextKoniec(), null);
            jSyranePanel.add(getJButton2(), null);
            jSyranePanel.add(jLabel, null);
            jSyranePanel.add(jLabel1, null);
            jSyranePanel.add(getJLengthSlider1(), null);
            jSyranePanel.add(getJVolumeSlider1(), null);
        }
        return jSyranePanel;
    }

    /**
     * This method initializes jTextPocz
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextPocz() {
        if (jTextPocz == null) {
            jTextPocz = new JTextField();
            jTextPocz.setBounds(new Rectangle(20, 45, 80, 20));
            jTextPocz.setToolTipText("Wpisz poczatkowa czestotliwosc sygnalu");
            jTextPocz.setText("200");
        }
        return jTextPocz;
    }

    /**
     * This method initializes jTextKoniec
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextKoniec() {
        if (jTextKoniec == null) {
            jTextKoniec = new JTextField();
            jTextKoniec.setBounds(new Rectangle(20, 105, 80, 20));
            jTextKoniec.setToolTipText("Wpisz koncowa czestotliwosc sygnalu");
            jTextKoniec.setText("800");
        }
        return jTextKoniec;
    }

    /**
     * This method initializes jButton2
     *
     * @return javax.swing.JButton
     */
    private JButton getJButton2() {
        if (jButton2 == null) {
            jButton2 = new JButton();
            jButton2.setBounds(new Rectangle(20, 185, 80, 25));
            jButton2.setToolTipText("<html>Nacisnij aby wygenerowac sygnal narastajacy o zdefiniowanych <br> wyzej czestotliwosciach poczatkowych i koncowych. Dlugosc <br>sygnalu i glosnosc pobierane sa z odpowiednich suwakow.  </html>");
            jButton2.setText("Play");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    int hz = Integer.parseInt(jTextPocz.getText());
                    int hzEnd = Integer.parseInt(jTextKoniec.getText());
                    int dl = jLengthSlider1.getValue();
                    int vol = jVolumeSlider1.getValue();

                    try {
                        plays(hz, hzEnd, dl, vol);
                    } catch (LineUnavailableException e1) {
                        e1.printStackTrace();
                    }

                }
            });
        }
        return jButton2;
    }

    /**
     * This method initializes jButton3
     *
     * @return javax.swing.JButton
     */
    private JButton getJButton3() {
        if (jButton3 == null) {
            jButton3 = new JButton();
            jButton3.setBounds(new Rectangle(280, 150, 100, 25));
            jButton3.setToolTipText("Nacisnij by wygenerowac bialy szum");
            jButton3.setText("Biały Szum");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    int dl = jLengthSlider.getValue();

                    try {
                        szum(dl);
                    } catch (LineUnavailableException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
        return jButton3;
    }

    /**
     * This method initializes jButton4
     *
     * @return javax.swing.JButton
     */
    private JButton getJButton4() {
        if (jButton4 == null) {
            jButton4 = new JButton();
            jButton4.setBounds(new Rectangle(280, 190, 100, 25));
            jButton4.setToolTipText("Nacisnij aby przejsc do okna sumowania sygnalow");
            jButton4.setText("Suma");
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    JFrame FF = getJSumaFrame();
                    //FF.show();
                    FF.setVisible(true);
                }
            });

        }
        return jButton4;
    }

    /**
     * This method initializes jSumaFrame
     *
     * @return javax.swing.JFrame
     */
    private JFrame getJSumaFrame() {
        if (jSumaFrame == null) {
            jSumaFrame = new JFrame();
            jSumaFrame.setSize(new Dimension(513, 256));
            jSumaFrame.setTitle("Suma");
            jSumaFrame.setResizable(false);
            jSumaFrame.setContentPane(getJContentPane1());
        }
        return jSumaFrame;
    }

    /**
     * This method initializes jContentPane1
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJContentPane1() {
        if (jContentPane1 == null) {
            jLabel12 = new JLabel();
            jLabel12.setBounds(new Rectangle(250, 10, 80, 25));
            jLabel12.setText("Amplituda");
            jLabel4 = new JLabel();
            jLabel4.setBounds(new Rectangle(150, 10, 80, 25));
            jLabel4.setText("Czestotliwosc");
            jLabel3 = new JLabel();
            jLabel3.setBounds(new Rectangle(20, 10, 100, 25));
            jLabel3.setText("Typy sygnalow");
            jContentPane1 = new JPanel();
            jContentPane1.setLayout(null);
            jContentPane1.add(getJSygnal1(), null);
            jContentPane1.add(getJSygnal2(), null);
            jContentPane1.add(getJSygnal3(), null);
            jContentPane1.add(getJTextF1(), null);
            jContentPane1.add(getJTextF2(), null);
            jContentPane1.add(getJTextF3(), null);
            jContentPane1.add(getJButton5(), null);
            jContentPane1.add(jLabel3, null);
            jContentPane1.add(jLabel4, null);
            jContentPane1.add(getJLengthSlider2(), null);
            jContentPane1.add(getJVolumeSlider2(), null);
            jContentPane1.add(getJTextA1(), null);
            jContentPane1.add(getJTextA2(), null);
            jContentPane1.add(getJTextA3(), null);
            jContentPane1.add(jLabel12, null);
        }
        return jContentPane1;
    }

    /**
     * This method initializes jSygnal1
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getJSygnal1() {
        if (jSygnal1 == null) {
            String[] sygnaly = {" ", "sinus", "pila", "prostokat"};
            jSygnal1 = new JComboBox(sygnaly);
            jSygnal1.setBounds(new Rectangle(20, 40, 100, 25));
            jSygnal1.setToolTipText("Rodzaj pierwszego sumowanego sygnalu");
        }
        return jSygnal1;
    }

    /**
     * This method initializes jSygnal2
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getJSygnal2() {
        if (jSygnal2 == null) {
            String[] sygnaly = {" ", "sinus", "pila", "prostokat"};
            jSygnal2 = new JComboBox(sygnaly);
            jSygnal2.setBounds(new Rectangle(20, 80, 100, 25));
            jSygnal2.setToolTipText("Rodzaj drugiego sumowanego sygnalu");
        }
        return jSygnal2;
    }

    /**
     * This method initializes jSygnal3
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getJSygnal3() {
        if (jSygnal3 == null) {
            String[] sygnaly = {" ", "sinus", "pila", "prostokat"};
            jSygnal3 = new JComboBox(sygnaly);
            jSygnal3.setBounds(new Rectangle(20, 120, 100, 25));
            jSygnal3.setToolTipText("Rodzaj trzeciego sumowanego sygnalu");
        }
        return jSygnal3;
    }

    /**
     * This method initializes jTextF1
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextF1() {
        if (jTextF1 == null) {
            jTextF1 = new JTextField();
            jTextF1.setBounds(new Rectangle(160, 40, 50, 25));
            jTextF1.setToolTipText("Czestotliwosc pierszego sumowanego sygnalu");
            jTextF1.setText("200");
        }
        return jTextF1;
    }

    /**
     * This method initializes jTextF2
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextF2() {
        if (jTextF2 == null) {
            jTextF2 = new JTextField();
            jTextF2.setBounds(new Rectangle(160, 80, 50, 25));
            jTextF2.setToolTipText("Czestotliwosc drugiego sumowanego sygnalu");
            jTextF2.setText("200");
        }
        return jTextF2;
    }

    /**
     * This method initializes jTextF3
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextF3() {
        if (jTextF3 == null) {
            jTextF3 = new JTextField();
            jTextF3.setBounds(new Rectangle(160, 120, 50, 25));
            jTextF3.setToolTipText("Czestotliwosc trzeciego sumowanego sygnalu");
            jTextF3.setText("200");
        }
        return jTextF3;
    }

    /**
     * This method initializes jButton5
     *
     * @return javax.swing.JButton
     */
    private JButton getJButton5() {
        if (jButton5 == null) {
            jButton5 = new JButton();
            jButton5.setBounds(new Rectangle(20, 185, 100, 25));
            jButton5.setToolTipText("<html>Nacisnij aby wygenerowac sygnal bedacy suma do trzech <br>sygnalow okreslonego typu i czestotliwosci</html>");
            jButton5.setText("Play");
            jButton5.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    try {
                        sumuj();
                    } catch (LineUnavailableException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
        return jButton5;
    }

    /**
     * This method initializes jJMenuBar
     *
     * @return javax.swing.JMenuBar
     */
    private JMenuBar getJJMenuBar() {
        if (jJMenuBar == null) {
            jJMenuBar = new JMenuBar();
            jJMenuBar.add(getJMenu1());
            jJMenuBar.add(getJMenu2());
        }
        return jJMenuBar;
    }

    /**
     * This method initializes jMenu1
     *
     * @return javax.swing.JMenu
     */
    private JMenu getJMenu1() {
        if (jMenu1 == null) {
            jMenu1 = new JMenu();
            jMenu1.setText("Program");
            jMenu1.add(getJMenuItem());
        }
        return jMenu1;
    }

    /**
     * This method initializes jMenuItem
     *
     * @return javax.swing.JMenuItem
     */
    private JMenuItem getJMenuItem() {
        if (jMenuItem == null) {
            jMenuItem = new JMenuItem();
            jMenuItem.setText("Zamknij");
            jMenuItem.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    System.exit(0);
                }
            });
        }
        return jMenuItem;
    }

    /**
     * This method initializes jMenu2
     *
     * @return javax.swing.JMenu
     */
    private JMenu getJMenu2() {
        if (jMenu2 == null) {
            jMenu2 = new JMenu();
            jMenu2.setText("Pomoc");
            jMenu2.add(getJMenuItem1());
        }
        return jMenu2;
    }

    /**
     * This method initializes jMenuItem1
     *
     * @return javax.swing.JMenuItem
     */
    private JMenuItem getJMenuItem1() {
        if (jMenuItem1 == null) {
            jMenuItem1 = new JMenuItem();
            jMenuItem1.setText("Autorzy");
            jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    JFrame HH = getJFrameHelp();
                    HH.setVisible(true);
                }
            });
        }
        return jMenuItem1;
    }

    /**
     * This method initializes jFrameHelp
     *
     * @return javax.swing.JFrame
     */
    private JFrame getJFrameHelp() {
        if (jFrameHelp == null) {
            jFrameHelp = new JFrame();
            jFrameHelp.setSize(new Dimension(332, 343));
            jFrameHelp.setTitle("Autorzy");
            jFrameHelp.setResizable(false);
            jFrameHelp.setContentPane(getJContentPane2());
        }
        return jFrameHelp;
    }

    /**
     * This method initializes jContentPane2
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJContentPane2() {
        if (jContentPane2 == null) {
            jLabel11 = new JLabel();
            jLabel11.setBounds(new Rectangle(50, 225, 200, 20));
            jLabel11.setText("Buc 6");
            jLabel10 = new JLabel();
            jLabel10.setBounds(new Rectangle(50, 190, 200, 20));
            jLabel10.setText("Buc 5");
            jLabel9 = new JLabel();
            jLabel9.setBounds(new Rectangle(50, 155, 200, 20));
            jLabel9.setText("Buc 4");
            jLabel8 = new JLabel();
            jLabel8.setBounds(new Rectangle(50, 120, 200, 20));
            jLabel8.setText("Buc 3");
            jLabel7 = new JLabel();
            jLabel7.setBounds(new Rectangle(50, 85, 200, 20));
            jLabel7.setText("Buc 2");
            jLabel6 = new JLabel();
            jLabel6.setBounds(new Rectangle(50, 50, 200, 20));
            jLabel6.setFont(new Font("Dialog", Font.BOLD, 12));
            jLabel6.setText("Buc 1");
            jLabel5 = new JLabel();
            jLabel5.setBounds(new Rectangle(125, 17, 74, 21));
            jLabel5.setFont(new Font("Dialog", Font.BOLD, 14));
            jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
            jLabel5.setText("Autorzy");
            jContentPane2 = new JPanel();
            jContentPane2.setLayout(null);
            jContentPane2.add(jLabel5, null);
            jContentPane2.add(jLabel6, null);
            jContentPane2.add(jLabel7, null);
            jContentPane2.add(jLabel8, null);
            jContentPane2.add(jLabel9, null);
            jContentPane2.add(jLabel10, null);
            jContentPane2.add(getJButton6(), null);
            jContentPane2.add(jLabel11, null);
        }
        return jContentPane2;
    }

    /**
     * This method initializes jEditorPane
     *
     * @return javax.swing.JEditorPane
     */
    /**
     * This method initializes jButton6
     *
     * @return javax.swing.JButton
     */
    private JButton getJButton6() {
        if (jButton6 == null) {
            jButton6 = new JButton();
            jButton6.setBounds(new Rectangle(137, 267, 66, 25));
            jButton6.setText("OK");
            jButton6.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    jFrameHelp.setVisible(false);
                }
            });
        }
        return jButton6;
    }

    /**
     * This method initializes jLengthSlider1
     *
     * @return javax.swing.JSlider
     */
    private JSlider getJLengthSlider1() {
        if (jLengthSlider1 == null) {
            jLengthSlider1 = new JSlider();
            jLengthSlider1.setBounds(new Rectangle(120, 10, 74, 200));
            jLengthSlider1.setToolTipText("Czas trwania generowanego sygnalu");
            jLengthSlider1.setMajorTickSpacing(500);
            jLengthSlider1.setMaximum(10000);
            jLengthSlider1.setMinimum(0);
            jLengthSlider1.setMinorTickSpacing(500);
            jLengthSlider1.setOrientation(JSlider.VERTICAL);
            jLengthSlider1.setPaintLabels(true);
            jLengthSlider1.setPaintTicks(true);
            jLengthSlider1.setValue(1000);
            jLengthSlider1.setBorder(new TitledBorder("Length"));
            Hashtable labelTable = new Hashtable();
            labelTable.put(new Integer(0), new JLabel("0"));
            labelTable.put(new Integer(jLengthSlider.getMaximum()), new JLabel("10s"));
            labelTable.put(new Integer(1 * jLengthSlider.getMaximum() / 10), new JLabel("1s"));
            labelTable.put(new Integer(2 * jLengthSlider.getMaximum() / 10), new JLabel("2s"));
            labelTable.put(new Integer(3 * jLengthSlider.getMaximum() / 10), new JLabel("3s"));
            labelTable.put(new Integer(4 * jLengthSlider.getMaximum() / 10), new JLabel("4s"));
            labelTable.put(new Integer(5 * jLengthSlider.getMaximum() / 10), new JLabel("5s"));
            labelTable.put(new Integer(6 * jLengthSlider.getMaximum() / 10), new JLabel("6s"));
            labelTable.put(new Integer(7 * jLengthSlider.getMaximum() / 10), new JLabel("7s"));
            labelTable.put(new Integer(8 * jLengthSlider.getMaximum() / 10), new JLabel("8s"));
            labelTable.put(new Integer(9 * jLengthSlider.getMaximum() / 10), new JLabel("9s"));
            jLengthSlider1.setLabelTable(labelTable);
        }
        return jLengthSlider1;
    }

    /**
     * This method initializes jVolumeSlider1
     *
     * @return javax.swing.JSlider
     */
    private JSlider getJVolumeSlider1() {
        if (jVolumeSlider1 == null) {
            jVolumeSlider1 = new JSlider();
            jVolumeSlider1.setBounds(new Rectangle(220, 10, 60, 200));
            jVolumeSlider1.setToolTipText("Glosnosc");
            jVolumeSlider1.setMajorTickSpacing(20);
            jVolumeSlider1.setMaximum(100);
            jVolumeSlider1.setMinimum(0);
            jVolumeSlider1.setMinorTickSpacing(10);
            jVolumeSlider1.setOrientation(JSlider.VERTICAL);
            jVolumeSlider1.setPaintLabels(true);
            jVolumeSlider1.setPaintTicks(true);
            jVolumeSlider1.setSnapToTicks(false);
            jVolumeSlider1.setValue(20);
            jVolumeSlider1.setBorder(new TitledBorder("Volume"));
        }
        return jVolumeSlider1;
    }

    /**
     * This method initializes jLengthSlider2
     *
     * @return javax.swing.JSlider
     */
    private JSlider getJLengthSlider2() {
        if (jLengthSlider2 == null) {
            jLengthSlider2 = new JSlider();
            jLengthSlider2.setBounds(new Rectangle(348, 10, 74, 200));
            jLengthSlider2.setToolTipText("Czas trwania generowanego sygnalu");
            jLengthSlider2.setMajorTickSpacing(500);
            jLengthSlider2.setMaximum(10000);
            jLengthSlider2.setMinimum(0);
            jLengthSlider2.setMinorTickSpacing(500);
            jLengthSlider2.setOrientation(JSlider.VERTICAL);
            jLengthSlider2.setPaintLabels(true);
            jLengthSlider2.setPaintTicks(true);
            jLengthSlider2.setValue(1000);
            jLengthSlider2.setBorder(new TitledBorder("Length"));
            Hashtable labelTable = new Hashtable();
            labelTable.put(new Integer(0), new JLabel("0"));
            labelTable.put(new Integer(jLengthSlider.getMaximum()), new JLabel("10s"));
            labelTable.put(new Integer(1 * jLengthSlider.getMaximum() / 10), new JLabel("1s"));
            labelTable.put(new Integer(2 * jLengthSlider.getMaximum() / 10), new JLabel("2s"));
            labelTable.put(new Integer(3 * jLengthSlider.getMaximum() / 10), new JLabel("3s"));
            labelTable.put(new Integer(4 * jLengthSlider.getMaximum() / 10), new JLabel("4s"));
            labelTable.put(new Integer(5 * jLengthSlider.getMaximum() / 10), new JLabel("5s"));
            labelTable.put(new Integer(6 * jLengthSlider.getMaximum() / 10), new JLabel("6s"));
            labelTable.put(new Integer(7 * jLengthSlider.getMaximum() / 10), new JLabel("7s"));
            labelTable.put(new Integer(8 * jLengthSlider.getMaximum() / 10), new JLabel("8s"));
            labelTable.put(new Integer(9 * jLengthSlider.getMaximum() / 10), new JLabel("9s"));
            jLengthSlider2.setLabelTable(labelTable);
        }
        return jLengthSlider2;
    }

    /**
     * This method initializes jVolumeSlider2
     *
     * @return javax.swing.JSlider
     */
    private JSlider getJVolumeSlider2() {
        if (jVolumeSlider2 == null) {
            jVolumeSlider2 = new JSlider();
            jVolumeSlider2.setBounds(new Rectangle(438, 10, 60, 200));
            jVolumeSlider2.setToolTipText("Glosnosc");
            jVolumeSlider2.setMajorTickSpacing(20);
            jVolumeSlider2.setMaximum(100);
            jVolumeSlider2.setMinimum(0);
            jVolumeSlider2.setMinorTickSpacing(10);
            jVolumeSlider2.setOrientation(JSlider.VERTICAL);
            jVolumeSlider2.setPaintLabels(true);
            jVolumeSlider2.setPaintTicks(true);
            jVolumeSlider2.setSnapToTicks(false);
            jVolumeSlider2.setValue(20);
            jVolumeSlider2.setBorder(new TitledBorder("Volume"));
        }
        return jVolumeSlider2;
    }

    /**
     * This method initializes jTextA1
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextA1() {
        if (jTextA1 == null) {
            jTextA1 = new JTextField();
            jTextA1.setBounds(new Rectangle(260, 40, 50, 25));
            jTextA1.setText("1");
            jTextA1.setToolTipText("<html>Amplituda pierszego sumowanego sygnalu<br>wartosci od 0 do 1 </html>");
        }
        return jTextA1;
    }

    /**
     * This method initializes jTextA2
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextA2() {
        if (jTextA2 == null) {
            jTextA2 = new JTextField();
            jTextA2.setBounds(new Rectangle(260, 80, 50, 25));
            jTextA2.setText("1");
            jTextA2.setToolTipText("<html>Amplituda drugiego sumowanego sygnalu<br>wartosci od 0 do 1 </html>");
        }
        return jTextA2;
    }

    /**
     * This method initializes jTextA3
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextA3() {
        if (jTextA3 == null) {
            jTextA3 = new JTextField();
            jTextA3.setBounds(new Rectangle(260, 120, 50, 25));
            jTextA3.setText("1");
            jTextA3.setToolTipText("<html>Amplituda trzeciego sumowanego sygnalu<br>wartosci od 0 do 1 </html>");
        }
        return jTextA3;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Generator thisClass = new Generator();
                thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                thisClass.setVisible(true);
            }
        });
    }

    /**
     * This is the default constructor
     */
    public Generator() {
        super();
        initialize();
    }

    /**
     * This method initializes this
     *
     * @return void
     */
    private void initialize() {
        this.setSize(427, 369);
        this.setResizable(false);
        this.setJMenuBar(getJJMenuBar());
        this.setContentPane(getJContentPane());
        this.setTitle("Generator");
    }

    /**
     * This method initializes jContentPane
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jLabel2 = new JLabel();
            jLabel2.setBounds(new Rectangle(280, 35, 100, 25));
            jLabel2.setText("Typ sygnalu");

            jContentPane = new JPanel();
            jContentPane.setLayout(null);
            jContentPane.add(getJFreqSlider(), null);
            jContentPane.add(getJLengthSlider(), null);
            jContentPane.add(getJVolumeSlider(), null);
            jContentPane.add(getJGenButton(), null);
            jContentPane.add(getJFreqText(), null);
            jContentPane.add(getJComboBox(), null);
            jContentPane.add(getJButton(), null);
            jContentPane.add(getJButton1(), null);
            jContentPane.add(getJButton3(), null);
            jContentPane.add(getJButton4(), null);
            jContentPane.add(jLabel2, null);

            if (group == null) {
                group = new ButtonGroup();

            }
        }
        return jContentPane;
    }

    public static void play(int hz, int dl, int vol) throws LineUnavailableException {
        float frequency = 44100;
        byte[] buf;
        AudioFormat af;

        buf = new byte[1];
        af = new AudioFormat(frequency, 8, 1, true, false);

        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af);

        sdl.start();

        // byte bb [] = new byte[(int)(dl*frequency/1000) + 1];
        if ((String) jComboBox.getSelectedItem() == "sinus") {
            for (int i = 0; i < dl * frequency / 1000; i++) {
                double angle = i / (frequency / hz) * 2.0 * Math.PI;
                buf[0] = (byte) (Math.sin(angle) * vol * 1.27);
                // bb[i]=(byte)(Math.sin(angle)* vol * 1.27);
                sdl.write(buf, 0, 1);
            }
        }

        if ((String) jComboBox.getSelectedItem() == "prostokat") {
            //System.out.println("loda");
            //byte bb [] = new byte[(int)(dl*frequency/1000) + 1];
            for (int i = 0; i < dl * frequency / 1000; i++) {
                //	 double s = 0;
                //	 for(int j = 1; j < 25; j = j + 2)
                //	 {
                //	   double angle = i/(frequency/hz)*Math.PI;
                //		 double wave = 1/j * Math.sin(j * angle);// * vol;
                //		 s = s + wave;
                //	   buf[0]=(byte)(Math.sin(angle)*vol);
                //		 }
                // System.out.println(s);
                //	 buf[0] = (byte) (s * vol * 1.27);
                //   sdl.write(buf,0,1);
                //-------------
    /*		 double num;
                 long iPart;
                 double fPart;
                 num = i/(frequency/hz);
                 iPart = (long) num;
                 fPart = num - iPart;
    	   
                 //System.out.println(fPart);
                 /* 	   if(fPart < 0.5)
                 {
                 buf[0] = (byte)(1 * vol * 1.27);
                 //bb[i] = (byte)(1 * vol * 1.27);
                 // System.out.println((byte)(1 * vol * 1.27));
                 }
                 else
                 {
                 buf[0] = (byte)(-1 * vol * 1.27);
                 // bb[i] = (byte)(-1 * vol * 1.27);
                 // System.out.println((byte)(-1 * vol * 1.27));
                 }
                 */
                double angle = i / (frequency / hz) * 2.0 * Math.PI;
                double sinus = Math.sin(angle);
                byte v;
                if (sinus > 0) {
                    v = 1;
                } else {
                    v = -1;
                }

                buf[0] = (byte) (v * vol * 1.27);
                sdl.write(buf, 0, 1);

            }
        }

        if ((String) jComboBox.getSelectedItem() == "pila") {
            for (int i = 1; i < dl * frequency / 1000; i++) {
    		// double s = 0;
                // for(int j = 1; j < 20; j++)
                // {
                //  double angle = i/(frequency/hz)*Math.PI;
                //	 double wave = 1/j * Math.sin(j * angle);// * vol;
                //	 s = s + (-1 ^ (j + 1)) * wave;
                //buf[0]=(byte)(Math.sin(angle)*vol);
                // }
                // System.out.println(s);
                // buf[0] = (byte) (s * vol);
                // sdl.write(buf,0,1);
                //double x = 2 * amplitude * ((((i + mSample) % (int) (mCurRate / frequency)) / (mCurRate / frequency)) - 0.5);

                // return (float) ((1 + ((time / wavelength * 2) % 2 - 1)) / 2);
                double val = (i / (frequency / hz) * 2) % 2 - 1;
                buf[0] = (byte) (val / 2 * vol * 1.27);
                sdl.write(buf, 0, 1);
//--------    		 
                // double steps = (frequency/1000) * (1/(double)hz);
                // double val = (i % steps) / (steps);
                // buf[0] = (byte)(val * vol * 1.27);
                // sdl.write(buf,0,1);
//---------
                //    		 System.out.println(val * vol * 1.27);
                // buf[0] = (byte)(2 * (((i % (int)(hz/frequency)) / (hz/frequency))) - 0.5);
                //System.out.println(buf[0]);
            }
        }

        sdl.drain();
        sdl.stop();
        sdl.close();

    }
//------------------------------------------------

    public static byte generuj(int hz, int time, int vol, double ampl, String rodzaj) throws LineUnavailableException {
        float frequency = 44100;
        byte[] buf;
        // AudioFormat af;

        buf = new byte[1];
    // af = new AudioFormat(frequency,8,1,true,false);

        //  SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        //  sdl = AudioSystem.getSourceDataLine(af);
        if (rodzaj == "sinus") {
            double angle = time / (frequency / hz) * 2.0 * Math.PI;
            buf[0] = (byte) (Math.sin(angle) * ampl * vol * 1.27);
            //   sdl.write(buf,0,1);

        }

        if (rodzaj == "prostokat") {
            double angle = time / (frequency / hz) * 2.0 * Math.PI;
            double sinus = Math.sin(angle);
            byte v;
            if (sinus > 0) {
                v = 1;
            } else {
                v = -1;
            }

            buf[0] = (byte) (v * ampl * vol * 1.27);
            //   sdl.write(buf,0,1);  	   
        }

        if (rodzaj == "pila") {
            double val = (time / (frequency / hz) * 2) % 2 - 1;
            buf[0] = (byte) (val / 2 * ampl * vol * 1.27);
            //	 sdl.write(buf,0,1);
        }

        return buf[0];

    }

    public static void plays(int hz, int hzEnd, int dl, int vol) throws LineUnavailableException {
        float frequency = 44100;
        byte[] buf;
        AudioFormat af;

        buf = new byte[1];
        af = new AudioFormat(frequency, 8, 1, true, false);

        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af);

        sdl.start();

        double j = hz;
        // hzEnd = Integer.parseInt(jTextKoniec.getText());
        double max = (dl * frequency / 1000);
        double x = (hzEnd - hz) / max;
        for (int i = 0; i < dl * frequency / 1000; i++) {
            double angle = i / (frequency / j) * 2.0 * Math.PI;
            buf[0] = (byte) (Math.sin(angle) * vol * 1.27);
            sdl.write(buf, 0, 1);
            j = j + x;
        }
        sdl.drain();
        sdl.stop();
        sdl.close();
    }

    public static void szum(int dl) throws LineUnavailableException {
        float frequency = 44100;
        byte[] buf;
        AudioFormat af;

        buf = new byte[1];
        af = new AudioFormat(frequency, 8, 1, true, false);

        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af);

        sdl.start();

        Random gen = new Random(1252899);
        for (int i = 0; i < dl * frequency / 1000; i++) {
            byte x = (byte) (gen.nextInt(255));
            buf[0] = x;
            sdl.write(buf, 0, 1);
        }

        sdl.drain();
        sdl.stop();
        sdl.close();
    }

    public static void sumuj() throws LineUnavailableException {
        float frequency = 44100;
        byte[] buf;
        AudioFormat af;

        buf = new byte[1];
        af = new AudioFormat(frequency, 8, 1, true, false);

        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af);

        sdl.start();

        int dl = jLengthSlider2.getValue();
        int hz1 = Integer.parseInt(jTextF1.getText());
        int hz2 = Integer.parseInt(jTextF2.getText());
        int hz3 = Integer.parseInt(jTextF3.getText());
        String a1 = jTextA1.getText();
        a1 = a1.replace(",", ".");
        String a2 = jTextA2.getText();
        a2 = a2.replace(",", ".");
        String a3 = jTextA3.getText();
        a3 = a3.replace(",", ".");

        double ampl1 = Double.parseDouble(a1);
        double ampl2 = Double.parseDouble(a2);
        double ampl3 = Double.parseDouble(a3);
        int vol = jVolumeSlider2.getValue();
        byte bb;

        for (int i = 0; i < dl * frequency / 1000; i++) {
            bb = 0;
            if (jSygnal1.getSelectedItem() != " ") {
                //System.out.println("weszles");
                bb = (byte) (bb + generuj(hz1, i, vol, ampl1, jSygnal1.getSelectedItem().toString()));
            }

            if (jSygnal2.getSelectedItem() != " ") {
                //System.out.println("weszles");
                bb = (byte) (bb + generuj(hz2, i, vol, ampl2, jSygnal2.getSelectedItem().toString()));
            }

            if (jSygnal3.getSelectedItem() != " ") {
                //System.out.println("weszles");
                bb = (byte) (bb + generuj(hz3, i, vol, ampl3, jSygnal3.getSelectedItem().toString()));
            }

            buf[0] = bb;
            sdl.write(buf, 0, 1);
        }

        sdl.drain();
        sdl.stop();
        sdl.close();
    }

}
