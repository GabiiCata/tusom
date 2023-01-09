package gespina.apps.tusom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import gespina.apps.tusom.model.Wine;

@Repository
public interface WineRepository extends JpaRepository<Wine, Long>{
    
}
