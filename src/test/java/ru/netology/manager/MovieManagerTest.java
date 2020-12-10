package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
  private MovieManager movieManagerDefault = new MovieManager();

  private Movie[] movies;

  //добавление фильма в ленту
  @Test
  public void shouldAdd() {
    movies = new Movie[5];
    for (int i = 0; i < 5; i++) {
      movies[i] = new Movie();
    }
    for (int i = 0; i < 5; i++) {
      movieManagerDefault.add(movies[i]);
    }
    Movie[] actual = movieManagerDefault.getAll();
    Movie[] expected = new Movie[]{movies[4], movies[3], movies[2],movies[1], movies[0]};

    assertArrayEquals(expected, actual);

  }

  //получить последние 10 фильмов, если их в ленте меньше 10
  @Test
  public void shouldGetLessTen() {
    movies = new Movie[5];

    for (int i = 0; i < 5; i++) {
      movies[i] = new Movie();
    }
    for (int i = 0; i < 5; i++) {
      movieManagerDefault.add(movies[i]);
    }
    Movie[] actual = movieManagerDefault.getAll();
    Movie[] expected = new Movie[]{movies[4], movies[3], movies[2],movies[1], movies[0]};

    assertArrayEquals(expected, actual);

  }

  //получить последние 10 фильмов, если их в ленте больше 10
  @Test
  public void shouldGetIfMoreTen() {
    movies = new Movie[11];
    for (int i = 0; i < 11; i++) {
      movies[i] = new Movie();
    }
    for (int i = 0; i < 11; i++) {
      movieManagerDefault.add(movies[i]);
    }
    Movie[] actual = movieManagerDefault.getMovies();
    Movie[] expected = new Movie[10];
    for (int i = 0; i < 10; i++) {
      expected[i] = movies[10 - i];
    }
    assertArrayEquals(expected, actual);
  }

  //получить произвольное число фильмов, которое больше, чем фильмов в ленте
  @Test
  public void shouldGetMoreThanInBillboard() {
    MovieManager movieManager = new MovieManager(6);
    movies = new Movie[3];
    for (int i = 0; i < 3; i++) {
      movies[i] = new Movie();
    }
    for (int i = 0; i < 3; i++) {
      movieManager.add(movies[i]);
    }
    Movie[] actual = movieManager.getAll();
    Movie[] expected = new Movie[3];
    for (int i = 0; i < 3; i++) {
      expected[i] = movies[2 - i];
    }
    assertArrayEquals(expected, actual);
  }


}