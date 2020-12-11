package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;


class MovieManagerTest {

  //добавление фильма в ленту
  @Test
  public void shouldAdd() {
    MovieManager movieManagerDefault = new MovieManager(10);

    Movie first = new Movie(1, "productName1", "imageUrl1", "genre1");
    Movie second = new Movie(2, "productName2", "imageUrl2", "genre2");
    Movie third = new Movie(3, "productName3", "imageUrl3", "genre3");
    Movie fourth = new Movie(4, "productName4", "imageUrl4", "genre4");
    movieManagerDefault.add(first);
    movieManagerDefault.add(second);
    movieManagerDefault.add(third);
    movieManagerDefault.add(fourth);

    Movie[] actual = movieManagerDefault.getAll();
    Movie[] expected = new Movie[]{ fourth, third, second, first};

    assertArrayEquals(expected, actual);
  }

  @Test
  void shouldAddWhenMoreThanTen(){
    MovieManager movieManagerDefault = new MovieManager(10);
    Movie first = new Movie(1, "productName1", "imageUrl1", "genre1");
    Movie second = new Movie(2, "productName2", "imageUrl2", "genre2");
    Movie third = new Movie(3, "productName3", "imageUrl3", "genre3");
    Movie fourth = new Movie(4, "productName4", "imageUrl4", "genre4");
    Movie fifth = new Movie(5, "productName5", "imageUrl5", "genre5");
    Movie sixth = new Movie(6, "productName6", "imageUrl6", "genre6");
    Movie seventh = new Movie(7, "productName7", "imageUrl7", "genre7");
    Movie eighth = new Movie(8, "productName8", "imageUrl8", "genre8");
    Movie ninth = new Movie(9, "productName9", "imageUrl9", "genre9");
    Movie tenth = new Movie(10, "productName10", "imageUrl10", "genre10");
    Movie eleventh = new Movie(11, "productName11", "imageUrl11", "genre11");
    movieManagerDefault.add(first);
    movieManagerDefault.add(second);
    movieManagerDefault.add(third);
    movieManagerDefault.add(fourth);
    movieManagerDefault.add(fifth);
    movieManagerDefault.add(sixth);
    movieManagerDefault.add(seventh);
    movieManagerDefault.add(eighth);
    movieManagerDefault.add(ninth);
    movieManagerDefault.add(tenth);
    movieManagerDefault.add(eleventh);

    Movie[] actual = movieManagerDefault.getAll();
    Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

    assertArrayEquals(expected, actual);
  }
  @Test
  void shouldEmptyMovieManager(){
    MovieManager movieManagerDefault = new MovieManager(10);

    Movie[] actual = movieManagerDefault.getAll();
    Movie[] expected = new Movie[0];

    assertArrayEquals(expected, actual);
  }
}








