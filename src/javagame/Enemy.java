package javagame;

public class Enemy {
	private int maxHealthy, currentHealth, power, speedX, centerX, centerY;
	private Background bg = StartingClass.getBg1();
	
	public void update(){
		centerX += speedX;
		speedX = bg.getSpeedX()*5;
	}
	
	public void die(){
		
	}
	
	public void attack(){
		
	}

	public int getMaxHealthy() {
		return maxHealthy;
	}

	public void setMaxHealthy(int maxHealthy) {
		this.maxHealthy = maxHealthy;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getSpeedX() {
		return speedX;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public int getCenterX() {
		return centerX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public Background getBg() {
		return bg;
	}

	public void setBg(Background bg) {
		this.bg = bg;
	}
}
