//К задачам из предыдущего дз добавить абстракции. т е на этом дз нужно
//        гарантированно продумать иерархию компонент и взаимодействия их
//        между собой.
//        Обеспечить переход от использования явных классов в сторону
//        использования абстрактных типов. Т е работаем не с:
//        - конкретным экземпляром генеалогического древа, а с интерфейсом
//        “ генеалогическое древо”
//        - конкретным экземпляром котика, а с интерфейсом “котик”, лучше
//        уйти от взаимодействия с конкретными питомцами и повысить
//        уровень абстракции до взаимодействия с котиком, собачкой или
//        хомяком т е с интерфейсом “животное”

public class Main {
    public static void main(String[] args) {
        Persona papa = new Persona("Van", "m", 49, "cats", "Libr1");
        Persona son = new Persona("Fui", "m", 25, "dogs", "Libr2");
        papa.PersonaLibrary.addBook("Bunin", "Stig", "Russia");
        papa.addName(son);
        papa.voice();
        TreeView.view(papa, 0);
        System.out.println("/".repeat(30));
        TreeView.libraryView(papa);
        papa.PreferenceOfAnimals.addAnimal("Sharik", "Britishe", 3, "black");
        son.PreferenceOfAnimals.addAnimal("Wow", "Whithoutbreed", 10, "black-and-white");
        System.out.println("/".repeat(30));
        TreeView.animalView(papa);
        TreeView.animalView(son);
    }
}