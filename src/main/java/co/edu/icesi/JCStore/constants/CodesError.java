package co.edu.icesi.JCStore.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CodesError {

    CODE_O1("CODE_01", "The user must contain a phone number or an email address to be registered.");

    private String code;
    private String message;
}
