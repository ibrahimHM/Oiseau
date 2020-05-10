package com.oiseau;

import java.util.ArrayList;

import java.util.List;

/**
 * Décrivez votre classe agilite.tp1.oiseau.com.oiseau.Nid ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Nid
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String matiere;
    private int capacite;
    private List<Oiseau> oiseaux = new ArrayList<>();

    public List<Oiseau> getOiseaux() {
        return oiseaux;
    }

    public Oiseau getOiseau(int index){return oiseaux.get(index);}

    public void setOiseau(Oiseau oiseau){
        if ( oiseaux.size() < capacite )
            this.oiseaux.add(oiseau);
    }

    public String habitat(int index){
		if index < this.capacite{
			if (isEmpty())
				return ("nid en " + matiere);
			else
				return (this.getOiseau(index).getType() + " habite " + matiere);
		}else{
			throw new IndexOutOfBoundsException("l'index saisie dépasse la capacité");
		}
        
    }

    public boolean isEmpty() {
        return oiseaux.isEmpty();
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    /**
     * Constructeur d'objets de classe agilite.tp1.oiseau.com.oiseau.Nid
     */
    public Nid(String matiere, int capacite)
    {
        // initialisation des variables d'instance
        this.matiere = matiere;
        this.capacite = capacite;
    }

    public String getMatiere(){
        return matiere;
    }
    public int getCapacite(){
        return capacite;
    }
    
}
