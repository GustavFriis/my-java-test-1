package assignment4;

public class Student
{

    private int studentId;
    private String name;
    private int grade;
    private double multiplier;

    /**
     * Imaginery high school students can have their grade multiplied with a number if they
     * take a higher level course (1.06) or goes direct to university (1.08)
     *
     * If they do both, they will get 1.06 * 1.08 = 1.1448
     */


    /** The constructor must create a new student object with default values for
     * the multiplier and grade variables:
     *
     * The multiplier should default to 1.06
     * Grade default to 0
     *
     * @param studentId A unique number used to identify a student
     * @param name The name of the student
     *
     * all instance variables in the constructor must be set by their
     * setter methods not by setting it directly
     *
     * setName(name)  // <--- correct
     * this.name = name // <--- wrong
     */
    public Student(int studentId, String name)
    {
        //TODO Delete line below, and implement this method
        setStudentId(studentId);
        setName(name);
        setMultiplier(1.06);
        setGrade(0);
    }


    /**
     *
     * @return the value of the instance field
     */
    public double getMultiplier()
    {
        //TODO Delete line below, and implement this method

         return this.getMultiplier();
    }


    /**
     * The setter for the multiplier must check that the value is either 
     * 1.08 * 1.06 (1.1448) or 1.08 or 1.06
     *
     * If not, then do not update the value
     *
     * @param multiplier
     * @return if the input was valid
     */
    public boolean setMultiplier(double multiplier)
    {
        //TODO Delete line below, and implement this method
        if (multiplier == 1.08) {
            return true;
        } else if (multiplier == 1.06){
            return true;
        } else if (multiplier == 1.06 * 1.08){
            return true;
        }
        return false;
    }


    /**
     *
     * @return the value of the grade multiplied by the multiplier.
     */
    public double getComputedGrade()
    {
        //TODO Delete line below, and implement this method
        throw new UnsupportedOperationException();
    }


    /**
     * The setter for grade, must check that it is a value from the 7-point scale
     * valid values are: -3, 0, 2, 4, 7, 10, 12
     * Do not set value if invalid
     *
     * @param grade
     * @return if input was valid
     */
    public boolean setGrade(int grade)
    {
        //TODO Delete line below, and implement this method
        if (grade == -3 ){
            return true;
        } else if (grade == 0) {
            return true;
        } else if (grade == 2){
            return true;
        } else if (grade == 4 ){
            return true;
        } else if (grade == 7){
            return true;
        } else if (grade == 10){
            return true;
        } else if (grade == 12) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @return the value of the instance field
     */
    public int getGrade()
    {
        //TODO Delete line below, and implement this method
        throw new UnsupportedOperationException();
    }


    /**
     *
     * @return the value of the instance field
     */
    public String getName()
    {
        //TODO Delete line below, and implement this method
        throw new UnsupportedOperationException();
    }


    /**
     * The setter for name, must check that the name is valid. A name must hold
     * at least 2 words (seperated by space) A name must not be null or empty. A
     * name cannot have the following characters: .\/,()&%€#!$ Do not set the
     * value, if the name is not valid.
     *
     * @param name
     * @return if input was valid
     */
    public boolean setName(String name)
    {
        //TODO Delete line below, and implement this method
        throw new UnsupportedOperationException();
    }


    /**
     *
     * @return the value of the instance field
     */
    public int getStudentId()
    {
        //TODO Delete line below, and implement this method
        setStudentId(this.studentId);
        return studentId;
    }


    /**
     * The setter for studentId must check that it is larger than -1 Do not set
     * the value, if this is false.
     *
     * @param studentId
     * @return
     */
    public boolean setStudentId(int studentId)
    {
        //TODO Delete line below, and implement this method
        if (studentId < 0) {
            return false;
        }
        return true;
    }

}
