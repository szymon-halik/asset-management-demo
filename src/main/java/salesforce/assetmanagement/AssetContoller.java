package salesforce.assetmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/asset")
public class AssetContoller {
    @Autowired
    private RestRepository repository;
    @GetMapping("/{id}")
    public Optional<Asset> findById(@PathVariable long id){
        return repository.findById(id);

    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Asset updateAsset(
            @PathVariable("id") final Long id, @RequestBody final Asset asset) {
        return asset;
    }
    @PostMapping("/addasset")
    public String addAsset(@Valid Asset asset, BindingResult result, Model model){
        repository.save(asset);
        model.addAttribute("assets", repository.findAll());
        return "index";
    }

}
