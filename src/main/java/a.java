CarInfo.java
	
	public boolean illegal(int maxSpeed) {
		if ((this.speed>maxSpeed) || (this.privateCar==true)) {
			return true;
		}
		return false;
	}
	
	
CameraInfo.java
	
	public boolean allGood() {
		for (int i=0; i<this.cars.length; i++) {
			if (this.cars[i].illegal==true) {
				return false;
			}
		}
		return true;
	}

Out.java

	
	public int legalCities(CameraInfo [] cameras) {
		int count = 0;
		for (int i=0; i<cameras.length; i++) {
			if (cameras[i].allGood()==true) {
				count++;
			}
		}
		return count;
	}

