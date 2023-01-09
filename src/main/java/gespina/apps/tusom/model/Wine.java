package gespina.apps.tusom.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter @Setter
@NoArgsConstructor
@SequenceGenerator(
    name = "SEQ_WINE",
    initialValue = 1,
    allocationSize = 1,
    sequenceName = "SEQ_WINE")
@Table(
    name = "WINE",
    uniqueConstraints = {@UniqueConstraint(columnNames = "wineId")})
public class Wine {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_WINE")
    @JsonIgnore
    private Long wineId;

    private String brand;

    private String type;

    private String description;

    private Date creationDate;

    private Date elaborationDate;

    @JsonIgnore
    private boolean enabled; 
}
