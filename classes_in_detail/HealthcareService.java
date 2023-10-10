package classes_in_detail;

public class HealthcareService {

    // Specialist outer class
    public static class Specialist {
        private String name;
        private Profile specialistProfile;

        // Static variable to keep track of the total number of specialists
        private static int totalSpecialists = 0;

        public Specialist(String name, String qualification, int experience) {
            this.name = name;
            this.specialistProfile = new Profile(qualification, experience);

            // Increment the static count of specialists when a new specialist is created
            totalSpecialists++;
        }

        public void displayDetails() {
            System.out.println("Specialist Name: " + name);
            specialistProfile.displayProfile();
        }

        // Static method to get the total number of specialists
        public static int getTotalSpecialists() {
            return totalSpecialists;
        }

        // Static nested class for the profile
        public static class Profile {
            private String qualification;
            private int yearsOfExperience;

            public Profile(String qualification, int experience) {
                this.qualification = qualification;
                this.yearsOfExperience = experience;
            }

            public void displayProfile() {
                System.out.println("Qualification: " + qualification);
                System.out.println("Experience: " + yearsOfExperience + " years");
            }
        }
    }

    public static void main(String[] args) {
        Specialist drRajesh = new Specialist("Dr. Rajesh Sharma", "MD in Cardiology", 12);
        drRajesh.displayDetails();

        Specialist drAnita = new Specialist("Dr. Anita Gupta", "PhD in Neurology", 9);
        drAnita.displayDetails();

        // Display the total number of specialists using the static method
        System.out.println("Total Specialists: " + Specialist.getTotalSpecialists());
    }
}
