public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 N° 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7(999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = Boolean.parseBoolean("true");
        post.birthday = new FormDate();
        post.birthday.day = 23;
        post.birthday.month = 8;
        post.birthday.year = 1996;
    }
}
