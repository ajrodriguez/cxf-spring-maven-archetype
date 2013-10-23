#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.beans;

import javax.xml.bind.annotation.XmlRootElement; 
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable; 


/**
 * @author aj2r
 *
 */
@XmlType(
		name = "AppType",
		namespace = "${package}.beans",
		propOrder = {"id", "descriptor"}
		)
@XmlRootElement(
		name="App",
		namespace = "${package}.beans"
		)
public class App implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8530601651140329751L;
	
	private Long id;
	private String descriptor;
	
	public App() {
		
	}
	
	public App(Long id, String descriptor) {
		super();
		this.id = id;
		this.descriptor = descriptor;
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescriptor() {
		return descriptor;
	}
	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}
	
	public boolean equals(Object o) {
		if(o != null && o instanceof App) {
			App oApp = (App) o;
			if (oApp.id.longValue() == this.id.longValue()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return this.id != null ? this.id.hashCode() : 0;
	}
	
	@Override
	public String toString() {
		return "App{id=" + this.id + ", descriptor='" + this.descriptor + "${symbol_escape}'}";
	}

}