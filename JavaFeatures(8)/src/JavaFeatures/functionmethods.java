package JavaFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class functionmethods {

    public static void main(String[] args) {
        
        Function<String, String> function1 = s -> s.substring(0, 4);
        System.out.println(function1.apply("Nikita"));               

        
        Function<List<Student>, List<Student>> obj = li -> {
            List<Student> res = new ArrayList<>();
            for (Student s : li) {
                if (function1.apply(s.getName()).equalsIgnoreCase("Niki")) {
                    res.add(s);
                }
            }
            return res;
        };

       
        Student s1 = new Student(1, "nikita");
        Student s2 = new Student(2, "Nikitasa");
        Student s3 = new Student(3, "Aaru");

        
        List<Student> studentList = Arrays.asList(s1, s2, s3);

        
        List<Student> filteredList = obj.apply(studentList);

       
        System.out.println("Filtered Students:");
        for (Student s : filteredList) {
            System.out.println(s.getName());
        }
    }

   
    private static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
