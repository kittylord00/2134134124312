
class Professor extends Employee {
    private int ammountOfLectures;
    private double salaryForLecture;

    public Professor(String name, String surname, String department, boolean isMilitary, int ammountOfLectures, double salaryForLecture) {
        super(name, surname, department, isMilitary);
        this.ammountOfLectures = ammountOfLectures;
        this.salaryForLecture = salaryForLecture;
    }


    @Override
    public double calculateSalary() {
        return ammountOfLectures * salaryForLecture;
    }

    @Override
    public String performDuties() {
        return "Навчає студентів";
    }

    public int getAmmountOfLectures() {
        return ammountOfLectures;
    }


    public void setAmmountOfLectures(int ammountOfLectures) {
        this.ammountOfLectures = ammountOfLectures;
    }

    public double getSalaryForLecture() {
        return salaryForLecture;
    }

    public void setSalaryForLecture(double salaryForLecture) {
        this.salaryForLecture = salaryForLecture;
    }

    @Override
    public String toString() {
        return "Профессор - " + "Ім'я: " +getFirstname() + ", " + "Прізвище: " + getLastname()+ ", " + "Працює у навчальному закладі " + getDepartment()+ ", " + "Чи є він військовим? - "  + isMilitary()+ ", " + "Кількість проведених лекцій - " + getAmmountOfLectures()+ ", " + "За одну лекцію він отримує " + getSalaryForLecture()+ ", " + "Його запрплата: " +calculateSalary()+ ", " + "Чи може він заступити у наряд? - " +isDuty();
    }

}