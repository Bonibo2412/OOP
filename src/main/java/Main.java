public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
            post.birthday.day = 13;
            post.birthday.month = 10;
            post.birthday.year = 2000;
        post.name = "Иван";
        post.passport = "4444 № 4444444";
        post.patronymic = "Иванович";
        post.phone = "+7-916-456-78-95";
        post.surname = "Иванович";
        post.subscription = true;

    }
}

