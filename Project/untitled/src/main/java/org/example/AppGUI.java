package org.example;

import javax.swing.*;
import java.awt.*;

public class AppGUI extends JFrame {

    private Student student;

    private JTextField nameField;
    private JTextField priceField;
    private JTextArea descriptionArea;
    private JComboBox<Category> categoryBox;

    private DefaultListModel<String> listModel;

    public AppGUI() {
        student = new Student("S001", "Anna", "anna@edu.p.lodz.pl", 10);

        setTitle("campUStrade - Create Activity");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));

        // ===== FORM =====
        JPanel form = new JPanel(new GridLayout(5, 2, 5, 5));

        nameField = new JTextField();
        priceField = new JTextField();
        descriptionArea = new JTextArea(3, 20);

        categoryBox = new JComboBox<>();
        categoryBox.addItem(new Category("Tutoring"));
        categoryBox.addItem(new Category("Repairs"));
        categoryBox.addItem(new Category("Languages"));

        JButton createButton = new JButton("Create Activity");
        createButton.addActionListener(e -> createActivity());

        form.add(new JLabel("Activity Name:"));
        form.add(nameField);

        form.add(new JLabel("Price:"));
        form.add(priceField);

        form.add(new JLabel("Description:"));
        form.add(new JScrollPane(descriptionArea));

        form.add(new JLabel("Category:"));
        form.add(categoryBox);

        form.add(new JLabel(""));
        form.add(createButton);

        // ===== LIST =====
        listModel = new DefaultListModel<>();
        JList<String> activityList = new JList<>(listModel);

        panel.add(form, BorderLayout.NORTH);
        panel.add(new JScrollPane(activityList), BorderLayout.CENTER);

        add(panel);
    }

    private void createActivity() {
        try {
            String name = nameField.getText();
            int price = Integer.parseInt(priceField.getText());
            String description = descriptionArea.getText();
            Category category = (Category) categoryBox.getSelectedItem();

            Activity activity = student.createActivity(name, price, description, category);

            listModel.addElement(
                    activity.getActivityName() + " | " +
                            activity.getPrice() + " credits | " +
                            activity.getCategory().getCategoryName()
            );

            clearFields();

            JOptionPane.showMessageDialog(this, "Activity created!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Price must be a number!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void clearFields() {
        nameField.setText("");
        priceField.setText("");
        descriptionArea.setText("");
        categoryBox.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AppGUI().setVisible(true));
    }
}