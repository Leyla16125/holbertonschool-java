public class Numbers0to99 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 99; i++) {
            sb.append(i);
            if (i != 99) {
                sb.append(", ");
            }
        }

        System.out.println(sb.toString());
    }
}
