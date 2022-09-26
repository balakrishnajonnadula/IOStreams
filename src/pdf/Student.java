package pdf;

public class Student {
	private String name;
	private String id;
	private String phone;
	private String add;

	public Student(String name, String id, String phone, String add) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

}
