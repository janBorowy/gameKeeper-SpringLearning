package pl.student.gameKeeper.pojos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import javax.annotation.processing.Generated;
import java.util.Date;
import java.util.Objects;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    @Getter
    private @Id @GeneratedValue long id;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private Date publishedDate;

    // add nested classes
    // private Developer developer;
    // private Publisher publisher;

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.title, this.publishedDate);
    }

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "Game id=" + id + "(unserializable)";
        }
    }
}
