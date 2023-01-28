public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.username = "yo";
        user.password = "ZZaaqq11";
        user.sayHello();

        User mikus = new User("Mikus", "Haslo");
        mikus.sayHello();
    }
}
