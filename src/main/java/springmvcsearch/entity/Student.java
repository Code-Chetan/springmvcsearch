package springmvcsearch.entity;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	private String userName;
	private Long userId;
	
	@DateTimeFormat(pattern = "yyyy/mm/dd")
	private Date userDOB;
	
	private List<String> courses;
	private String gender;
	private String studentType;
	private Address address;
	
	public String getUserName() {return userName;}
	
	public void setUserName(String userName) {this.userName = userName;}
	
	public Long getUserId() {return userId;}
	
	public void setUserId(Long userId) {this.userId = userId;}
	
	public Date getUserDOB() {return userDOB;}
	
	public void setUserDOB(Date userDOB) {this.userDOB = userDOB;}
	
	public List<String> getCourses() {return courses;}
	
	public void setCourses(List<String> courses) {this.courses = courses;}
	
	public String getGender() {return gender;}
	
	public void setGender(String gender) {this.gender = gender;}
	
	public String getStudentType() {return studentType;}
	
	public void setStudentType(String studentType) {this.studentType = studentType;}

	public Address getAddress() {return address;}

	public void setAddress(Address address) {this.address = address;}

	@Override
	public String toString() {
		return "Student [UserName=" + userName + ", UserId=" + userId + ", UserDOB=" + userDOB + ", courses=" + courses
				+ ", gender=" + gender + ", studentType=" + studentType + ", address=" + address + "]";
	}
}
