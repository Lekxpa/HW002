public abstract class Human {
    private String gender;
    private String name;
    private int age;
    private String preferenceOfAnimals;

    public void setGender(String gender){
        this.gender = gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setpreferenceOfAnimals(String preferenceOfAnimals){
        this.preferenceOfAnimals = preferenceOfAnimals;
    }
    public String getGender(){
        return gender;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getpreferenceOfAnimals(){
        return preferenceOfAnimals;
    }
    public abstract void voice();
}
