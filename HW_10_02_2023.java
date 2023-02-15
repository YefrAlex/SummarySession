package SummarySession;
      /*  Создать три класса:
        а) Фирма (с полем Название).
        б) Отдел (с полями Название, Количество сотрудников, Фирма)
        в) Сотрудник (с полями ФИО, Должность, Оклад, Отдел).
        В этом пункте Вам необходимо придумать логичные и правильные (с точки зрения именования классов и переменных в Java) названия классов, всех полей.
        Подберите правильные, на Ваш взгляд, типы данных. Расставьте нужные модификаторы доступа. Создайте сеттеры и геттеры, конструкторы.

        Предположим, что все сотрудники делятся на два типа: Штатный сотрудник и Сотрудник по контракту.
        Реализовать этот пункт с помощью наследования.
       */

public class HW_10_02_2023 {

    public static void main(String[] args) {
    }

    private class FirmNameList {
        private String firmName;

        private FirmNameList(String firmName) {
            this.firmName = firmName;
        }
    }

    private class Department extends FirmNameList {
        private String department;
        private int numberOfEmployees;
        private String firmName;

        private Department(String firmName, String department, int numberOfEmployees) {
            super(firmName);
            this.department = department;
            this.numberOfEmployees = numberOfEmployees;
            this.firmName = firmName;

        }

        public Department(String firmName, String department) {
            super(firmName);
            this.department = department;

        }
    }

    private class EmployeeList extends Department {
        private String employeeName;
        private String employeePosition;
        private int employeeSalary;
        private String department;

        private EmployeeList(String department, String employeeName, String employeePosition, int employeeSalary, String firmName) {
            super(department, firmName);
            this.employeeName = employeeName;
            this.employeePosition = employeePosition;
            this.employeeSalary = employeeSalary;
            this.department = department;
        }
    }
}


