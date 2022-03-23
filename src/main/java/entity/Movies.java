package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Movies {
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Id
    @Column(name = "movieId")
    private int movieId;
    @Basic
    @Column(name = "title")

    private String title;

    @Basic
    @Column(name = "category")
    private String category;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movies movies = (Movies) o;
        return movieId == movies.movieId && Objects.equals(title, movies.title) && Objects.equals(category, movies.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, title, category);
    }
}
