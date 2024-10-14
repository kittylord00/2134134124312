public class Main {
    public static void main(String[] args){
        Professor professor = new Professor("Євген", "Мартин", "ЛДУБЖД", false, 50, 500);
        Admin admin = new Admin("Сергій", "Гусак", "ЛДУБЖД", true, 48, 900);

        System.out.println(professor);
        System.out.println(admin);
    }
}
