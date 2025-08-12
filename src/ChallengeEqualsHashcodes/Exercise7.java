package ChallengeEqualsHashcodes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

//Given a list of objects representing database entities with fields such as id, name, and timestamp,
// ensure that no two entities are considered equal if their id fields are different.
public class Exercise7 {
    public static void main(String[] args){
        Entity entity1 = new Entity("Bob", 859,LocalDate.now());
        Entity entity2 = new Entity("Maria", 851, LocalDate.now());
        Entity entity3 = new Entity("Chris", 924, LocalDate.now());

        System.out.println("Is entity1 equals to entity2? " + entity1.equals(entity2));
        System.out.println("Is entity 2 equals to entity3? " + entity2.equals(entity3));

        System.out.println("Does entity1 have same hashcode as entity 2?" + (entity1.hashCode() == entity2.hashCode()));
        System.out.println("Does entity2 have the same hashcode as entity 3? " + (entity2.hashCode() == entity3.hashCode()));


    }
}

class Entity {
    private String name;
    private int id;
    private LocalDate timestamp;

    Entity(String name, int id, LocalDate timestamp){
        this.name = name;
        this.id=id;
        this.timestamp=timestamp;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public LocalDate getTimestamp(){
        return timestamp;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj ) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Entity newEntity = (Entity) obj;
        return this.id== newEntity.getId();
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", timestamp=" + timestamp +
                '}';
    }
}
