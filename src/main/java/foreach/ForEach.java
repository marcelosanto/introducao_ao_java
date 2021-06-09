package foreach;

public class ForEach {
    public  static void main(String[] args){
        String[] vect = new String[] {"Marcelo", "Alice", "Gabriel", "Maquerle"};

        //foreach
        for (String nome: vect) {
            System.out.println(nome);
        }
    }
}
