import java.util.*;

public class TaskForWork {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 4, 5, 1, 5, 4};

        System.out.println(new TaskForWork().calculate(arr));

    }
    public HashMap<Integer, Integer> calculate(int[] arr) {
        //Переменная счетчик повторений
        int count = 1;

        //Инициализация
        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        //Работа метода
        for (int j : arr) {
            if (!uniqueSet.add(j)) list.add(j);                                             // Заполнение коллекции, повторяющимися элементами.
        }
        if (list.size() > 0) {                                                             // Проверка на содержание повторябщихся элементов в исходном массиве.
            for (int i = 0; i < uniqueSet.size(); i++) {                                    // Внешний цикл, содержащий элементы без повторений (будущий ключ HashMap).
                for (int j = 0; j < list.size(); j++) {                                    // Внутренний цикл, содержащий элементы списка с повторениями (будущее значение HashMap).
                    if (Objects.equals(uniqueSet.stream().toList().get(i), list.get(j))) {  // Сравниваем элементы двух коллекций для колучения количества повторений.
                        count++;
                    }
                    if (j == list.size() - 1) {                                            // Условие на проверку окончания коллекции с ключами HashMap.
                        map.put(uniqueSet.stream().toList().get(i), count);                 // Заполнение HashMap полученными ключами и значеними.
                        count = 1;                                                         // Обновление счетчика после добавления одного элемента.
                    }
                }
            }
        } else {                                                                           // Условие для массива без повторений.
            for (int i = 0; i < uniqueSet.size(); i++) {                                    // Цикл для обхода всех элементов исходного массива/списка.
                map.put(uniqueSet.stream().toList().get(i), 1);                             // Заполнение HashMap.
            }
        }
        return map;
    }
}
