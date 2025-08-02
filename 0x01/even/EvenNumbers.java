public class EvenNumbers {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 100; i += 2) {  
            sb.append(i);
            if (i != 98) {  
                sb.append(", ");
            }
        }

        System.out.println(sb.toString());
    }
}

