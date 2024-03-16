package task2;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(60000, 120001);
        int age = random.nextInt(18, 78);
        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary, age);
    }

    public static Freelancer generateFreelancer(){
        String[] names = new String[] { "Александр", "Артём", "Егор", "Арсений", "Максим", "Андрей", "Клим", "Богдан", "Фёдор", "Платон" };
        String[] surnames = new String[] { "Макаров", "Панин", "Коровин", "Соколов", "Карпов", "Акимов", "Глебов", "Михайлов", "Лыткин", "Тихонов" };

        int salary = random.nextInt(30000, 180001);
        int age = random.nextInt(18, 78);
        return Freelancer.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary, age);
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     *
     * @param count
     * @return
     */
//    public static Worker[] generateEmployees(int count){
//        Worker[] workers = new Worker[count];
//        for (int i = 0; i < count; i++){
//            workers[i] = generateWorker();
//        }
//        return workers;
//    }

    public static <T extends Employee> T[] generateEmployees(int count, Class<T> type){
        T[] employees = (T[]) new Employee[count];
        for (int i = 0; i < count; i++) {
            if (type == Worker.class) {
                employees[i] = (T) generateWorker();
            } else if (type == Freelancer.class) {
                employees[i] = (T) generateFreelancer();
            }
        }
        return employees;
    }




}
