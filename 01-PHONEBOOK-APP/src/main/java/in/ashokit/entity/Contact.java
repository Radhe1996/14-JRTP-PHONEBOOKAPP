package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CONTACT-DETAILS")
public class Contact {
	@Id
	@GeneratedValue
	@Column(name = "CONTACT-ID")
	private Integer  contactid;
	
	@Column(name= "CONTACT-")
	private String   contactname;
	@Column(name= "CONTACT-NUMBER")
	private long     contactnumber;
	@Column(name= "CONTACT-EMAIL")
	private String   contactEmail;

}