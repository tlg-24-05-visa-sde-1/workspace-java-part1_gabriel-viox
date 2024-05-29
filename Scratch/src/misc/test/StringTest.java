package misc.test;

class StringTest {
    public static void main(String[] args) {
        String city1 = "New York";
        String city2 = "New York";

        System.out.println(city1.equals(city2));
        System.out.println(city1 == city2);

        System.out.println();

        String newCity1 = city1.substring(0, 3);
        String newCity2 = city2.substring(0, 3);

        System.out.println(newCity1.equals(newCity2));

        String poem = """
                Top of the hill
                Roses are red 
                if looks could kill
                i'd be dead
                """;
        System.out.println(poem);

        String pattern = "\\d{3}[A-Z]{3}|[A-Z]\\d{3}[A-Z]{3}]";
        String plate1 = "450DMX";
        String plate2 = "VIOX111DMX";
        System.out.println("This plate is valid: " + plate1.matches(pattern));
        System.out.println("This plate is valid: " + plate2.matches(pattern));





    }
}