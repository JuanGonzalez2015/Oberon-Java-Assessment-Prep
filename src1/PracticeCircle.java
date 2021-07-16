public class PracticeCircle {
    private double radius; //1a

    public static double circumference(int radius) { //1b
        return radius * 2 * Math.PI;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
        public static double circumference( double radius){
            return radius * 2 * Math.PI;

        }

        public static double total(double bill, double tipPercentage){
        return bill + (bill * tipPercentage / 100);

        }

        public static void even(int[] nums){
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] % 2 == 0){
                    System.out.println(nums[i]);
                }
            }
        }
    }




