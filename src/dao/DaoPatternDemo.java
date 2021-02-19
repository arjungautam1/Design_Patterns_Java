/*
 * @author : arjun@moco.com.np
 * FocusOne Payment Solutions
 *
 */
package dao;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //print all students
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student :[Roll No:" + student.getRollNo() + ",name :" + student.getName() + "]");
        }
        //update student
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Pooja");
        studentDao.updateStudent(student);

        //get the student
        studentDao.getStudent(0);
        System.out.println("Student :[RollNo:" + student.getRollNo() + ",Name :" + student.getName() + "]");

        //delete the student
        Student student1 = studentDao.getAllStudents().get(1);
        studentDao.deleteStudent(student1);


    }


}
