class Admin extends Employee{
    private int hoursOfWork;
    private double salaryPerHour;

    public Admin(String name, String surname, String department, boolean isMilitary, int hoursOfWork, double salaryPerHour) {
        super(name, surname, department, isMilitary);
        this.hoursOfWork = hoursOfWork;
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public String performDuties(){
        return "Керує професорами";
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public String toString(){
        return "Адміністратор - " + "Ім'я: " +getFirstname() + ", "+ "Прізвище: " + getLastname()+ ", " + "Працює у навчальному закладі " + getDepartment()+ ", " + "Чи є він військовим? - "  + isMilitary()+ ", " + "Відпрацьовано ним годин " + getHoursOfWork() + ", " + "За одну робочу годину він отримує " + getSalaryPerHour()+ ", " + "Загальна зарплата:" +calculateSalary() +", " + "Його зобов'язання: " + performDuties() + ", " + "Чи може він заступини в наряд? - "+ isDuty();
    }
}