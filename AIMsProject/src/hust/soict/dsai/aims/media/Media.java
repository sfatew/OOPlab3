package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
    
    protected int id;
    protected String title;
    protected String category;
    protected float cost;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media(String title) {
        this.title = title;
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isMatch(String title){
        if (this.title.equals(title)){
            return true;
        }
        return false;
    }

    public boolean isMatch(int id){
        if (this.id == id){
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o){

        if (this == o){
            return true;
        }
        if (!(o instanceof Media)) {  
            return false;  
        }  
        Media media = (Media) o; 
        return (title.equals(media.title));
    }
}
