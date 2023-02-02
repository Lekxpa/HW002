import java.util.ArrayList;

public class Persona extends Human{
    public Library PersonaLibrary;
    public Kind PreferenceOfAnimals;
    public Persona(String Name, String Gender, int Age, String preferenceOfAnimals, String personaLibrary){ // конструктор. Сюда передаются данные.ПОлученные данные нужно записать
        setName(Name);
        setGender(Gender);
        setAge(Age);
        setpreferenceOfAnimals(preferenceOfAnimals);
        this.PersonaLibrary = new Library(personaLibrary);//создали библиотеку с таким название
        this.PreferenceOfAnimals = new Kind(preferenceOfAnimals);
    }
    ArrayList<Persona> listname = new ArrayList<>();
    public void addName(Persona persona){
        listname.add(persona);
    }
    public ArrayList<Persona> getListname(){
        return listname;
    }
    public void voice(){
        String name = getName();
        System.out.println("Hello! My name is " + name + "! This is my family: ");
    }
}
