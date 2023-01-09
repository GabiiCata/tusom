package gespina.apps.tusom.controller.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WineRequest {

    private String brand;

    private String type;

    private String description; 

    private Date elaborationDate;

}
