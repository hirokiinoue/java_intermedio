package ModelViewController;

public class Student {
	   private String rollNo;
	   private String name;
	   private int media;
	   
	   public boolean finalresult(){
		
		   return media>=6;
	   }
	   
	   public String getRollNo() {
	      return rollNo;
	   }
	   
	   public void setRollNo(String rollNo) {
	      this.rollNo = rollNo;
	   }
	   
	   public String getName() {
	      return name;
	   }
	   
	   public void setName(String name) {
	      this.name = name;
	   }
	}