import java.util.Stack;

public class VerificadorParentesis {
    public static void main(String[] args) {
        String exp1 = "((a+b)*5) - 7";
        String exp2 = "2*[(a+b)/2.5 + x - 7*y";

        System.out.println("Expresión 1 equilibrada: " + esEquilibrada(exp1));
        System.out.println("Expresión 2 equilibrada: " + esEquilibrada(exp2));
    }

    public static boolean esEquilibrada(String expresion) {
        // Creamos una pila de caracteres
        Stack<Character> pila = new Stack<>();

        // Recorremos la cadena carácter por carácter
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            // Si es apertura, lo guardamos (apilamos)
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            }
            // Si es cierre, verificamos el último elemento de la pila
            else if (c == ')' || c == ']' || c == '}') {
                // Si la pila está vacía antes de encontrar un par, no está equilibrada
                if (pila.isEmpty()) return false;

                char ultimo = pila.pop(); // Sacamos el de arriba para comparar

                // Verificamos que el cierre corresponda a la apertura correcta
                if (c == ')' && ultimo != '(') return false;
                if (c == ']' && ultimo != '[') return false;
                if (c == '}' && ultimo != '{') return false;
            }
        }
        // Si al final la pila está vacía, todo se cerró bien
        return pila.isEmpty();
    }
}