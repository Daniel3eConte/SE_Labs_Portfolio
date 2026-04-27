package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class AppGUI extends JFrame {
    private JComboBox<Category> filterBox;
    private List<Student> students = new ArrayList<>();
    private List<Category> categories = new ArrayList<>();
    private Student loggedStudent = null;

    private JComboBox<Category> categoryComboBox;
    private DefaultListModel<Activity> activityModel = new DefaultListModel<>();
    private DefaultListModel<Category> categoryModel = new DefaultListModel<>();

    public AppGUI() {
        setTitle("campUStrade");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTabbedPane tabs = new JTabbedPane();
        tabs.add("Register", registerPanel());
        tabs.add("Login", loginPanel());
        tabs.add("Category", categoryPanel());
        tabs.add("Activity", activityPanel());
        tabs.add("Manage", managePanel());

        add(tabs);
    }

    private JPanel registerPanel() {
        JPanel p = new JPanel(new GridLayout(5,2));

        JTextField id = new JTextField();
        JTextField name = new JTextField();
        JTextField email = new JTextField();
        JPasswordField pwd = new JPasswordField();

        p.add(new JLabel("ID")); p.add(id);
        p.add(new JLabel("Name")); p.add(name);
        p.add(new JLabel("Email")); p.add(email);
        p.add(new JLabel("Password")); p.add(pwd);

        JButton btn = new JButton("Register");
        p.add(btn);

        btn.addActionListener(e -> {
            students.add(new Student(
                    id.getText(),
                    name.getText(),
                    email.getText(),
                    new String(pwd.getPassword()),
                    0
            ));
            JOptionPane.showMessageDialog(this, "Registered");
        });

        return p;
    }

    private JPanel loginPanel() {
        JPanel p = new JPanel(new GridLayout(3,2));

        JTextField email = new JTextField();
        JPasswordField pwd = new JPasswordField();

        p.add(new JLabel("Email")); p.add(email);
        p.add(new JLabel("Password")); p.add(pwd);

        JButton btn = new JButton("Login");
        p.add(btn);

        btn.addActionListener(e -> {
            for (Student s : students) {
                if (s.getEmail().equals(email.getText()) &&
                        s.checkPassword(new String(pwd.getPassword()))) {
                    loggedStudent = s;
                    JOptionPane.showMessageDialog(this, "Login OK");
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Login failed");
        });

        return p;
    }

    private JPanel categoryPanel() {
        JPanel p = new JPanel(new BorderLayout());

        JTextField field = new JTextField();
        JButton add = new JButton("Add");
        JButton del = new JButton("Delete");

        JList<Category> list = new JList<>(categoryModel);

        JPanel top = new JPanel(new GridLayout(1,3));
        top.add(field); top.add(add); top.add(del);

        p.add(top, BorderLayout.NORTH);
        p.add(new JScrollPane(list), BorderLayout.CENTER);

        add.addActionListener(e -> {
            Category c = new Category(field.getText());
            categories.add(c);
            categoryModel.addElement(c);

            if (categoryComboBox != null) categoryComboBox.addItem(c);
            if (filterBox != null) filterBox.addItem(c); // ✅ QUI
        });
        del.addActionListener(e -> {
            Category c = list.getSelectedValue();
            if (c != null) {
                categories.remove(c);
                categoryModel.removeElement(c);
                if (categoryComboBox != null) categoryComboBox.removeItem(c);
            }
        });

        return p;
    }

    private JPanel activityPanel() {
        JPanel p = new JPanel(new GridLayout(5,2));

        JTextField name = new JTextField();
        JTextField price = new JTextField();
        JTextField desc = new JTextField();

        categoryComboBox = new JComboBox<>();

        JButton create = new JButton("Create");

        p.add(new JLabel("Name")); p.add(name);
        p.add(new JLabel("Price")); p.add(price);
        p.add(new JLabel("Description")); p.add(desc);
        p.add(new JLabel("Category")); p.add(categoryComboBox);
        p.add(create);

        create.addActionListener(e -> {
            if (loggedStudent == null) {
                JOptionPane.showMessageDialog(this, "Login first");
                return;
            }

            Category c = (Category) categoryComboBox.getSelectedItem();
            if (c == null) return;

            Activity a = loggedStudent.createActivity(
                    name.getText(),
                    Integer.parseInt(price.getText()),
                    desc.getText(),
                    c
            );

            activityModel.addElement(a);
        });

        return p;
    }

    private JPanel managePanel() {
        JPanel p = new JPanel(new BorderLayout());

        filterBox = new JComboBox<>();
        for (Category c : categories) filterBox.addItem(c);

        DefaultListModel<Activity> filteredModel = new DefaultListModel<>();
        JList<Activity> list = new JList<>(filteredModel);

        JButton filterBtn = new JButton("Filter");
        JButton delete = new JButton("Delete Activity");

        JPanel top = new JPanel(new GridLayout(1,2));
        top.add(filterBox);
        top.add(filterBtn);

        p.add(top, BorderLayout.NORTH);
        p.add(new JScrollPane(list), BorderLayout.CENTER);
        p.add(delete, BorderLayout.SOUTH);

        filterBtn.addActionListener(e -> {
            filteredModel.clear();
            Category selected = (Category) filterBox.getSelectedItem();
            if (selected != null) {
                for (Activity a : selected.getActivities()) {
                    filteredModel.addElement(a);
                }
            }
        });

        delete.addActionListener(e -> {
            Activity a = list.getSelectedValue();
            if (a != null) {
                a.getCategory().getActivities().remove(a);
                filteredModel.removeElement(a);
                activityModel.removeElement(a);
            }
        });

        return p;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AppGUI().setVisible(true));
    }
}