interface Workable{
    String performDuties();
}

interface Service{
    boolean isDuty();
}

abstract class Employee implements Workable, Service {
    private String name;
    private String surname;
    private String department;
    private boolean isMilitary;

    public Employee(String name,String surname, String department, boolean isMilitary){
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.isMilitary = isMilitary;
    }

    public abstract double calculateSalary();

    @Override
    public boolean isDuty(){
        return isMilitary;
    }

    public String getFirstname() {
        return name;
    }

    public void setFirstname(String firstname) {
        this.name = firstname;
    }

    public String getLastname() {
        return surname;
    }

    public void setLastname(String lastname) {
        this.surname = lastname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public abstract String performDuties();
}



