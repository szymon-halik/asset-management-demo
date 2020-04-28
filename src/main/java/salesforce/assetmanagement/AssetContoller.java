package salesforce.assetmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

public class AssetContoller {
    @Autowired
    private RestRepository repository;

    @RequestMapping(method = RequestMethod.GET,value = "/assets")
    public Iterable<Asset> getAllAssets(){
        return repository.findAll();
    }
    @RequestMapping(method = RequestMethod.GET, value = "/asset/{id}")
    public Optional<Asset> getAsset(@PathVariable long id){
        return repository.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/asset")
    public void addAsset(@RequestBody Asset asset){
        repository.save(asset);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/asset/{id}")
    public void updateAsset(@RequestBody Asset asset, @PathVariable long id){
        repository.save(asset);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/asset/{id}")
    public void deleteAsset( @PathVariable long id){
        repository.deleteById(id);
    }

}
