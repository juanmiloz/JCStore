package co.edu.icesi.JCStore.dto;

import com.sun.istack.NotNull;

import java.util.UUID;

public class ItemDTO {

    private UUID itemId;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private double price;
}
