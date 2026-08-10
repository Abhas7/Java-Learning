public class Flight{
    private int code;
    private String name;
    private String dept;
    private String dest;

    public Flight(int code, String name, String dept, String dest){
        this.code = code;
        this.name = name;
        this.dept = dept;
        this.dest = dest;
    }
 
    public int getCode() { return code; } 

    public String getName() { return name; } 
   
    public String getDept() { return dept; }

    public String getDest() { return dest; }  

    public void setCode(int code) { this.code = code; }

    public void setName(String name) { this.name = name; }

    public void setDept(String dept) { this.dept = dept; } 

    public void setDest(String dest) { this.dest = dest; }
   
    @Override 
    public String toString() {
        return code+"."+name+","+dept+","+dest; 
    }
} 

 
// print the details of the flight no 123.
// print all flights by jet carrier.
// print flight going  pune to delhi.
// print flights from mumbai.
// print a flight no 290
