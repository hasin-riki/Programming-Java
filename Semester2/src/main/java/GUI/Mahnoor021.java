
package GUI;

import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Mahnoor021 extends Frame
{
    public Mahnoor021 (String abcd) {
        super(abcd);
        Label x, y;
        TextField a, b;
        Button c, d;

        setLayout(new FlowLayout());
        setSize(400, 300);
        setTitle("Mahnoor Khan");
        setVisible(true);
        x = new Label("Username");
        x.setBounds(20, 20, 100, 40);
        add(x);
        y = new Label("Password");
        y.setBounds(20, 60, 100, 40);
        add(y);
        a = new TextField("");
        a.setBounds(120, 20, 200, 40);
        add(a);
        b = new TextField("");
        b.setBounds(120, 60, 200, 40);
        add(b);
        c = new Button("Submit");
        c.setBackground(Color.white);
        add(c);
        d = new Button("Cancel");
        d.setBackground(Color.white);
        add(d);
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                Frame f = (Frame) e.getSource();
                f.dispose();
            }
        });
    }

    public static void main(String[] args)
    {
        Mahnoor021 abcd = new Mahnoor021("Mahnoor Khan");
    }
}
