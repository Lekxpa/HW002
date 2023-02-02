import java.util.ArrayList;
class KindOfAnimals{
    public String kindNickname;
    public String kindBreed;
    public int kindAgeofAnimal;
    public String kindColorofAnimal;
}
public class Kind extends Animal {
    public String nameofKind;
    public Kind(String nameofKind){
        this.nameofKind = nameofKind;
    }
    ArrayList<KindOfAnimals> kindList = new ArrayList<>();
    public void addAnimal(String nickName, String breed, int ageOfAnimal, String colorOfAnimal){
        KindOfAnimals kA = new KindOfAnimals();
        setNicknamel(nickName);
        setBreed(breed);
        setAgeofAnimal(ageOfAnimal);
        setColorofAnimal(colorOfAnimal);
        kA.kindNickname = getNickname();
        kA.kindBreed = getBreed();
        kA.kindAgeofAnimal = getAgeofAnimal();
        kA.kindColorofAnimal = getColorofAnimal();
        kindList.add(kA);
    }
    public ArrayList<KindOfAnimals> getKindList(){
        return kindList;
    }
}