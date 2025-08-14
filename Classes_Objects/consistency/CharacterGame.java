public class CharacterGame {
    private int currentHealth;
    private String name;
    private String status;

    public CharacterGame(int initialHealth, String initialName) {
        setName(initialName);           
        setCurrentHealth(initialHealth); }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        if (currentHealth < 0) {
            this.currentHealth = 0;
        } else if (currentHealth > 100) {
            this.currentHealth = 100;
        } else {
            this.currentHealth = currentHealth;
        }

        if (this.currentHealth > 0) {
            this.status = "alive";
        } else {
            this.status = "dead";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
        
    }

    public String getStatus() {
        return status;
    }

    public void takeDamage(int damageAmount) {
        setCurrentHealth(this.currentHealth - damageAmount);
    }

    public void receiveHealing(int healingAmount) {
        setCurrentHealth(this.currentHealth + healingAmount);
    }
}
