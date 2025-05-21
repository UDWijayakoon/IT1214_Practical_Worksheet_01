class Student {
    private String name;
    private int rollNo;
    private String course;

    // Constructor
    Student(String name, int regNo, String course) {
        this.name = name;
        this.rollNo = regNo;
        this.course = course;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getRollNo() { return rollNo; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Reg No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

