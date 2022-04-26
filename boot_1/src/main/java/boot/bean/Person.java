package boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @Author Mi
 * @Date 2022/4/6 15:19
 * @Version 1.0
 */
@ConfigurationProperties(prefix = "person")
@Component
public class Person {
    private String username;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String,Object> score;
    private Set<Double> salarys;
    private Map<String,List<Pet>> allPets;


    public Person(String username, Boolean boss, Date birth, Integer age, Pet pet, String[] interests, List<String> animal, Map<String, Object> score, Set<Double> salarys, Map<String, List<Pet>> allPets) {
        this.username = username;
        this.boss = boss;
        this.birth = birth;
        this.age = age;
        this.pet = pet;
        this.interests = interests;
        this.animal = animal;
        this.score = score;
        this.salarys = salarys;
        this.allPets = allPets;
    }


    public Person() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public List<String> getAnimal() {
        return animal;
    }

    public void setAnimal(List<String> animal) {
        this.animal = animal;
    }

    public Map<String, Object> getScore() {
        return score;
    }

    public void setScore(Map<String, Object> score) {
        this.score = score;
    }

    public Set<Double> getSalarys() {
        return salarys;
    }

    public void setSalarys(Set<Double> salarys) {
        this.salarys = salarys;
    }

    public Map<String, List<Pet>> getAllPets() {
        return allPets;
    }

    public void setAllPets(Map<String, List<Pet>> allPets) {
        this.allPets = allPets;
    }

    @Override
    public String toString() {
        return "PerSon{" +
                "username='" + username + '\'' +
                ", boss=" + boss +
                ", birth=" + birth +
                ", age=" + age +
                ", pet=" + pet +
                ", interests=" + Arrays.toString(interests) +
                ", animal=" + animal +
                ", score=" + score +
                ", salarys=" + salarys +
                ", allPets=" + allPets +
                '}';
    }
}



