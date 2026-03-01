public class Student {

    private String name;
    private double average;

    public Student(String name,double average){
        if(average > 6 || average < 1){
            throw new IllegalArgumentException("Nie poprawna wartość");
        }else {
            this.average = average;
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public String getStatus(){
        if(average >= 3){
            return "Zdal";
        }else {
            return "Nie zdal";
        }
    }

    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student("Jan", 3.0);
        students[1]= new Student("Adrian", 5.8);
        students[2]= new Student("Marek", 0.3);

        for( int i = 0 ; i < students.length; i++){
            System.out.println(students[i].getName() + " - " + students[i].getAverage() + " - " + students[i].getStatus());
        }








    }
}
