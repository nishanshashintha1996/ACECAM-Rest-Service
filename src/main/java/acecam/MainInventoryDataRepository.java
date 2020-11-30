package acecam;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MainInventoryDataRepository extends CrudRepository<MainInventoryData, Integer> {

    List <MainInventoryData> findByAutoId(Integer id);

    List <MainInventoryData> findTopByAutoId(Integer id);
}
