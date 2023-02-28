import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class GUILayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Моя программа");
        // размеры окна программы
        frame.setBounds(300, 300, 400, 500);

        // позволять или нет изменять размер окна мышкой
        frame.setResizable(false);

        // завершать выполнение программы, когда закрываем ее
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout()); // без этого лэйаута невозможно размещать элементы там где нужно (Север, Юг, т.д.)

        // --------------------------------------------------------------------------------------------------
        // создаем панель заголовка
        JPanel topPanel = new JPanel();
        // отступы содержимого. Отступ сверху, слева, снизу, справа
        topPanel.setBorder(new EmptyBorder(0, 0, 0, 20));

        // прописываем заголовок
        JLabel labelTitle = new JLabel("Моя форма");
        labelTitle.setFont(new Font("Arial", Font.BOLD, 22)); // шрифт заголовка

        // добавляем панель заголовка и вешаем на нее заголовок
        frame.add(topPanel, BorderLayout.NORTH);
        topPanel.add(labelTitle);

        // --------------------------------------------------------------------------------------------------
        // создаем основную панель
        JPanel mainPanel = new JPanel();
        JLabel nameL = new JLabel("Имя: "); // заголовок к текстовому полю: Имя
        JTextField nameTF = new JTextField(); // тектовое поле: имя
        JLabel mailL = new JLabel("Мейл: "); // заголовок к текстовому полю: почта
        JTextField mailTF = new JTextField(); // тектовое поле: почта

        // задаем названиям полей выравнивание
        nameL.setHorizontalAlignment(SwingConstants.RIGHT);
        mailL.setHorizontalAlignment(SwingConstants.RIGHT);

        // задаем текстовым полям геом. параметры
        nameTF.setPreferredSize(new Dimension(200, 20));
        mailTF.setPreferredSize(new Dimension(200, 20));

        // добавляем основную панель и вешаем на нее все, что насоздавали
        frame.add(mainPanel, BorderLayout.CENTER);
        // для привязки объектов по координатам используем GridBagConstraints
        mainPanel.setLayout(new GridBagLayout()); // без этого лэйаута невозможно задавать координаты элементам
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 0, 10, 5);
        c.fill = GridBagConstraints.BOTH; // без добавления этого свойства выравнивание не сработает. Верстка макета какая-то
        mainPanel.add(nameL, c);
        c.gridx = 1;
        c.gridy = 0;
        mainPanel.add(nameTF, c);
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(mailL, c);
        c.gridx = 1;
        c.gridy = 1;
        mainPanel.add(mailTF, c);

        // --------------------------------------------------------------------------------------------------
        // создаем панель-подвал
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBorder(new EmptyBorder(0, 0, 20, 0));

        // чекбокс и кнопка, чтобы подписаться
        JCheckBox subscribeOffer = new JCheckBox("Подписаться на новости");
        JButton button = new JButton("ЖМИ!");
        button.setPreferredSize(new Dimension(100, 20));

        // добавляем панель-подвал и вешаем на нее все, что насоздавали
        frame.add(bottomPanel, BorderLayout.SOUTH);
        bottomPanel.add(subscribeOffer);
        bottomPanel.add(button);

        // --------------------------------------------------------------------------------------------------
        // видно окошко или нет. Нам нужно чтоб было видно уж. Рекомендуется выводить этот метод последним
        frame.setVisible(true); // видно окошко или нет. Нам нужно чтоб было видно уж. Рекомендуется выводить этот метод последним
    }
}