package net.jrz.flyweight;

public interface WebActions {
    void access(User user);
    void welcome();
    void exit(User user);
    void introduction();
}

class BlogWebActions implements WebActions{
    @Override
    public void access(User user) {
        System.out.println("This is the blog web, and the access user is " + user);
    }

    @Override
    public void welcome() {
        System.out.println("Welcome to the blog web !!!");
    }

    @Override
    public void exit(User user) {
        System.out.println("The " + user + " will exit...");
        System.out.println("GoodBye, the blog web look forward to meet again");
    }

    @Override
    public void introduction() {
        System.out.println("Hello, this is the web of blog. ");
    }
}

class MallWebActions implements WebActions{
     @Override
    public void access(User user) {
        System.out.println("This is the mall web, and the access user is " + user);
    }

    @Override
    public void welcome() {
        System.out.println("Welcome to the mall web !!!");
    }

    @Override
    public void exit(User user) {
        System.out.println("The " + user + " will exit...");
        System.out.println("GoodBye, the mall web look forward to meet again");
    }

    @Override
    public void introduction() {
        System.out.println("Hello, this is the web of mall. ");
    }
}

class SingleWebActions implements WebActions{
    @Override
    public void access(User user) {
        System.out.println("This is the singlePerson web, and the access user is " + user);
    }

    @Override
    public void welcome() {
        System.out.println("Welcome to the singlePerson web !!!");
    }

    @Override
    public void exit(User user) {
        System.out.println("The " + user + " will exit...");
        System.out.println("GoodBye, the singlePerson web look forward to meet again");
    }

    @Override
    public void introduction() {
        System.out.println("Hello, this is the web of singlePerson. ");
    }
}