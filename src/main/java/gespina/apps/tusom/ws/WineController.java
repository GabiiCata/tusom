package gespina.apps.tusom.ws;

import java.util.Calendar;
import java.util.Date;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@RestController
public class WineController {
    
    @Getter @Setter
    private class Wine {
        private String name = "Cordero piel de lobo";
        private String type = "Malbec";
        private Date date = new Date();
    }

    @GetMapping (path = "/wine")
    public ResponseEntity<?> getWines(){

        Wine wine = new Wine();
        return ResponseEntity.ok(wine);
    }
}
