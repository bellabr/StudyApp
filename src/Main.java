import managementsystems.LogInManagementSystem;
import managementsystems.ManagementRunnable;
import managementsystems.PreLogInSystem;

public class Main {
    /**
     * Asks for the language, then runs an instance of LogInManagementSystem
     */
    public static void main(String[] args) {
        PreLogInSystem preLogInSystem = new PreLogInSystem();
        String language = preLogInSystem.promptForLanguage();
        ManagementRunnable managementRunnable = new LogInManagementSystem(language);
        managementRunnable.run();
    }
}
