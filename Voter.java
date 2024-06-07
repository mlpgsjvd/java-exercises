import java.util.Scanner;

class Voter {
    int birthYear;
    int age;

        public Voter(int birthYear) {
        this.birthYear = birthYear;
        this.calculateAge();
    }

        private void calculateAge() {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        this.age = currentYear - birthYear;
    }

        public boolean isEligibleToVote() {
        return this.age >= 18;
    }

        public void displayVoterInfo() {
        System.out.println("Birth Year: " + this.birthYear);
        System.out.println("Age: " + this.age);
        if (this.isEligibleToVote()) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        Voter voter = new Voter(birthYear);
        voter.displayVoterInfo();
    }
}

