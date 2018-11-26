
public class Emp {
 int id;
 String name;
 
 Emp(int id, String name){
	 this.id=id;
	 this.name=name;
 }
 
 public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
 public boolean equals(Object o){
	 
	 Emp emp=(Emp) o;
	 return emp.getId()!=this.getId();
	 
 }
 
public int hashcode(){
	 return id;
 }
}
