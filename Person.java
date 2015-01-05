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
}