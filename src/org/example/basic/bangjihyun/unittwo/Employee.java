package org.example.basic.bangjihyun.unittwo;

public class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getter
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // Setter (단, salary는 제공하지 않음)
    public void setName(String name) {
        this.name = name;
    }

    // 부서 변경 전용 메서드
    public void changeDepartment(String newDepartment) {
        if (newDepartment != null && !newDepartment.isBlank()) {
            this.department = newDepartment;
            System.out.println("부서가 " + newDepartment + "로 변경되었습니다.");
        } else {
            System.out.println("유효하지 않은 부서명입니다.");
        }
    }
}
