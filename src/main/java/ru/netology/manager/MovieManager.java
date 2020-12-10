package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
  private int numOfMovies = 10;
  private Movie[] items = new Movie[0];

  public MovieManager() {
  }

  public MovieManager(int numOfMovies) {
    this.numOfMovies = numOfMovies;
  }

  public void add(Movie item) {
    // создаём новый массив размером на единицу больше
    int length = items.length + 1;
    Movie[] tmp = new Movie[length];
    System.arraycopy(items, 0, tmp, 0, items.length);
    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = item;
    items = tmp;
  }

  public Movie[] getAll() {
    Movie[] result = new Movie[items.length];
    for (int i = 0; i < result.length; i++) {
      int index = items.length - i - 1;
      result[i] = items[index];
    }
    return result;

  } public Movie[] getMovies() {
    int numToShow = Math.min(items.length, numOfMovies);
    Movie[] result = new Movie[numOfMovies];
    for (int i = 0; i < result.length; i++) {
      int index = numOfMovies - i - 1;
      result[i] = items[index];
    }
    return result;
  }
}
