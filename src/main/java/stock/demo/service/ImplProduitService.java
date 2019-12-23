package stock.demo.service;

import org.springframework.stereotype.Service;
import stock.demo.entity.Produit;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImplProduitService implements IProduitService {
    private List<Produit> produits;

    public  ImplProduitService(){
        produits = new ArrayList<Produit>();

        produits.add(new Produit("Livre",50,20));
        produits.add(new Produit("Cahier",60,5.2f));
        produits.add(new Produit("Sac",50,10));
    }

    @Override
    public List<Produit> getProduits() {
        return produits;
    }

    @Override
    public void addProduit(Produit produit) {
        produits.add(produit);
    }

    @Override
    public void EditProduit(Produit produit) {
        produits.remove(produit);
        produits.add(produit);
    }

    @Override
    public void deleteProduit(String ref) {
        Produit produit = new Produit();
        produit.setRef(ref);
        produits.remove(produit);
    }
}
