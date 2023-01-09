package gespina.apps.tusom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import gespina.apps.tusom.controller.model.WineRequest;
import gespina.apps.tusom.model.Wine;
import gespina.apps.tusom.service.WineService;

@RestController

public class WineController {
    
    @Autowired
    private WineService wineService;

    @GetMapping (path = "/wines")
    public ResponseEntity<?> getWines(){
        List<Wine> wines = wineService.findAll();
        return ResponseEntity.ok(wines);
    }




    @PostMapping (path = "/create" , produces = "application/json")
    public @ResponseBody ResponseEntity<?> createWine(@RequestBody WineRequest wineRequest){
        Wine newWine = wineService.createFromRequest(wineRequest);
        return ResponseEntity.ok(newWine);
    }

    @GetMapping (path = "")
    public ResponseEntity<?> hello(){
        return ResponseEntity.ok("Bienvenido senior :D 🦆");
    }
}
