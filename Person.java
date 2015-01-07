public class Person{
	private Integer id;
	private String name;
	private Integer age;
	
	public Person(){
		System.out.println('I am a person!');
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public Integer getId(){
		return this.id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setAge(Integer age){
		this.age = age;
	}
	
	public Integer getAge(){
		return this.age;
	}
	
	public void addNewMethod(){
		System.out.println('this is a new line!')
	}

	public void addNewMethod2(){
		System.out.println('this is a new 2 line!');
	}
}