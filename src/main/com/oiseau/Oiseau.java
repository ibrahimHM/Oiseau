package com.oiseau;

/**
 * Décrivez votre classe agilite.tp1.oiseau.com.oiseau.Oiseau ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Oiseau
{
    // ici, les attributs de l'oiseau : Type et couleur de l'oiseau,
    //Ailes est une variable booléenne pour dire si l'oiseau a des ailes
    private String type;
    private String couleur;
    private boolean ailes;
    private Nid nid;

    public Nid getNid() {
        return nid;
    }

    public void setNid(Nid nid) {
        this.nid = nid;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public boolean isAiles() {
        return ailes;
    }

    public void setAiles(boolean ailes) {
        this.ailes = ailes;
    }

    /**
     * Constructeur d'objets de classe agilite.tp1.oiseau.com.oiseau.Oiseau
     */
    public Oiseau(String type, String couleur, boolean ailes)
    {
        // initialisation des variables d'instance
        this.type = type;
        this.couleur = couleur;
        this.ailes = ailes;
    }
    
    public String getType(){
        return type;
    }
    public String getCouleur(){
        return couleur;
    }
    public boolean getAiles(){
        return ailes;
    }
    
    public String bouger(){
        if (ailes){
           return "vole";
        }
        else {
            return "marche";  
        }
    }
}

