package gespina.apps.tusom.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gespina.apps.tusom.controller.model.WineRequest;
import gespina.apps.tusom.model.Wine;
import gespina.apps.tusom.repository.WineRepository;

@Service
public class WineService {
    @Autowired   private WineRepository wineRepository;
    @Autowired private ModelMapper mapper;
    
    public List<Wine> findAll(){
        return wineRepository
        .findAll()
        .stream()
        .filter(wine -> wine.isEnabled())
        .toList();
     }

    public Wine createFromRequest(WineRequest wineRequest){
        Wine wine = mapper.map(wineRequest, Wine.class);
        wine.setCreationDate( getCurrentDate() );
        wine.setEnabled(true);
        return create(wine);
    }
    
    public Wine create ( Wine newWine ){
        return wineRepository.saveAndFlush(newWine);
    }

    public Date getCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return calendar.getTime();
      }
}
