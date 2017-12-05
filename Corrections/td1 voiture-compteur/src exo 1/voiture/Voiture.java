// Voiture.java
package voiture;

public class Voiture {
  private String nom;
  private int vitesse;
  private IFreins freins;
  private IMoteur moteur;

  // Ce constructeur n'a plus � �tre public, les voitures sont construites par
  // l'usine
  // public Voiture(String nom) {
  // this(nom, new FreinsStandard(), new MoteurStandard());
  // }

  // Visibilit� paquetage
  Voiture(String nom, IFreins freins, IMoteur moteur) {
    this.nom = nom;
    this.vitesse = 0;
    this.freins = freins;
    this.moteur = moteur;
  }

  // Les 6 m�thodes suivantes sont 'final' car elles n'ont pas vocation � �tre
  // sp�cialis�es

  public final String getNom() {
    return nom;
  }

  public final int getVitesse() {
    return vitesse;
  }

  public final void setVitesse(int v) {
    vitesse = v;
  }

  @Override
  public final String toString() {
    return nom;
  }

  public final void freiner() {
    freins.freiner(this);
  }

  public final void remplacerFreins(IFreins freins) {
    this.freins = freins;
  }

  public final void r�parerFreins() {
    freins.r�parer();
  }

  public final int getVitesseMaximale() {
    return moteur.getVitesseMaximale(this);
  }

  public final void acc�l�rer() {
    moteur.acc�l�rer(this);
  }

}
