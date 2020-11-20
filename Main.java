public class Main {
     public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
            Set<String> lines = new HashSet<String>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
            System.out.println(lines);
        }
}
