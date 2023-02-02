public class TreeView {
    public static void view(Persona root, int num) {
        String line = "_".repeat(num);
//        System.out.println(line + root.FullName);
        System.out.println(line + root.getName());
        for (Persona a : root.getListname()) {
            view(a, num + 1);
        }
    }

    public static void libraryView(Persona root) {
        System.out.println(root.getName() + ": My library: " + root.PersonaLibrary.nameLibrary);
        for (LibraryBooks a : root.PersonaLibrary.listBook) {
            System.out.println(a.bAutor + " " + a.bName + " " + a.bLanguage);
        }
    }

    public static void animalView(Persona root) {
        System.out.println(root.getName() + ": I prefer " + root.PreferenceOfAnimals.nameofKind + ". My favourite:");
        for (KindOfAnimals b : root.PreferenceOfAnimals.kindList) {
            System.out.println(b.kindNickname + ". Breed - " + b.kindBreed + ", " + b.kindAgeofAnimal + " years old, " + b.kindColorofAnimal + " color");
        }
    }
}