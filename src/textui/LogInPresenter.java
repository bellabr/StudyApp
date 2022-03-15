package textui;

import users.UserManager;

import java.util.Map;

/**
 * Displays logging in and quitting functionalities.
 */
public class LogInPresenter {
    Map<PresenterPrompts, String> promptsMap;

    public LogInPresenter(Map<PresenterPrompts, String> promptsMap) {
        this.promptsMap = promptsMap;
    }

    // entering the program
    public void welcomer() {
        System.out.println(promptsMap.get(PresenterPrompts.welcomer));
    }
    public void lCreateAccountOrLoginPrompt() {
        System.out.println(promptsMap.get(PresenterPrompts.logInMenu));
        System.out.println(promptsMap.get(PresenterPrompts.chooseOptionPrompt));
    }

    // log in prompts
    public void lLogInUsernamePrompt() {
        System.out.println(promptsMap.get(PresenterPrompts.logInUserNamePrompt));
    }
    public void lLogInPasswordPrompt() {
        System.out.println(promptsMap.get(PresenterPrompts.logInPasswordPrompt));
    }
    public void sayUserNameNotExist() {
        System.out.println(promptsMap.get(PresenterPrompts.logInUserNotExist));
    }
    public void sayAccountSuspended() {
        System.out.println(promptsMap.get(PresenterPrompts.logInAccountSuspended));
    }
    public void lSayLoginSuccess() {
        System.out.println(promptsMap.get(PresenterPrompts.logInSayLoginSuccess));
    }
    public void lSayLoginError() {
        System.out.println(promptsMap.get(PresenterPrompts.logInSayLoginError));
    }

    // create account prompts
    public void typeOfAccountMenu() {
        System.out.println(promptsMap.get(PresenterPrompts.logInTypeOfAccountMenu));
    }
    public void lSayIncorrectKey() {
        System.out.println(promptsMap.get(PresenterPrompts.logInIncorrectAdminKey));
    }
    public void lCreateAccountError() {
        System.out.println(promptsMap.get(PresenterPrompts.logInCreateAccountError));
    }
    public void lCreateAccountUsernamePrompt() {
        System.out.println(promptsMap.get(PresenterPrompts.logInCreateUserNamePrompt));
    }
    public void lCreateAccountPasswordPrompt() {
        System.out.println(promptsMap.get(PresenterPrompts.logInCreatePasswordPrompt));
    }
    public void lCreateAccountEmailPrompt() {
        System.out.println(promptsMap.get(PresenterPrompts.logInCreateEmailPrompt));
    }
    public void lSayUsernameNotUnique() {
        System.out.println(promptsMap.get(PresenterPrompts.logInSayUsernameNotUnique));
    }
    public void lSaySuccessfulAccountCreation() {
        System.out.println(promptsMap.get(PresenterPrompts.logInSaySuccessfulAccountCreation));
    }

    // reset
    public void lUsernameResetPrompt() {
        System.out.println(promptsMap.get(PresenterPrompts.logInUsernameResetPrompt));
    }
    public void lResetAccountPrompt() {
        System.out.println(promptsMap.get(PresenterPrompts.logInResetAccountPrompt));
    }
    public void lProvideNewPinPrompt() {
        System.out.println(promptsMap.get(PresenterPrompts.logInProvideNewPinPrompt));
    }
    public void lInvalidPinPrompt() {
        System.out.println(promptsMap.get(PresenterPrompts.logInInvalidPinPrompt));
    }
    public void lSayPasswordChangeSuccess() {
        System.out.println(promptsMap.get(PresenterPrompts.logInSayPasswordChangeSuccess));
    }

    // generic
    public void displayUserInfo(String userName, String userID, UserManager.UserType userType) {
        System.out.println(promptsMap.get(PresenterPrompts.logInSayUserName) + userName + ". " +
                promptsMap.get(PresenterPrompts.logInSayUserID) + userID +
                ". " + promptsMap.get(PresenterPrompts.logInSayUserType) + userType.name() + ".\n");
    }
    public void lSayInvalidInput() {
        System.out.println(promptsMap.get(PresenterPrompts.invalidInputReporter));
    }

    // exiting the program
    public void exiter() {
        System.out.println(promptsMap.get(PresenterPrompts.logInExiter));
    }
    public void saveOrNotPrompter() {
        System.out.println(promptsMap.get(PresenterPrompts.logInSaveOrNotPrompt));
    }
}
