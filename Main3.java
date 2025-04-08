//Sports interface
interface Sports {
    int getSportsScore();
}
//Students class
class Student{
    private int academicScore;
    public void setAcademicScore(int score){
        academicScore=score;
    }
    public int getAcademicScore(){
    return academicScore;
    }
}
//Result class inheriting Student and implementing Sports
class Result extends Student implements Sports{
    private int sportsScore;
    public void setSportsScore(int score){
        sportsScore=score;
    }
    //Method from Sports interface
    public int getSportsScore(){
        return sportsScore;
    }
    public void displayScore(){
        System.out.println("Academic Score:"+getAcademicScore());
        System.out.println("Sports Score:"+getSportsScore());
    }
}
//Main class 
public class Main3{
    public static void main(String[] args){
        Result studentResult=new Result();
        studentResult.setAcademicScore(91);
        studentResult.setSportsScore(86);
        studentResult.displayScore();
    }
}