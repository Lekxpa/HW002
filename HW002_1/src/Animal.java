public abstract class Animal {
    private String Nickname;
    private String Breed;
    private int AgeofAnimal;
    private String ColorofAnimal;
    public void setNicknamel(String Nickname){
        this.Nickname = Nickname;
    }
    public void setBreed(String Breed){
        this.Breed = Breed;
    }
    public void setAgeofAnimal(int AgeofAnimal){
        this.AgeofAnimal = AgeofAnimal;
    }
    public void setColorofAnimal(String ColorofAnimal){
        this.ColorofAnimal = ColorofAnimal;
    }
    public String getNickname(){
        return Nickname;
    }
    public String getBreed(){
        return Breed;
    }
    public int getAgeofAnimal(){
        return AgeofAnimal;
    }
    public String getColorofAnimal(){
        return ColorofAnimal;
    }
//    public abstract void voiceAnimal();
//    public void voiceAnimal(){
//        if(nameofKind)
//        System.out.println("Мяу");
//        System.out.println("Гав");
//        System.out.println("Шшшшш");
//    }
}


