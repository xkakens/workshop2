package pl.coderslab;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User("email2","kakens","haslo");
        userDao.create(user);
        User toChange = userDao.read(3);
        toChange.setUsername("pseudonim2");
        userDao.update(toChange);
        userDao.delete(1);
        System.out.println(userDao.findAll().toString());
    }
}