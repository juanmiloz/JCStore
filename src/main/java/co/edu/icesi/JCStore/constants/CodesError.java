package co.edu.icesi.JCStore.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CodesError {

    CODE_O1("CODE_01", "The user must contain a phone number or an email address to be registered."),
    CODE_02("CODE_02", "Repeated user, the email you have entered is already registered."),
    CODE_03("CODE_03", "Repeated user, the phone number you have entered is already registered.");

    private String code;
    private String message;
}
