package stock.demo.service;

import stock.demo.entity.Produit;

import java.util.List;

public interface IProduitService {
    List<Produit> getProduits();
    void addProduit(Produit produit);
    void EditProduit(Produit produit);
    void deleteProduit(String ref);
}
