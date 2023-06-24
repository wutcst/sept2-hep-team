import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import chess.Board;


public class Chess extends JDialog  {
    private JPanel chessPanel;
    private JPanel chessTop;
    private JButton restartButton;
    private JPanel chessBottom;

    private JButton button1;

    public Chess(JFrame parent) {
//        JFrame frame=new JFrame();
//        frame.setContentPane(chessgame);
////        frame.getContentPane().setBackground(Color.BLACK);
//        frame.setLayout(new GridLayout());
//        frame.setMinimumSize(new Dimension(800, 800));
//        frame.setLocationRelativeTo(null);
//
//
//        Board board=new Board();
//        frame.add(board);
//
//        frame.setVisible(true);

        super(parent);
        setContentPane(chessPanel);
        JFrame frame=new JFrame();

        JPanel chessgame = new JPanel();
        JPanel chessChangetimer = new JPanel();

        chessTop = new JPanel();
        chessBottom = new JPanel();

        JButton click = new JButton();



        chessTop.setBorder(new EmptyBorder(10,10,10,10));

        chessChangetimer.add(button1);

        chessTop.add(chessChangetimer);


        chessgame.setBackground(Color.BLACK);
        chessBottom.setBackground(Color.green);
        chessBottom.add(restartButton);

        Board board=new Board();
        chessgame.add(board);

        frame.add(chessTop, BorderLayout.PAGE_START);
        frame.add(chessgame, BorderLayout.CENTER);
        frame.add(chessBottom, BorderLayout.PAGE_END);


//        frame.getContentPane().setBackground(Color.BLACK);
//        frame.setLayout(new GridLayout());
        frame.setMinimumSize(new Dimension(850, 900));
        frame.setLocationRelativeTo(null);


//        Board board=new Board();
//        chessgame.add(board);
//        chessmenu.add(textField1);
//
//        frame.add(chessgame);
//        frame.add(chessmenu);

        frame.setVisible(true);

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
