package model;

import jpa.Seat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@Document(collection = "airplane")
public class Airplane {

    @Id
    private String _id;
    private Float cost_mln_dollars;
    @DBRef
    private ObjectId owner_airline;
    private Integer number_of_seats;
    private List<Seat> seats;

}
