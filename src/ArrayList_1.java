
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        float nota = 0.0f;
        int editar;
        ArrayList <Float> notesAlumnes = new ArrayList<>();
        System.out.println("(1): Afegir nota, (2): Consulta nota, (3): Eliminar nota, (4): Modificar nota, (5): Sortir");
        int usuari = input.nextInt();
        while (usuari != 5) {
            switch (usuari) {
                case 1:
                    System.out.println("Nota a afegir, seguida del llistat:");
                    nota = input.nextFloat();
                    notesAlumnes.add(nota);
                    break;

                case 2:
                    System.out.println("Índex a consultar:");
                    editar = input.nextInt();
                    notesAlumnes.get(editar);
                    break;

                case 3:
                    System.out.println("Índex de la nota a eliminar:");
                    editar = input.nextInt();
                    notesAlumnes.remove(editar);
                    break;

                case 4:
                    System.out.println("Índex de nota a modificar:");
                    editar = input.nextInt();
                    notesAlumnes.set(editar, input.nextFloat());
                    break;

                default:
                    System.out.println("Error");
                break;
            }
            if (usuari != 5) {
                System.out.println("(1): Afegir nota, (2): Consulta nota, (3): Eliminar nota, (4): Modificar nota, (5): Sortir");
                usuari = input.nextInt();
            }
        }
    }
}