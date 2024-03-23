public class Main {
       public static int [] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int [] arr = new int [30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        taskOne();
    }
    public static void taskOne() {

        System.out.println("Task 1");
        int[] arr = generateRandomArray();
        //Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Напишите программу, которая решит эту задачу, и выведите в консоль
        // результат в формате: «Сумма трат за месяц составила … рублей».
        int moneyPerMonth = 0;
        //сумма всех затрат за 30 дней
        for (int iMoney : arr) {
           moneyPerMonth += iMoney;
       }
        //System.out.println(Arrays.toString(arr)); // для проверки
        System.out.println("Сумма трат за месяц составила = " +moneyPerMonth + " рублей");

        System.out.println("Task 2");
        arr = generateRandomArray();
        //Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в
        // формате: «Минимальная сумма трат за день составила … рублей. Максимальная
        // сумма трат за день составила … рублей».
        int minimumMoneyPerDay = arr[0];
        int maximumMoneyPerDay = arr[0];
        for (int iMoney : arr) {
            if (minimumMoneyPerDay > iMoney) {
                minimumMoneyPerDay = iMoney;
            }
            else if (maximumMoneyPerDay < iMoney){
                maximumMoneyPerDay = iMoney;
            }
        }
        //System.out.println(Arrays.toString(arr)); // для проверки
        System.out.println("Минимальная сумма трат за день составила = " + minimumMoneyPerDay + " рублей");
        System.out.println("Максимальная сумма трат за день составила = " + maximumMoneyPerDay + " рублей");

        System.out.println("Task 3");
        arr = generateRandomArray();
        //Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        //Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за
        // месяц поделить на количество дней), и выведите в консоль результат в формате: «Средняя сумма
        // трат за месяц составила … рублей».
        //Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
        float averageMoneyPerMonth = 0;
        for (int iMoney : arr) {
            averageMoneyPerMonth += iMoney;
        }
        averageMoneyPerMonth = averageMoneyPerMonth/arr.length;
        //System.out.println(Arrays.toString(arr)); // для проверки
        System.out.println("Средняя сумма трат за месяц составила = " + averageMoneyPerMonth + " рублей");

        System.out.println("Task 4");
        //В бухгалтерской книге появился баг. Что-то пошло не так: фамилии и имена сотрудников начали
        // отображаться в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные
        // с именами сотрудников хранятся в виде массива символов char[ ].
        //Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в
        // корректном виде. В качестве данных для массива используйте:
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //В результате в консоль должно быть выведено: Ivanov Ivan.
        //Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно
        // пройти по массиву циклом и распечатать его элементы в правильном порядке.
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //for (int i = reverseFullName.length-1; i >= 0; i--) {
        //   System.out.print(reverseFullName[i]);
        //}
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
       }
}