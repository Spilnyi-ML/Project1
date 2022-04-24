package com.homeproject.firstproject;

public class Employee {
    public static void main(String[] args) {
        System.out.println("--------пункт 1, 2, 3------------");
        Employee employee_1 = new Employee();
        employee_1.setSurname("Ivanov");
        employee_1.setName("Petr");
        employee_1.setPatronymic("Sergeevich");
        employee_1.setPosition("QA-Engineer");
        employee_1.setEmail("IvanovPS@gmail.com");
        employee_1.setPhoneNumber("+79111234567");
        employee_1.setSalary(2200);
        employee_1.setAge(34);
        System.out.println(employee_1.toString());

        Employee employee_2 = new Employee();
        employee_2.setSurname("Sidorov");
        employee_2.setName("Ivan");
        employee_2.setPatronymic("Michailovich");
        employee_2.setPosition("Team-Lead");
        employee_2.setEmail("SidorovIM@gmail.com");
        employee_2.setPhoneNumber("+79211234567");
        employee_2.setSalary(4200);
        employee_2.setAge(39);
        System.out.println(employee_2.toString());

        System.out.println("--------пункт 4------------");

        Employee1[] emplArray = new Employee1[5];
        emplArray[0] = new Employee1("Ivanov", "Petr", "Sergeevich", "QA-Engineer",
                "IvanovPS@gmail.com","+79111234567", 2200, 34);
        emplArray[1] = new Employee1("Sidorov", "Ivan", "Michailovich", "Team-Lead",
                "SidorovIM@gmail.com","+79211234567", 4200, 39);
        emplArray[2] = new Employee1("Petrov", "Mikhail", "Leonidovich", "Developer",
                "PetrovML@gmail.com","+79311234567", 3200, 50);
        emplArray[3] = new Employee1("Mironov", "Fedor", "Nikolaevich", "Analyst",
                "MironovFN@gmail.com","+79411234567", 3700, 27);
        emplArray[4] = new Employee1("Kireev", "Pavel", "Stepanovich", "Project-Manager",
                "KireevPS@gmail.com","+79511234567", 4000, 42);

        for (int i = 0; i < 5; i++){
            System.out.println(emplArray[i]);
        }

        System.out.println("--------пункт 5------------");

        for (int i = 0; i < 5; i++) {
            if (emplArray[i].getAge() > 40) {
                System.out.println("Сотрудник старше 40 лет: " + emplArray[i]);
            };
        }

    }

    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public String toString() {
        return  "Фамилия: " + surname + "; Имя: " + name + "; Отчество: " + patronymic +
                "; Должность: " + position + "; Email: " + email + "; Номер телефона: " + phoneNumber +
                "; Зарплата: " + salary + "; Возраст: " + age;
    }

   public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



