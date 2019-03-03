package entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Visage {
	
	private int faceId;
	private String age;
	private String file;
	private String gender;
	private int left;
	public int getFaceId() {
		return faceId;
	}
	public void setFaceId(int faceId) {
		this.faceId = faceId;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public Visage(int faceId, String age, String file, String gender, int left) {
		super();
		this.faceId = faceId;
		this.age = age;
		this.file = file;
		this.gender = gender;
		this.left = left;
	}
	public Visage() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
