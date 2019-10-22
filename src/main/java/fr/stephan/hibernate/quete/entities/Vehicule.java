package fr.stephan.hibernate.quete.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String brand;

	private String model;
	private int    horsePower;

	public Vehicule() {
	}

	public Vehicule(String brand, String model, int horsePower) {
		this.brand = brand;
		this.model = model;
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Vehicule [id=" + id + ", Marque= " + brand + ", Modèle= " + model
				+ ", chevaux fiscaux " + horsePower + "]";
	}

	public String getBrand() {

		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public Long getId() {
		return id;
	}

}
