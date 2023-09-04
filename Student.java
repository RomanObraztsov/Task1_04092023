import java.util.Scanner;

public class Student {
    private String name;
    private String lName;
    private String otch = "-";
    private int age;
    String[] predmets = new String[] {"Математика", "Информатика", "Русский язык"};
    int[] marks = new int[3];

    public void setName(){
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.next();
        this.lName = scanner.next();
        this.age = scanner.nextInt();
        System.out.println("У студента есть отчество?");
        String answer = scanner.next();
        if (answer == "Да" || answer == "да" || answer == "Yes" || answer == "yes"){
            this.otch = scanner.next();
        } else if (answer == "Нет" || answer == "нет" || answer == "No" || answer == "no"){
            System.out.println("В графу Отчество будет записан — ");
        } else {
            System.out.println("Ответ некорректен.");
        }
        System.out.println("Введите оценки студента:");
        System.out.println("Математика:");
        this.marks[0] = scanner.nextInt();
        System.out.println("Информатика:");
        this.marks[1] = scanner.nextInt();
        System.out.println("Русский язык:");
        this.marks[2] = scanner.nextInt();
    }

}


