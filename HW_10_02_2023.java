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

        public String getFirmName() {
            return firmName;
        }

        public void setFirmName(String firmName) {
            this.firmName = firmName;
        }

        private FirmNameList(String firmName) {
            this.firmName = firmName;
        }
    }

    private class Department extends FirmNameList {
        private String department;
        private int numberOfEmployees;
        private String firmName;

        public String getDepartment() {
            return department;
        }

        public int getNumberOfEmployees() {
            return numberOfEmployees;
        }

        public String getFirmName() {
            return firmName;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public void setNumberOfEmployees(int numberOfEmployees) {
            this.numberOfEmployees = numberOfEmployees;
        }

        public void setFirmName(String firmName) {
            this.firmName = firmName;
        }

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

        public String getEmployeeName() {
            return employeeName;
        }

        public String getEmployeePosition() {
            return employeePosition;
        }

        public int getEmployeeSalary() {
            return employeeSalary;
        }

        public String getDepartment() {
            return department;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public void setEmployeePosition(String employeePosition) {
            this.employeePosition = employeePosition;
        }

        public void setEmployeeSalary(int employeeSalary) {
            this.employeeSalary = employeeSalary;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        private EmployeeList(String department, String employeeName, String employeePosition, int employeeSalary, String firmName) {
            super(department, firmName);
            this.employeeName = employeeName;
            this.employeePosition = employeePosition;
            this.employeeSalary = employeeSalary;
            this.department = department;
        }
    }
    private class EmployeeType extends EmployeeList {
          private String employeeType;

        public String getEmployeeType() {
            return employeeType;
        }

        public void setEmployeeType(String employeeType) {
            this.employeeType = employeeType;
        }

        public EmployeeType(String department, String employeeName, String employeePosition, int employeeSalary, String firmName, String employeeType) {
            super(department, employeeName, employeePosition, employeeSalary, firmName);
            this.employeeType = employeeType;
        }
    }


}


