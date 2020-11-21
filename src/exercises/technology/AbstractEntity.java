package exercises.technology;

public  class AbstractEntity {
    private static int id;

    public static int getId(){
        id++;
        return id;
    };
}
