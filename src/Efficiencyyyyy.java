import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Efficiencyyyyy implements ActionListener {


    private int y = 1;
    private JLabel label;
    private JLabel subjects;
    private JLabel assignments;
    private JLabel dueDate;
    private JLabel done;
    private JFrame frame;
    private JPanel panel;
    private JTextField subjectText;
    private JTextField assignmentText;
    private JTextField dueText;
    private JButton submit;
    private JButton button;
    private JCheckBox check;
    private boolean yes = true;


    public Efficiencyyyyy() {


        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Add Row");
        button.addActionListener(this);
        button.setBounds(600,1,100,50);
        button.setBackground(Color.decode("#b343f0"));
        button.setFocusPainted(false);
        Border border = BorderFactory.createLineBorder(Color.decode("#66029c"),2);

        label = new JLabel("Number of CLicks: 0");
        subjects = new JLabel("Subjects");
        subjects.setText("Subjects");
        subjects.setHorizontalTextPosition(JLabel.CENTER);//in label
        subjects.setVerticalTextPosition(JLabel.CENTER);
        subjects.setBackground(Color.LIGHT_GRAY);
        subjects.setOpaque(true);
        subjects.setSize(100,100);
        subjects.setBorder(border);
        subjects.setVerticalAlignment(JLabel.CENTER);//in screen
        subjects.setHorizontalAlignment(JLabel.CENTER);
        subjects.setBounds(0,1,100,50);

        assignments = new JLabel("Assignments");
        assignments.setText("Assignments");
        assignments.setHorizontalTextPosition(JLabel.CENTER);//in label
        assignments.setVerticalTextPosition(JLabel.CENTER);
        assignments.setBackground(Color.LIGHT_GRAY);
        assignments.setOpaque(true);
        assignments.setSize(100,100);
        assignments.setBorder(border);
        assignments.setVerticalAlignment(JLabel.CENTER);//in screen
        assignments.setHorizontalAlignment(JLabel.CENTER);
        assignments.setBounds(100,1,300,50);

        dueDate = new JLabel("Due Date");
        dueDate.setText("Due Date");
        dueDate.setHorizontalTextPosition(JLabel.CENTER);//in label
        dueDate.setVerticalTextPosition(JLabel.CENTER);
        dueDate.setBackground(Color.LIGHT_GRAY);
        dueDate.setOpaque(true);
        dueDate.setSize(100,100);
        dueDate.setBorder(border);
        dueDate.setVerticalAlignment(JLabel.CENTER);//in screen
        dueDate.setHorizontalAlignment(JLabel.CENTER);
        dueDate.setBounds(400,1,100,50);

        done = new JLabel("Done");
        done.setText("Done");
        done.setHorizontalTextPosition(JLabel.CENTER);//in label
        done.setVerticalTextPosition(JLabel.CENTER);
        done.setBackground(Color.LIGHT_GRAY);
        done.setOpaque(true);
        done.setSize(100,100);
        done.setBorder(border);
        done.setVerticalAlignment(JLabel.CENTER);//in screen
        done.setHorizontalAlignment(JLabel.CENTER);
        done.setBounds(500,1,100,50);




        frame.add(subjects);
        frame.add(assignments);
        frame.add(button);
        frame.add(dueDate);
        frame.add(done);
        frame.getContentPane().setBackground( Color.BLACK );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Efficiencyyyyy");
        frame.setSize(714,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[]args){
        new Efficiencyyyyy();
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("Submit")) {
            subjectText.setEnabled(false);
            assignmentText.setEnabled(false);
            dueText.setEnabled(false);
            submit.setVisible(false);

            Date date;
            try {
                date = new Date(dueText.getText());
                SimpleDateFormat formatDate = new SimpleDateFormat("EE MM dd YYYY");
                dueText.setText(formatDate.format(date));

                long dateNow = System.currentTimeMillis();
                long dateTime = date.getTime();
                if (dateTime - dateNow < 0)
                    dueText.setDisabledTextColor(Color.red);
            } catch(Exception e) {}

            if (check.isSelected()) dueText.setDisabledTextColor(Color.green);

            yes = true;
            button.setEnabled(true);
        }
        if (event.getActionCommand().equals("Add Row") && yes) {
            y +=50;
            subjectText = new JTextField();
            subjectText.setText("Subject");
            subjectText.setPreferredSize(new Dimension(250,40));
            subjectText.setBounds(0,y, 100, 50);


            assignmentText = new JTextField();
            assignmentText.setText("Assignments");
            assignmentText.setPreferredSize(new Dimension(250,40));
            assignmentText.setBounds(100,y, 300, 50);

            dueText = new JTextField();
            dueText.setText("MM/DD/YY");
            dueText.setPreferredSize(new Dimension(250,40));
            dueText.setBounds(400,y, 100, 50);

            check = new JCheckBox();
            check.setText("Done?");
            check.setPreferredSize(new Dimension(250,40));
            check.setBounds(500,y, 100, 50);

            submit = new JButton("Submit");
            submit.setVisible(true);
            submit.setText("Submit");
            submit.addActionListener(this);
            submit.setBounds(600,y,100,50);
            submit.setBackground(Color.decode("#d08deb"));

            frame.add(subjectText);
            frame.add(assignmentText);
            frame.add(dueText);
            frame.add(check);
            frame.add(submit);
            frame.setVisible(true);
            frame.repaint();
            yes = false;
            button.setEnabled(false);
        }


    }
}
