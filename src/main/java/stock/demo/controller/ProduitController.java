package stock.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import stock.demo.entity.Produit;
import stock.demo.service.IProduitService;

import java.util.List;

@RestController
@RequestMapping("/api/produit")
@CrossOrigin
public class ProduitController {

    @Autowired
    private IProduitService produitService;

    @GetMapping
    public List<Produit> getProduits(){
        return produitService.getProduits();
    }

    @PostMapping
    public void addProduit(Produit produit) {
        produitService.addProduit(produit);
    }

    @PutMapping
    public void updateProduit(Produit produit){
        produitService.EditProduit(produit);
    }

    @DeleteMapping
    public void deleteProduit(@PathVariable String ref){
        produitService.deleteProduit(ref);
    }
}
