package model;

public class Bandera implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "name")
	private java.lang.Character name;

	public Bandera() {
	}

	public java.lang.Character getName() {
		return this.name;
	}

	public void setName(java.lang.Character name) {
		this.name = name;
	}

	public Bandera(java.lang.Character name) {
		this.name = name;
	}

}