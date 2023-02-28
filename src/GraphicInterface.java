import javax.swing.*;

public class GraphicInterface {
    public static void main(String[] args) {
        // окно графического интерфейса
        JFrame frame = new JFrame ("Моя программа");

        // размеры окна программы
        frame.setBounds(300, 300, 500, 500);

        // позволять или нет изменять размер окна мышкой
        frame.setResizable(true);

        // завершать выполнение программы, когда закрываем ее
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // создаем панель, внутри которой будем размещать элементы
        JPanel panel = new JPanel();
        frame.add(panel);

        // просто надпись
        JLabel label = new JLabel("Нажми на эту кнопку, когда будешь готов");
        panel.add(label);

        // кнопка
        JButton button = new JButton("ЖМИ!");
        panel.add(button);

        // галочка
        JCheckBox checkbox = new JCheckBox("текст чекбокса");
        panel.add(checkbox);

        // обычное однострочное текстовое поле
        JTextField textfield = new JTextField("дефолтный текст", 20);
        panel.add(textfield);

        // взаимоисключающая галочка, т. н. радиокнопка
        JRadioButton radiobutton1 = new JRadioButton("Радиокнопка1");
        JRadioButton radiobutton2 = new JRadioButton("Радиокнопка2");
        ButtonGroup bg = new ButtonGroup(); // необходимо добавить обе кнопки в группу, чтобы кнопки были взаимоисключающими
        bg.add(radiobutton1);
        bg.add(radiobutton2);
        panel.add(radiobutton1);
        panel.add(radiobutton2);

        // многострочное текстовое поле
        JTextArea textarea = new JTextArea("дефолтный текст");
        panel.add(textarea);

        // эти два массива - содержимое для будущей таблицы
        String arrData [][] = {{"1", "Toyota"}, {"2", "Mitsubishi"}, {"3", "Lexus"}, {"4", "Ford"}};
        String colsTitle [] = {"№ п/п", "Марка авто"};
        // создаем таблицу, наполняем ее данными из массивов
        JTable table = new JTable(arrData, colsTitle);
        JScrollPane scroll = new JScrollPane(table);
        panel.add(scroll);

        frame.setVisible(true); // видно окошко или нет. Нам нужно чтоб было видно уж. Рекомендуется выводить этот метод последним
    }
}
