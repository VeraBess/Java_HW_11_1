package ru.netology.domain.services;

public class MovieManager {

    private String[] movies = new String[0];
    private int limit;

    public MovieManager() {  //конструктор без параметров для вывода кол-ва фильмов по умолчанию
        this.limit = 5;
    }

    public MovieManager(int limit) { //конструктор с параметром для вывода любого кол-ва фильмов
        this.limit = limit;
    }

    public void addMovie(String movie) {  //Метод добавление нового фильма
        String[] temp = new String[movies.length + 1]; //новый массив temp это массив movies + 1 ячейка
        for (int i = 0; i < movies.length; i++) {  //циклом проходим по массиву
            temp[i] = movies[i]; //копируем ячейки из массива movies в массив temp
        }
        temp[temp.length - 1] = movie; //в последнюю ячейку нового массива temp кладем добавленный фильм
        movies = temp; //массив temp становится массивом movies
    }

    public String[] findAll() {  //Метод вывод всех фильмов в порядке добавления
        return movies;
    }

    public String[] findLast() {  //Метод вывод по лимиту последних добавленных фильмов в обратном порядке
        int resultLength; //переменная для желаемого размера массива где будут последние фильмы
        if (movies.length < limit) {  //проверка на кол-во фильмов, если меньше заданного лимита то выводим что есть
            resultLength = movies.length;
        } else {
            resultLength = limit;  // если кол-во фильмов равно или больше заданного лимита то выводим кол-во по лимиту
        }
        String[] temp = new String[resultLength]; // создаем массив с определенным выше кол-вом ячеек
        for (int i = 0; i < temp.length; i++) { // проходим циклом по всему массиву
            temp[i] = movies[movies.length - 1 - i]; //складываем в массив ячейки в обратном порядке
        }
        return temp;
    }
}
