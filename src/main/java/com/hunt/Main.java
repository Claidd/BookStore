package com.hunt;

import com.hunt.model.*;

import java.util.ArrayList;

public class Main {
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Employee> employees = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        initData();
        String booksInfo =
                String.format("Общее кол-во проданных книг %d на сумму %f", getCountOfSoldBooks(),getAllPriceOfSoldBooks());
        System.out.println(booksInfo);
    }
    // Получить общую сумму заказов
    public static double getAllPriceOfSoldBooks(){
        double price = 0;
        for (Order order : orders){
            // Используем метод снизу
            price += getPriceSoldBooksInOrder(order);
        }
        return price;
    }

    //Возвращаем общую стоимость книг одного заказа
    public static double getPriceSoldBooksInOrder(Order order){
        double price = 0;
        for (long bookId : order.getBooks()){
            Book book = getBookId(bookId);
            price += book.getPrice();
        }
        return price;
    }



    // Получить общее количество проданных книг
    public static int getCountOfSoldBooks(){
        int count = 0;
        for (Order order : orders){
            count += order.getBooks().length;
        }
        return count;
    }

    //Поиск книги по ее ид
    public static Book getBookId(long id){

        Book currentBook = null;
        for (Book book : books){
            if (book.getId() == id){
                currentBook = book;
                break;
            }
        }
        return currentBook;
    }



    public static void initData(){
        employees.add(new Employee(1, "Иван Хант", 32));
        employees.add(new Employee(2, "Машенька Радионова", 29));
        employees.add(new Employee(3, "Мелкий Плут", 15));

        customers.add(new Customer(1, "Сидоров Алексей", 25));
        customers.add(new Customer(2, "Романов Дмитрий", 32));
        customers.add(new Customer(3, "Симонов Кирилл", 19));
        customers.add(new Customer(4, "Кириенко Данил", 45));
        customers.add(new Customer(5, "Воротникова элина", 23));

        books.add(new Book(1, "Война и мир", "Толстой Лев", 1600, BookGenre.ART));
        books.add(new Book(2, "Перступление и наказание", "Достоевский Федор", 600, BookGenre.ART));
        books.add(new Book(3, "Мертвые души", "Гоголь Николай", 750, BookGenre.ART));
        books.add(new Book(4, "Руслан и Людмила", "Пушкин Александр", 500, BookGenre.ART));

        books.add(new Book(5, "Введение в психоанализ", "Фрейд Зигмунд", 1050, BookGenre.PSYCHOLOGY));
        books.add(new Book(6, "Психология влияния", "Чалдин Роберт", 550, BookGenre.PSYCHOLOGY));
        books.add(new Book(7, "Как перестать беспокоиться", "Карнеги Дейл", 1000, BookGenre.PSYCHOLOGY));

        books.add(new Book(8, "Gang of Four", "Гаммак Эрих", 900, BookGenre.PROGRAMMING));
        books.add(new Book(9, "Совершенный код", "Макконел Стив", 1200, BookGenre.PROGRAMMING));
        books.add(new Book(10, "Рефакторинг", "Фаулер Мартин", 850, BookGenre.PROGRAMMING));
        books.add(new Book(11, "Алгоритмы", "Кармен Томас", 450, BookGenre.PROGRAMMING));

        orders.add(new Order(1, 1,1,new long[]{8,9,10,11}));
        orders.add(new Order(2, 1,2,new long[]{1}));

        orders.add(new Order(2, 2,3,new long[]{5,6,7}));
        orders.add(new Order(2, 2,4,new long[]{1,2,3,4}));

        orders.add(new Order(2, 3,5,new long[]{2,5,9}));
    }
}