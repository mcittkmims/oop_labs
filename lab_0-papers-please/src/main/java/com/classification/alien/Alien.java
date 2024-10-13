package com.classification.alien;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Alien {
    // The same attributes as in JSON to be able to map the JSON into an alien
    private int id;
    private Boolean isHumanoid;
    private String planet;
    private Integer age;
    private List<String> traits;

    // The race and universe will be attributed by classification
    @JsonIgnore
    private String race;
    @JsonIgnore
    private String universe;


    // Constructor with @JsonCreator
    @JsonCreator
    public Alien(
        @JsonProperty("id") int id,
        @JsonProperty("isHumanoid") Boolean isHumanoid,
        @JsonProperty("planet") String planet,
        @JsonProperty("age") Integer age,
        @JsonProperty("traits") List<String> traits) {
        this.id = id;
        this.isHumanoid = isHumanoid;
        this.planet = planet;
        this.age = age;
        this.traits = traits;
        this.race = "";
        this.universe = "";
    }

    // Getters and Setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty(value = "isHumanoid")
    public Boolean isHumanoid() {
        return this.isHumanoid;
    }

    public void setHumanoid(Boolean isHumanoid) {
        this.isHumanoid = isHumanoid;
    }

    public String getPlanet() {
        return this.planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getTraits() {
        return this.traits;
    }

    public void setTraits(List<String> traits) {
        this.traits = traits;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return this.race;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public String getUniverse() {
        return this.universe;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", isHumanoid=" + isHumanoid +
                ", planet='" + planet + '\'' +
                ", age=" + age +
                ", traits=" + traits +
                ", race=" + race +
                ", universe=" + universe +
                '}';
    }
}


