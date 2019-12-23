package stock.demo.entity;

import java.util.Objects;

public class Produit {
    private String ref;
    private int quantite;
    private float PU;

    public Produit() {
    }

    public Produit(String ref, int quantite, float PU) {
        this.ref = ref;
        this.quantite = quantite;
        this.PU = PU;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public float getPU() {
        return PU;
    }

    public void setPU(float PU) {
        this.PU = PU;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return Objects.equals(ref, produit.ref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref);
    }
}
