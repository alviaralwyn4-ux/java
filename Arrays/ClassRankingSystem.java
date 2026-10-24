
package Arrays;

public class ClassRankingSystem {

    static class Student {
        String name;
        int quizzes[];

        Student(String name, int quizzes[]) {
            this.name = name;
            this.quizzes = quizzes;
        }

        double getAverage() {
            int sum = 0;

            for (int i = 0; i < quizzes.length; i++) {
                sum += quizzes[i];
            }

            return (double) sum / quizzes.length;
        }
    }

    static int linearSearch(Student students[], String target) {
        int rank = 1;

        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(target)) {
                while (i > 0 &&
                       students[i - 1].getAverage()
                       == students[i].getAverage()) {
                    i--;
                    rank--;
                }

                return rank;
            }
            rank++;
        }

        return -1;
    }

    static void bubbleSort(Student students[]) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getAverage()
                        < students[j + 1].getAverage()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        String names[] = {
            "Alwyn", "Maxine", "John", "Lira", "Rey"
        };

        int quizData[][] = {
            {90, 85, 88, 92},
            {95, 90, 93, 94},
            {80, 85, 82, 85},
            {95, 90, 93, 94},
            {88, 86, 84, 90}
        };

        Student students[] = new Student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        bubbleSort(students);

        System.out.println("========================================");
        System.out.println("             LEADERBOARD");
        System.out.println("========================================");
        System.out.printf("%-8s %-12s %-10s%n",
                "Rank", "Name", "Average");
        System.out.println("----------------------------------------");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {
            if (i > 0 &&
                students[i].getAverage()
                != students[i - 1].getAverage()) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-12s %-10.2f%n",
                    rank,
                    students[i].name,
                    students[i].getAverage());
        }

        System.out.println("========================================");

        String target = "John";
        int position = linearSearch(students, target);

        if (position != -1) {
            System.out.println(target
                    + " was found at rank: " + position);
        } else {
            System.out.println(target + " was not found.");
        }
    }
}
