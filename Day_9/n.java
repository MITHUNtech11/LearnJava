package Day_9;
class StudentN{
    private int id;
    public void setId(int a){
        id=a;
    }
    public int getId(){
        return id;
    }
    public static void main(String[] args){
        StudentN s = new StudentN();
        s.setId(100);
        System.out.println(s.getId());
    }
}