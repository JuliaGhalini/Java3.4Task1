package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {

  private int numOfMoviesToShow = 10;
  private Movie[] items = new Movie[0];

  public MovieManager() {
  }

  public MovieManager(int numOfMoviesToShow) {
    this.numOfMoviesToShow = numOfMoviesToShow;
  }

  public void add(Movie item) {
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
  }

  public Movie[] getMovies() {
    int numToShow = Math.min(items.length, numOfMoviesToShow);
    Movie[] result = new Movie[numToShow];
    for (int i = 0; i < result.length; i++) {
      int index = numToShow - i - 1;
      result[i] = items[index];
    }
    return result;
  }

}
