import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Efficiencyyyyy implements ActionListener {


    private int count = 0;
    private JLabel label;
    private JLabel subjects;
    private JLabel assignments;
    private JLabel dueDate;
    private JFrame frame;
    private JPanel panel;
    private JTextField subjectText;
    private JTextField assignmentText;
    private JTextField dueText;
    private JButton submit;

    public Efficiencyyyyy() {


        frame = new JFrame();
        panel = new JPanel();
        JButton button = new JButton("Add Row");
        button.addActionListener(this);
        button.setBounds(500,3,100,50);
        Border border = BorderFactory.createLineBorder(Color.BLUE,3);

        label = new JLabel("Number of CLicks: 0");
        subjects = new JLabel("Subjects");
        subjects.setText("Subjects");
        subjects.setHorizontalTextPosition(JLabel.CENTER);//in label
        subjects.setVerticalTextPosition(JLabel.CENTER);
        subjects.setBackground(Color.green);
        subjects.setOpaque(true);
        subjects.setSize(100,100);
        subjects.setBorder(border);
        subjects.setVerticalAlignment(JLabel.CENTER);//in screen
        subjects.setHorizontalAlignment(JLabel.CENTER);
        subjects.setBounds(0,3,100,50);

        assignments = new JLabel("Assignments");
        assignments.setText("Assignments");
        assignments.setHorizontalTextPosition(JLabel.CENTER);//in label
        assignments.setVerticalTextPosition(JLabel.CENTER);
        assignments.setBackground(Color.green);
        assignments.setOpaque(true);
        assignments.setSize(100,100);
        assignments.setBorder(border);
        assignments.setVerticalAlignment(JLabel.CENTER);//in screen
        assignments.setHorizontalAlignment(JLabel.CENTER);
        assignments.setBounds(100,3,300,50);

        dueDate = new JLabel("Due Date");
        dueDate.setText("Due Date");
        dueDate.setHorizontalTextPosition(JLabel.CENTER);//in label
        dueDate.setVerticalTextPosition(JLabel.CENTER);
        dueDate.setBackground(Color.green);
        dueDate.setOpaque(true);
        dueDate.setSize(100,100);
        dueDate.setBorder(border);
        dueDate.setVerticalAlignment(JLabel.CENTER);//in screen
        dueDate.setHorizontalAlignment(JLabel.CENTER);
        dueDate.setBounds(400,3,100,50);


        subjectText = new JTextField();
        subjectText.setText("Subject");
        subjectText.setPreferredSize(new Dimension(250,40));
        subjectText.setBounds(0,53, 100, 50);

        assignmentText = new JTextField();
        assignmentText.setPreferredSize(new Dimension(250,40));
        assignmentText.setBounds(100,53, 300, 50);

        dueText = new JTextField();
        dueText.setPreferredSize(new Dimension(250,40));
        dueText.setBounds(400,53, 100, 50);

        submit = new JButton("Submit");
        submit.addActionListener(this);
        submit.setBounds(500,53,100,50);



        frame.add(subjects);
        frame.add(assignments);
        frame.add(button);
        frame.add(subjectText);
        frame.add(assignmentText);
        frame.add(dueText);
        frame.add(dueDate);
        frame.add(submit);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Efficiencyyyyy");
        frame.setSize(600,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[]args){
        new Efficiencyyyyy();
        new Input();
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("Submit")) {
            subjectText.setEnabled(false);
            assignmentText.setEnabled(false);
            dueText.setEnabled(false);
            submit.setVisible(false);
        }
        if (event.getActionCommand().equals("Add Row")) {

        }


    }
}
