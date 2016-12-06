package com.praj.exmple;

public class PetOwner {

	private Pet pet;
	private Dog dog;

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public void showPetOwner() {
		pet.petDisplay();
		dog.dogDisplay();
	}

}
