package co.com.softlond.model.gateways;

import co.com.softlond.model.PlantillaModel;
import reactor.core.publisher.Mono;

public interface PlantillaGateways {
    Mono<PlantillaModel> savePlantilla(PlantillaModel plantilla);
    Mono<PlantillaModel> updatePlantilla(PlantillaModel plantilla);
    Mono<PlantillaModel> findById(String id);
    Mono<Boolean> existByid(String id);
    Mono<Boolean> findOne();
}
