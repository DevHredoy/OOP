package hredoy.com.nonstatic;

public class student {
    int studentId;
    String studentName;
    String schoolName="narail highschool";
    student(int studentId,String studentName)
    {
        this.studentId=studentId;
        this.studentName=studentName;

    }


    void printStudentInfo()
    {
        System.out.println("id : "+studentId);
        System.out.println("name : "+studentName);
        System.out.println("schoolname :"+schoolName);
    }

}
