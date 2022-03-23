package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Ratings {

    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Id
    @Column(name = "ratingId")
    private int ratingId;
    @Basic
    @Column(name = "movieId")
    private Integer movieId;

    @Basic
    @Column(name = "userId")

    private Integer userId;

    @Basic
    @Column(name = "rating")
    private Integer rating;

    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ratings ratings = (Ratings) o;
        return ratingId == ratings.ratingId && Objects.equals(movieId, ratings.movieId) && Objects.equals(userId, ratings.userId) && Objects.equals(rating, ratings.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ratingId, movieId, userId, rating);
    }
}
