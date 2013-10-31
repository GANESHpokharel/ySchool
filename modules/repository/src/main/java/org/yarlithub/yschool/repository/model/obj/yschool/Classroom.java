package org.yarlithub.yschool.repository.model.obj.yschool;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassroomHasStaffHasRole;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassroomStudent;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassroomSubject;
import org.yarlithub.yschool.repository.model.obj.yschool.iface.IClassroom;


/** 
 * Object mapping for hibernate-handled table: classroom.
 * @author autogenerated
 */

@Entity
@Table(name = "classroom", schema = "yschool")
public class Classroom implements Cloneable, Serializable, IPojoGenEntity, IClassroom {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558977440L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Set<ClassroomHasStaffHasRole> classroomHasStaffHasRoles = new HashSet<ClassroomHasStaffHasRole>();

	/** Field mapping. */
	private Set<ClassroomStudent> classroomStudents = new HashSet<ClassroomStudent>();

	/** Field mapping. */
	private Set<ClassroomSubject> classroomSubjects = new HashSet<ClassroomSubject>();

	/** Field mapping. */
	private String division;
	/** Field mapping. */
	private Integer grade;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private Section sectionIdsection;
	/** Field mapping. */
	private Integer year;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Classroom() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public Classroom(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param division String object;
	 * @param grade Integer object;
	 * @param id Integer object;
	 * @param year Integer object;
	 */
	public Classroom(String division, Integer grade, Integer id, 					
			Integer year) {

		this.division = division;
		this.grade = grade;
		this.id = id;
		this.year = year;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return Classroom.class;
	}
 

    /**
     * Return the value associated with the column: classroomHasStaffHasRole.
	 * @return A Set&lt;ClassroomHasStaffHasRole&gt; object (this.classroomHasStaffHasRole)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "id.classroomIdclass"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( nullable = false  )
	public Set<ClassroomHasStaffHasRole> getClassroomHasStaffHasRoles() {
		return this.classroomHasStaffHasRoles;
		
	}
	
	/**
	 * Adds a bi-directional link of type ClassroomHasStaffHasRole to the classroomHasStaffHasRoles set.
	 * @param classroomHasStaffHasRole item to add
	 */
	public void addClassroomHasStaffHasRole(ClassroomHasStaffHasRole classroomHasStaffHasRole) {
		classroomHasStaffHasRole.getId().setClassroomIdclass(this);
		this.classroomHasStaffHasRoles.add(classroomHasStaffHasRole);
	}

  
    /**  
     * Set the value related to the column: classroomHasStaffHasRole.
	 * @param classroomHasStaffHasRole the classroomHasStaffHasRole value you wish to set
	 */
	public void setClassroomHasStaffHasRoles(final Set<ClassroomHasStaffHasRole> classroomHasStaffHasRole) {
		this.classroomHasStaffHasRoles = classroomHasStaffHasRole;
	}

    /**
     * Return the value associated with the column: classroomStudent.
	 * @return A Set&lt;ClassroomStudent&gt; object (this.classroomStudent)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "classroomIdclass"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( nullable = false  )
	public Set<ClassroomStudent> getClassroomStudents() {
		return this.classroomStudents;
		
	}
	
	/**
	 * Adds a bi-directional link of type ClassroomStudent to the classroomStudents set.
	 * @param classroomStudent item to add
	 */
	public void addClassroomStudent(ClassroomStudent classroomStudent) {
		classroomStudent.setClassroomIdclass(this);
		this.classroomStudents.add(classroomStudent);
	}

  
    /**  
     * Set the value related to the column: classroomStudent.
	 * @param classroomStudent the classroomStudent value you wish to set
	 */
	public void setClassroomStudents(final Set<ClassroomStudent> classroomStudent) {
		this.classroomStudents = classroomStudent;
	}

    /**
     * Return the value associated with the column: classroomSubject.
	 * @return A Set&lt;ClassroomSubject&gt; object (this.classroomSubject)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "classroomIdclass"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( nullable = false  )
	public Set<ClassroomSubject> getClassroomSubjects() {
		return this.classroomSubjects;
		
	}
	
	/**
	 * Adds a bi-directional link of type ClassroomSubject to the classroomSubjects set.
	 * @param classroomSubject item to add
	 */
	public void addClassroomSubject(ClassroomSubject classroomSubject) {
		classroomSubject.setClassroomIdclass(this);
		this.classroomSubjects.add(classroomSubject);
	}

  
    /**  
     * Set the value related to the column: classroomSubject.
	 * @param classroomSubject the classroomSubject value you wish to set
	 */
	public void setClassroomSubjects(final Set<ClassroomSubject> classroomSubject) {
		this.classroomSubjects = classroomSubject;
	}

    /**
     * Return the value associated with the column: division.
	 * @return A String object (this.division)
	 */
	@Basic( optional = false )
	@Column( nullable = false, length = 45  )
	public String getDivision() {
		return this.division;
		
	}
	

  
    /**  
     * Set the value related to the column: division.
	 * @param division the division value you wish to set
	 */
	public void setDivision(final String division) {
		this.division = division;
	}

    /**
     * Return the value associated with the column: grade.
	 * @return A Integer object (this.grade)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Integer getGrade() {
		return this.grade;
		
	}
	

  
    /**  
     * Set the value related to the column: grade.
	 * @param grade the grade value you wish to set
	 */
	public void setGrade(final Integer grade) {
		this.grade = grade;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "idclass", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: sectionIdsection.
	 * @return A Section object (this.sectionIdsection)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = true )
	@JoinColumn(name = "section_idsection", nullable = true )
	public Section getSectionIdsection() {
		return this.sectionIdsection;
		
	}
	

  
    /**  
     * Set the value related to the column: sectionIdsection.
	 * @param sectionIdsection the sectionIdsection value you wish to set
	 */
	public void setSectionIdsection(final Section sectionIdsection) {
		this.sectionIdsection = sectionIdsection;
	}

    /**
     * Return the value associated with the column: year.
	 * @return A Integer object (this.year)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Integer getYear() {
		return this.year;
		
	}
	

  
    /**  
     * Set the value related to the column: year.
	 * @param year the year value you wish to set
	 */
	public void setYear(final Integer year) {
		this.year = year;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public Classroom clone() throws CloneNotSupportedException {
		
        final Classroom copy = (Classroom)super.clone();

		if (this.getClassroomHasStaffHasRoles() != null) {
			copy.getClassroomHasStaffHasRoles().addAll(this.getClassroomHasStaffHasRoles());
		}
		if (this.getClassroomStudents() != null) {
			copy.getClassroomStudents().addAll(this.getClassroomStudents());
		}
		if (this.getClassroomSubjects() != null) {
			copy.getClassroomSubjects().addAll(this.getClassroomSubjects());
		}
		copy.setDivision(this.getDivision());
		copy.setGrade(this.getGrade());
		copy.setId(this.getId());
		copy.setSectionIdsection(this.getSectionIdsection());
		copy.setYear(this.getYear());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("division: " + this.getDivision() + ", ");
		sb.append("grade: " + this.getGrade() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("year: " + this.getYear());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final Classroom that; 
		try {
			that = (Classroom) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getDivision() == null) && (that.getDivision() == null)) || (getDivision() != null && getDivision().equals(that.getDivision())));
		result = result && (((getGrade() == null) && (that.getGrade() == null)) || (getGrade() != null && getGrade().equals(that.getGrade())));
		result = result && (((getSectionIdsection() == null) && (that.getSectionIdsection() == null)) || (getSectionIdsection() != null && getSectionIdsection().getId().equals(that.getSectionIdsection().getId())));	
		result = result && (((getYear() == null) && (that.getYear() == null)) || (getYear() != null && getYear().equals(that.getYear())));
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}