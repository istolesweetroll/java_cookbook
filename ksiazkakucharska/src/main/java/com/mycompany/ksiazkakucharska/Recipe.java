package com.mycompany.ksiazkakucharska;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private String title;
    private List<String> ingredients;
    private String description;
    private List<String> categories;
    private String imagePath;

    public List<String> getCategories() {
        return categories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void addCategory(String kategoria) {
        categories.add(kategoria);
    }
    
    public void addIngredients(String ingredients){
        this.ingredients.add(ingredients);
    }
    
    @Override
    public String toString() {
        String text = title;
        text = text + "<html><pre>SKŁADNIKI:<br>";
        
        for (int i = 0; i < ingredients.size(); i++) {
            text = text + "<br>" + ingredients.get(i);
        }
        
        text = text + description + "</html>";
        
        return text;
    }

    public Recipe(String tytul, List<String> skladniki,
            String opis, List<String> kategorie, String zdjecieurl) {

        this.title = tytul;
        this.ingredients = skladniki;
        this.description = opis;
        this.categories = kategorie;
        this.imagePath = zdjecieurl;
    }

    public Recipe() {
        categories = new ArrayList<String>();
        ingredients = new ArrayList<String>();
    }

    public String getTekstPrzepisuSformatowany() {
        String tekstprzepisu = "<html><pre>SKŁADNIKI:<br>";

        for (int i = 0; i < this.ingredients.size(); i++) {
            tekstprzepisu = tekstprzepisu + "<br>" + this.ingredients.get(i);

        }

        tekstprzepisu = tekstprzepisu + this.description + "</html>";

        return tekstprzepisu;
    }
}
